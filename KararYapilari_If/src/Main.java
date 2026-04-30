import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        * Amaç 1: Sadece turkay kullanıcısı bu uygulamayı kullanabilir.
        * Amaç 2: turkay ve beyza kullanıcısı bu.....
        * */

        System.out.print("Kullanıcı adını giriniz:");
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi = scanner.next();

        System.out.println("Şifrenizi girin");
        String sifre = scanner.next();

        if (kullaniciAdi.equals("turkay") && sifre.equals("abc123")){
            System.out.println("Hoşgeldin Türkay");
        } else if (kullaniciAdi.equals("beyza") && sifre.equals("xyz98")) {
            System.out.println("Merhaba Beyza Sakarya!!!");

        } else {
            System.out.println("Tanınmayan kullanıcı. Uygulamadan çıkılıyor");
            return;
        }
        System.out.println("Burası ne olursa olsun çalışır!");
    }
}