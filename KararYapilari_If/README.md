# Karar Yapıları - If/Else Statements

Bu proje, Java programlama dilinde **karar yapıları (if-else)** konusunu öğrenmek için hazırlanmış basit bir kullanıcı doğrulama uygulamasıdır.

## 📚 Öğrenme Hedefleri

Bu proje ile aşağıdaki konuları öğreneceksiniz:

- ✅ Java'da temel karar yapılarını kullanma
- ✅ If-else ve else-if yapılarını anlama ve uygulama
- ✅ Mantıksal operatörleri (`&&`, `||`) kullanma
- ✅ String karşılaştırma işlemlerini doğru yapma (`.equals()` metodu)
- ✅ Kullanıcıdan girdi alma (Scanner sınıfı)
- ✅ Program akışını kontrol etme (`return` ifadesi)

## 🎯 Ele Alınan Konular

### 1. **If-Else Yapısı**
Programın farklı koşullara göre farklı kod bloklarını çalıştırmasını sağlar.

```java
if (kosul) {
    // Koşul doğruysa bu blok çalışır
} else if (baska_kosul) {
    // İlk koşul yanlış, bu koşul doğruysa bu blok çalışır
} else {
    // Hiçbir koşul doğru değilse bu blok çalışır
}
```

### 2. **Mantıksal Operatörler**
- `&&` (VE operatörü): Her iki koşul da doğru olmalı
- `||` (VEYA operatörü): Koşullardan en az biri doğru olmalı

### 3. **String Karşılaştırma**
Java'da String'leri karşılaştırırken `==` yerine `.equals()` metodu kullanılır:
```java
if (kullaniciAdi.equals("turkay")) {
    // Doğru kullanım
}
```

### 4. **Scanner Sınıfı**
Kullanıcıdan konsol üzerinden girdi almak için kullanılır:
```java
Scanner scanner = new Scanner(System.in);
String girdi = scanner.next();
```

### 5. **Program Akış Kontrolü**
`return` ifadesi ile metodun çalışmasını durdurup çıkış yapılabilir.

## 🚀 Nasıl Çalıştırılır?

1. Projeyi IDE'nizde (IntelliJ IDEA, Eclipse, vb.) açın
2. `Main.java` dosyasını çalıştırın
3. Kullanıcı adı ve şifre girin

### Geçerli Kullanıcılar:
- **Kullanıcı Adı:** turkay | **Şifre:** abc123
- **Kullanıcı Adı:** beyza | **Şifre:** xyz98

## 💻 Kod Açıklaması

```java
// Kullanıcıdan girdi alma
Scanner scanner = new Scanner(System.in);
String kullaniciAdi = scanner.next();
String sifre = scanner.next();

// Birinci kullanıcı kontrolü (VE operatörü kullanımı)
if (kullaniciAdi.equals("turkay") && sifre.equals("abc123")) {
    System.out.println("Hoşgeldin Türkay");
} 
// İkinci kullanıcı kontrolü (else-if kullanımı)
else if (kullaniciAdi.equals("beyza") && sifre.equals("xyz98")) {
    System.out.println("Merhaba Beyza Sakarya!!!");
} 
// Hiçbir koşul sağlanmazsa
else {
    System.out.println("Tanınmayan kullanıcı. Uygulamadan çıkılıyor");
    return; // Programdan çık
}

// Bu satır sadece doğrulama başarılıysa çalışır
System.out.println("Burası ne olursa olsun çalışır!");
```

## 📝 Notlar

- Bu proje eğitim amaçlıdır ve gerçek bir güvenlik sistemi değildir
- Gerçek uygulamalarda şifreler kodda saklanmamalıdır
- Kullanıcı doğrulama sistemleri çok daha karmaşık güvenlik önlemleri içermelidir

## 🎓 Öğrendiklerinizi Test Edin

Projeyi geliştirmek için şunları deneyebilirsiniz:
1. Yeni kullanıcılar ekleyin
2. Şifre uzunluk kontrolü ekleyin
3. Kullanıcıya 3 deneme hakkı verin
4. Büyük/küçük harf duyarsız kullanıcı adı kontrolü yapın

---

**Java101 Eğitim Serisi** - Karar Yapıları Modülü
