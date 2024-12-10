import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Vize notunu giriniz: ");
    double v = scan.nextDouble();
    System.out.println("Final notunu giriniz: ");
    double f = scan.nextDouble();

    double not = notHesaplama(v,f);
    System.out.println("Toplam notunuz: "+not);

    }
    public static double notHesaplama(double v, double f) {
        double vetki = v*40/100;
        double fetki = f*60/100;
        double total = vetki+fetki;
        return total;

    }

}
