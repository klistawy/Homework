import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Email adresinizi giriniz:");
        String mail = scanner.nextLine();

        if (isGoogleEmail(mail)) {
            System.out.println("Google domainli bir mail girdiniz.");
        } else {
            System.out.println("Google domainli bir mail girmediniz.");
        }

        scanner.close();
    }

    public static boolean isGoogleEmail(String email) {
        return email.endsWith("@gmail.com");
    }
}