public class Urun {


    /*
    Encapsulation: nesneye ait bir özelliğe doğrudan erişmek yerine
    getter ve setter fonksiyonları yazılarak, söz konusu field "kapsül" içine alınır.
    * */
    private int id;
    private String ad;
    private double fiyat;
    private int stok;


    public void setFiyat(double deger){
        if (deger<=0){
            throw new IllegalArgumentException("fiyat negatif olamaz");
        }

        this.fiyat = deger;
    }

    public double getFiyat(){
        return this.fiyat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public boolean urunVarMi(){
        return this.stok > 0;
    }


}
