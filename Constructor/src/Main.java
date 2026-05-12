//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            /*
              Uygulamada bir Excel dosyasından veri çekerek
              isteğe göre PDF veya HTML formatında çıktı üreten bir
              rapor üreticisi var.
            * */

//        RaporOlusturucu raporOlusturucu = new RaporOlusturucu();
  //      System.out.println(raporOlusturucu.getFormat());

        RaporOlusturucu rpr = new RaporOlusturucu("C:\\credits.xslx");
        System.out.println(rpr.getFormat());

        RaporOlusturucu rpr2 = new RaporOlusturucu("C:\\performans.xslx","HTML");

    }
}