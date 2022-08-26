//Array (dizi)

/*

1) Coklu data saklamaya izin veren yapilardir.
2) Array'lar tek data tipi depolayabilirler.
3) Array olusturmak icin i)Data Tipi ii)Data sayisi soylenmelidir.
4) Array'lar diger collection'lardan (List, Set) hizlidir.
5) Array'lar diger collection'lardan daha az memory kullanirlar.
6) Array'larin icine primitive data tipleri(Integer, String), sObject'ler (Account,elma__c, Contact) konabilir.

*/
//----------------------------------
//Array olusturmak
//----------------------------------
//null, ici bos object demektir.

//Kalibini olusturalim

DataType[] arr = new DataType[DataSayisi];

//----------------------------------

Integer[] arr = new Integer[2]; //Data sayisini yazmazsaniz "Unexpected token '['." hatasi alirsiniz
System.debug(arr); //(null, null)

//----------------------------------

//ornek: 5 elemanli notlar adinda Integer bir array olusturunuz ve console'a yazdiriniz.

Integer[] notlar = new Integer[5];
System.debug(notlar); //(null, null, null, null, null)

//----------------------------------

//ornek: 3 elemanli isimler adinda string bir array olusturunuz ve console'a yazdiriniz.

String[] isimler = new String[3];
System.debug(isimler); //(null, null, null)

//----------------------------------

//Array'a eleman eklemek
//Array'ler index mantigiyla calisirlar. 0 ilk index demektir.

String[] isimler = new String[3];

isimler[0] = 'Ali Can';
//System.debug(isimler); //(Ali Can, null, null)
isimler[2] = 'Ayse Han';
//System.debug(isimler); //(Ali Can, null, Ayse Han)
isimler[1] = 'Fatma Can';
System.debug(isimler); //(Ali Can, Fatma Can, Ayse Han)

//----------------------------------

//Array olustur ve eleman ekle

//ornek: Decimal bir array olusturalim.

Decimal[] bmi = new Decimal[]{12.5, 23.7, 45.2, 67.3};
System.debug(bmi); //(12.5, 23.7, 45.2, 67.3)

//----------------------------------

//ornek 1: Integer data tipinde ages isminde array olusturunuz ve icine 12, 23 ve 8 datalarini koyunuz.

//1.yol:

Integer[] ages = new Integer[3];

ages[0] = 12;
ages[1] = 23;
ages[2] = 8;
ages[1] = 42;

System.debug(ages); //(12, 42, 8)

//2.yol: Tavsiye edilen

Integer[] ages = new Integer[]{12, 23, 8};
System.debug(ages); //(12, 23, 8)

//--------------------------------------

//ornek 2: Integer data tipinde arr isminde bir array olusturunuz. Icine sirasiyla 5, 9, 6, 10, 3 datalarini koyunuz
//Sonrada 3. ve 5. elemanlarini toplayip sonucu console'a yazdiriniz.

//3.eleman 6 ==> index'i 2 yani arr[2]
//5.eleman 3 ==> index'i 4 yani arr[4]

Integer[] arr = new Integer[]{5, 9, 6, 10, 3};
System.debug(arr[2] + arr[4]); //9

//--------------------------------------

//ornek 3: String data tipinde arr isminde bir array olusturunuz. Icine sirasiyla Ali, Mary, Tom, Brad datalarini koyunuz.
//Index'i 2 olan data haric digerlerini ayri satirda console'a yazdiriniz.
//continue keyword'u gecerli gecerli donguyu sonlandirip bir sonraki donguye devam eder.Yani sizi artirma/azaltmaya goturur.

//-------------------------------------tum datayi yazdiralim.eksik cozum
String[] arr = new String[]{'Ali', 'Mary', 'Tom', 'Brad'};
    
    for(Integer i=0; i<arr.size(); i++){
        System.debug(arr[i]);
    }
    
//--------------------------------------------tam cozum bu

String[] arr = new String[]{'Ali', 'Mary', 'Tom', 'Brad'};
    
    for(Integer i=0; i<arr.size(); i++){
        
        if(i==2){
            continue; 
        }      
        System.debug(arr[i]);
    }
//-------------------------------------------------
//ornek 4: Account Object data tipinde array olusturunuz ve icine 4 tane Account Object koyunuz.

//Account Object'te zorunlu alan sadece Name'dir.

//Oncelikle 4 tane Account olusturalim.

Account acc1 = new Account(Name='First Account', Phone='123');
Account acc2 = new Account(Name='Second Account', Phone='234');
Account acc3 = new Account(Name='Third Account', Phone='345');
Account acc4 = new Account(Name='Fourth Account', Phone='456');

Account[] accounts = new Account[]{acc1, acc2, acc3, acc4};
    
//insert accounts; admin partta account'lari olusturur.

System.debug(accounts); 
//(Account:{Name=First Account, Phone=123}, 
//Account:{Name=Second Account, Phone=234}, 
//Account:{Name=Third Account, Phone=345}, 
//Account:{Name=Fourth Account, Phone=456})

//------------------------------------------------------

//ornek 5: (5, 0, 2, 0) array'inde tum sifirlari sona yerlestiriniz.

//(5, 0, 2, 0)  ==> (5, 2, 0, 0) 

Integer[] arr = new Integer[]{5, 0, 2, 0};

Integer[] yeniArr = new Integer[arr.size()]; //dynamic code

//System.debug(arr); //(5, 0, 2, 0)
//System.debug(yeniArr); //(null, null, null, null)

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

