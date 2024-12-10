import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ilk 3 sayı

    Scanner scan = new Scanner(System.in);
    System.out.println("Notları giriniz:");
    double not1 = scan.nextInt();
    double not2 = scan.nextInt();
    double not3 = scan.nextInt();
    double ort = (not1+not2+not3)/3;

        //yeni gelecek sayılar

     for (int i=0; i>-1; i++) {
         retry:
         System.out.println("Sayı eklemek ister misiniz? Evetse 1, hayırsa 0 yazınız.");
         int j = scan.nextInt();
         if (j==1){
             System.out.println("Not giriniz: ");
             double notx = scan.nextInt();
             ort = ortalamaAlma(ort, i, notx);
             System.out.println("Yeni ortalamanız: " + ort);
             System.out.println("-------------------------------");
             continue;

         } else if (j==0) {
             System.out.println("Başka sayı eklenmiyor. Bu notların ortalaması: "+ort);
             System.out.println("Program kapatılıyor...");
             break;
         } else {
             System.out.println("Yanlış sayı girdiniz. 0 veya 1 girmelisiniz. Lütfen tekrar deneyiniz.");
             System.out.println("-----------------------------------------------------------------------");
             continue;
         }


     }

    }

    public static double ortalamaAlma (double ort, double loop, double notx) {
        double ortalama1= ort*3;
        double ortalama2= ort*loop;
        double ortalama3= notx + ortalama1 + ortalama2;
        double ortalama = ortalama3 / (4+loop);
        return ortalama;
    }

}


