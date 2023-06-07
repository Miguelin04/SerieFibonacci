import java.util.*;

public class SerieFibonacci {
    private Map<Long, Long> nuF;

    public SerieFibonacci() {
        nuF = new HashMap<Long, Long>();
    }

    public long numeroFib(long n) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (nuF.containsKey(n)) {
            return nuF.get(n);
        }
        long fibValue = numeroFib(n - 1) + numeroFib(n - 2);
        nuF.put(n, fibValue);
        return fibValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (long i = 0; i < nuF.size(); i++) {
            sb.append(numeroFib(i)).append(" ");
        }
        return sb.toString();
    }
}