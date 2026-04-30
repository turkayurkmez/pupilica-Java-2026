# Java Operatörler (Operators)

## 📚 Öğrenme Hedefleri

Bu proje ile aşağıdaki konularda bilgi ve deneyim kazanacaksınız:

- Java'da temel operatör türlerini öğrenmek
- Aritmetik işlemleri doğru şekilde kullanabilmek
- Karşılaştırma operatörleriyle karar mekanizmaları oluşturabilmek
- Birleşik operatörlerle kod yazımını kısaltabilmek
- Prefix ve suffix artırma/azaltma operatörlerinin farkını anlamak
- Mantıksal operatörlerle boolean ifadeler oluşturabilmek

## 🎯 Ele Alınan Konular

### 1. Aritmetik Operatörler
Program, iki sayı üzerinde temel matematiksel işlemleri gerçekleştirir:
- `+` Toplama
- `-` Çıkarma
- `*` Çarpma
- `/` Bölme
- `%` Mod alma (kalan bulma)

```java
System.out.println("Toplam :" + (x+y));
System.out.println("Kalan  :" + ((int)x % (int)y));
```

### 2. Karşılaştırma Operatörleri
İki değeri karşılaştırarak `boolean` (true/false) sonuç döndürür:
- `>` Büyüktür
- `<` Küçüktür
- `==` Eşittir
- `!=` Eşit değildir
- `>=` Büyük veya eşittir _(projede yok ama bilmeniz önemli)_
- `<=` Küçük veya eşittir _(projede yok ama bilmeniz önemli)_

```java
System.out.println(x + ">" + y + " : " + (x > y));
```

### 3. Birleşik Atama Operatörleri
Bir değişken üzerinde işlem yapıp sonucu aynı değişkene atamayı kolaylaştırır:
- `+=` Ekle ve ata
- `-=` Çıkar ve ata
- `*=` Çarp ve ata
- `/=` Böl ve ata
- `%=` Mod al ve ata _(projede yok)_

```java
sayi += 10;  // sayi = sayi + 10; ile aynı
sayi *= 2;   // sayi = sayi * 2; ile aynı
```

### 4. Artırma ve Azaltma Operatörleri (Prefix vs Suffix)
Bir değişkeni 1 artırma veya azaltma işlemleri:

**Prefix (`++x`)**: Önce artır, sonra kullan
```java
System.out.println("++x --> " + ++varsayilan); // Önce artırır, sonra yazdırır
```

**Suffix (`x++`)**: Önce kullan, sonra artır
```java
System.out.println("x++ -->" + varsayilan++); // Önce yazdırır, sonra artırır
```

### 5. Mantıksal Operatörler
Boolean değerler üzerinde mantıksal işlemler yapar:
- `&&` VE (AND) - Her iki koşul da doğru olmalı
- `||` VEYA (OR) - En az bir koşul doğru olmalı
- `!` DEĞİL (NOT) - Değeri tersine çevirir

```java
System.out.println("Her ikisi de pozitif mi? "+ (xPozitifMi && yPozitifMi));
System.out.println("En az biri pozitif mi? "+ (xPozitifMi || yPozitifMi));
```

## 🚀 Programı Çalıştırma

```bash
# Derleme
javac src/Main.java

# Çalıştırma
java -cp src Main
```

## 💡 Örnek Çıktı

```
İlk sayıyı girin: 15
İkinci sayıyı girin: 4

----- Aritmetik Operatörler -----
Toplam :19.0
Fark :11.0
Çarpım :60.0
Bölüm  :3.75
Kalan  :3
---- Karşılaştırma operatörler ----
15.0>4.0 : true
15.0<4.0 : false
15.0==4.0 : false
15.0!=4.0 : true
---- Birleşik operatörler ------
2
---------- prefix ve suffix ----------
Sayının ilk değeri 10
++x --> 11
x++ -->11
Sayının şu anki değeri  --> 12
 -------- Mantıksal operatörler ---------
Her ikisi de pozitif mi? true
En az biri pozitif mi? true
a negatif mi? false
```

## 📝 Mini Ödev

Aşağıdaki ödevleri yaparak konuyu pekiştirebilirsiniz:

### Görev 1: Gelişmiş Hesap Makinesi
Mevcut programa aşağıdaki özellikleri ekleyin:
- Üs alma işlemi (`Math.pow()` kullanabilirsiniz)
- Karekök alma (`Math.sqrt()` kullanabilirsiniz)
- Mutlak değer bulma

### Görev 2: Prefix vs Suffix Challenge
Aşağıdaki kodun çıktısını tahmin edin, sonra çalıştırıp kontrol edin:
```java
int a = 5;
int b = a++ + ++a;
System.out.println("a: " + a + ", b: " + b);
```

### Görev 3: Not Sistemi
Kullanıcıdan bir sınav notu alın (0-100) ve aşağıdaki mantıksal operatörlerle kontroller yapın:
- Not 0-100 arasında mı?
- Öğrenci geçti mi? (>=50)
- Öğrenci takdir aldı mı? (>=85)
- Öğrenci başarısız oldu mu? (<50)

### Görev 4: Sayı Özellikleri
İki sayı alın ve mantıksal operatörlerle şunları kontrol edin:
- Her iki sayı da çift mi?
- En az bir sayı tek mi?
- Her iki sayı da negatif mi?
- Sayıların toplamı 100'den büyük mü ve her ikisi de pozitif mi?

## 🤔 Düşünelim

1. `x++` ile `++x` arasındaki farkı ne zaman önemli olur?
2. `&&` operatörü, sol taraf `false` ise sağ tarafı kontrol eder mi? (Short-circuit evaluation)
3. `a = a + 1` yerine neden `a += 1` veya `a++` kullanmalıyız?

## 📖 Ek Kaynaklar

- [Oracle Java Operators Documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
- Java operatörlerin öncelik sırası (Operator Precedence)
- Bitwise operatörler (İleri seviye)

---

**Not:** Bu proje Java programlamada operatörlerin temellerini öğrenmek için hazırlanmıştır. Pratik yaparak öğrenmenin en iyi yol olduğunu unutmayın! 💪
