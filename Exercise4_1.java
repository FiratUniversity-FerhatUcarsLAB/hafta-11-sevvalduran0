public class Exercise4_1 {

    // American Format: Monday, July 22, 2019
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // European Format: 22 July 2019, Monday
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {

        // Example test values
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        System.out.println("American Format");
        printAmerican(day, date, month, year);

        System.out.println("European Format");
        printEuropean(day, date, month, year);
    }
}
