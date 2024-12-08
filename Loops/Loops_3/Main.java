import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random rand = new Random();
        int cift = 0;
        int tek = 0;

        for (int i = 0; i < 50; i++) {
            int sayi = rand.nextInt(101); // 0-100 arasında bir sayı üret
            System.out.println("Gelen sayı: " + sayi);

            if (sayi % 2 == 0) {
                cift++;
            } else {
                tek++;
            }
        }

        System.out.println("\nÇift sayı adedi: " + cift);
        System.out.println("Tek sayı adedi: " + tek);

    }
}