# ATM Simülatörü 🏧

Java ile geliştirilmiş basit bir ATM (Otomatik Para Çekme Makinesi) simülasyonu projesidir. Bu proje, temel Java konseptlerini öğrenmek ve konsolda kullanıcı etkileşimli bir uygulama geliştirmek için hazırlanmıştır.

## 📚 Öğrenme Hedefleri

Bu projeyi tamamladığınızda aşağıdaki konularda yetkinlik kazanacaksınız:

- ✅ Kullanıcıdan konsol üzerinden veri alma (`Scanner` sınıfı)
- ✅ Koşullu ifadelerle karar mekanizmaları oluşturma (`if-else`, `switch-case`)
- ✅ Döngülerle tekrarlayan işlemler yapma (`do-while`, `while`)
- ✅ Değişken tanımlama ve veri tipleriyle çalışma (`int`, `double`)
- ✅ Kullanıcı doğrulama ve güvenlik kontrolü implementasyonu
- ✅ Hata yönetimi ve input validasyonu
- ✅ Menü tabanlı konsol uygulaması tasarlama
- ✅ Matematiksel işlemler ve mantıksal operatörler kullanma

## 🎯 Ele Alınan Konular

### 1. **Scanner Sınıfı ve Kullanıcı Girişi**
- `Scanner` nesnesi oluşturma
- `nextInt()` ve `nextDouble()` metodları
- Kullanıcıdan veri alma

### 2. **Değişkenler ve Veri Tipleri**
- `int` (tam sayı) - PIN kodu, menü seçimleri
- `double` (ondalıklı sayı) - bakiye, tutar işlemleri
- Değişken başlatma ve güncelleme

### 3. **Kontrol Yapıları**
- **if-else:** Koşullu dallanmalar
- **switch-case:** Menü seçeneklerini yönetme
- **do-while:** PIN kontrolü ve ana menü döngüsü
- Mantıksal operatörler (`!=`, `<=`, `>`)

### 4. **Güvenlik ve Validasyon**
- PIN doğrulama sistemi
- 3 hatalı girişte hesap kilitleme
- Negatif tutar kontrolü
- Yetersiz bakiye kontrolü
- Günlük limit kontrolü

### 5. **Matematiksel İşlemler**
- Toplama (`+=`) - Para yatırma
- Çıkarma (`-=`) - Para çekme
- Karşılaştırma operatörleri

## 🚀 Nasıl Çalıştırılır?

### Ön Gereksinimler
- Java JDK 8 veya üzeri

### Çalıştırma Adımları

1. Projeyi klonlayın veya indirin
2. Terminal/Komut İstemi'nde proje dizinine gidin:
   ```bash
   cd ATMSimulator/src
   ```
3. Java dosyasını derleyin:
   ```bash
   javac Main.java
   ```
4. Programı çalıştırın:
   ```bash
   java Main
   ```

## 💡 Kullanım

### Varsayılan Bilgiler
- **PIN Kodu:** `5498`
- **Başlangıç Bakiyesi:** `1500 TL`
- **Günlük Çekim Limiti:** `10000 TL`
- **Maksimum Hatalı PIN Girişi:** `3`

### Menü Seçenekleri
1. **Bakiye Sorgula:** Mevcut bakiyenizi görüntüler
2. **Para Yatır:** Hesabınıza para yatırır
3. **Para Çek:** Hesabınızdan para çeker (limitler dahilinde)
4. **Çıkış Yap:** Uygulamadan çıkar

## 🎓 Mini Ödev: Projeyi Geliştirin!

Aşağıdaki özelliklerden **en az 2 tanesini** ekleyerek projeyi geliştirin:

### Seviye 1 - Başlangıç (Kolay) 🟢

1. **Başarılı İşlem Sayacı**
   - Kullanıcının kaç işlem yaptığını tutan bir sayaç ekleyin
   - Çıkış yaparken toplam işlem sayısını gösterin

2. **İşlem Geçmişi**
   - Son 3 işlemi (yatırma/çekme) bir dizide saklayın
   - Menüye "5. İşlem geçmişi" seçeneği ekleyerek gösterin

3. **Para Birimi Seçimi**
   - Uygulama başlarken TL, USD veya EUR seçimi yaptırın
   - Tüm işlemleri seçilen para birimi ile gösterin

### Seviye 2 - Orta (Orta) 🟡

4. **Havale/EFT Özelliği**
   - Menüye "Havale yap" seçeneği ekleyin
   - Hedef hesap numarası ve tutar girilsin
   - Transfer ücreti (%1) hesaplansın ve bakiyeden düşülsün

5. **Günlük İşlem Limiti**
   - Para çekme işlemlerinde günlük kalan limiti takip edin
   - Her çekim işleminden sonra kalan günlük limiti gösterin
   - Limit dolduğunda uyarı verin

6. **PIN Değiştirme**
   - Menüye "PIN değiştir" seçeneği ekleyin
   - Eski PIN doğrulandıktan sonra yeni PIN belirlensin
   - Yeni PIN en az 4 haneli olmalı

### Seviye 3 - İleri (Zor) 🔴

7. **Çoklu Kullanıcı Sistemi**
   - Farklı PIN kodlarına sahip 3 farklı hesap oluşturun
   - Her hesabın kendi bakiyesi olsun
   - Girişteki PIN'e göre doğru hesaba erişilsin

8. **Dosyaya Kayıt (Bonus)**
   - İşlem geçmişini bir `.txt` dosyasına kaydedin
   - Her işlem tarih ve saat bilgisiyle kayıt edilsin
   - Program başlarken eski bakiye dosyadan okunabilsin

9. **Gelişmiş Güvenlik**
   - 3 başarısız girişten sonra 30 saniye bekleme süresi ekleyin
   - PIN kısmında girilen karakterler `*` olarak gösterilsin
   - Her başarılı girişte oturum süresi (5 dakika) başlatın

### 📋 Ödev Teslim Formatı

```
1. Hangi özellikleri eklediniz?
2. Kodunuzun ekran görüntüsü
3. Programın çalışırken ekran görüntüsü
4. Karşılaştığınız zorluklar nelerdi?
```

## 🔍 Kod Analizi İpuçları

- **Do-while döngüsü** neden kullanılmış? While ile farkı nedir?
- **Switch-case** yapısı yerine if-else kullansaydık ne değişirdi?
- Günlük limit kontrolü neden gerekli?
- PIN için `int` yerine `String` kullansaydık ne olurdu?

## 🤝 Katkıda Bulunma

Bu projeyi geliştirmek isterseniz:
1. Fork edin
2. Yeni bir branch oluşturun (`git checkout -b feature/yeniOzellik`)
3. Değişikliklerinizi commit edin (`git commit -am 'Yeni özellik eklendi'`)
4. Branch'inizi push edin (`git push origin feature/yeniOzellik`)
5. Pull Request oluşturun

## 📝 Lisans

Bu proje eğitim amaçlı hazırlanmıştır ve serbestçe kullanılabilir.

---

**İyi Kodlamalar! 🚀**
