
https://app.patika.dev/imrankacan

Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapılmaya çalışılmıştır. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgileri dışarıdan alınmaktadır. Mesafe başına ücret 0,10 TL / km olarak almaktadır. İlk olarak uçuşun toplam fiyatı hesaplayıp, sonrasında ki koşullara göre müşteriye aşağıdaki indirimler uygulanmaktadır ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmektedir.
• Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
• Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
• Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
• Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

Örneğin;
Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
Toplam Tutar = (135-27)* 2 = 216 TL