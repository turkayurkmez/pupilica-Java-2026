public class AtmSimulator {
    public static void main(String[] args) {
        //SABİT kesinlikle değişmeyecek alanlar:
        final String BANKA_ADI = "JavaBank";
        final double ISLEM_UCRETI = 2.5;
        final int GUNLUK_LIMIT = 5000;

        String musteriAdi = "Sıla Kılıç";
        double hesapBakiyesi = 1_000_000.15;
        int cekilecekTutar = 400;

        System.out.println(BANKA_ADI + "'a hoşgeldiniz ");
        System.out.println("Müşteri adı: " + musteriAdi);
        System.out.println("Mevcut Bakiye: " + hesapBakiyesi);
        System.out.println("--------------------------------");

        double doubleCekilecekTutar = cekilecekTutar;
        System.out.println(doubleCekilecekTutar);

        double yeniBakiye = hesapBakiyesi - doubleCekilecekTutar-ISLEM_UCRETI;
        System.out.println(yeniBakiye);

       double hassasDeger = 299.99;
       int tamSayi = (int)hassasDeger;
       System.out.println(tamSayi);

    }
}
