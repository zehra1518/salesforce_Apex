//DateTime Class Devam....

//ornek 6: 
//date() method'u DateTime'dan sadece date'i almak icin kullanilir.

DateTime myDateTime = DateTime.now();

System.debug(myDateTime.date()); //2022-08-05 00:00:00

//------------------------------

//ornek 7: 
//format() method'u DateTime'i String'e cevirir.

DateTime myDt = DateTime.newInstance(2002, 8, 5, 10, 12, 23);

String newDt = myDt.format();
System.debug(newDt); // 05/08/2002, 10:12

//---------------------------------

//DateTime Class'ta kullanilan saat formatlari
/*
	HH: mm 		24'lu saat sistemi
	hh: mm a 	12'li saat sistemi ve A.M, P.M gosterir
	hh: mm 		12'li saat sistemi ve A.M, P.M gosterilmez
	HH: MM		yanlis bir formattir, buyuk M'ler aylar icin kullanilir

	hh: mm: ss a 	saniye icin sonuna ss eklenir.
*/
//DateTime Class'ta kullanilan tarih formatlari:
/*
dd-MM-yyyy
MMM-Aug
MMMM-August
*/
//---------------------------------

//ornek 8: 
//format(String) method'u DateTime'i String'e istedigimiz formatta cevirir.
//- isaretinin yerine istediginiz karakteri koyabilirsiniz

DateTime myDt = DateTime.newInstance(2002, 8, 5, 20, 12, 23);

String newDt = myDt.format('dd-MMMM-yyyy HH: mm: ss');
System.debug(newDt); //05-August-2002 20: 12: 23
//---------------------------------
//ornek 9: 
//format(dateFormat, timeZone) method'u istenen timezone'daki DateTime'i, String'e istedigimiz formatta cevirir.

DateTime myDt = DateTime.newInstance(2002, 8, 5, 20, 12, 23);

String newDt = myDt.format('dd-MM-yyyy hh: mm: ss a','JST');
System.debug(newDt);//06-08-2002 04: 12: 23 AM

//---------------------------------

//ornek 10: 
//UserInfo bir Class'tir. Kullanici bilgilerini depolar.
//TimeZone bir Class'tir.

TimeZone tz = UserInfo.getTimeZone();
System.debug(tz.getDisplayName()); //tz ==> Europe/Dublin
//tz.getDisplayName() ==> GMT+01:00) Irish Standard Time (Europe/Dublin)

//---------------------------------
//ornek 11:

//user degil de TimeZone'dan veri cekersek, istedigimiz spesifik TimeZonu'u gorebiliriz.(GMT'ye gore)

TimeZone tz = TimeZone.getTimeZone('Europe/Istanbul');
System.debug(tz.getDisplayName()); //(GMT+03:00) Eastern European Standard Time (Europe/Istanbul)

//---------------------------------

//if statements

//---------------------------------

//if you work hard, you will succeed
//kalibini olusturalim
//condition dogruysa(true) suslu parantezin icindeki kodlar calisir, yanlissa(false) calismaz.

if(condition-kosul-sart){
    //calisacak kodlar
}

//----------------------

if(3<5){
    System.debug('condition dogru if calisti'); //condition dogru if calisti
}

//----------------------

if(7==4+3){
    System.debug('condition dogru, if calisti'); //condition dogru, if calisti
}

//----------------------
//ornek 1: Sayi 10'dan kucuk ise console'a "Kucuk" yazdirin, 10'dan buyuk ise "Buyuk" yazdirin.

Integer num = 12;

if(num<10){
    System.debug('Kucuk');
}

if(num>10){
    System.debug('Buyuk');
}
//----------------------
//ornek 2: Sayi cift ise console'a "Cift", tek ise "Tek" yazdirin.

//Verilen sayiyi 2'ye boldugumde kalan 0 ise cifttir.
//Math.mod() method'unu kullanacagiz

Integer num = 12;

if(Math.mod(num, 2)==0){
    System.debug('Cift');
}

if(Math.mod(num, 2)!=0){
    System.debug('Tek');
}
//----------------------

//ornek 3: Dogru password "pwd123!" oldugunda, verilen password'un dogru olup olmadgini kontrol eden ve
//kullaniciya uygun mesaj veren kodu yaziniz

String pwd = 'pwd!';

if(pwd.equals('pwd123!')){
    System.debug('Password u dogru girdiniz, tebrikler...');   
}

if(!pwd.equals('pwd123!')){
    System.debug('Password u yanlis girdiniz, tekrar deneyiniz...');
}

//----------------------
//if-else statements

//condition dogruysa(true) if blogu, condition yanlissa(false) else blogu calisir.
//if else'de sadece biri calisabilir.
//if else iki durumlu senaryolarda kullanilir

//once kalibini olusturalim

if(){
    
}else{
    
}
//----------------------
//ornek 1: Sayi 10'dan kucuk ise console'a "Kucuk" yazdirin, degil ise "Kucuk degil" yazdirin

Integer sayi = 9;

if(sayi<10){
    System.debug('Kucuk');
     
}else{
    System.debug('Kucuk degil');
}

//----------------------

//ornek 2: Sayi cift ise console'a "Cift" yazdirin, tek ise "Tek" yazdirin.

//----------------------if cozumu
Integer num = 12;

if(Math.mod(num, 2)==0){
    System.debug('Cift');
}

if(Math.mod(num, 2)!=0){
    System.debug('Tek');
}
//----------------------if else cozumu

Integer num = 13;

if(Math.mod(num, 2)==0){
    System.debug('Cift');
}else{
    System.debug('Tek'); //Tek
}

//-------------------------
//ornek 3: Dogru password "pwd123!" oldugunda, verilen password'un dogru olup olmadgini kontrol eden ve
//kullaniciya uygun mesaj veren kodu yaziniz

String pwd = 'elma12';

if(pwd.equals('elma123')){
    System.debug('Dogru password girdiniz, tebrikler...');
}else{
    System.debug('Yanlis password girdiniz, tekrar deneyiniz...'); //Yanlis password girdiniz, tekrar deneyiniz...
}

//-----------------------------------

//if - else if - else

//Daha fazla durumlu senaryolarda if - else if - else kullanilir.
//Kalibini olusturalim
//Daha fazla durum varsa araya else if ekleriz.

if(){
    
}else if(){
    
}else if(){
    
}else{
    
}

