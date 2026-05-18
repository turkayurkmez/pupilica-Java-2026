import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Bir sayı girin: ");
            int sayi1 = scanner.nextInt();
            System.out.println("Bir sayı daha girin: ");
            int sayi2 = scanner.nextInt();

            int sonuc = sayi1 / sayi2;

            System.out.println("Bölme işlemi sonucu: "+ sonuc);
        } catch (InputMismatchException e) {
            System.out.println("Sayılar sadece rakam içermeli");
        }catch (ArithmeticException e){
            System.out.println("Tam sayılar 0'a bölünemez!!!");
        }catch (Exception e){
            System.out.println("Bilinmeyen bir hata oluştu. Mesajı:"+e.getMessage());
        }


        System.out.println("Ürün adını girin");
        String name = scanner.next();

        System.out.println("Ürün fiyatı:");
        double price = scanner.nextDouble();

        System.out.println("Fiyat para birimi");
        String currency = scanner.next();

        Product p = new Product();
        p.setName(name);

        try {
            p.setPrice(price);
            p.setCurrency(currency);

            System.out.println("Ürün oluşturuldu:" + p.getName() + " " + p.getPrice() + " " + p.getCurrency());

        }
        catch (AmountMustBePositiveException e){
            System.out.println(e.getMessage());
        }
        catch (CurrencyInvalidException e){
            System.out.println(e.getMessage());
        }



    }
}