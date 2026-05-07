import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] sayilar = {64,25,11,22,9};
        System.out.println("Sıralamadan önce: "+ Arrays.toString(sayilar));

        Arrays.sort(sayilar);
        System.out.println("Sıralamadan sonra: "+ Arrays.toString(sayilar));

        //DİKKAT: Binary Search için array'ın sıralanmış olması gerekir.
        int arananSayi = 22;
        int index = Arrays.binarySearch(sayilar,arananSayi);
        System.out.println(arananSayi + " sayısının indexi " + index);

        int[] bos = new int[7];
        Arrays.fill(bos,10);
        System.out.println(Arrays.toString(bos));

    }
}