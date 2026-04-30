# Java Döngüler (Loops) Projesi 🔄

## 📚 Öğrenme Hedefleri

Bu proje ile:
- Java'da döngü yapılarını (while, do-while, for) öğreneceksiniz
- Döngülerin hangi durumlarda kullanılacağını anlayacaksınız
- `break` ve artırma/azaltma operatörlerini kullanacaksınız
- Kullanıcıdan girdi alarak interaktif programlar yazacaksınız
- Döngü kontrol yapılarını ve koşullarını öğreneceksiniz

## 🎯 Ele Alınan Konular

### 1. While Döngüsü
**Kullanım Durumu:** Koşul sağlandığı sürece çalışır.

```java
while (koşul) {
    // Koşul doğru olduğu sürece çalışacak kod
}
```

**Projede Uygulanışı:**
- **Sayı Toplama:** Kullanıcı 0 girene kadar sayıları toplar
- **PIN Doğrulama:** 3 deneme hakkıyla PIN kontrolü yapar

### 2. Do-While Döngüsü
**Kullanım Durumu:** En az bir kere çalışması gereken döngüler için.

```java
do {
    // En az bir kere çalışacak kod
} while (koşul);
```

**Projede Uygulanışı:**
- PIN kodu kontrolü (kullanıcı en az bir kere girdi yapmak zorunda)

### 3. For Döngüsü
**Kullanım Durumu:** Belirli sayıda tekrar için ideal.

```java
for (başlangıç; koşul; artış/azalış) {
    // Belirlenen sayıda çalışacak kod
}
```

**Projede Uygulanışı:**
- Geri sayım yapma (kullanıcının belirlediği sayıdan 0'a kadar)

### 4. Döngü Kontrol İfadeleri
- **break:** Döngüyü tamamen sonlandırır
- **Koşul Kontrolü:** `if` ile döngü içinde karar verme
- **Artırma/Azaltma:** `++` ve `--` operatörleri

## 💡 Proje Özellikleri

### Örnek 1: Sayı Toplama
```
Kullanıcı istediği kadar sayı girebilir
Anlık toplam her adımda gösterilir
0 girildiğinde program sonuçları gösterir
```

### Örnek 2: PIN Doğrulama (While)
```
3 deneme hakkı vardır
Doğru PIN: 1234
Her yanlış denemede kalan hak azalır
```

### Örnek 3: PIN Doğrulama (Do-While)
```
Do-while yapısıyla farklı bir yaklaşım
Doğru PIN: 9876
Kullanıcı en az bir kere deneme yapmak zorunda
```

### Örnek 4: Geri Sayım
```
Kullanıcı başlangıç sayısını belirler
For döngüsü ile 0'a kadar geri sayar
```

## 🚀 Programı Çalıştırma

```bash
javac src/Main.java
java -cp src Main
```

## 🎓 Mini Ödevler

### Ödev 1: Basit (⭐)
**Çift Sayıları Yazdır**
- 1'den 100'e kadar olan çift sayıları yazdıran bir for döngüsü yazın
- İpucu: `%` (mod) operatörünü kullanın

### Ödev 2: Orta (⭐⭐)
**Şifre Gücü Kontrolü**
- Kullanıcıdan şifre isteyin
- While döngüsü kullanarak şifrenin en az 8 karakter olmasını kontrol edin
- Şifre 8 karakterden kısa olduğu sürece tekrar isteyin

### Ödev 3: İleri (⭐⭐⭐)
**Çarpım Tablosu Oluşturucu**
- İç içe (nested) for döngüleri kullanarak 1-10 arası çarpım tablosu yazdırın
- Örnek çıktı formatı:
```
1 x 1 = 1    1 x 2 = 2    1 x 3 = 3 ...
2 x 1 = 2    2 x 2 = 4    2 x 3 = 6 ...
...
```

### Ödev 4: Zorlayıcı (⭐⭐⭐⭐)
**Tahmin Oyunu**
- Program 1-100 arası rastgele bir sayı seçsin (Math.random() kullanın)
- Kullanıcı tahmin yapsın
- "Daha büyük" veya "Daha küçük" ipucu verin
- Kullanıcı doğru tahmin edene kadar döngü devam etsin
- Kaç denemede bulduğunu gösterin

### Ödev 5: Uzman (⭐⭐⭐⭐⭐)
**Fibonacci Serisi Yazdırıcı**
- Kullanıcıdan kaç terim istediğini sorun
- While veya for döngüsü kullanarak Fibonacci serisini yazdırın
- Örnek: 0, 1, 1, 2, 3, 5, 8, 13, 21...
- Bonus: Her terimi toplamlarıyla birlikte gösterin

## 🤔 While vs Do-While Farkı

| While | Do-While |
|-------|----------|
| Koşul başta kontrol edilir | Koşul sonda kontrol edilir |
| Hiç çalışmayabilir | En az bir kez çalışır |
| Girdi kontrolünde kullanışlı | Menü sistemlerinde ideal |

## 📖 Öğrenme Notları

- **While:** Koşul sağlandığı sürece döner
- **Do-While:** İşlemi yap, sonra koşulu kontrol et
- **For:** Sayaç gerektiren işlemler için optimize
- **break:** Döngüden anında çık
- **continue:** Mevcut iterasyonu atla, döngüye devam et (projede kullanılmamış)

## 🔧 Geliştirme Önerileri

1. Hata yönetimi ekleyin (try-catch)
2. Sayı yerine harf girilmesi durumunu kontrol edin
3. Kullanıcı deneyimini artıracak mesajlar ekleyin
4. Döngü sayaçlarını göstererek öğrenmeyi pekiştirin

---

**İyi Çalışmalar! 🚀**

> *"Programlama öğrenmek, düşünmeyi öğrenmektir."*
