public class Arbol {
    private NodoArbol inicial;

    public Arbol() {
        this.inicial = null;
    }

    public void insertar(int valor) {
        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }

    public void recorridoPreorden() {
        preorden(this.inicial);
    }

    private void preorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        System.out.print(nodo.getValor() + " ");
        preorden(nodo.getNodoIzquierdo());
        preorden(nodo.getNodoDerecho());
    }

    public void recorridoInorden() {
        inorden(this.inicial);
    }

    private void inorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        inorden(nodo.getNodoIzquierdo());
        System.out.print(nodo.getValor() + " ");
        inorden(nodo.getNodoDerecho());
    }

    public void recorridoPostorden() {
        postorden(this.inicial);
    }

    private void postorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        postorden(nodo.getNodoIzquierdo());
        postorden(nodo.getNodoDerecho());
        System.out.print(nodo.getValor() + " ");
    }

}
