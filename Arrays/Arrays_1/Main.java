import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> topluluk = new ArrayList<String>();

        topluluk.add("Uygar");
        topluluk.add("Eray");
        topluluk.add("Berşan");
        topluluk.add("Eymen");
        topluluk.add("Yiğit");
        topluluk.add("Arda");
        topluluk.add("Doruk");
        topluluk.add("Eren");
        topluluk.add("Kerem");
        topluluk.add("Mert");
        topluluk.add("Toprak");

        //eleman yazdırma

        System.out.println("Kişi Listesi: "+ topluluk);
        System.out.println("-----------------------------------------");

        //karakter güncelleme

        topluluk.set(0,"Kıvanç");
        System.out.println("Güncel Liste: "+topluluk);
        System.out.println("-----------------------------------------");

        //diziden çıkarma

        topluluk.remove(0);
        System.out.println("Yeni Liste: "+topluluk);
        System.out.println("-----------------------------------------");

        //büyük harflerle yazdırma
        for(String kisi: topluluk) {
            System.out.println(kisi.toUpperCase());
        }
    }
}