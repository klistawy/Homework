import java.util.Random;


public class Main {
    public static void main(String[] args) {

    Random rand = new Random();
        int sayi1 = rand.nextInt(100);
        int sayi2 = rand.nextInt(100);
        int sayi3 = rand.nextInt(100);



        int[] liste = {sayi1,sayi2,sayi3};
        int toplam = 0;
        int max = sayi1;
        int ortalama = 0;
        System.out.println("Gelen sayılar sırasıyla: " +sayi1 +"," +sayi2+","+ sayi3);

        for (int sayilar:liste) {
            toplam = toplam + sayilar;
            ortalama = toplam/3;
        if (max< sayilar) {
            max = sayilar;
        }
        }
        System.out.println("Sayıların toplamı: " + toplam);
        System.out.println("Aralarındaki en büyük sayı: " + max);
        System.out.println("Sayıların yaklaşık ortalaması: " + ortalama);

    }
}