import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Döngü, bir koşul sağlandığı sürece yapılan eylemlerdir.
        //klavyeden girilen sayıları toplayan bir örnek. 0 girilirse; işlem tamamlanacak.

        int toplam = 0;
        int sayi;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Birazdan gireceğiniz sayıları toplayacağım. Çıkmak için 0'a basın.");
        while (true){
            System.out.print("Sayı: ");
            sayi = scanner.nextInt();
            //eğer sayı, 0 girilirse döngüden çık:
            if (sayi == 0){
                break;
            }

            toplam += sayi;
            System.out.println("Anlık toplam:"+ toplam);
        }

        System.out.println("Toplam: "+ toplam);

        //Kullanıcı, belirli bir pin değerini 3 deneme içinde doğru girmek zorundadır.


        int hak = 3;
        System.out.println("Lütfen PIN kodunu giriniz:");
        String pin = scanner.next();

        //Döngü, bir koşul sağlandığı sürece yapılan eylemlerdir.
        //KOŞUL: pin değeri  YANLIŞ ise ve hak 0 değilse:
        //Eylem: Kullanıcıya pin kodunu sor.
        while (!pin.equals("1234") && hak > 0){
            System.out.println("Lütfen pin kodunu giriniz. Kalan hakkınız: "+hak--);
            pin = scanner.next();

        }

        String girilenPin ="";
        int deneme =3;
        do {
            System.out.println("do while için pin kodunu girin. Kalan deneme hakkı"+ deneme-- );
            girilenPin = scanner.next();

        }while (!girilenPin.equals("9876") && deneme>0 );


        System.out.println("Geri sayım yapacağız. Kaçtan başlayalım: ");
        int baslangic = scanner.nextInt();


        for ( int sayac = baslangic;sayac >= 0; sayac--) {
            System.out.print(sayac + " ");
        }









    }
}