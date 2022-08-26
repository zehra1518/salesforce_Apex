//loops (donguler)

//donguler tekrar eden kodlama islerini kolaylastirmak icin kullanilir.

//Apex'de su donguleri gorecegiz.

//1. for loop
//2. while loop
//3. do while loop
//4. for each loop (Collection'larda gorecegiz.)

//---------------------------------

//1. for loop
//for dongusu, temel olarak bir kod blogunu belirli sayida ve ust uste calistirmak icin kullanilir.

//ornek 1: Console'a 5 kere 'Hi!' yazdirin.

//1.yol

System.debug('Hi!');
System.debug('Hi!');
System.debug('Hi!');
System.debug('Hi!');
System.debug('Hi!');

//2.yol

//kalibini olusturalim

for(;;){
    
}
//-----------------------

for(Baslangic Degeri ; Loop Calisma Kurali ; Artirma/Eksiltme){
    //Calisacak kodlar
}

//---------------------------
// Baslangic Degeri ; Loop Calisma Kurali  ; Artirma/Eksiltme

for(Integer i = 1   ;       i<6           ;  i++){
 
    System.debug('Hi!');
}

//Artirma ==> Increment   Azaltma ==> Decrement
//i degisken ismidir.Genel kabul gormustur.
// i++ ile i = i + 1 aynidir.
//----------------------------

//ornek 2: 6(dahil) den 3(dahil) e kadar tum Integer'lari console'a yazdiriniz.

for(Integer i=6; i>2; i--){
    
  System.debug(i);
}

//-----------------------------
//ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz.(3 ve 20 dahil)

for(Integer i=3; i<21; i++){
  
    if(Math.mod(i, 2)==0){
        
        System.debug(i);
    }   
}
//-------------------------------
//ornek 4: 40(dahil) dan 3 (dahil) e kadar tum tek sayilari console'a yazdiriniz.

for(Integer i=40; i>2; i--){
    
    if(Math.mod(i, 2)!=0){
        System.debug(i);
    }
}

//-------------------------------
//ornek 5: 1 den 9 a kadar sayilari ekrana yazdirirken, degiskenin degeri 3 oldugunda donguyu kiran kodu yaziniz.(1 ve 9 dahil)

//Baslangic kosulundan bagimsiz olarak donguyu kirmak mumkundur

for(Integer i=1; i<10; i++){
    System.debug(i);
    
        if(i==3){
        break;
    }
}

//------------------------------

//ornek 6: 6'dan 10'a kadar tum Integer'larin toplamini console'a yazdiriniz.(6 ve 10 dahil)
//   		6 + 7 + 8 + 9 + 10 ==> 40

//Bu tarz sorularda ilk hamleniz, memory'de sonucu depolayabileceginiz bir alan acmaktir.
//etkisiz elemani variable'a yerlestiririz

Integer toplam = 0;

for(Integer i=6; i<11; i++){
    
    toplam = toplam + i;
   
}
 System.debug(toplam);

//-------------------------------------
//ornek 7: 10'dan 7'ye kadar tum Integer'larin carpimini console'a yazdiriniz.(10 ve 7 dahil)
// 10x9x8x7 ==> 5040