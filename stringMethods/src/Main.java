//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String ad = "     Türkay Ürkmez      ";
        System.out.println("Orijinal: "+ ad);
        System.out.println("trim(): " + ad.trim() );
        System.out.println("küçük harf: "+ ad.trim().toLowerCase() );
        System.out.println("büyük harf: "+ ad.trim().toUpperCase() );

        String email = "turkay.urkmez@dinamikzihin.com";
        //Bilgi almak:
        System.out.println("Uzunluk: " + email.length());
        System.out.println(email.indexOf('@'));
        System.out.println("Kullanıcı adı "+ email.substring(0,email.indexOf('@')));
        System.out.println("Domain: "+ email.substring(email.indexOf('@')+1));
        System.out.println(".com ile mi bitiyor? "+ email.endsWith(".com"));

        String[] parcalar = email.split("@");
        System.out.println("Spit işleminden sonra 0. Eleman: "+ parcalar[0]);
        System.out.println("Spit işleminden sonra 1. Eleman: "+ parcalar[1]);



    }
}