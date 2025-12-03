public class Exercise4_6_Multadd {

    // a * b + c işlemini yapan metot
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // expSum(x) = x * e^(-x) + (1 - e^(-x))
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), 1 - Math.exp(-x));
    }

    public static void main(String[] args) {

        // Basit testler
        System.out.println("multadd(2,3,4) = " + multadd(2,3,4)); // 2*3+4 = 10
        System.out.println("multadd(5,0.5,1) = " + multadd(5,0.5,1)); // 5*0.5+1 = 3.5

        // 1) sin(π/4) + cos(π/4)/2
        double sincos = multadd(Math.cos(Math.PI/4), 0.5, Math.sin(Math.PI/4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + sincos);

        // 2) log 10 + log 20 (natural log, ln)
        double logSum = multadd(Math.log(20), 1, Math.log(10));
        System.out.println("log(10) + log(20) = " + logSum);

        // 3) expSum örneği
        double x = 2.0;
        System.out.println("expSum(" + x + ") = " + expSum(x));
    }
}
