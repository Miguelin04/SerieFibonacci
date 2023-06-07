import java.util.HashMap;

class SerieFibonacci {
    private long valor;
    private HashMap<Long, Long> fibonacciCache;

    public SerieFibonacci(long valor) {
        this.valor = valor;
        this.fibonacciCache = new HashMap<>();
    }

    public long Fibonacci(long numero) {
        if (fibonacciCache.containsKey(numero)) {
            return fibonacciCache.get(numero);
        } else {
            long resultado;
            if ((numero == 0) || (numero == 1)) {
                resultado = numero;
            } else {
                resultado = Fibonacci(numero - 1) + Fibonacci(numero - 2);
            }
            fibonacciCache.put(numero, resultado);
            return resultado;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < valor; i++) {
            sb.append(Fibonacci(i)).append(" ");
        }
        return sb.toString();
    }
}

