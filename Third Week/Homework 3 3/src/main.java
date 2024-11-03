import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç tane sayıyla işlem yapacaksınız?");
        int[] Numbers = new int[scanner.nextInt()];
        int total = 1;
        int b;

        while(true){
            System.out.println("İşlem yapmak istediğiniz sayıları giriniz: ");
            for (int i=0;i<Numbers.length;i++){
                Numbers[i]=scanner.nextInt();
            }
            scanner.nextLine();

            System.out.println("Hangi işlemi yapmak istersiniz?");
            System.out.println("Toplama için 1, çıkarma için 2, çarpma için 3, bölme içinse 4'e basınız.");
            System.out.println("Çıkmak için ise escape yazınız:");
            String a = scanner.nextLine();

            if (a == "escape") {break;}

            else {b = Integer.valueOf(a);}

            switch (b) {
                case 1:
                    for(int i=0;i<Numbers.length;i++){
                        total +=Numbers[i];
                    }
                    System.out.println("işleminizin sonucu: "+ (total-1));
                    break;

                case 2:
                    for(int i=0;i<Numbers.length;i++){
                        total -=Numbers[i];
                    }
                    System.out.println("işleminizin sonucu: "+ (total-1));
                    break;

                case 3:
                    for(int i=0;i<Numbers.length;i++){
                        total *=Numbers[i];
                    }
                    System.out.println("işleminizin sonucu: "+ (total));
                    break;

                case 4:
                    for(int i=0;i<Numbers.length;i++){
                        total /=Numbers[i];
                        System.out.println("işleminizin sonucu: "+ (total));
                        break;

                    }
            }
        }
    }
}