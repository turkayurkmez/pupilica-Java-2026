//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
     /*
     * Bir lise için, aşağıdaki işlemleri yapabileceğim bir uygulama istendi:
     *    Öğrenci kaydı
     *    Sınıf seçimi
     *    Sınfa branş Öğretmeni atama
     *
     * Bu uygulama evreninde hangi VARLIKLAR olmalı?
     * */

        //kalem bir ürün nesnesidir
        //kalem bir ürün örneğidir.
        //kalem bir ürün instance'ıdır.

        //new dediğime göre heap'de oluştur ve adresi kaleme aktar
        Urun kalem = new Urun();
        //Stack'de silgi oluştur ve kalem'in adresini aktar.
        Urun silgi = kalem;
        Urun masa = new Urun();

        //kalem adresine heap'e git ad değerini değiştir:
        kalem.Ad = "Rotring 0.7 uçlu kalem";
        kalem.Fiyat = 200;
        //silgi adresine git. Ad değerini değiştir.


        System.out.println(kalem.Ad + " - " + kalem.Fiyat);

    }
}