import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


   Scanner scan = new Scanner (System.in);

    System.out.println("Birinci sayıyı giriniz: ");
    int sayi1 = scan.nextInt();
    System.out.println("İkinci sayıyı giriniz: ");
    int sayi2 = scan.nextInt();

    if (sayi1>sayi2){
        System.out.println(sayi1 + ", " + sayi2+"'den daha büyüktür.");
    }
    else if (sayi1<sayi2){
        System.out.println(sayi1 +", "+ sayi2+ "'den daha büyüktür.");
    }
    else{
        System.out.println(sayi1+" ve "+sayi2+" birbirine eşittir.");
    }


    }
}