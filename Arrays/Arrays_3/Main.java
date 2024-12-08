import java.util.Random;


public class Main {
    public static void main(String[] args) {

        int[] sayi = new int[14];
        Random rand = new Random();

        for (int i=0; i< sayi.length; i++){
            sayi[i] = rand.nextInt(100);
        }
        for (int i = 0; i < sayi.length - 1; i++) {
            for (int a = 0; a < sayi.length - 1 - i; a++) {
                if (sayi[a] > sayi[a + 1]) {
                    int temp = sayi[a];
                    sayi[a] = sayi[a + 1];
                    sayi[a + 1] = temp;
                }
            }
        }
        System.out.println("Küçükten büyüğe sıralama: " );
        System.out.println("------------------------- " );
        for (int a: sayi){
            System.out.println(a+" ");
        }

    }
}