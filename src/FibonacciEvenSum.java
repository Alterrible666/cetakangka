import java.util.ArrayList;
import java.util.List;

public class FibonacciEvenSum {
    public static void main(String[] args) {
        List<Integer> fibonacciList = new ArrayList<>();
        List<Integer> evenFibonacciList = new ArrayList<>();
        int limit = 4500;
        int a = 0;
        int b = 1;
        int sum = 0;

        while (b <= limit) {
            if (b >= 10) {
                fibonacciList.add(b);
                if (b % 2 == 0) {
                    evenFibonacciList.add(b);
                    sum += b;
                }
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        System.out.println("Deretan bilangan Fibonacci dari 10 sampai 4500:");
        for (int fibonacci : fibonacciList) {
            System.out.print(fibonacci + " ");
        }

        System.out.println("\n\nArray bilangan Fibonacci genap:");
        for (int evenFibonacci : evenFibonacciList) {
            System.out.print(evenFibonacci + " ");
        }

        System.out.println("\n\nTotal bilangan Fibonacci genap: " + evenFibonacciList.size());
        System.out.println("Jumlah bilangan Fibonacci genap: " + sum);
    }
}
