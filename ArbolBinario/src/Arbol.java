import java.util.*;

public class Arbol {
    public Nodo raiz;
    private Map<Long, Nodo> valorList;
    public Arbol() {
        this.raiz = null;
        this.valorList = new HashMap<>();
    }
    public void agregarDato(long dato) {
        Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
            return;
        }
        Nodo padre, actual;
        padre = actual = raiz;
        do {
            padre = actual;
            actual = (dato < actual.dato) ? actual.izquierdo : actual.derecho;
        } while (actual != null);
        if (dato < padre.dato) {
            padre.izquierdo = nuevo;
        } else {
            padre.derecho = nuevo;
        }
    }
    public boolean buscar(long valor) {

        return buscarNodo(raiz, valor);
    }
    private boolean buscarNodo(Nodo nodo, long valor) {
        while (nodo != null && valor != nodo.dato) {
            nodo = (valor < nodo.dato) ? nodo.izquierdo : nodo.derecho;
        }
        return nodo != null;
    }
    public void recorridoEnOrden() {
        recorridoEnOrden(raiz);
        System.out.println();
    }
    private void recorridoEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoEnOrden(nodo.izquierdo);
            System.out.print(nodo.dato + " ");
            recorridoEnOrden(nodo.derecho);
        }
    }
    public void recorridoPosOrden() {
        recorridoPosOrden(raiz);
        System.out.println();
    }
    public void recorridoPosOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoPosOrden(nodo.izquierdo);
            recorridoPosOrden(nodo.derecho);
            System.out.print(nodo.dato + " ");
        }
    }
    public void recorridoPreOrden() {
        recorridoPreOrden(raiz);
        System.out.println();
    }
    public void recorridoPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.print(nodo.dato + " ");
            recorridoPreOrden(nodo.izquierdo);
            recorridoPreOrden(nodo.derecho);
        }
    }
    public void mostrarArbol(Nodo nodo, String prefijo) {
        if (nodo != null) {
            System.out.println(prefijo + "Nodo raíz:");
            System.out.println(prefijo + " " + nodo.dato);

            if (nodo.derecho != null) {
                System.out.println(prefijo + "Nodo derecho:");
                mostrarValores(nodo.derecho, prefijo + " ");
                System.out.println();
            }
            if (nodo.izquierdo != null) {
                System.out.println(prefijo + "Nodo izquierdo:");
                mostrarValores(nodo.izquierdo, prefijo + " ");
                System.out.println();
            }
        }
    }
    private void mostrarValores(Nodo nodo, String prefijo) {
        if (nodo != null) {
            System.out.print(prefijo + nodo.dato + " ");
            mostrarValores(nodo.izquierdo, prefijo);
            mostrarValores(nodo.derecho, prefijo);
        }
    }
}