//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EtYemek kofte = new EtYemek();
        kofte.setYemekAdi("Köfte");
        kofte.setEtTuru("Dana kıyma");
        kofte.setEkstraSosVarMi(true);
        kofte.setPismeSuresi(45);

        SebzeYemek bezelye = new SebzeYemek();
        bezelye.setYemekAdi("Bezelye");
        bezelye.setZeytinYagliMi(true);
        bezelye.setPismeSuresi(30);

        Tatli tulumba = new Tatli();
        tulumba.setSerbetliMi(true);
        //tulumba.setSerbetliMi(false);
        tulumba.setPismeSuresi(20);
        tulumba.setYemekAdi("Tulumba");

        Asci asci = new Asci();
        asci.Pisir(kofte);
        asci.Pisir(bezelye);
        asci.Pisir(tulumba);


    }
}