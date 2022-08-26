//soru 11: Size verilen iki tarihin ayni olup olmadigini kontrol ediniz.

//isSameDay(other) method'u non-static bir method'dur.
//isSameDay(other) method'u Boolean return eder.

Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);
Date girlBirthDate = Date.newInstance(2016, 4, 12);

Boolean isSame1 = fatherBirthDate.isSameDay(sonBirthDate);
Boolean isSame2 = sonBirthDate.isSameDay(girlBirthDate);

System.debug(isSame1); //false
System.debug(isSame2); //true

//-------------------------------

//soru 12: Size verilen tarihi 
//			a) String'e cevirmeden yilin son iki rakamini ekrana yazdiriniz
//			b) String'e cevirip yilin son iki rakamini ekrana yazdiriniz

//a)
//Bir sayiyi 100'e boler kalani alirsaniz, o sayinin son iki rakamini bulmus olursunuz
//Apex matematik ile ilgili islemleri Math Class'i icine koymustur.
//Apex, Math Class'i icinde bize bolme isleminin kalanini veren bir fonksiyon olusturmustur.
// Math.mod() ==> kalani verir.
//---------------------------------------
Integer kalan = Math.mod(25, 4);
System.debug(kalan); //1
//--------------------
Integer kalan = Math.mod(1990, 100);
System.debug(kalan); //90
//--------------------
Integer age = 25;
Integer kalan = Math.mod(age, 2);
System.debug(kalan); //1

//---------------------------------------

Date fatherBirthDate = Date.newInstance(1990, 7, 21);

Integer year = fatherBirthDate.year();
//System.debug(year); //1990

Integer lastTwoDigits = Math.mod(year, 100);
System.debug(lastTwoDigits); //90

//b)String'e cevirip yilin son iki rakamini ekrana yazdiriniz

//format() method'u verilen tarihi String'e cevirir

Date myDate = Date.newInstance(1990, 7, 21);

String dayString = myDate.format().substring(8,10);
System.debug(dayString); // 90
//-------------------------------------
Date myDate = Date.newInstance(1990, 7, 21);

String dayString = myDate.format().right(2);
System.debug(dayString); // 90

//------------------------------------

//DateTime Class
//--------------------------
//ornek 1: 
//now() method'u GMT("Greenwich Mean Time")'daki zamani verir.
//Turkiye +3 saat dilimindedir.

DateTime myDateTime = DateTime.now();
System.debug(myDateTime); //2022-08-04 19:49:40
//--------------------------
//ornek 2: 
//hour() method'u DateTime'dan sadece saat kismini almak icin kullanilir.
//hour() method'u Integer return eder.

DateTime myDateTime = DateTime.now();
System.debug(myDateTime); //2022-08-04 19:54:57
Integer justHour = myDateTime.hour();
System.debug(justHour); //20
//--------------------------
//ornek 3:
//addHours() method'u DateTime'a saat eklemek veya cikarmak(negatif sayi kullan) icin kullanilir.

DateTime myDt = DateTime.now();
DateTime newDt = myDT.addHours(+3);
System.debug(newDt); //2022-08-04 23:01:46
//--------------------------
//ornek 4:
//addDays() method'u DateTime'a gun eklemek veya cikarmak(negatif sayi kullan) icin kullanilir.

DateTime myDateTime = DateTime.now();
DateTime newDt = myDateTime.addDays(5);
System.debug(newDt); //2022-08-09 20:08:38

//--------------------------

//ornek 5: 
//addMinutes() method'u DateTime'a dakika eklemek veya cikarmak(negatif sayi kullan) icin kullanilir.

DateTime myDateTime = DateTime.now();

DateTime newDt = myDateTime.addDays(6).addMinutes(20);
System.debug(newDt); //2022-08-10 20:33:33

