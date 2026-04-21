import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class YasHesaplama {
    public static void main(String[] args) {

        /*
        Amaç: Kişinin doğduğu yıla göre, yaşını hesaplamak istyoruz.
        Tam sayı tipinde doğum yılı
        Tam sayı tipinde içinde bulunulan yıl (2026)
        * */
        Scanner klavye = new Scanner(System.in);


        System.out.println("Doğduğunuz yıl:");
        int dogumYili = klavye.nextInt();
        int suAnkiYil = LocalDate.now().getYear();

        int yas = suAnkiYil - dogumYili;
        System.out.println(yas);

    }
}
