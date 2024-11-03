

public class Main {
    public static void main(String[] args) throws InterruptedException{

//basit sayaç sistemi
        int saniye = 0;
        int dakika = 0;

        while (true) {
            System.out.println("Dakika: " + dakika + " Saniye: " + saniye);
            Thread.sleep(1000);
            saniye++;

            if (saniye == 60) {
                dakika++;
                saniye = 0;
            }
        }



    }
}