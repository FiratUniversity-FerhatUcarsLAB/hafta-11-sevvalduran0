public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}

/*
----------------------------------------------------------
1) STACK DIYAGRAMI (ping ilk kez çağrıldığında)
----------------------------------------------------------

main(args)
   |
   --> zoop()
           |
           --> baffle()
                    |
                    --> ping()   <-- ilk ping çağrısı

Stack görünümü:

+---------------------------+
| ping()                    |
| (parametre yok)           |
+---------------------------+
| baffle()                  |
| (parametre yok)           |
+---------------------------+
| zoop()                    |
| (parametre yok)           |
+---------------------------+
| main(String[] args)       |
+---------------------------+



----------------------------------------------------------
2) PROGRAM ÇIKTISI (birebir, boşluk ve satır sonlarıyla)
----------------------------------------------------------

No, I wug.
You wugga wug.
I wug.

Açıklama:

main -> "No, I "
zoop -> baffle -> "wug."
     -> "You wugga "
     -> baffle -> "wug."
main -> "I "
main -> baffle -> "wug."

Hepsi birleşince:

No, I wug.
You wugga wug.
I wug.

----------------------------------------------------------
*/
