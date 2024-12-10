import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    //ilk iki sayıyı alma

        Scanner scan = new Scanner(System.in);
        System.out.println("Çarpılacak sayıları giriniz: ");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        int carpim= sayi1 * sayi2;

        //istenilen kadar sayı alma

        for (int i=1; i>0; i++) {
            retry:
            System.out.println("Başka sayı eklemek ister misiniz?");
            System.out.println("Eğer isterseniz 1, istemezseniz 0 yazın.");

            int j= scan.nextInt();
            if (j==1) {
                System.out.println("Şu anda sonuç: "+carpim+" Hangi sayıyı eklemek istersiniz?");
                int c= scan.nextInt();
                carpim = sayiCarpimi(carpim,c);
                System.out.println("Sayınız başarıyla eklendi. Yeni sonuç: "+ carpim);
                System.out.println("----------------------------------------------");
                continue;
            } else if (j==0) {
                System.out.println("Başka sayı eklenmiyor. Cevabınız: " +carpim);
                System.out.println("Kod bitiriliyor...");
                break;
            } else {
                System.out.println("1 ya da 0 yazmanız gerekiyordu. Lütfen tekrar deneyin:");
                continue;
            }
        }
        }
    public static int sayiCarpimi (int carpim, int c) {
        int sonuc = carpim*c;
        return sonuc;
    }
}