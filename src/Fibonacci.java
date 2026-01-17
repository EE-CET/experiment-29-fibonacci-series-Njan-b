import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N == 0) {
            System.out.println(0);
            return;
        }
        if (N == 1) {
            System.out.println(1);
            return;
        }

        int a = 0, b = 1;
        int fib = 0;

        for (int i = 2; i <= N; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        System.out.println(fib);
    }
}
