public class ExcelDokuman extends Dokuman implements CiktiAlinabilir {
    @Override
    public void dokumaniAc() {
        System.out.println("Excel dokümanı açıldı ");

    }

    @Override
    public void kaydet() {
        System.out.println("Excel dokümanı kaydedildi ");

    }

    @Override
    public void ciktiAl() {

    }

//    @Override
//    public void ciktiAl() {
//
//    }
}
