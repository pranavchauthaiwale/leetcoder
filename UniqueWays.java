public class UniqueWays {

    public static void main(String[] args){
        int m = 1;
        int n = 10;
        long paths = uniquePaths(m, n);
        System.out.println(paths);
    }

    public static long uniquePaths(int m, int n) {
        m--; n--;
        if(m <= 0 || n <= 0){
            return 1;
        }

        int steps = m + n;
        int bigger = m <= n ? n : m;
        int smaller = m <= n ? m : n;
        long num = steps;
        for(int i = steps - 1; i > bigger; i--){
            num = num * i;
        }
        return num / factorial(smaller);
    }

    public static long factorial(int n){
        long fact = 1;
        for(int i = 2; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
}
