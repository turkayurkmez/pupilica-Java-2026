# Casting ve Sabitler

Bu proje, Java programlama dilinde **tür dönüşümü (casting)** ve **sabit değişkenler (final)** kavramlarını öğretmeyi amaçlayan bir eğitim projesidir.

## 🎯 Öğrenme Hedefleri

Bu projeyi tamamladığınızda şunları öğrenmiş olacaksınız:

1. **Sabit değişken tanımlama**: `final` anahtar kelimesini kullanarak değiştirilemez değişkenler oluşturma
2. **Otomatik tür dönüşümü (Implicit Casting)**: Küçük veri tiplerini büyük veri tiplerine otomatik dönüştürme
3. **Manuel tür dönüşümü (Explicit Casting)**: Büyük veri tiplerini küçük veri tiplerine zorla dönüştürme
4. **Veri kaybı kavramı**: Tür dönüşümlerinde ortaya çıkabilecek veri kayıplarını anlama
5. **ASCII kodları**: Karakterler ve sayılar arasındaki ilişkiyi kavrama
6. **String'den sayıya dönüşüm**: `Integer.parseInt()` metodunu kullanma

## 📚 Ele Alınan Konular

### 1. Sabitler (Constants)
```java
final double PI = 3.1459;
final int MAX_OGRENCI_SAYISI = 30;
final String EVET = "Evet";
```
- `final` anahtar kelimesi ile tanımlanır
- Değerleri program boyunca değiştirilemez
- Genellikle BÜYÜK_HARFLERLE yazılır
- Kodun okunabilirliğini ve güvenliğini artırır

### 2. Implicit Casting (Genişletme - Widening)
```java
int tamSayi = 200;
double deger = tamSayi;      // int → double (otomatik)
long buyukSayi = tamSayi;    // int → long (otomatik)
```
- Küçük tipten büyük tipe dönüşüm
- Otomatik olarak gerçekleşir
- Veri kaybı riski yoktur
- Sıralama: `byte → short → int → long → float → double`

### 3. Explicit Casting (Daraltma - Narrowing)
```java
int tamSayi = 200;
byte sekizBit = (byte) tamSayi;  // int → byte (manuel)
```
- Büyük tipten küçük tipe dönüşüm
- Manuel olarak belirtilmelidir
- **Veri kaybı riski vardır!**
- Parantez içinde hedef tip belirtilir

### 4. Karakter ve Sayı Dönüşümü
```java
char adinizinIlkHarfi = 'Ü';
int asciiCode = (char) adinizinIlkHarfi;  // Karakter → ASCII kodu
char harf = (char) 220;                    // ASCII kodu → Karakter
```
- Her karakterin bir ASCII/Unicode değeri vardır
- `char` ve `int` arasında dönüşüm yapılabilir
- 'Ü' karakterinin ASCII kodu: 220

### 5. String'den Sayıya Dönüşüm
```java
String ifade = scanner.next();
int sayi = Integer.parseInt(ifade);
```
- `Integer.parseInt()` metodu String'i int'e çevirir
- Kullanıcıdan alınan metinsel veriler sayıya dönüştürülür
- Hatalı formatta metin girilirse `NumberFormatException` hatası alınır

## 🚀 Projeyi Çalıştırma

```bash
# Derleme
javac src/Main.java

# Çalıştırma
java -cp src Main
```

## 💡 Kod Örnekleri ve Çıktılar

Program çalıştırıldığında şu çıktıları üretir:

```
200.0              // int'den double'a dönüşüm
200                // int'den long'a dönüşüm
-56                // 200 değeri byte'a sığmadığı için veri kaybı!
220                // 'Ü' karakterinin ASCII kodu
Ü                  // 220 ASCII kodunun karakter karşılığı
Bir sayı girin:
```

### ⚠️ Dikkat: Veri Kaybı
`byte sekizBit = (byte) 200;` işleminde sonuç **-56** çıkar çünkü:
- `byte` veri tipi -128 ile 127 arasında değer alabilir
- 200 bu aralığın dışındadır
- Overflow (taşma) nedeniyle beklenmedik sonuç oluşur

## 📝 Mini Ödev

Aşağıdaki görevleri tamamlayarak öğrendiklerinizi pekiştirin:

### Görev 1: Sıcaklık Dönüştürücü
Kullanıcıdan Celsius cinsinden sıcaklık alın ve Fahrenheit'a çevirin.
- Formül: `F = (C × 9/5) + 32`
- Dönüşüm sabitlerini `final` ile tanımlayın
- Sonuçları hem `int` hem `double` olarak gösterin

```java
// Örnek Çıktı:
// Celsius: 25
// Fahrenheit (int): 77
// Fahrenheit (double): 77.0
```

### Görev 2: Karakter Keşfi
Kullanıcıdan bir karakter alın ve:
1. Karakterin ASCII kodunu yazdırın
2. ASCII kodunu 1 artırın ve yeni karakteri gösterin
3. ASCII kodunu 1 azaltın ve yeni karakteri gösterin

```java
// Örnek Çıktı:
// Karakter: A
// ASCII Kodu: 65
// Bir sonraki karakter: B
// Bir önceki karakter: @
```

### Görev 3: Veri Kaybı Testi
Kullanıcıdan bir `double` sayı alın (örn: 123.456) ve:
1. Sayıyı `int`'e dönüştürün (ondalık kısmı kaybolur)
2. Sayıyı `long`'a dönüştürün
3. Sayıyı `float`'a dönüştürün
4. Her adımda kaybedilen veriyi kullanıcıya gösterin

```java
// Örnek Çıktı:
// Orijinal sayı (double): 123.456
// int'e dönüştürüldü: 123 (Kayıp: 0.456)
// long'a dönüştürüldü: 123 (Kayıp: 0.456)
// float'a dönüştürüldü: 123.456 (Kayıp: Yok)
```

### Bonus Görev: Tam Sayı Sınırları
Java'daki tüm tam sayı tiplerinin minimum ve maksimum değerlerini yazdıran bir program yazın:
- `byte`, `short`, `int`, `long`
- `Integer.MIN_VALUE`, `Integer.MAX_VALUE` gibi sabitleri kullanın
- Her tipin kaç byte yer kapladığını da gösterin

## 🔍 Sık Yapılan Hatalar

1. **final değişkeni değiştirmeye çalışmak**
   ```java
   final int SABIT = 10;
   SABIT = 20;  // ❌ HATA: Cannot assign a value to final variable
   ```

2. **Casting işaretini unutmak**
   ```java
   int sayi = 100;
   byte kucuk = sayi;  // ❌ HATA: Incompatible types
   byte kucuk = (byte) sayi;  // ✅ DOĞRU
   ```

3. **Veri kaybını göz ardı etmek**
   ```java
   int buyuk = 300;
   byte kucuk = (byte) buyuk;  // ⚠️ Veri kaybı: -44
   ```

## 📖 İlgili Kaynaklar

- [Oracle Java Documentation - Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
- [Java Type Casting](https://www.w3schools.com/java/java_type_casting.asp)
- [ASCII Table](https://www.asciitable.com/)

## 👨‍💻 Geliştirme Önerileri

Projeyi geliştirmek için:
- Kullanıcı girişi doğrulama (try-catch ile hata yönetimi)
- Menü sistemi ekleme (1: Casting, 2: ASCII, 3: Sabitler)
- Daha fazla dönüşüm örneği (hex, binary, octal)
- Grafik arayüz (JavaFX ile)

---

**Not**: Bu proje Java 101 eğitim serisinin bir parçasıdır. Sorularınız için issue açabilir veya pull request gönderebilirsiniz.
