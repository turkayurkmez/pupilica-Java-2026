import java.util.ArrayList;
import java.util.List;

public class Yemek {
    private List<String> malzemeler = new ArrayList<>();

    private double fiyat;

    private int pismeSuresi;

    private String yemekAdi;


    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getPismeSuresi() {
        return pismeSuresi;
    }

    public void setPismeSuresi(int pismeSuresi) {
        this.pismeSuresi = pismeSuresi;
    }

    public String getYemekAdi() {
        return yemekAdi;
    }

    public void setYemekAdi(String yemekAdi) {
        this.yemekAdi = yemekAdi;
    }

    public void Pisir(){
        System.out.println(yemekAdi + " " + pismeSuresi + " dakikada pişti");
    }

    public void sunumYap(){
        System.out.println(yemekAdi +  ",  yanında pilav ile sunuldu"  );
    }
}
