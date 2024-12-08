import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //kaydolma
    Scanner scan = new Scanner(System.in);
    System.out.println("E-mail adresinizi oluşturunuz: ");
    String mail = scan.next();
    System.out.println("Şifre oluşturunuz: ");
    String pw = scan.next();

        //oturum açma
        retry1:
        for (int i = 0; i<4; i++) {
            System.out.println("Kullanıcı adınızı giriniz:");
            String mail1 = scan.next();
            System.out.println("Şifrenizi giriniz.");
            String pw1 = scan.next();
            boolean a = mail.equals(mail1);
            boolean b = pw.equals(pw1);

            if(a&&b) {
                System.out.println("Başarıyla giriş yaptınız.");
                break;
            } else {
                System.out.println("Hatalı şifre veya kullanıcı adı girdiniz. Lütfen tekrar deneyin.");
                System.out.println("Hatalı girilen deneme: "+i);
                continue retry1;

                }
            }
        System.out.println("Program sonlandırılıyor...");

        }
    }