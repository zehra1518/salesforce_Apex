//ornek 7: Kullanici isminin ilk harflerini alrak console'a yazdiriniz.
// '    Ali Can   ' ==> AC

String y = '  Ali Can   ';
String trimli = y.trim();
//System.debug(trimli);

String first = trimli.split(' ')[0].substring(0,1);
//System.debug(first); //Ali
String last = trimli.split(' ')[1].substring(0,1);
//System.debug(last);
System.debug(first+last); //AC

//ornek 8: Bir String'in herhangi bir karakterinden baslayarak belli bir yere kadar tum karakterlerini aliniz
// 			abc@yahoo.com ==> yahoo

//1.yol:
String str = 'abc@yahoo.com'; 
String company1 = str.split('@')[1].split('\\.')[0];  //split() method'u icinde nokta(.) kullandiginizda onune \\ koyunuz
System.debug(company1); //yahoo

//2.yol:
//remove() method'u tirnak icine yazilan istenilen yeri siler
String str = 'abc@yahoo.com';
String company2 = str.split('@')[1].remove('.com'); 
System.debug(company2); //yahoo

//---------------------------------------------------
//indexOf() methodu spesifik bir karakterin ilk gorunumunun index'ini verir
//ornek 9: 

String b = 'Ali Can, Canan a selam soyle';
Integer idx1 = b.indexOf('a'); //ilk gordugu kucuk a'nin index'ini verir.
System.debug(idx1); //5
//------    
String b = 'Ali Can, Canan a selam soyle';
Integer idx2 = b.indexOf('a',6);
System.debug(idx2); //10  //6.index'ten sonraki kucuk a'nin index'ini verir.
    
//---------------------------------------------------
//ornek 10: Bir String'in herhangi bir karakterinden baslayarak sona kadar tum karakterlerini aliniz
//		abc@gmail.com ==> gmail.com

String z = 'abc@gmail.com';
Integer index = z.indexOf('@'); //3
String zNew = z.substring(index+1);
System.debug(zNew); //gmail.com
//---------------------------------------------------
//ornek 11: Bir String'in herhangi bir karakterinden baslayarak herhangi bir karaktere kadar tum karakterlerini aliniz.

//abc@gmail.com ==> gmail
//Code dinamik olsun

String a = 'abc@hotmail.com';

Integer startingIndex = a.indexOf('@')+1; //3
Integer endingIndex = a.indexOf('.'); //11
String companyName = a.substring(startingIndex, endingIndex);
System.debug(companyName); //hotmail
//---------------------------------------------------

//ornek 12: Bir String'deki "Can" kelimesinin son kullaniminin baslangic index'ini bulunuz.
//			'Canim Can, Canan a selam soyle'

//lastIndexOf() method'u karakterin son gorunumunun index'ini verir
//lastIndexOf() method'u, olmayan karakterler icin -1 verir
//lastIndexOf() method'unu coklu karakterler icin kullanirsaniz, son gorunumun ilk karakterinin index'ini verir.

String c = 'Canim Can, Canan a selam soyle';

Integer idx2 = c.lastIndexOf('Can');
System.debug(idx2); //11

//---------------------------------------------------
//ornek 13: Size verilen bir String'in ilk ve son karakterlerinin ASCII degerlerini console'a yazdiriniz

//String'lerde her zaman ilk karakterin index'i "0" dir.
//String'lerde her zaman son karakterin index'i "toplam karakter sayisi -1" dir yani "length()-1" dir
//charAt() method'u String icindeki karakterin ASCII degerini verir.

String d = 'Ali Can';
Integer ilkAscii = d.charAt(0);
System.debug(ilkAscii); //65

Integer sonAscii = d.charAt(d.length()-1);
System.debug(sonAscii); //110

//ornek 14: Verilen bir String'de "a" karakterinin olup olmadigini kontrol eden kodu yaziniz.

//contains() method'u herhangi bir karakterin veya karakterlerin String'de olup olmadigini kontrol eder.
//contains() method'u true veya false return eder. Boolean'la karsilayacaksiniz

String e = 'Ali Can';
Boolean result1 = e.contains('a');
System.debug(result1); //true

//ornek 15: Verilen bir String'de "an" karakterlerinin olup olmadigini kontrol eden kodu yaziniz.

String f = 'Ali Can';
Boolean result2 = f.contains('an');
System.debug(result2); //true

