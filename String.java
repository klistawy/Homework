import java.util.Scanner;

public class String {
    public static void main(java.lang.String[] args) {

        Scanner scan = new Scanner(System.in);

        //babama mesaj gönderiyorum

        System.out.println("Babanıza Mesaj Gönderin: ");
        java.lang.String mesaj = scan.nextLine();
        System.out.println("Babanıza Mesaj Gönderildi: " + mesaj);

        System.out.println("Caps Lock Tuşunuz Açık Kalmış: "+ mesaj.toUpperCase());

        int kalankarakter = 127-mesaj.length();
        System.out.println("Karakter Sınırı 127'dir. Kullanılan Karakter Sayısı: "+mesaj.length() +
                " Kalan Karakter Sınırı:"+ kalankarakter);

        boolean ilkharf = mesaj.startsWith("B");
        if(ilkharf) {System.out.println("Mesajınız B ile başlıyor." );}
        else{System.out.println("Mesajınız B ile başlamıyor. Mesajınız "+mesaj.charAt(0)+" ile başlamakta. ");}

   }
}




