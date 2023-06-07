import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor para la raíz del árbol: ");
        int valorRaiz = scanner.nextInt();
        Arbol arbol = new Arbol(valorRaiz);

        System.out.print("Ingrese el número de elementos a agregar: ");
        int numElementos = scanner.nextInt();

        for (int i = 0; i < numElementos; i++) {
            System.out.print("Ingrese el valor para agregar al árbol: ");
            int valor = scanner.nextInt();
            arbol.agregar(valor);
        }

        System.out.println("\nÁrbol resultante:");
        System.out.println(arbol);

        System.out.print("\nIngrese el valor a buscar: ");
        int valorBuscado = scanner.nextInt();
        boolean encontrado = arbol.buscar(valorBuscado);
        System.out.println("¿Se encontró el dato " + valorBuscado + "? " + encontrado);
    }
}
