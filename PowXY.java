public class PowXY {

    public static void main(String[] args){
        double x = 2;
        int n = 11;
        double result = pow(x, n);
        System.out.println(String.format("X:[%f] raised to n:[%d] = [%f]", x, n, result));
    }

    public static double pow(double x, int n) {
        if (n == 0)
            return 1;
        double val = pow(x, n / 2);
        if (n % 2 == 0)
            return val * val;
        if (n > 0)
            return x * val * val;
        return (val * val) / x;
    }
}
