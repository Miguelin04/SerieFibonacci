public class Arbol {
    public Nodo raiz;

    public Arbol(int dato) {
        this.raiz = new Nodo(dato);
    }

    public void agregar(int dato) {
        Nodo nuevo = new Nodo(dato);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            agregarRecursivo(raiz, nuevo);
        }
    }

    private void agregarRecursivo(Nodo actual, Nodo nuevo) {
        if (nuevo.dato < actual.dato) {
            if (actual.izquierdo == null) {
                actual.izquierdo = nuevo;
            } else {
                agregarRecursivo(actual.izquierdo, nuevo);
            }
        } else {
            if (actual.derecho == null) {
                actual.derecho = nuevo;
            } else {
                agregarRecursivo(actual.derecho, nuevo);
            }
        }
    }

    public boolean buscar(int dato) {
        return buscarRecursivo(raiz, dato);
    }

    private boolean buscarRecursivo(Nodo actual, int dato) {
        if (actual == null) {
            return false;
        }
        if (dato == actual.dato) {
            return true;
        }
        if (dato < actual.dato) {
            return buscarRecursivo(actual.izquierdo, dato);
        } else {
            return buscarRecursivo(actual.derecho, dato);
        }
    }

    public String toString() {
        if (raiz == null) {
            return "Árbol vacío";
        }
        return raiz.toString();
    }
}

