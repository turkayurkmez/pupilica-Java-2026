import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        hosgeldinYaz();
        System.out.println("Hazır mısınız?");
        cizimYap();
        System.out.println("Bugün, konumuz metotlar!");
        cizimYap();


        Scanner scanner = new Scanner(System.in);
        System.out.println("İsminiz: ");
        String ad = scanner.next();

        merhabaDe(ad);
        indirimliFiyatGoster("Patates",70,0.2);


        System.out.println("Satılan ürünün adı: ");
        String urunAdi = scanner.next();
        System.out.println(urunAdi +  " ürününün Satış fiyatı:");
        double satis = scanner.nextDouble();
        System.out.println(urunAdi + " ürününün maaliyeti: " );
        double maaliyet = scanner.nextDouble();
        System.out.println("Günlük ortalama satış sayısı:");
        int satisAdedi = scanner.nextInt();

        double gunlukKar = gunlukKarHesapla(maaliyet,satis,satisAdedi);
        System.out.println(urunAdi+  " isimli ürünün günlük karı "+ gunlukKar + " TL'dir.");





    }

    //her çağrıldığında, ekrana "Sisteme Hoşgeldiniz" yazan fonksiyon.
    static void hosgeldinYaz(){
        System.out.println("=====================");
        System.out.println("|                   |");
        System.out.println("|    Sisteme...     |");
        System.out.println("|  Hoşgeldiniz      |");
        System.out.println("|                   |");
        System.out.println("|===================|");





    }

    static void cizimYap(){
        System.out.println("------------------------------------");
    }

    static void merhabaDe(String isim){
        System.out.println("Merhaba "+ isim);
    }
    //Gözlük, 500 yerine 445 TL
    static void indirimliFiyatGoster(String urunAdi, double fiyat, double indirimOrani){
        double indirimliFiyat = fiyat * (1- indirimOrani);
        System.out.println(urunAdi+", " + fiyat + " yerine " + indirimliFiyat + " TL");
    }

    static double gunlukKarHesapla(double maaliyet, double satisFiyati, int satisAdedi){
        double net = satisFiyati - maaliyet;
        double kazanc = net * satisAdedi;
        return kazanc;
    }

}