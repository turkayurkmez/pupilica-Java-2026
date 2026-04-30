import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Sabitler:
        final double PI = 3.1459;
        final int MAX_OGRENCI_SAYISI = 30;
        final String EVET ="Evet";

        //Casting:
        int tamSayi = 200;
        //implicitly casting (widening - genişletme)
        double deger = tamSayi;
        System.out.println(deger);
        long buyukSayi = tamSayi;
        System.out.println(buyukSayi);

        //explicit casting (narrowing - daraltma)
        byte sekizBit = (byte) tamSayi;

        System.out.println(sekizBit);

        char adinizinIlkHarfi = 'Ü';
        int asciiCode = (char)adinizinIlkHarfi;
        System.out.println(asciiCode);
        char harf = (char) 220;
        System.out.println(harf);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin:");

        String ifade = scanner.next();
        int sayi = Integer.parseInt(ifade);

        System.out.println(ifade + " " + sayi);









    }
}