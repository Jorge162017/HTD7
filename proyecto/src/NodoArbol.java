/**
 * @author jorgelopez
 * Nodo de un Arbol Binario
 */
public class NodoArbol <K, T> {
    public T Value;
    public K Key;
    public NodoArbol<K, T> hijoIzquierdo;
    public NodoArbol<K, T> hijoDerecho;

    public NodoArbol() {
        hijoIzquierdo = null;
        hijoDerecho = null;
    }

    public NodoArbol(K key, T value) {
        Key = key;
        Value = value;
        hijoIzquierdo = null;
        hijoDerecho = null;
    }
}
//Referencia: https://parzibyte.me/blog/2020/05/08/arbol-binario-java/