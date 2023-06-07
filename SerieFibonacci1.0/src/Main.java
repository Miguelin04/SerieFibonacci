import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el valor del Fibonacci: ");
        long valor = leer.nextLong();
        leer.close();

        SerieFibonacci serie = new SerieFibonacci();
        System.out.println(serie.toString());
    }
}


