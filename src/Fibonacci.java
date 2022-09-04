public class Fibonacci {
    public static int FibonacciRecursion(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return FibonacciRecursion(n-1)+FibonacciRecursion(n-2);
    }

    public static int FibonacciCircle(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        int [] a = new int[n+1];
        a[1] = a[2] = 1;
        for (int i = 3; i <= n; i++) {
            a[i] = a[i-1]+ a[i-2];
        }
        return a[n];
    }

    public static void main(String[] args) {
        System.out.println(FibonacciRecursion(12));
        System.out.println(FibonacciCircle(3));
    }
}
