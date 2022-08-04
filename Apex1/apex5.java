//Date Data Type (Date Data Tipi) (Class)

//currentDate, variable ismidir. current ==> simdiki, date ==> tarih

//today() fonksiyonu bugunun tarihini verir.
//today() method'u saat bolumunu de bos olarak verir. Apex kalibi korudu

Date currentDate = Date.today();
System.debug(currentDate); //2022-07-30 00:00:00
//--------------------------------------

//Disardan istegimiz tarihi de girebiliriz
Date myDate = Date.newInstance(2002, 8, 2);
System.debug(myDate); //2002-08-02 00:00:00
//--------------------------------------
//soru 1: myDate'den 210 gun sonraki tarih nedir?
//addDays(gun sayisi) fonksiyonu ileriki tarihleri gun ekeleyrek bulmak icin kullanilir
    
Date myDate = Date.newInstance(2002, 8, 2);

Date laterDate = myDate.addDays(210);
System.debug(laterDate); //2003-02-28 00:00:00
//--------------------------------------

//soru 2: Bugunden 5 ay sonrasinin tarihi nedir?

Date currentDate = Date.today(); //class ismi yazarak fonksiyona ulastim. Bu tip fonksiyonlara "static" fonksiyon denir.

Date laterDate = currentDate.addMonths(5); // addMonths() fonksiyonuna olusturdugum object uzerinden ulastim.
											//Bu tip fonksiyonlara "non-static" fonksiyonlar denir.
System.debug(laterDate); //2022-12-30 00:00:00
//--------------------------------------

//soru 3: Bugunden 5 ay 210 gun sonrasinin tarihi nedir?

Date currentDate = Date.today();

Date laterDate = currentDate.addMonths(5).addDays(210);
System.debug(laterDate); //2023-07-28 00:00:00
//--------------------------------------

//soru 4: Ali 04.05.2010 tarihinde dogmustur. Ali'nin dogum tarihinden 2 yil, 3 ay, 12 gun sonrasinin tarihi nedir?

Date birthDateOfAli = Date.newInstance(2010, 5, 4);

Date laterDate = birthDateOfAli.addYears(2).addMonths(3).addDays(12);
System.debug(laterDate); //2012-08-16 00:00:00

//--------------------------------------

Date currentDate = Date.today();
Date laterDate = currentDate.minusDays(210);
System.debug(laterDate);

//Method does not exist or incorrect signature: void minusDays(Integer) from the type Date
//Date class'i kullanarak gecmise gitmek mumkun degildir.

//----------------------------------------

//soru 5: Ali 04.05.2010 tarihinde dogmustur. Ali'nin dogum tarihinden 3 yil, 6 ay, 18 gun oncesinin tarihi nedir?

Date birthDateOfAli = Date.newInstance(2010, 5, 4);
Date laterDate = birthDateOfAli.addYears(-3).addMonths(-6).addDays(-18);
System.debug(laterDate); //2006-10-17 00:00:00

//soru 6: Verilen tarih objesinden sadece yili ekrana yazdiriniz.

//------------------------------------HATALI
//year() methodu, tarih objesinden yil kismini Integer olarak alir.
//Illegal assignment from Integer to Date, Tamsayidan tarihe gecersiz atama
//Yil degerini depolamak icin olusturdugumuz variable'in data tipi Integer olmalidir
//Cunku yili aldigimizda sadece sayi almis oluruz.
//Aksi taktirde "Illegal assignment from Integer to Date" hata mesajini alirsiniz

Date myBirthDate = Date.newInstance(1990, 7, 13);
Date justYear = myBirthDate.year();
System.debug(justYear);

//------------------------------------

Date myBirthDate = Date.newInstance(1990, 7, 13);
Integer justYear = myBirthDate.year();
System.debug(justYear); //1990
//------------------------------------

//soru 7: Sizin ve cocugunuzun dogum tarihlerinin aylarinin toplami nedir?

Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);

Integer justMonthFather = fatherBirthDate.month();
Integer justMonthSon = sonBirthDate.month();

System.debug(justMonthFather+justMonthSon); //11
//------------------------------------

//soru 8: Sizin ve cocugunuzun dogum tarihleri arasindaki gun sayisi nedir?
//daysBetween(other) method'u iki tarih arasindaki gun sayisini verir
//daysBetween(other) method'u kullanilirken buyuk tarih method'dan once yazilmalidir. Kucuk tarih ise method 
// parantezi icine yazilmalidir. Aksi taktirde sonuc negatif cikar.

Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);

Integer daysNumber = fatherBirthDate.daysBetween(sonBirthDate);
System.debug(daysNumber); //9397

//------------------------------------

//soru 9: Sizin ve cocugunuzun dogum tarihleri arasindaki ay sayisi nedir?

Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);

Integer aySayisi = fatherBirthDate.monthsBetween(sonBirthDate);
System.debug(aySayisi); //309

//------------------------------------

//soru 10: Size verilen yilin Leap Year (artik yil) olup olmadigini kontrol ediniz.

//Leap Year : a) 100'e bolunen yil, 400'e de bolunuyorsa artik yildir. Ornek: 2000+, 1800-
//			  b) 100'e bolunemeyen yil, 4'e bolunurse artik yildir. Ornek: 2004+, 2007-

//isLeapYear(year) fonksiyonu static bir fonksiyon oldugu icin class ismi ile cagirilmalidir.Object ile cagirilamaz.
//isLeapYear(year) fonksiyonu verilen bir yilin artik yil olup olmadigini kontrol eder.
//isLeapYear(year) fonksiyonu Boolean return eder.

Date fatherBirthDate = Date.newInstance(1990, 7, 21);
Date sonBirthDate = Date.newInstance(2016, 4, 12);

Boolean isFatherLeap = Date.isLeapYear(fatherBirthDate.year());
Boolean isSonLeap = Date.isLeapYear(sonBirthDate.year());
System.debug('Babanin dogum yili artik yil mi?' + ' ' + isFatherLeap); //false
System.debug('Cocugun dogum yili artik yil mi?' + ' ' + isSonLeap); //true

