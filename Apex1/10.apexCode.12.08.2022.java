//ornek 3: Verilen password'u asagidaki kurallara gore kontrol eden kodu yaziniz.

// i) Password'de 8 karakter varsa ilk karakter "i" olmali ve password gecerli yazmali
// ii) Password'de 8 karakter yoksa ilk karakter "!" olmali ve password gecerli yazmali

//startsWith() ilk karakteri kontrol eder.
//once kalibi olusturalim

String pwd = 'i12345';
String result = (pwd.length()==8) ? ((pwd.startsWith('i')) ? ('Password Gecerli') : ('Password Gecersiz')) : ((pwd.startsWith('!')) ? ('Password Gecerli') : ('Password Gecersiz'));
   
System.debug(result);   

//-------------------------------------------

//switch on statement

//switch on statement farkli kosullara dayali olarak farkli eylemler gerceklestirmek icin kullanilir.
//3'ten fazla durum varsa switch on kullaniriz.(best practise)

//kalibini olusturalim

switch on variable{
    when data{
        
    }
    when data{
        
    }
    when data{
        
    }
    when else{
        
    }
}
//---------------------------

//ornek 1: Girilen cinsiyet degerlerine gore, console'a uygun cumleleri yazdiriniz.

String gender = 'Female';

switch on gender{
    when 'Female'{
        System.debug('This is a girl'); //This is a girl
    }
    when 'Male'{
        System.debug('This is a boy');
    }
    when else{
        System.debug('Invalid Input');
    }
}

//--------------------------------------
//ornek 2: Ay numarasina gore ayin ismini gosteren kodu yaziniz.

//------------------------else if cozumu
Integer ayNumarasi = 72;

if(ayNumarasi==1){
    System.debug('Ocak');
}else if(ayNumarasi==2){
    System.debug('Subat');
}else if(ayNumarasi==3){
    System.debug('Mart');
}else if(ayNumarasi==4){
    System.debug('Nisan');
}else if(ayNumarasi==5){
    System.debug('Mayis');
}else if(ayNumarasi==6){
    System.debug('Haziran');
}else if(ayNumarasi==7){
    System.debug('Temmuz');
}else if(ayNumarasi==8){
    System.debug('Agustos');
}else if(ayNumarasi==9){
    System.debug('Eylul');
}else if(ayNumarasi==10){
    System.debug('Ekim');
}else if(ayNumarasi==11){
    System.debug('Kasim');
}else if(ayNumarasi==12){
    System.debug('Aralik');
}else{
    System.debug('Gecerli bir ay sayisi giriniz');
}

//----------------------switch on cozumu

Integer ayNumarasi = 15;

switch on ayNumarasi{
    when 1{
        System.debug('Ocak');
    }
    when 2{
        System.debug('Subat');
    }
    when 3{
        System.debug('Mart');
    }
    when 4{
        System.debug('Nisan');
    }
    when 5{
        System.debug('Mayis');
    }
    when 6{
        System.debug('Haziran');
    }
    when 7{
        System.debug('Temmuz');
    }
    when 8{
        System.debug('Agustos');
    }
    when 9{
        System.debug('Eylul');
    }
    when 10{
        System.debug('Ekim');
    }
    when 11{
        System.debug('Kasim');
    }
    when 12{
        System.debug('Aralik');
    }
    when else{
        system.debug('Gecerli bir ay sayisi giriniz'); //Gecerli bir ay sayisi giriniz
    }
}

//--------------------------------------

//ornek 3: Asagidaki kurallara gore, harfe karsilik gelen notu yazdiriniz.
// A==>81-100, B==>71-80, C==>61-70, D==>50-60, E==>0-49
//------------------------
//1.yol
String dersNotu = 'a';

switch on dersNotu.toUpperCase(){  
    when 'A'{
        System.debug('81-100'); //81-100
    }
    when 'B'{
        System.debug('71-80');
    }
    when 'C'{
        System.debug('61-70');
    }
    when 'D'{
        System.debug('50-60');
    }
    when 'E'{
        System.debug('0-49');
    }
    when else{
        System.debug('Gecerli bir harf giriniz');
    }
}
//------------------------
//2.yol:

String dersNotu = 'b';

switch on dersNotu{  
    when 'A', 'a'{
        System.debug('81-100'); //81-100
    }
    when 'B', 'b'{
        System.debug('71-80');
    }
    when 'C', 'c'{
        System.debug('61-70');
    }
    when 'D', 'd'{
        System.debug('50-60');
    }
    when 'E', 'e'{
        System.debug('0-49');
    }
    when else{
        System.debug('Gecerli bir harf giriniz');
    }
}

//---------------------------------

//ornek 4: Verilen karakter A, E, I, O, U, a, e, i, o, u dan birisi ise "Sesli Harf"
//			Verilen karakter yukardaki harflerden farkli ise "Sessiz Harf"
//			Verilen karakter 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 dan birisi ise "Rakam"
//			Verilen karakter harf veya rakam degilse "Sembol" yazdiriniz

String karakter = '1';

switch on karakter.toUpperCase(){
    when 'A', 'E', 'I', 'O', 'U'{
        System.debug('Sesli Harf');
    }
    when  'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'{
        System.debug('Sessiz Harf');
    }
    when '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'{
        System.debug('Rakam'); //Rakam
    }
    when else{
        System.debug('Sembol');
    }
}
//----------------------------------------

//enum (siralama-numaralandirma): Degisme ihtimali olmayan datalari depolamak icin kullanilir.

//Haftanin gun isimleri, ay isimleri, harfler, sehir isimleri, ulkeler, araba markalari

//ornek 5: Ilkbahar icin "Piknik"
//			Sonbahar icin "Doga Yuruyusu"
//			Yaz icin "Yuzme"
//			Kis icin "Kayak" yazdiriniz.

//String veya Integer tanimlamasi yapmayacagiz.Verilerimiz enum'dan gelecek.

switch on Mevsim.KIS{
    
    when ILKBAHAR{
        System.debug('Piknik');
    }
    when SONBAHAR{
        System.debug('Doga Yuruyusu');
    }
    when YAZ{
        System.debug('Yuzme');
    }
    when KIS{
        System.debug('Kayak');
    }
}

//-------------------------

//ornek 6: rastgeleBirHarfVer() method'unu kullanarak. aldiginiz harfler icin, asagidaki mesajlari kullaniciya veriniz.

//i) 'A' ve 'a' ==> Ilk Harf...
//ii) 'B' ve 'b'==> Ikinci Harf...
//iii) 'Z' ve 'z'==> Son Harf...
//iv) 'X','x','W','w', 'Q', 'q'==> Turkce karakter degil
//v) Digerleri icinde ==> 'Sen ozel bir karakter degilsin...'

switch on MyClass2.rastgeleBirHarfVer(){
   
    when 'A', 'a'{
        System.debug('Ilk Harf...');
    }
    when 'B', 'b'{
        System.debug('Ikinci Harf...');
    }
    when 'Z', 'z'{
        System.debug('Son Harf');
    }
    when 'X','x','W','w', 'Q', 'q'{
        System.debug('Turkce karakter degil');
    }
    when else{
        System.debug('Sen ozel bir karakter degilsin...');
    }
}

