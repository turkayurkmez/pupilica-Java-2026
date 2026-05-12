public class RaporOlusturucu {



    /*
    * Varsayılan değerleri belirlemek için parametresiz cons.*/
//    public RaporOlusturucu(){
//        format = "PDF";
//    }

    public RaporOlusturucu(String excelDosyasi){
//        if (excelDosyasi == null || excelDosyasi.isEmpty()) {
//            throw new IllegalArgumentException("excel dosyası olmadan rapor üretilemez");
//        }
//
//        format = "PDF";

        //aynı şeyi iki kere yapmak yerine, bir constructor'un diğerini çağırmasını sağlıyoruz:
        this(excelDosyasi,"PDF");

    }

    public RaporOlusturucu(String excelDosyasi, String format){

        if (excelDosyasi == null || excelDosyasi.isEmpty()) {
            throw new IllegalArgumentException("excel dosyası olmadan rapor üretilemez");
        }
        this.format = format;
    }



    private String format;
    private String title;
    private String excelDosyasi;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
