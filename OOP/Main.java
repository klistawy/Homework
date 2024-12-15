import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Model, renk ve üretim yılı girin: ");
        Araba araba1 = new Araba(scan.next(), scan.next(), scan.nextInt());
        araba1.yazdir();


    }
}


