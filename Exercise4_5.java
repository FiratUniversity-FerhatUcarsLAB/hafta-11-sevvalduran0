public class Exercise4_5 {

    public static void zoop(String fred, int bob) {
        System.out.println(fred); // yazdırır: fred
        if (bob == 5) {
            ping("not "); // bob==5 ise çağrılır
        } else {
            System.out.println("!"); // bob != 5 ise çağrılır
        }
    }

    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz); // ilk zoop çağrısı
        clink(2 * buzz);        // clink çağrısı
    }

    public static void clink(int fork) {
        System.out.print("It's "); // satır sonu yok
        zoop("breakfast ", fork);  // ikinci zoop çağrısı
    }

    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

/*
----------------------------------------------------------
1) STACK DIYAGRAMI (zoop ikinci kez çağrıldığında)
----------------------------------------------------------

main(args)
   |
   --> clink(fork=4)
           |
           --> zoop(fred="breakfast ", bob=4)

Aktif metotlar: main, clink, zoop
Parametreler: fred="breakfast ", bob=4; fork=4; bizz=5, buzz=2
Yerel değişkenler: clink içindeki fork, main içindeki bizz ve buzz

----------------------------------------------------------
2) PROGRAM ÇIKTISI (birebir, boşluk ve satır sonlarıyla)
----------------------------------------------------------

just for
any not more 
It's breakfast 
! 

Açıklama:
- main -> zoop("just for",5) -> bob==5 → ping("not ") -> çıktı: "just for\nany not more "
- main -> clink(4) -> System.out.print("It's ") + zoop("breakfast ",4) -> bob !=4 → else bloğu -> çıktı: "It's breakfast \n! "
----------------------------------------------------------
*/
