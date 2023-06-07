import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el valor del Fibonacci: ");
        long n = leer.nextLong();
        leer.close();

        for (long i = 0; i < n; i++) {
            System.out.print(numeroFib(i, new HashMap<Long, Long>()) + " ");
        }
        System.out.println();
    }

    public static long numeroFib(long n, Map<Long, Long> nuF) {
        if ((n == 0) || (n == 1)) {
            return n;
        }
        if (nuF.containsKey(n)) {
            return nuF.get(n);
        }
        long fibValue = numeroFib(n - 1, nuF) + numeroFib(n - 2, nuF);
        nuF.put(n, fibValue);
        return fibValue;
    }
}
