import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los valores para construir el árbol(con espacios): ");
        String valoresInput = scanner.nextLine().trim();
        for (String valor : valoresInput.split(" ")) {
            arbol.agregarDato(Long.parseLong(valor));
        }

        System.out.println("Recorrido en orden:");
        arbol.recorridoEnOrden();
        System.out.println("Recorrido posorden:");
        arbol.recorridoPosOrden();
        System.out.println("Recorrido preorden:");
        arbol.recorridoPreOrden();
        arbol.mostrarArbol(arbol.raiz, "");

        System.out.print("Ingrese el valor a buscar: ");
        long valorBuscado = scanner.nextLong();
        scanner.close();
        boolean encontrado = arbol.buscar(valorBuscado);
        System.out.println("El valor " + valorBuscado + (encontrado ? " está presente en el árbol." : " no se encuentra en el árbol."));
    }
}
