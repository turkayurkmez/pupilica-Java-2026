public abstract class Dokuman {

    private String baslik;

    public void kopyala(String nereden, String nereye){
        System.out.println("Dosya kopyalandı");
    }

    public void tasi(String nereden, String nereye){
        System.out.println("Dosya taşındı");
    }

    public abstract void dokumaniAc();

    public abstract void kaydet();
   // public abstract void ciktiAl();

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }
}
