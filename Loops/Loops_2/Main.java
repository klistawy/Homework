import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //sayı alma
        Scanner scan = new Scanner(System.in);
        retry:
        while(true) {
            System.out.println("Bir sayı giriniz: ");
            int a = scan.nextInt();

            //faktöriyel
            int f = 1;
            for (int i = a; i > 0; i--) {
                f = i * f;
            }

            //tekrar etme
            System.out.println("Girdiğiniz sayının faktöriyeli: " + f);
            System.out.println("Devam edecek misiniz? Öyleyse 1 yazın:");
            int cevap = scan.nextInt();
            if (cevap == 1) {
                continue retry;
            }
            System.out.println("Program sonlandırıldı...");
            break;
        }




    }
}