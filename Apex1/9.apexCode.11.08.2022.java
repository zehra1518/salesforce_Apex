//ornek 2: Password buyuk harf ile baslarsa
//				i) 'A' veya 'B' ile baslamali
//		   Password kucuk harf ile baslarsa
//				i) 'y' veya 'z' ile baslamali
//			Kullanicidan alinan password'e gore uygun mesajlari yazdiriniz

String pwd = 'y123@';
Integer firstChar = pwd.charAt(0);

if(firstChar>=65 && firstChar<=90){
    
    if(firstChar==65 || firstChar==66){
        System.debug('Password kurallara uygun');        
    }else{
        System.debug('Password kurallara uygun degil cunku ilk karakter A veya B degil');
    }
    
}else if(firstChar>=97 && firstChar<=122){
    
    if(firstChar==121 || firstChar==122){
         System.debug('Password kurallara uygun');        
    }else{
        System.debug('Password kurallara uygun degil cunku ilk karakter y veya z degil');
    }
    
}else{
    System.debug('Password kurallara uygun degil cunku ilk karakter harf degil');
}
//------------------------------------
//ternary statement (ucerli ifade)

//if else'in aynisidir. Sadece syntax farklidir.
//Kalibini olusturalim:  condition ? ilk cikti(true) : ikinci cikti(false);
//Condition kismi direkt yazilir. Sonra ? isareti, sonra ilk cikti(true), sonra ikinci cikti(false) yazarsiniz
//Condition dogruysa ?'den sonraki kisim, yanlissa :'den sonraki kisim calisir.

//ornek 1: Sayi 10'dan kucuk ise console'a "Kucuk" yazdirin, degil ise "Kucuk degil" yazdirin.

//--------------------if else cozumu

Integer num = 8;

if(num<10){
    System.debug('Kucuk'); //Kucuk
}else{
    System.debug('Kucuk degil');
}

//--------------------ternary cozumu

Integer num = 18;

//					condition ? 	 true 		:     false

String sonuc =		num<10    ? 	'Kucuk'     :  'Kucuk degil';
System.debug(sonuc); //Kucuk degil
//-------------------------

//ornek 2: Sayi cift ise console'a "Cift" yazdirin, tek ise "Tek" yazdirin.

Integer num = 13;
//					condition 				? 	 true 		:       false
String sonuc =		Math.mod(num, 2)==0		? 	'Cift'		:		'Tek';

System.debug(sonuc); //Tek

//---------------------------
//ornek 3: Dogru password "pwd123!" oldugunda verilen password'un dogru olup olmadigini kontrol eden ve 
//kullaniciya uygun mesaj veren kodu yaziniz.

String pwd = 'pwd123';

String sonuc = pwd.equals('pwd123!') ? 'Password dogru' : 'Password yanlis';
System.debug(sonuc); //Password yanlis

//---------------------------
//ornek 4: Asagidaki ornege gore, 'ali' ve 'aLi' isimleri icin ciktiyi bulunuz

String adi = 'aLi';

String game = adi.equals('ali') ? 'ali' : 'ALI';

System.debug(game); // ALI

//---------------------------
//nested ternary  

//ornek 1: Asagidaki ornege gore 'Ali', 'Veli' ve 'Ayse' isimleri icin ciktiyi bulunuz.

// (condition) ? ( (condition) ? (true) : (false) ) : (false)

String name = 'Ali';

String sonuc = (name.length()>3) ? ( (name.contains('l')) ? ('Merhaba Veli') : ('Merhaba Ayse') ) : ('Merhaba Ali');

System.debug(sonuc);

//ornek 2: Verilen yilin "Leap Year" olup olmadigini kontrol eden kodu yaziniz

//Leap Year;
//		i) 100'e bolunen yil 400'e de bolunuyorsa "Leap Year" dir
//		ii) 100'e bolunemeyen yil 4'e bolunuyorsa "Leap Year" dir.

// kalibini olusturalim

// (c) ? (  (c) ? (t) : (f)  ) : (  (c) ? (t) : (f)   )

Integer year = 1800;

String result = (Math.mod(year, 100)==0) ? ((Math.mod(year, 400)==0) ? ('Leap Year') : ('Leap Year Degil')) : ((Math.mod(year, 4)==0) ? ('Leap Year') : ('Leap Year Degil'));

System.debug(result);

//--------------------------------------
//ornek 3: Verilen password'u asagidaki kurallara gore kontrol eden kodu yaziniz.

// i) Password'de 8 karakter varsa ilk karakter "i" olmali ve password gecerli yazmali
// ii) Password'de 8 karakter yoksa ilk karakter "!" olmali ve password gecerli yazmali