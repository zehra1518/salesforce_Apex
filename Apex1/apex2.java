//4) Boolean:

//ornek 2:
Boolean b1 = true;
Boolean b2 = true;
Boolean b3 = false;
Boolean b4 = false;

System.debug(b1 || b2); //true
System.debug(b2 || b3); //true
System.debug(b3 && b2); //false
System.debug(b3 && b4); //false

//5) Decimal: Ondalikli sayilar icin kullanilir.
//Ozellikle fiyat degerleri icin "Decimal" kullanilir.
//App'inizde bu data tipini secmelisiniz

//ornek 1: 15.23 liralik bir gomlegi 'Fiyat' etiketi kullanarak console'a yazdiriniz.

Decimal gomlekFiyati = 15.23;
System.debug('Fiyat :' + gomlekFiyati); //Fiyat :15.23

//ornek 2: 3 tane Decimal data tipinde variable olusturunuz ve bunlarin toplamini
//bir etiket ile console'a yazdiriniz.

//1.yol:
Decimal corapFiyati = 12.99;
Decimal gomlekFiyati = 23.99;
Decimal ayakkabiFiyati = 18.99;
System.debug('Toplam fiyat :' + (corapFiyati+gomlekFiyati+ayakkabiFiyati)); //Toplam fiyat :55.97

//2.yol: Tek satirda yazabiliriz

Decimal corapFiyati = 12.99, gomlekFiyati = 23.99, ayakkabiFiyati = 18.99;
System.debug('Toplam fiyat :' + (corapFiyati+gomlekFiyati+ayakkabiFiyati)); //Toplam fiyat :55.97

//3 corap, 2 gomlek, 1 ayakkabi olsaydi?

Decimal corapFiyati = 12.99, gomlekFiyati = 23.99, ayakkabiFiyati = 18.99;
System.debug('Toplam fiyat :' + (3*corapFiyati+2*gomlekFiyati+ayakkabiFiyati)); //Toplam fiyat :105.94

//ornek 3: Bir tamsayi degiskeni ve bir ondalik degisken olusturun ve carpimlarini bir etiketle
//console'a yazdiriniz

//cozum 1:

Integer a = 5;
Decimal b = 2.25;
System.debug('Carpimlari : ' + a*b); //Carpimlari : 11.25

//cozum 2:

Integer a = 5;
Decimal b = 2.4;
System.debug('Carpimlari : ' + a*b); //Carpimlari : 12.0 //sonuc decimal veri turunde olur

//6) Double: 64 bitlik ondalik sayilar icin kullanilir.

//ornek 1: 
Double piSayisi = 3.14159;
System.debug('pi sayisi : ' + piSayisi); //pi sayisi : 3.14159
//------------------------------------------------

//7) ID: Her Salaesforce kardinin benzersiz (unique) bir tanimlayicisi (Id) vardir.
//Belli bir yazim kurali vardir
//------------------------------------------------

//8) Date ve DateTime
//Date: Tarihi belirtir
//DateTime: Tarih + Saat bildirir
//------------------------------------------------

//String Data Tipi (Class)
//String: String data tipi cumleler, kelimeler, semboller, rakamlar icerebilir.

//ornek 1: 's' String'ine 'Ali Can' yukleyerek yazdiriniz.

String s = 'Ali Can';
System.debug(s); //Ali Can

//ornek 2: 's' String degerini buyuk harflerle yaziniz.
// Ali Can ==> ALI CAN
// toUpperCase() tum harfleri buyuk harf yapar.

String s = 'Ali Can';
String buyukHarf = s.toUpperCase();
System.debug(s); //Ali Can
System.debug(buyukHarf); //ALI CAN

//ornek 3: 'isim' String degerini kucuk harflerle yaziniz
//toLowerCase() tum harfleri kucuk harf yapar

//1.yol:
String isim = 'Ali Can';
String kucukHarf = isim.toLowerCase();
System.debug(kucukHarf); //ali can

//2.yol:
String isim = 'Ali Can';
System.debug(isim.toLowerCase()); //ali can

//ornek 4:Size verilen isim ve soyismin ilk harfleri buyuk, diger harfleri kucuk olacak sekle ceviriniz
// 'aLi cAn' ==> Dogrusu 'Ali Can' olacak

//capitalize() String'in ilk harfini buyuk yapar.
//Bir satirda birden fazla methodu yanyana kullanirsaniz buna "method chain - method zinciri" denir

//------------------------------CEVAP EKSIK OLDU
String t = 'aLi cAn';
String tNew = t.toLowerCase().capitalize();
System.debug(tNew); //Ali can

//------------------------------
//split() String'i istediginiz karakterden parcalmaya yarar.
//Apex index kullanir ve index'ler sifirdan baslar.
//'aLi cAn' ==> Ali Can olacak

String t = 'aLi cAn';

String firstName = t.split(' ')[0].toLowerCase().capitalize();
//System.debug(firstName); //Ali
String lastName = t.split(' ')[1].toLowerCase().capitalize();
//System.debug(lastName); //Can
System.debug(firstName + ' ' + lastName); //Ali Can

//ornek 5: Kullanici ismini girerken basta ve sonda bosluk birakabilir ama isimler
// boslukla baslamaz ve boslukla bitmez. Bu hatayi tamir eden kodu yaziniz

//trim() method'u bir String'deki bastaki ve sondaki bosluklari siler.

String u = '    Ali Can  ';
System.debug('Trim den once :' + u); //Trim den once :    Ali Can  

String trimli = u.trim();
System.debug('Trim den sonra :' + trimli); //Trim den sonra :Ali Can

//ornek 6: Kullanicinin isminde, bosluklari sildikten sonra kac harf oldugunu bulan kodu yaziniz.
// '   Ali    Can    ' ==> AliCan ==> 6

//deleteWhiteSpace() String'deki tum bosluklari siler.
//length() String'deki karakter sayisini verir
//Method chain'de en son uygulanan method'un turu ne ise, memory'de ona uygun data tipi acilir.

String v = '   Ali    Can    ';

Integer uzunluk = v.deleteWhiteSpace().length(); 
System.debug(uzunluk); //6

//substring() method'u iki turlu kullanilir.
//substring() index mantigiyla calisir.Yani saymaya 0 dan baslanir
//1) substring(start) ==> start'dan baslayarak sona kadar tum karakterleri alir.

String y = 'Tom Hanks';

String sonuc = y.substring(5);
System.debug(sonuc); //anks

//2) substring(start, end) ==> start'dan baslayarak end'e kadar alir.(start dahil, end haric)

String y = 'Tom Hanks';

String sonuc = y.substring(4,6);
System.debug(sonuc); //Ha

