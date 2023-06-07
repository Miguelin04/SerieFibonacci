public class Nodo {
    public int dato;
    public Nodo izquierdo;
    public Nodo derecho;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierdo = null;
        this.derecho = null;
    }

    public String toString() {
        String s = "Nodo " + dato;
        if (izquierdo != null) {
            s += "\n\tIzquierdo: " + izquierdo;
        }
        if (derecho != null) {
            s += "\n\tDerecho: " + derecho;
        }
        return s;
    }
}