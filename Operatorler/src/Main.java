import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("İlk sayıyı girin:");
        double x = scanner.nextInt();
        System.out.print("İkinci sayıyı girin:");
        double y = scanner.nextInt();

        /* ARİTMETİK OPERATÖRLER */

        System.out.println("\n----- Aritmetik Operatörler -----");
        System.out.println("Toplam :" + (x+y)  );
        System.out.println("Fark :" + (x-y)  );
        System.out.println("Çarpım :" + (x*y)  );
        System.out.println("Bölüm  :" + (x/y)  );

        System.out.println("Kalan  :" + ((int)x % (int)y)  );

        System.out.println("---- Karşılaştırma operatörler ----");
        System.out.println(x + ">" + y + " : " + (x > y));
        System.out.println(x + "<" + y + " : " + (x < y));
        System.out.println(x + "==" + y + " : " + (x == y));
        System.out.println(x + "!=" + y + " : " + (x != y));

        System.out.println("---- Birleşik operatörler ------");
        int sayi = (int)x;

        sayi += 10; //sayi = sayi + 10;
        sayi *= 2; //sayi = sayi *2;
        sayi /=5;
        sayi -=3;
        System.out.println(sayi);

        System.out.println("---------- prefix ve suffix ---------- ");
        int varsayilan = 10;
        System.out.println("Sayının ilk değeri "+ varsayilan);
        System.out.println("++x --> " + ++varsayilan);
        System.out.println("x++ -->" + varsayilan++);
        System.out.println("Sayının şu anki değeri  --> "+ varsayilan);

        System.out.println(" -------- Mantıksal operatörler ---------");

        boolean xPozitifMi = x > 0;
        boolean yPozitifMi = y>0;

        System.out.println("Her ikisi de pozitif mi? "+ (xPozitifMi && yPozitifMi));
        System.out.println("En az biri pozitif mi? "+ (xPozitifMi || yPozitifMi));
        System.out.println("a negatif mi? "+ (!xPozitifMi));


















    }
}