import java.util.HashMap;

class CalcularFibonacci {
    private HashMap<Long, Long> fibonacciCache;

    public CalcularFibonacci() {
        this.fibonacciCache = new HashMap<>();
    }

    public long calcularFibonacci(long numero) {
        if (fibonacciCache.containsKey(numero)) {
            return fibonacciCache.get(numero);
        } else {
            long resultado;
            if (numero == 0 || numero == 1) {
                resultado = numero;
            } else {
                resultado = calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
            }
            fibonacciCache.put(numero, resultado);
            return resultado;
        }
    }
}
