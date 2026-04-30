import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Lütfen trafik ışığı seçin:\n1. Kırmızı\n2. Sarı\n3.Yeşil ");
        Scanner scanner = new Scanner(System.in);

        int secim = scanner.nextInt();

        if (secim == 1){
            System.out.println("DUR!");
        } else if (secim == 2) {
            System.out.println("DİKKAT!");
        } else if (secim == 3) {
            System.out.println("GEÇ");
        }
        else {
            System.out.println("Hatalı seçim");
        }

        switch (secim){
            case 1:
                System.out.println("DUR!");
                break;
            case 2:
                System.out.println("DİKKAT!");
                break;
            case 3:
                System.out.println("GEÇ");
                break;


        }


    }
}