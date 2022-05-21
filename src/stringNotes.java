import java.util.Locale;

public class stringNotes {
    public static void main(String[] args) {
        String mesaj = "Bugun hava cok guzel.";      // Klasik anlamda bir string değer.
        System.out.println(mesaj);

        System.out.println("Eleman sayisi:"+mesaj.length());  // Burada mesaj string kaç karekterden oluşuyor onu görebiliriz.

        //Şimdi de bir string değerin içindeki istediğimiz karekterini bulalım.

        System.out.println("5. eleman:"+mesaj.charAt(4)); //4. index deki elemanı yani 5. elemanı oluyor.

        // concat ile birleştirme yapalım.
        System.out.println(mesaj.concat("Nese doluyor insan"));
        //startsWith ve endsWith ile boolean değer kontrolü yapabiliriz.
        System.out.println(mesaj.startsWith("B"));  // İlk  karekter B ile başlıyor mu sorusuna true veya false çıktısı verecek.
        System.out.println(mesaj.endsWith("l"));    //Son karekter l mi ona bak demek.

        //Şimdi de bir String değer içerisinden istediğimiz miktardaki karekterleri alalım.
        //istediğimiz karekterleri almak için ilk başta bir tane char array oluşturmamız lazım.
        //Cagırıcagmız karekterler bu array içerisine gelecek.
        char[] karekterler = new char[4];
        mesaj.getChars(0,4,karekterler,0);
        System.out.println(karekterler); //Cıktı olarak string degerin ilk 4 karekterini verdi.

        //İstersek bir char karekteri string deger içirisinde arayabiliriz.
        System.out.println(mesaj.indexOf('a')); // yani 'a' karekteri kaçıncı index de demek. 7


        //"replace" ile ilgisi string deger icerisindeki bazı şeyleri degistirebiliriz.
        System.out.println(mesaj.replace(' ','-')); // boslul yerine '-' koy dedim.

        // bir baska kullanımda "substring()" şurdan itibaren yazmaya başla demek.
        System.out.println(mesaj.substring(2)); //2. index ve sonrasını yazdır demek.
        System.out.println(mesaj.substring(2,7));   //kısaca 2. index den basla 7. indexe kadar yazdır.7. index dahil degil.

        //Bize verilen string degeri belli bir koşul ile parçalamak icin "split(kosul)" ile ayırabiliriz.
        for (String kelime : mesaj.split(" ")){     //Boslugu kullanarak string degeri parcaladık.
            System.out.println(kelime);
        }

        //String degerde ki butun harfleri kucuk veya buyuk harfe cevirebiliriz.
        //"toLowerCase()" ve "toUppercase()" kullanımı.
        System.out.println(mesaj.toLowerCase(Locale.ROOT));
        System.out.println(mesaj.toUpperCase(Locale.ROOT));

        //"trim()" ile String degerin basında ki veya sonundaki  bosluklardan kurtulabiliriz.



    }
}
