//ornek 10: Asagidaki sekli for loop kullanarak cizdiriniz
/*
	AAAAA
	AAAAA
	AAAAA

*/

//Satir sayisi 3
//Sutun sayisi 5

Integer satir = 3;
Integer sutun = 5;

for(Integer i=1; i<=satir; i++){
    String s = '';
    
    for(Integer k=1; k<=sutun; k++){
       s = s + 'A';    
    }
   System.debug(s); 
}


//System.LimitException: Apex CPU time limit exceeded
//sonsuz dongu hatasi
//---------------------------------

//ornek 11: Asagidaki sekli for loop kullanarak cizdiriniz

/*
	*
	**
	***
	****

*/

Integer satir = 4;

for(Integer i=1; i<=satir; i++){
    String s = '';
    
    for(Integer k=1; k<=i; k++){

        s = s + '*';
    }
    System.debug(s);   
}
//-----------------------------------
//2.while loop

//kalibini olusturalim

//-------------------------for

for(baslangic degeri; loop calisma kurali; artirma/azaltma){
    //calisacak kodlar
}

//------------------------- while

baslangic degeri
    
while(loop calisma kurali){
    //calisacak kodlar
    artirma/azaltma
}

//-----------------------

//ornek 1: Console'a 5 kere 'Hi!' yazdiriniz

//------------------for

for(Integer i=1; i<6; i++){
    System.debug('Hi!');
}

//---------------------while

Integer i = 1;

while(i<6){
                            
	System.debug('Hi!');
                          
 i++;
}
//------------------------

//ornek 2: 15 (dahil) den 8(dahil) e kadar tum Integer'lari console'a yazdiriniz.

Integer i = 15;

while(i>7){
    System.debug(i);
    i--;
}

//--------------------------

//ornek 3: 3'den 20'ye kadar tum cift sayilari console'a yazdiriniz(3 ve 20 dahil)

Integer i = 3;

while(i<21){
    
    if(Math.mod(i, 2)==0){
        System.debug(i);
    }
       i++;
}

//-------------------

//ornek 4: Verilen bir Integer'in rakamlari toplamini console'a yazdiriniz.

//		573 ==> 5+7+3=15 ==> Output 15 olmali

//Math.mod kullanarak verilen sayiyi 10'a bolersek kalani en sagdaki basamak olur
//Iki Integer'i birbirine bolersek sonuc Integer olur(tamsayi)
//Apex virgulden sonrasini siler, yuvarlama islemi yapmaz

Integer i = 573;

Integer toplam = 0;
while(i>0){
    toplam = toplam + Math.mod(i, 10);
   
    i = i/10;
    
}
System.debug(toplam);

//------------------------------------
//ornek 5: Bir String'deki tekrarsiz karakterleri console'a yazdiriniz.
// kertenkelle ==> rtn

//indexOf() ve lastIndexOf() kullanalim

//1.yol:

String s = 'kertenkelle';
String sonuc = '';

Integer i = 0;

while(i<s.length()){
    
    String c = s.substring(i, i+1);
    
    if(s.indexOf(c)==s.lastIndexOf(c)){
        sonuc = sonuc + c;
        
    }
    i++;
}
System.debug(sonuc);
//---------------------------

//2.yol:

//countMatches() method'u bir karakterin bir String'de kac kere kullanildigini verir.
//tekrarsiz karakterler 1 kere kullanilmis olurlar.

String s = 'kertenkelle';

Integer i = 0;

while(i<s.length()){
    
    String c = s.substring(i, i+1);
    
    if(s.countMatches(c)==1){
        System.debug(c);
    }
    i++;
    
}
//-----------------------------

//3. do while loop

//kalibini olusturalim.

//---------------------while

baslangic degeri
    
while(loop calisma kurali){
    //calisacak kodlar
    artirma/azaltma
}
//----------------------do while

baslangic degeri
    
    do{
        
    //calisacak kodlar
    artirma/azaltma
        
    }while(loop calisma kurali);

//----------------

//ornek 1: Console'a 5 kere 'Hi!' yazdiriniz

Integer i = 1;
            
do{
                
System.debug('Hi!');
               
i++;
               
}while(i<6);
        
//ornek 2: 5 den 3 e kadar Integer'lari console'a yazdiriniz(5 ve 3 dahil) 

Integer i = 5;

do{
    System.debug(i);
    i--;
    
}while(i>2);

//-------------------
//while loop ile do while loop arasindaki fark nedir?

//while loop'ta loop'un en basta kirilmasi mumkundur cunku once kural kontrol edilir,sonra islem yapilir
//do while loop'ta loop'un basta kirilmasi mumkun degildir.(sonsuz donguye sokulmazsa) Once bir kere calistirilir.

Integer i = 1;

while(i<1){
    System.debug('Ben while loop um'); //hicbir sey gostermez
    i++;
}
//-----------

Integer k = 1;

do{
    
    System.debug('Ben do while loop um'); //Ben do while loop um
    k++;
    
}while(k<1); //bir kere calismasi icin condition'in false vermesi gerekir.
