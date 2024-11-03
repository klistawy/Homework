import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Vize sınavından aldığınız puanını giriniz: ");
        int vi = scan.nextInt();
        System.out.println("Final sınavından aldığınız puanı giriniz: ");
        int fi = scan.nextInt();

        int v = vi*35/100;
        int f = fi*65/100;
        int total= v+f;

        System.out.println("Toplam puanınız: "+total);
        if (total<75) {
            System.out.println("Barajı geçemediniz. Kaldınız.");
        } else {
            System.out.println("Barajı başarıyla geçtiniz.");
        }

    }
}