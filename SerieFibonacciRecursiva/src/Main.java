import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el valor del Fibonacci: ");
        long valor = leer.nextLong();
        leer.close();

        for (int i = 0; i < valor; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
        System.out.println();
    }

    public static long Fibonacci(long numero) {
        if ((numero == 0) || (numero == 1)) {
            return numero;
        } else {
            return Fibonacci(numero - 1) + Fibonacci(numero - 2);
        }
    }
}
