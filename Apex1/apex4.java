//ornek 16: Verilen bir String'de "an" karakterlerinin olup olmadigini buyuk harf kucuk harfe
//dikkat etmeden kontrol eden kodu yaziniz
//"an" ==> true,   "An" ==> true, "aN" ==> true, "AN" ==> true

//containsIgnoreCase() method'u herhangi bir karakterin veya karakterlerin String'de var olup olmadigini buyuk harf
//kucuk harf dikkate almadan kontrol eder.
//containsIgnoreCase() method'u true veya false return eder.Boolean

String g = 'Ali Can';
Boolean result3 = g.containsIgnoreCase('AN');
System.debug(result3); //true

//ornek 17: Verilen iki String'in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz

//equals() method'u iki String'in birbirinin aynisi olup olmadigini kontrol eder.
//equals() method'u true veya false return eder. Boolean

String h = 'Ali Can';
String i = 'Ali Can';

Boolean result4 = h.equals(i);
System.debug(result4); //true

//ornek 18: Verilen iki String'in birbirinin aynisi olup olmadigini buyuk harf kucuk harf dikkate almadan
//kontrol eden kodu yaziniz

String j = 'Ali Can';
String k = 'ali can';

Boolean result5 = k.equalsIgnoreCase(j);
System.debug(result5); //true

//-------------------------------------

/*Regular Expression(Regex): Bir grup data'yi almak icin kullanilir.
	1) Pozitif Senaryolar:
		Tum buyuk harfler: [A-Z]
		Tum kucuk harfler: [a-z]
		Tum harfler: [A-Za-z]
		Tum rakamlar: [0-9]
		a'dan g'ye tum buyuk ve kucuk harfler: [A-Ga-g]
		Tum harfler ve rakamlar: [A-Za-z0-9]
		Tum a, x, y ler: [axy]

	2) Negatif Senaryolar:
		Tum buyuk harfler haric: [^A-Z]
		Tum harfler haric: [^A-Za-z]

	3) Bu kisimda [] kullanilmaz. Buyuk harfliler olumsuz anlama gelir.
		Sadece bosluk (space) karakteri: \\s
		Space karakteri haric: \\S

		Sadece rakamlar(digit): \\d
		Rakamlar haric: \\D
*/

//ornek 19: Bir String'deki tum buyuk harfleri siliniz.
//replaceAll() = hepsini degistir
//Buyuk harflerin yerine hicbir sey ('') koyarsaniz silersiniz. '' hicbir sey demektir.

//kalibini olusturalim. method parantezi ==> tirnak ==> koseli parantez
//replaceAll() method'u cift parametreli kullanilir

String m = 'Ali Can Kahraman';
String noUpperCase = m.replaceAll('[A-Z]','');
System.debug(noUpperCase); //li an ahraman

//ornek 20: Bir String'deki tum a, x, y harflerini * e ceviriniz.

String n = 'Extra calisiyorum ki Apex i ogreneyim';

String noaxy = n.replaceAll('[axy]', '*');
System.debug(noaxy); //E*tr* c*lisi*orum ki Ape* i ogrene*im

//ornek 21: Bir String'deki buyuk harfler haric, tum harfleri "!" ceviriniz.
// (^) haric anlamina gelir

String p = 'APEX icin KOD yazmalisin';

String buyukHaric = p.replaceAll('[^A-Z]', '!');
System.debug(buyukHaric); //APEX!!!!!!KOD!!!!!!!!!!!

//ornek 22: Bir String'deki tum harfler haric, butun karakterleri "?" e ceviriniz
//Unexpected token '&lt;EOF&gt;'. hatasi aldim cunku yazdirirken fazladan b harfi gelmis.

String r = 'Ali Can 123456789';

String harfHaric = r.replaceAll('[^A-Za-z]', '?');
System.debug(harfHaric); //Ali?Can??????????
//-------------------------------------------
//ornek 23: Bir String'deki space haric butun karakterleri "*" e ceviriniz

//1.yol:

String s = '1234 5678 9012 3456';
String justSpace1 = s.replaceAll('[^ ]', '*');
System.debug(justSpace1); //**** **** **** ****

//2.yol:
// \\d rakamlari sec
String s = '1234 5678 9012 3456';
String justSpace2 = s.replaceAll('\\d', '*');
System.debug(justSpace2); //**** **** **** ****

//ekstra ornek:
// \\D rakamlar haric
String s = '1234 5678 9012 3456';
String justSpace2 = s.replaceAll('\\D', '*');
System.debug(justSpace2); //1234*5678*9012*3456
//-------------------------------------------
//ornek 24: Bir String'deki tum "a" harflerini "*" ceviriniz

//1.yol:
String t = 'Ankara ya elma almaya gitmis...';

String noA = t.replaceAll('[a]', '*');
System.debug(noA); //Ank*r* y* elm* *lm*y* gitmis...

//2.yol:

String t = 'Ankara ya elma almaya gitmis...';

String noA = t.replaceAll('a', '*');
System.debug(noA); //Ank*r* y* elm* *lm*y* gitmis..

//3.yol: 
//replace() sinirli sayida datayi degistirmek icin kullanilir.

String t = 'Ankara ya elma almaya gitmis...';
String noA = t.replace('a', '*');
System.debug(noA); //Ank*r* y* elm* *lm*y* gitmis...

//-------------------------------------------
//ornek 25: Verilen bir String'in ilk karakterini / karakterlerini kontrol ediniz

//startsWith() method'u bir String'in ilk karakterini / karakterlerini kontrol eder.
//startsWith() method'u boolean return eder.

String u = 'Ali Can';
Boolean startA = u.startsWith('A');
System.debug(startA); //true
//-------------------------------------------
//ornek 26: Verilen bir String'in son karakterini / karakterlerini kontrol ediniz

//endsWith() method'u bir String'in son karakterini / karakterlerini kontrol eder.
//endsWith() method'u boolean return eder.

String v = 'Veli Han';
Boolean endsN = v.endsWith('n');
System.debug(endsN); //true

//-------------------------------------------

//ornek 27: Verilen bir password'un asagidaki kurallara uyup uymadigini kontrol ediniz.
//          1)En az 8 karakter icermeli
//          2)En az 1 buyuk harf icermeli
//          3)En az 1 kucuk harf icermeli
//          4)En az 1 rakam icermeli
//          5)En az 1 sembol icermeli
//          6)Space karakter icermemeli 

String password = 'Ac?!Ymnnd';

//          1)En az 8 karakter icermeli
Boolean lengthControl = password.length()>=8;
//System.debug(lengthControl); //true

//          2)En az 1 buyuk harf icermeli
//buyuk harf haric silersem buyuk harfler kalir. uzunlugunu baksam. 0 dan buyukse buyuk vardir
Boolean upperCaseControl = password.replaceAll('[^A-Z]', '').length()>0;
//System.debug(upperCaseControl); //true

//          3)En az 1 kucuk harf icermeli
Boolean lowerCaseControl = password.replaceAll('[^a-z]', '').length()>0;
//System.debug(lowerCaseControl); //true

//          4)En az 1 rakam icermeli
Boolean digitControl = password.replaceAll('[^0-9]', '').length()>0;
//System.debug(digitControl); //true

//          5)En az 1 sembol icermeli
Boolean symbolControl = password.replaceAll('[A-Za-z0-9]','').length()>0;     
//System.debug(symbolControl);  //true  

//          6)Space karakter icermemeli 
//space haric her seyi sil. sifira est mi? kontrol et.

Boolean spaceControl = password.replaceAll('[^ ]','').length()==0;
//System.debug(spaceControl); true


System.debug('Password dogru : ' + (lengthControl && upperCaseControl && lowerCaseControl && digitControl && symbolControl && spaceControl));


    
