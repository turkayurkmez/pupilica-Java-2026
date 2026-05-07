import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static String[] kelimeHavuzu = {"java", "metot", "döngüler", "array", "karar", "programlama"};
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       /*
         1. Bir kelime listesi arasından rastgele kelime seç.
         2. Seçilen kelimeyi gizleyerek göster.
         3. Kullanıcıdan harf iste
         4. Girilen harfi, kelimede ara.
            a Varsa o bulmacada harfin yerini aç.
            b Yoksa hakkından bir azalt.
         5. Kelime tamamlandı mı?

       * */
        //test:
//        String secilenKelime = rastgeleBirKelimeSec();
//        System.out.println(secilenKelime);
//
//        String bulmaca = gizliKelimeyeDonustur(secilenKelime);
//        System.out.println(bulmaca);
//
//        String harf = kullanicidanHarfIste();
//        System.out.println(harf);
//
//        System.out.println(harfVarMi(secilenKelime, harf));
//        String tahminEdilenler ="";
//        if (harfVarMi(secilenKelime,harf)){
//            tahminEdilenler += harf;
//           String sonBulmaca =  bulmacayiGuncelle(secilenKelime,tahminEdilenler);
//            System.out.println(sonBulmaca);
//        }

        /*
        * 1. Rastgele kelime seç
        * 2. Doğru tahminler ve yanlış tahminler için değişken oluştur.
        * 3. hata sayısını tutsun
        * 4. hata sayısı 6'dan az VE kelime tamamlanmamış olduğu sürece:
        *     1. önce o anki bulmacanın durumu, kalan hak vs gibi bilgiler gelsin.
        *     2. kullanıcıdan harf al
        *     3. Bu harf daha önce girildi mi? Girildiyse başka harf iste
        *     4. Harf varsa, bulmacayı güncelle yoksa hakkı azalt
        *     5. Oyunun sonunu göster.
        *
        * */

        System.out.println("====== KELİME TAHMİN OYUNU ======");
        String yanit = "";
        do {
            String rastgeleKelime = rastgeleBirKelimeSec();
            String dogruTahminler = "";
            String yanlisTahminler = "";
            int hataSayisi = 0;

            boolean oyunDevamEdiyorMu = true;
            while (oyunDevamEdiyorMu) {
                //   1. önce o anki bulmacanın durumu, kalan hak vs gibi bilgileri getir.
                //        *     2. kullanıcıdan harf al
                //        *     3. Bu harf daha önce girildi mi? Girildiyse başka harf iste
                //        *     4. Harf varsa, bulmacayı güncelle yoksa hakkı azalt
                //
                durumGoster(rastgeleKelime, dogruTahminler, yanlisTahminler, hataSayisi);
                String harf = kullanicidanHarfIste();
                if (dahaOnceDenenmisMi(dogruTahminler + yanlisTahminler, harf)) {
                    System.out.println(harf + " harfi daha önce denendi. Lütfen yeni bir harf girin");
                    continue;
                }

                if (harfVarMi(rastgeleKelime, harf)) {
                    dogruTahminler += harf;
                    System.out.println(harf + " harfi, kelimede var");

                } else {
                    yanlisTahminler += harf;
                    System.out.println(harf + " harfi, kelimede yok.");
                    hataSayisi++;

                }
                oyunDevamEdiyorMu = hataSayisi < 6 && !kelimeTamamlandiMi(rastgeleKelime, dogruTahminler);

            }

// Oyunun sonunu göster.
            sonucuGoster(kelimeTamamlandiMi(rastgeleKelime, dogruTahminler), rastgeleKelime);
            System.out.println("Tekrar oynamak ister misiniz? (E/H)");
           yanit = scanner.next().toUpperCase();

        }while (yanit.equals("E"));

    }

    private static void sonucuGoster(boolean kazandiMi, String rastgeleKelime) {
        if (kazandiMi){
            System.out.println("Tebrikler! tüm kelimeyi buldunuz! " +  rastgeleKelime );
        }
        else {
            System.out.println("Kaynettiniz! Doğru kelime "+ rastgeleKelime);
        }
    }

    private static boolean dahaOnceDenenmisMi(String denenHarfler, String harf) {
        return denenHarfler.indexOf(harf) >= 0;
    }

    private static void durumGoster(String rastgeleKelime, String dogruTahminler, String yanlisTahminler, int hataSayisi) {
        System.out.println("Kelime: "+ bulmacayiGuncelle(rastgeleKelime,dogruTahminler));
//        String yanlisTahminMesaji = "";
//        if (yanlisTahminler.length()==0){
//            yanlisTahminMesaji = "-";
//        }
//        else {
//            yanlisTahminMesaji = yanlisTahminler;
//        }

        System.out.println("Yanlış tahmi edilen harfler:"+ (yanlisTahminler.isEmpty() ? "-" : yanlisTahminler ));
        System.out.println("Kalan hak: "+ (6-hataSayisi) + " kaldı");

    }

    private static boolean kelimeTamamlandiMi(String rastgeleKelime, String dogruTahminler) {
        for (int i = 0; i <rastgeleKelime.length() ; i++) {
            if (dogruTahminler.indexOf(rastgeleKelime.charAt(i))<0){
                return  false;
            }
        }
        return true;
    }

    //    1. Bir kelime listesi arasından rastgele kelime seç.
    public static String rastgeleBirKelimeSec() {
        int index = (int) (Math.random() * kelimeHavuzu.length);
        return kelimeHavuzu[index];
    }
 // 2. Seçilen kelimeyi gizleyerek göster.
    /**
     Bu fonksiyon, parametre olarak aldığı kelimeyi gizler.
    * */
    public static String gizliKelimeyeDonustur(String kelime){
        String gizli = "";
        for (int i = 0; i < kelime.length() ; i++) {
            gizli += "_ ";
        }
        return gizli;
    }


//      3. Kullanıcıdan harf iste
    static String kullanicidanHarfIste(){

        String harf = "";
        do {
            System.out.println("Lütfen bir harf girin:");
            harf = scanner.next();

            if (harf.length()>1){
                System.out.println("Sadece 1 karakter girin");
            }

        }while (harf.length()>1);
        return harf;

    }

    //4. Girilen harfi, kelimede ara.
    static boolean harfVarMi(String kelime, String harf){
       return   kelime.contains(harf);

    }

    static String bulmacayiGuncelle(String kelime, String dogruTahminler){
        String yeniGorunum ="";
        for (int i = 0; i <kelime.length() ; i++) {
            char harf = kelime.charAt(i);
            if (dogruTahminler.indexOf(harf) >=0 ){
                yeniGorunum += harf + " ";
            } else{
                yeniGorunum += "_ ";
            }



        }
        return  yeniGorunum.trim();
    }


}