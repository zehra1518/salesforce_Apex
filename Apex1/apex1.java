//Apex bu satiri okumaz.Yani kendimize veya baskasina aciklamadir.

/* 
1) Apex dili strongly type'dir. Bu nedenle Apex'teki her degisken(variable) belirli veri turu
(data type) ile iliskilendirilecektir.
2) Tum Apex degiskenleri baslangicta null olarak baslatilir.
3) Bir developer'in degiskenlere uygun degerlerin atandigindan emin olmasi gerekir.Aksi taktirde hata olusur
*/

//Data Types

/*
Primitive Data Types
1) Integer: Tam sayilar (Ondalik olmayanlar)
2) String: Adlar, adresler,semboller, kullanici adlari gibi birden cok karakterler
3) Long: Tam sayilar (Ondalik olmayanlar)
4) Boolean: True/False/Null
5) Decimal: Ondalik Sayilar (Fiyatlar icin Apex, decimal veri turunu kullanir.)
6) Double: Ondalik Sayilar
7) ID: Apex olusturacak ve kullanacak
8) Date: Tarihler icin kullanilir.
9) DateTime: Tarih + saat icin kullanilir.
*/

//ornek: Tamsayi (Integer) data tipinde ismi age olan bir variable olusturunuz ve icine 14 yukleyiniz

//data type ==> variable name ==> atama operatoru ==> data ==> noktali virgul

  	Integer age = 14;

//ornek: String data tipinde ismi name olan bir variable olusturarak, icine Ali Can data'sini yukleyiniz

	String name = 'Ali Can';

//ornek: Integer data tipinde isimleri yas, boy, agirlik olan 3 tane variable olusturunuz
//ve sirasiyla 14, 180, 45 degerlerini atayiniz.

//1.yol:

Integer yas = 14;
Integer boy = 180;
Integer agirlik = 45;

//2.yol: Tavsiye edilen, cunku tekrar yok

Integer yas = 14, boy = 180, agirlik = 45;

//Apex'de Data Tip'leri

//1) Integer 
//Ondalik icermeyen 32 bitlik bir tamsayidir.
//Deger araligi -2.147.483.648'den başlar ve maksimum değer 2.147.483.647'ye kadardır.

//ornek 1: Okula kayit olan bir ogrencinin yasini tutmak icin bir degisken olusturup
//icine 16 yukleyiniz
//System.debug('') fonksiyonu, degiskenin degerini yazdirir

Integer yas = 16;
System.debug(yas); //16
System.debug('Ogrencinin yasi:' + yas); //Ogrencinin yasi:16 //tirnak icine yazilan, label(etiket)tir.

//ornek 2: Iki tane Integer variable olusturunuz ve toplamlarini console'a yazdiriniz.

Integer a = 12, b = 13;
System.debug(a+b); //25
System.debug('Toplam: ' +(a+b)); //Toplam: 25
//-----------------------------------------------
//2)String: String data tipi cumleler, kelimeler, semboller, rakamlar icerebilir.

//ornek 1: Iki tane String variable olusturun ve o variable'lari birlestirerek consola'a yazdirin

//String'le beraber "+" isareti kullanirsaniz, o isaret "concatenation" anlamina gelir.
//"concatenation" demek, String'leri birbirine yapistirmak demektir.
//Iki sayinin arasinda "+" isareti toplama yapar.String'lerde "concatenation" demektir.

String s = 'Ali', t = 'Can';
System.debug(s + t); //AliCan
System.debug(s + ' ' + t); //Ali Can

//ornek 2: Iki String variable olusturun,Strig'leri birlestirin(concatenation) ve ardindan
//console'a yazdiriniz

//cozum 1:
String a = 'Apex';
String b = 'is easy';
System.debug(a+b); //Apexis easy

//cozum 2:
String a = 'Apex '; //x'den sonra space'e basiniz
String b = 'is easy';
System.debug(a+b); //Apex is easy

//cozum 3:
String a = 'Apex'; 
String b = '  is easy'; //i'den once space'a basiniz
System.debug(a+b); //Apex is easy

//cozum 4:
String a = 'Apex'; 
String b = 'is easy'; 
System.debug(a + ' ' + b); //Apex is easy

//ornek 3: Bir String ve iki Integer variable olusturunuz.String degeri ile Integer'larin
//toplamini console'a yazdiriniz

String s = 'elma';
Integer a = 10, b = 11;
System.debug(s + a + b); //elma1011
System.debug(s+(a+b)); //elma21
System.debug(s+ a*b); //elma110
System.debug(a + b + s); //21elma

//-----------------------------------------------
//3)Long: Tamsayilar icindir. Memory'de 64 bit kullanir.
//Deger araligi Integer'lardan buyuktur.
//Integer deger araliginin yetmedigi durumlarda kullaniriz.

//ornek 1: Iki tane Long variable olusturunuz ve toplamlarini bir etiketle console'a yazdiriniz
//Long olustururken eger deger, Integer'larin maksimum degerinden buyuk ise 
//sonuna "L" koymak zorundasiniz, yoksa "Illegal integer" hatasi alirsiniz
//Apex memory tasarruflu kullanilsin diye, yazilanlari integer kabul eder

Long m = 12345678901L, n = 123456789123L;
System.debug('Toplam: ' + (m+n)); //Toplam: 135802468024

//ornek 2: Iki tane Long variable olusturunuz ve toplamlarini 
//bir etiketle console'a yazdiriniz

Long a = 12, b = 13;
System.debug('Toplam: ' + (a+b)); //25

//-----------------------------------------------
//4)Boolean : Dogru/yanlis cevaplari icin "Boolean" data tipi kullanilir.
//Boolean'lar toplamda 3 farkli degere sahiptirler; true, false, null

//ornek 1: Emekli mi? etiketini true olarak cevaplayacak kodu yaziniz.

Boolean isRetired = true;
System.debug('Emekli mi? ' + isRetired); //Emekli mi? true



