//ornek 7: 10'dan 7'ye kadar tum Integer'larin carpimini console'a yazdiriniz.(10 ve 7 dahil)
// 10x9x8x7 ==> 5040

Integer carpim = 1;

for(Integer i=10; i>6; i--){ 
    carpim = carpim * i;
   
}
System.debug(carpim);

//------------------------------

//ornek 8: Size verilen bir String'in index'i tek sayi olan karakterlerini console'a yazdiriniz.

//String s = 'Amasya'; ==> msa
//------------
for(Integer i=0; i< s.length()){
    
}
//------------
for(Integer i=0; i<= s.length()-1){
    
}
//------------

String s = 'Amasya';
String sonuc = '';

for(Integer i=0; i<s.length(); i++){
  
    if(Math.mod(i, 2)!=0){
        sonuc = sonuc + s.substring(i, i+1); 
      
    }
}
System.debug(sonuc); //msa
//------------------------------------------------------------

//ornek 9: Verilen bir String'i tersden yazan kodu yaziniz.

//Ali Can ==> naC ilA
//Loop olustururken baslangic ve bitis degeri cok onemlidir.

//son index her zaman length()-1 dir.
//---------------------------
String s = 'Veli';
String ters = '';

for(Integer i=s.length()-1; i>=0; i--){
    
    ters = ters + s.substring(i, i+1);
   
}
System.debug(ters); //ileV
//---------------------------

String s = 'Veli';
String ters = s.reverse();
System.debug(ters); //ileV
//--------------------------------

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
