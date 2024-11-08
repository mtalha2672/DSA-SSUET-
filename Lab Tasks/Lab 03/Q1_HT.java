import java.util.*;
public class Q1_HT {
    private Map<Integer, Integer> memoizeTable = new HashMap<>();
    public int fibonacciMemoize(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (this.memoizeTable.containsKey(n)) {
            System.out.println("Getting value from computed result for " + n);
            return this.memoizeTable.get(n);
        }
        int result = fibonacciMemoize(n - 1) + fibonacciMemoize(n - 2);
        System.out.println("Putting result in cache for " + n);
        this.memoizeTable.put(n, result);
        return result;
    }

    public static void main(String[] args) {
        Q1_HT obj = new Q1_HT();
        System.out.println("Fibonacci value for n=7: "+obj.fibonacciMemoize(7));
    }
}

