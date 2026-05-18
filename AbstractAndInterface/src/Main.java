//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        PDFDokuman pdf = new PDFDokuman();
        ExcelDokuman excelDokuman = new ExcelDokuman();
        WordDokuman wordDokuman = new WordDokuman();

        DokumanYukleyici yukleyici = new DokumanYukleyici();
        yukleyici.DokumaniAc(pdf);
        yukleyici.DokumaniAc(excelDokuman);
        yukleyici.DokumaniAc(wordDokuman);

        DokumanYazici yazici = new DokumanYazici();
        yazici.ciktiAl(excelDokuman);
        yazici.ciktiAl(wordDokuman);
      //  yazici.ciktiAl(pdf);

    }
}