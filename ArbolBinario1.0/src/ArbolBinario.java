import java.util.Scanner;
public class ArbolBinario {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese los valores para construir el árbol (separados por espacios): ");
        String input = scanner.nextLine();
        String[] valores = input.split(" ");
        for (String valor : valores) {
            int num = Integer.parseInt(valor);
            arbol.insertar(num);
        }

        System.out.println("INORDEN");
        arbol.recorridoInorden();
        System.out.println("");

        System.out.println("POSTORDEN");
        arbol.recorridoPostorden();
        System.out.println("");

        System.out.println("PREORDEN");
        arbol.recorridoPreorden();
    }
}

