import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Elemanları biliyorsam:
                     // 0   1  2  3  4
        int[] notlar = {85,92,70,55,100};
        String[] gunler = {"Pazartesi","Salı","Çarşamba","Perşembe"};

//        System.out.println("1. öğrencinin notu: " + notlar[0]);
//        System.out.println("2. öğrencinin notu: " + notlar[1]);
//        System.out.println("3. öğrencinin notu: " + notlar[2]);
//        System.out.println("4. öğrencinin notu: " + notlar[3]);


        System.out.println("eleman sayısı: " + notlar.length);
        System.out.println("son indexteki değer: " + notlar[notlar.length-1]);

        for (int i = 0; i <notlar.length ; i++) {
            System.out.println( i+1 + ". öğrencinin notu:  "+notlar[i]);

        }

        for (int not : notlar){
            System.out.print(not+" - ");
        }

        //Eğer, eleman sayısını biliyor, fakat değerleri bilmiyorsam:,

        /*Senaryo:
          Uygulama çalıştığında, sınıfın kaç kişi olduğunu sorsun. Verilen yanıta göre; öğrencinin adını ve notlarını
          ayrı ayrı tutalım. Ardından liste biçiminde gösterelim.

        * */
        System.out.println("Sınıfta kaç kişi var?");
        Scanner scanner = new Scanner(System.in);
        int ogrenciSayisi = scanner.nextInt();
        String[] ogrenciler = new String[ogrenciSayisi];
        int[] puanlar = new int[ogrenciSayisi];

        for (int i = 0; i < ogrenciler.length ; i++) {
            System.out.println("Öğrenci Adı:");
            String ad = scanner.next();
            System.out.println("Puanı: ");
            int puan = scanner.nextInt();

            ogrenciler[i] = ad;
            puanlar[i] = puan;

        }

        for (int i = 0; i <ogrenciler.length ; i++) {
            System.out.println(ogrenciler[i]+ " isimli öğrencinin puanı: "+puanlar[i]);

        }









    }
}