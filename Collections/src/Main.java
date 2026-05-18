import javax.sound.midi.Soundbank;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
       // usingArrayList(scanner);
       // usingHashSet(scanner);
        //usingHashMap(scanner);
//        birSeyYap("Bu bir string");
//        birSeyYap(8);
        //hasmapScenario();

        usingIterator();

    }

    private static void usingHashSet(Scanner scanner){
        HashSet<String> participants = new HashSet<>();

        System.out.println(" Gezi kayıt sistemi ");
        System.out.println("TC kimlik no girin. Çıkmak için q");

        while (true){
            System.out.println("TC Kimlik no:");
            String tcKimlikNo = scanner.nextLine().trim();

            if(tcKimlikNo.equalsIgnoreCase("q")) break;
            if(tcKimlikNo.isEmpty()) continue;

            boolean isAdded = participants.add(tcKimlikNo);
            if (isAdded){
                System.out.println(tcKimlikNo + " başarıyla eklendi");
            }
            else {
                System.out.println("Daha önce eklenmiş. Tekrar eklenmedi");
            }

        }

        System.out.println("Hashset içindeki değerler");


        for (int i = 0; i < 20; i++) {
            for (String  element : participants){
                System.out.println(element);
            }

            System.out.println("---------------------");
        }




    }

    private static void usingArrayList(Scanner scanner) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Ürün eklemek için adını yazın çıkmak için q girin");


        while (true){
            System.out.println("Ürün Adı:");
            String element = scanner.next().trim();
            if (element.equalsIgnoreCase("q")) {
                break;
            }

            if (element.isEmpty()) {
                continue;
            }
            list.add(element);
            System.out.println("Ürün eklendi. Şu anda sepette "+ list.size()  + " eleman var.");



           // Object o = 5;



        }

        System.out.println("Alışveriş listeniz:");
        for (String item : list){
           System.out.println(item);
        }

        System.out.println("Aranacak ürünün adı:");
        String aranacakUrun = scanner.next().trim();

        if (list.contains(aranacakUrun)){
            System.out.println("Bu ürün, sepette bulunuyor.");
        }

        System.out.println("Silinecek ürün adı:");
        String toRemove = scanner.next().trim();
        if (list.contains(toRemove)){
            list.remove(toRemove);
        }else {
            System.out.println("Listede yok!");
        }

        System.out.println("Güncel durum:" + list);
    }

    private static void usingHashMap(Scanner scanner){
        HashMap<String,String> plates = new HashMap<>();

        System.out.println("Plaka kodu ve il giriniz. Çıkmak için q");

        while (true){
            System.out.println("Plaka kodu:");
            String plateCode = scanner.nextLine();
            if (plateCode.equalsIgnoreCase("q")) break;
            System.out.println("Şehir adını girin:");
            String city = scanner.nextLine();

            plates.put(plateCode,city); //eğer aynı plateCode key'ini bir kez daha girerseniz.
                                        //veriyi ona göre günceller.




        }

        System.out.println(" --- Plaka koduna göre şehir arama ---");
        System.out.println("Plaka kodunu girin çıkmak için q girin");

        while (true){
            System.out.println("Plaka kodu:");
            String key = scanner.nextLine();

            if (key.equalsIgnoreCase("q")) break;

            String value = plates.get(key);
            if (value == null) {
                System.out.println("Bu plaka kodu koleksiyonda yok!");
            }else {
                System.out.println(key + " plaka kodu, " + value + " şehrine ait");
            }



        }

        for (Map.Entry<String,String> entry : plates.entrySet() ){
            System.out.println(entry.getKey() + " --> "+ entry.getValue());
        }



    }

    private static void hasmapScenario(){

        String[] cities = {"İstanbul","İstanbul","Ankara","Eskişehir","İzmir","İzmir","Sivas","İzmir"};
        /*
          İstanbul: 2
          Ankara: 1
          Eskişehir: 1
          Sivas: 1
          İzmir: 3
        * */
        HashMap<String,Integer> citiesCount = new HashMap<>();
        for (String city : cities){
            int current = citiesCount.getOrDefault(city,0);
            citiesCount.put(city, current+1);
        }

        System.out.println("Şehir bilgisi:" + citiesCount);

    }


    private static void usingIterator(){
        ArrayList<String> liste = new ArrayList<>();
        liste.add("IPhone");
        liste.add("Samsung");
        liste.add("Huawei");
        liste.add("Xiaomi");

        for (String marka : liste){

            System.out.println(marka);
            //liste.remove(marka); NOT: for-each içerisinde, içinde döndüğünüz koleksiyona
            // müdahale edemezsiniz. Çünkü, foreach "yield iterable"dır. Peki bunu yapmanız
            // gerekirse ne olacak?
        }

        Iterator<String> listeIterator = liste.iterator();
        while (listeIterator.hasNext()){
            String m = listeIterator.next();

            if (m.equalsIgnoreCase("Samsung")){
                listeIterator.remove();
            }

        }
        //Alternatif iterator ile uğraşamam diyorsanız, döngüden sonra removeIf de kullanabilirsiniz.
        liste.removeIf(m -> m.equalsIgnoreCase("Iphone"));

        System.out.println("Son hali: "+ listeIterator.hasNext());

    }

//    static int birSeyYap(Object x){
//        /*
//        Boxing: Object bir tipe değer atamak.
//        Unboxing: Object içindeki değeri orijinal tipe cast etmek:
//        * */
//        int sample = (int)x;
//        return 0;
//    }
}