import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        AMAÇ: Bir ATM cihazının genel hatlarıyla simüle edilmesi...
          1. Uygulama pin kodu ile açılır.
             3 hatalı girişte sistem yanıt vermez.
          2. Bir menü açılsın. Bu menüde
               1. Bakiye sorgula
               2. Para yatır
               3. Para çek
               4. Çıkış

             Her eylem çalışsın.

             4'e basılmadığı sürece, 2. adımdaki menüye geri dönsün.
        * */

        Scanner scanner = new Scanner(System.in);
        double bakiye = 1500;
        int dogruPin = 5498;
        int girilenPin= 0;
        int hataliGiris = 0;
        double gunlukLimit = 10000;

        do {
            System.out.println("PIN kodunu giriniz");
            girilenPin = scanner.nextInt();
            hataliGiris++;
            if (girilenPin != dogruPin){
                int kalanHak = 3 - hataliGiris;
                if (kalanHak <= 0){
                    System.out.println("Pin kodunuz yanlış güvenlik sebebiyle kartınızı yutuyoruz");
                    return;
                }
            }
        }while (girilenPin != dogruPin);

        System.out.println("Giriş başarılı!");

        int secim = 0;
        do {
            /*
             2. Bir menü açılsın. Bu menüde
               1. Bakiye sorgula
               2. Para yatır
               3. Para çek
               4. Çıkış

             Her eylem çalışsın.

             4'e basılmadığı sürece, 2. adımdaki menüye geri dönsün.
            * */

            System.out.println("Ne yapmak istiyorsunuz?");
            System.out.println("1. Bakiye Sorgula");
            System.out.println("2. Para yatır");
            System.out.println("3. Para çek");
            System.out.println("4. Çıkış yap");

            System.out.println("Seçiminizi yapın:");
            secim = scanner.nextInt();
            switch (secim){
                case 1:
                    System.out.println("Bakiyeniz: "+ bakiye + " TL");
                    break;
                case 2:
                    //Önce tutar girilir.
                    //Eğer tutar negatifse uyar ve işlem yapma
                    //değilse bakiyeyi tutar kadar arttır.
                    System.out.print("Yatırılacak tutar:");
                    double tutar = scanner.nextDouble();
                    if (tutar<=0){
                        System.out.println("Tutar 0 ya da  negatif olamaz");
                    }
                    else {
                        bakiye += tutar;
                        System.out.println(tutar + " TL yatırıldı. Yeni bakiye "+bakiye + " TL");
                    }
                    break;
                case 3:
                    /*1. Tutar girilir
                       0 ya da negatif olamaz.
                       bakiyeden fazla olamaz
                       günlük limitten fazla olamaz.
                       eğer sorun yoksa bakiyeden tutar düşülür.
                    * */
                    System.out.print("Çekmek istediğiniz tutar:");
                    double cekilecekTutar = scanner.nextDouble();
                    if (cekilecekTutar<=0){
                        System.out.println("Çekilecek tutar negatif olamaz!");
                    } else if (cekilecekTutar>bakiye) {
                        System.out.println("Yeterli bakiyeniz yok");
                    } else if (cekilecekTutar>gunlukLimit) {
                        System.out.println("Günlük limitiniz " + gunlukLimit + " TL'dir.");
                    }
                    else{
                        bakiye -= cekilecekTutar;
                        System.out.println(cekilecekTutar + " TL çekildi. Kalan bakiye: "+ bakiye);
                    }

                    break;
                case 4:
                    System.out.println("Çıkış yapılıyor....");
                    break;
                default:
                    System.out.println("Hatalı seçim. 1-4 arası bir seçim yapın.");
                    break;

            }




        }while (secim != 4);




    }
}