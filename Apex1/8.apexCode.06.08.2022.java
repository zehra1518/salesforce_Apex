//if - else if - else
//-------------------------------
//Daha fazla durumlu senaryolarda if - else if - else kullanilir.
//Kalibini olusturalim
//Daha fazla durum varsa araya else if ekleriz.

if(){
    
}else if(){
    
}else if(){
    
}else{
    
}

//-------------------------------
//ornek 1: Verilen herhangi bir sayinin pozitif, negatif veya notr olup olmadigini kontrol eden kodu yaziniz.

Integer x = -3;

if(x>0){
    System.debug(x + ' pozitiftir');
    
}else if(x<0){
    System.debug(x + ' negatiftir'); //-3 negatiftir
    
}else{
    System.debug(x + ' noturdur');
}

//-------------------------------

//ornek 2: Asagidaki tabloya gore ders notlarini harflerle ifade ediniz.

//		0 - 50 (Dahil degil) ==> D
//		50 - 60 (Dahil degil) ==> C
//		60 - 80 (Dahil degil) ==> B
//		80 - 100 (Dahil) ==> A

//1.yol

Integer dersNotu = -58;

if(dersNotu>=0 && dersNotu<50){
    System.debug('D');
    
}else if(dersNotu>=50 && dersNotu<60){
    System.debug('C');
    
}else if(dersNotu>=60 && dersNotu<80){
    System.debug('B');
    
}else if(dersNotu>=80 && dersNotu<=100){ 
    System.debug('A');
    
}else{
    System.debug('Ders notu 0 ile 100 arasinda olmalidir');
}

//2.yol
//		0 - 50 (Dahil degil) ==> D
//		50 - 60 (Dahil degil) ==> C
//		60 - 80 (Dahil degil) ==> B
//		80 - 100 (Dahil) ==> A

//Kullaniciya daha spesifik bilgilendirme yapabiliriz.Condition'lari sadelestirebiliriz.

Integer dersNotu = 40;

if(dersNotu<0){
    System.debug('Ders notu negatif olamaz');
    
}else if(dersNotu<50){
    System.debug('D');
    
}else if(dersNotu<60){
    System.debug('C');
    
}else if(dersNotu<80){
    System.debug('B');
    
}else if(dersNotu<101){ //<=100 de yazabilirdik ama 2 kontrol olurdu.
    System.debug('A');
    
}else{
    System.debug('Ders notu 100 den buyuk olamaz');
}

//-----------------------------
//ornek 3: Haftanin gunlerinin sayisi girildiginde, gunun ismini yazan kodu yaziniz.

//	1 ==> Pazar, 2 ==> Pazartesi....

Integer numOfDay = 8;

if(numOfDay<1){
    System.debug('Gun sayilari 1 den kucuk olamaz');
}else if(numOfDay==1){
    System.debug('Pazar');
}else if(numOfDay==2){
    System.debug('Pazartesi');
}else if(numOfDay==3){
    System.debug('Sali');
}else if(numOfDay==4){
    System.debug('Carsamba');
}else if(numOfDay==5){
    System.debug('Persembe');
}else if(numOfDay==6){
    System.debug('Cuma');
}else if(numOfDay==7){
    System.debug('Cumartesi');
}else{
    System.debug('Gun sayilari 7 den buyuk olmaz'); //Gun sayilari 7 den buyuk olmaz
}
//-------------------------------

//ornek 4: Bas harfleri verilen ay adlarini console'a yazdiriniz.

// 'O' ==> Ocak, 'S' ==> Subat, 'M' ==> Mart, 'N' ==> Nisan, 'M' ==> Mayis v.b.

String aylar = 'O';

if(aylar.equals('O')){
    System.debug('Ocak'); //Ocak
    
}else if(aylar.equals('S')){
    System.debug('subat');
    
}else if(aylar.equals('M')){
    System.debug('Mart, Mayis');
    
}else if(aylar.equals('N')){
    System.debug('Nisan');
    
}else{
    System.debug('Tanimli bir ayin bas harfini girmediniz...');
}
//--------------------------------------

//nested if (icice if'ler)

//--------------------------
//ornek 1: Kisi erkek ise;
//				i) 16 yasindan kucuk ise calismamali
//				ii) 16-65(dahil) arasi calismali
//				iii) 65 yasindan buyuk ise emekli olmali
//		   Kisi kadin ise;
//				i) 18 yasindan kucuk ise calismamali
//				ii) 18-60(dahil) arasi calismali
//				iii) 60 yasindan buyuk ise emekli olmali

//			Kisinin cinsiyetine ve yasina bakarak uygun mesaji console'a yaziniz.

String gender = 'Female';
Integer age = 17;

if(gender.equals('Male')){
    
    if(age<0){
        System.debug('Age negatif olamaz');
    }else if(age<16){
        System.debug('Calismamali');
    }else if(age<=65){
        System.debug('Calismali');
    }else{
        System.debug('Emekli olmali');
    }
        
}else if(gender.equals('Female')){
    if(age<0){
        System.debug('Age negatif olamaz');
    }else if(age<18){
        System.debug('Calismamali'); //Calismamali
    }else if(age<=60){
        System.debug('Calismali');
    }else{
        System.debug('Emekli olmali');
    }
    
}else{
    System.debug('Sizin icin farkli bir tanimlama yapilmadi.');
}

//ornek 2: Password buyuk harf ile baslarsa
//				i) 'A' veya 'B' ile baslamali
//		   Password kucuk harf ile baslarsa
//				i) 'y' veya 'z' ile baslamali
//			Kullanicidan alinan password'e gore uygun mesajlari yazdiriniz

String pwd = 'e123@';

if(pwd.charAt(0)>=65 && pwd.charAt(0)<=90){
    
    if(pwd.CharAt(0)==65 || pwd.charAt(0)==66){
        System.debug('Password kurallara uygun');        
    }else{
        System.debug('Password kurallara uygun degil cunku ilk karakter A veya B degil');
    }
    
}else if(pwd.charAt(0)>=97 && pwd.charAt(0)<=122){
    
    if(pwd.charAt(0)==121 || pwd.charAt(0)==122){
         System.debug('Password kurallara uygun');        
    }else{
        System.debug('Password kurallara uygun degil cunku ilk karakter y veya z degil');
    }
    
}else{
    System.debug('Password kurallara uygun degil cunku ilk karakter harf degil');
}

