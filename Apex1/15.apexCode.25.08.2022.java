//ornek 5: (5, 0, 2, 0) array'inde tum sifirlari sona yerlestiriniz.

//(5, 0, 2, 0)  ==> (5, 2, 0, 0) 

Integer[] arr = new Integer[]{5, 0, 2, 0, 3, 0};

Integer[] yeniArr = new Integer[arr.size()]; 

Integer ilkIndx = 0;
Integer sonIndx = arr.size()-1;

for(Integer i=0; i<arr.size(); i++){
 
    if(arr[i]!=0){
        yeniArr[ilkIndx] = arr[i];
        ilkIndx++;
    }else{
        yeniArr[sonIndx] = 0;
        sonIndx--;
    }
    
}
System.debug(yeniArr); //(5, 2, 0, 0)

//------------------------------

//for each loop

//Array, collections(List, Set) ve Map'lerde kullanilir.
//for loop'taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz.

//Kalibini olusturalim.
//Variable ismi olarak genel kabul w'un kullanilmasidir.
//---------------------------------
for(DataType variable : array-list-set-map'ten biri){
    //calisacak kodlar
}
//---------------------------------
    
//ornek 6: String data tipinde myArr isminde bir array olusturunuz. Icine sirasiyla Ali, Veli, Ayse, Fatma datalarini
//koyunuz. Isimlerin ilk harflerini console'a yazdiriniz.

    String[] myArr = new String[]{'Ali', 'Veli', 'Ayse', 'Fatma'};
    for(String w : myArr){
        
        String ilkHarf = w.substring(0,1);
         System.debug(ilkHarf);
    }

//ornek 7: Bir Integer array'deki en buyuk ve en kucuk elemanin farkini bulunuz. 
//Math.max ve Math.min

    Integer[] arr = new Integer[]{5, 12, 200, 8, 23}; 
    
    Integer maksimum = arr[0];
  
    for(Integer w : arr){
        maksimum = Math.max(maksimum, w);
       
    }
    System.debug(maksimum); //200
    
    
    Integer minimum = arr[0];
    
    for(Integer w : arr){
        minimum = Math.min(minimum, w);
    }
    System.debug(minimum); //5
    
    System.debug(maksimum-minimum); //195
    
//ornek 8: Bir String array'de kullanilan toplam karakter sayisini ekrana yazdiriniz.
    
    String[] arr = new String[]{'Ali', 'Canan', 'Veli', 'Han'};
    
    Integer sum = 0;
     
    for(String w : arr){
        sum = sum + w.length();
        
    }
    System.debug(sum); //15

//List: 
//List'lerde onceden kac eleman yerlestirilecegini soyleme sarti yoktur

