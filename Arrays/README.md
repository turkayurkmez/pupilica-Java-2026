# Java 101 - Diziler (Arrays)

## 📚 Proje Hakkında

Bu proje, Java programlama dilinde dizilerin (arrays) temel kullanımını öğretmek için hazırlanmış bir eğitim projesidir. Öğrenci not sistemi üzerinden dizilerin farklı kullanım şekillerini pratik örneklerle gösterir.

## 🎯 Öğrenme Hedefleri

Bu projeyi tamamladığınızda:

- ✅ Java'da dizi tanımlama yöntemlerini öğreneceksiniz
- ✅ Dizi elemanlarına nasıl erişileceğini kavrayacaksınız
- ✅ `length` özelliği ile dizi boyutu hesaplamasını yapabileceksiniz
- ✅ Diziler üzerinde döngü (loop) kullanmayı öğreneceksiniz
- ✅ Geleneksel `for` ve gelişmiş `for-each` döngüleri arasındaki farkı anlayacaksınız
- ✅ Kullanıcıdan alınan verilerle dinamik dizi oluşturabileceksiniz
- ✅ Paralel diziler (parallel arrays) kullanarak ilişkili verileri saklayabileceksiniz

## 📖 Ele Alınan Konular

### 1. Bilinen Elemanlarla Dizi Oluşturma
```java
int[] notlar = {85, 92, 70, 55, 100};
String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe"};
```

### 2. Dizi Elemanlarına Erişim
- İndeks (index) kullanarak elemanlara erişim: `notlar[0]`
- Dizi uzunluğu: `notlar.length`
- Son elemana erişim: `notlar[notlar.length-1]`

### 3. Geleneksel For Döngüsü ile Dizileri Dolaşma
```java
for (int i = 0; i < notlar.length; i++) {
    System.out.println(notlar[i]);
}
```

### 4. Gelişmiş For-Each Döngüsü
```java
for (int not : notlar) {
    System.out.print(not + " - ");
}
```

### 5. Boyutu Bilinen Ancak Değerleri Bilinmeyen Diziler
```java
String[] ogrenciler = new String[ogrenciSayisi];
int[] puanlar = new int[ogrenciSayisi];
```

### 6. Scanner ile Kullanıcı Girişi Alma
- Kullanıcıdan veri okuma
- Dinamik dizi doldurma
- İlişkili verileri paralel dizilerde saklama

## 🚀 Projeyi Çalıştırma

1. Projeyi IDE'nizde açın (IntelliJ IDEA, Eclipse, vs.)
2. `Main.java` dosyasını çalıştırın
3. Konsola sınıftaki öğrenci sayısını girin
4. Her öğrenci için isim ve puan bilgilerini sırasıyla girin
5. Program tüm öğrencilerin bilgilerini listeleyecektir

## 💡 Kod Örnekleri

### Örnek Çıktı
```
eleman sayısı: 5
son indexteki değer: 100
1. öğrencinin notu: 85
2. öğrencinin notu: 92
3. öğrencinin notu: 70
4. öğrencinin notu: 55
5. öğrencinin notu: 100
85 - 92 - 70 - 55 - 100 - 

Sınıfta kaç kişi var?
3
Öğrenci Adı:
Ahmet
Puanı: 
95
Öğrenci Adı:
Ayşe
Puanı:
87
Öğrenci Adı:
Mehmet
Puanı:
78

Ahmet isimli öğrencinin puanı: 95
Ayşe isimli öğrencinin puanı: 87
Mehmet isimli öğrencinin puanı: 78
```

## 📝 Mini Ödev

Aşağıdaki görevleri tamamlayarak diziler konusundaki bilginizi pekiştirin:

### Görev 1: Not Ortalaması Hesaplama (Kolay)
Mevcut `notlar` dizisindeki tüm notların ortalamasını hesaplayan bir kod yazın.

**İpucu:** Tüm notları toplayıp, dizi uzunluğuna bölün.

### Görev 2: En Yüksek ve En Düşük Not (Orta)
Kullanıcıdan alınan notlar arasından en yüksek ve en düşük notu bulan bir program yazın.

**İpucu:** Bir `enYuksek` ve `enDusuk` değişkeni tanımlayıp, döngü içinde karşılaştırma yapın.

### Görev 3: Öğrenci Arama Sistemi (Zor)
Kullanıcıdan bir öğrenci adı alın ve bu öğrencinin notunu ekrana yazdırın. Eğer öğrenci bulunamazsa "Öğrenci bulunamadı" mesajı verin.

**İpucu:** Döngü ile `ogrenciler` dizisini tarayın ve girilen isimle eşleşme arayın.

### Bonus Görev: Geçme Notu Kontrolü (Ekstra)
50'nin altında not alan öğrencileri "Kaldı", 50 ve üzerinde not alanları "Geçti" olarak işaretleyen bir program yazın.

## 🔍 Öğrenme İpuçları

1. **İndeks 0'dan başlar:** Java dizilerinde ilk eleman `[0]` indeksindedir
2. **ArrayIndexOutOfBoundsException:** Dizinin sınırları dışına çıkmamaya dikkat edin
3. **For-each döngüsü:** Sadece okuma işlemleri için uygundur, değer değiştirme için geleneksel for kullanın
4. **Paralel diziler:** İlişkili verileri aynı indekste tutmaya özen gösterin

## 📚 İleri Konular

Bu projeyi tamamladıktan sonra şu konulara göz atabilirsiniz:
- Çok boyutlu diziler (2D Arrays)
- ArrayList ve dinamik listeler
- Arrays sınıfı ve yardımcı metodları (`Arrays.sort()`, `Arrays.equals()`)
- Dizi kopyalama ve manipülasyon teknikleri

---

**Mutlu kodlamalar!** 🎉
