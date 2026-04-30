# Java Karar Yapıları - Switch-Case Kullanımı 🚦

## 📚 Proje Hakkında

Bu proje, Java programlama dilinde karar yapılarını (if-else ve switch-case) öğrenmek için hazırlanmış bir trafik ışığı simülasyonudur. Aynı mantığın hem if-else hem de switch-case yapılarıyla nasıl uygulanabileceğini gösterir.

## 🎯 Öğrenme Hedefleri

Bu projeyi tamamladığınızda:

- ✅ **If-else** yapısının nasıl kullanıldığını anlayacaksınız
- ✅ **Switch-case** yapısının nasıl çalıştığını öğreneceksiniz
- ✅ Her iki yapının farklılıklarını ve kullanım alanlarını keşfedeceksiniz
- ✅ **Scanner** sınıfıyla kullanıcıdan veri almayı pekiştireceksiniz
- ✅ **Break** ifadesinin switch-case'deki önemini kavrayacaksınız
- ✅ Gerçek hayat senaryolarını (trafik ışıkları) kod ile modellemeyi öğreneceksiniz

## 📖 Ele Alınan Konular

### 1. If-Else Yapısı
```java
if (secim == 1) {
    System.out.println("DUR!");
} else if (secim == 2) {
    System.out.println("DİKKAT!");
} else if (secim == 3) {
    System.out.println("GEÇ");
} else {
    System.out.println("Hatalı seçim");
}
```
- Çoklu koşul kontrolü
- Else if zincirleme kullanımı
- Varsayılan durum için else bloğu

### 2. Switch-Case Yapısı
```java
switch (secim) {
    case 1:
        System.out.println("DUR!");
        break;
    case 2:
        System.out.println("DİKKAT!");
        break;
    case 3:
        System.out.println("GEÇ");
        break;
}
```
- Sabit değerlerle karşılaştırma
- Break ifadesinin kullanımı
- Daha okunabilir kod yapısı

### 3. Scanner ile Kullanıcı Girişi
- Scanner sınıfının import edilmesi
- `nextInt()` metodu ile tam sayı alma
- Kullanıcı etkileşimli program oluşturma

## 🔄 If-Else vs Switch-Case: Hangisi Ne Zaman?

| Özellik | If-Else | Switch-Case |
|---------|---------|-------------|
| **Esneklik** | Karmaşık koşullar (>, <, &&, \|\|) | Sadece eşitlik kontrolü (==) |
| **Okunabilirlik** | Çok seçenekte karmaşık | Çok seçenekte daha temiz |
| **Performans** | Tüm koşulları kontrol eder | Doğrudan ilgili case'e atlar |
| **Kullanım Alanı** | Aralık kontrolü, karmaşık mantık | Menü seçimleri, durum kontrolü |

## 🚀 Nasıl Çalıştırılır?

1. Projeyi IntelliJ IDEA veya herhangi bir Java IDE'sinde açın
2. `Main.java` dosyasını çalıştırın
3. Konsola 1, 2 veya 3 yazarak trafik ışığı seçin
4. Sonuçları gözlemleyin

## 💡 Mini Ödev

### Seviye 1: Başlangıç
Mevcut kodu geliştirin:
1. Switch-case yapısına `default` durumu ekleyin (hatalı seçimler için)
2. Kod içindeki tekrarları kaldırarak sadece **switch-case** kullanın
3. Yeşil ışık için "GEÇ" yerine "HADİ GEÇ!" yazdırın

### Seviye 2: Orta
Yeni bir program yazın:
```
Bir hesap makinesi oluşturun:
- Kullanıcıdan iki sayı alın
- İşlem seçimi yaptırın (+, -, *, /)
- Switch-case kullanarak sonucu hesaplayın
- Bölme için sıfıra bölme kontrolü ekleyin
```

### Seviye 3: İleri
Gelişmiş trafik sistemi:
```
- 4 yönlü kavşak simülasyonu yapın (Kuzey, Güney, Doğu, Batı)
- Her yön için farklı süre sayan bir sistem
- Switch-case içinde switch-case (nested) kullanın
- Sarı ışıkta geri sayım ekleyin
```

## 🐛 Kod İyileştirme Önerileri

Mevcut kodda fark ettiniz mi?
- Switch-case'de `default` durumu eksik
- If-else ve switch-case aynı işi yapıyor (tekrar var)
- Switch-case'deki son break gereksiz (ama iyi pratik!)

**Bonus Görev:** Bu iyileştirmeleri uygulayın! 💪

## 📝 Notlar

- `break` ifadesini unutursanız, bir sonraki case'ler de çalışır (fall-through)
- Switch-case sadece int, String, enum ve char tipleriyle çalışır
- Modern Java'da (Java 14+) switch-expression da kullanılabilir

## 🌟 İleri Okuma

- Java Documentation: [Switch Statements](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)
- Switch Expression (Java 14+)
- Pattern Matching for Switch (Java 17+)

---

**Keyifli Kodlamalar!** ☕️💻

