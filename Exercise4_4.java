public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Cevap:
        // Java bir hata vermez. Program normal çalışır.
        // Ancak IDE veya derleyici uyarı verebilir: 
        // "The value returned from method is never used."
        // (Metodun döndürdüğü değer kullanılmıyor)

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevap:
        // Derleme hatası oluşur.
        // Hata mesajı tipik olarak:
        // "bad operand types for binary operator '+'; first type: void, second type: int"
        // Çünkü sayHello() void döner ve + operatörü void ile kullanılamaz.
    }
}
