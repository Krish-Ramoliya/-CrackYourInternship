package heap;

public class Fibo_Formula {

    public static void main(String []args)
    {
        int no= 3;
        System.out.println(Fiboformula(no));
    }

    private static long Fiboformula(int no) {

        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;
        double psi = (1 - sqrt5) / 2;
        double ans = ((Math.pow(phi, no) - Math.pow(psi, no)) / sqrt5);
        return (long)Math.round(ans);

    }
}
