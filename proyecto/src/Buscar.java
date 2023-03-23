/**
 * Para buscar en el arbol binario implementando la interfaz IArbolBinario
 */
public class Buscar <K, T> implements IArbolBinario<K, T> {
    public NodoArbol<K, T> raiz;
    int count;
    IComparator<K, T> keyComparator;
    IKeyCalculator<K, T> keyCalculator;

    public Buscar(IComparator<K, T> metodoComparar, IKeyCalculator<K, T> metodoCalcularLlave) {
        keyComparator = metodoComparar;
        keyCalculator = metodoCalcularLlave;
        raiz = null;
        count = 0;
    }
    @Override
    public void Insert(K Key, T Value) {
        NodoArbol<K, T> _new = new NodoArbol<K, T>(Key, Value);

        if (raiz == null) {
            raiz = _new;
            count++;
        } else {
            try {
                InsertAux(raiz, _new);
            } catch(Exception e) {
                //Manejo de exception
            }

        }
    }
    private void InsertAux(NodoArbol<K, T> actual, NodoArbol<K, T> _new) throws Exception{
        if (actual != null) {

            if (keyComparator.Compare(actual.Key, _new.Key) > 0) { //Entra cuando actual > nuevo Inserta en hijo izquierdo
                if (actual.hijoIzquierdo == null) { //Puedo insertar en hijo izquierdo
                    actual.hijoIzquierdo = _new;
                    count++;
                } else { //Entra cuando no puedo insertar en el hijo izquierdo de actual ya que está ocupado
                    InsertAux(actual.hijoIzquierdo, _new);
                }
            } else if (keyComparator.Compare(actual.Key, _new.Key) < 0) { //Entra cuando actual < nuevo Inserta en hijo derecho

                if (actual.hijoDerecho == null) { //Puedo insertar en hijo derecho
                    actual.hijoDerecho = _new;
                    count++;
                } else { //Entra cuando no puedo insertar en el hijo derecho de actual ya que está ocupado
                    InsertAux(actual.hijoDerecho, _new);
                }
            } else {
                throw new Exception("Llaves repetidas");
            }

        }
    }
    @Override
    public T Delete(K key) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public T Find(K key, NodoArbol<K,T> value) {
        // TODO Auto-generated method stub
        T temp = null;


        if (value != null) {

            if((value.Key).equals(key)){
                temp = value.Value;
            }

            if(temp == (null)){
                temp = Find(key, value.hijoIzquierdo);
            }
            if(temp == (null)){
                temp = Find(key, value.hijoDerecho);
            }

        }

        return temp;
    }
    public int Count() {
        return count;
    }

    @Override
    public boolean IsEmpty() {
        return count == 0;
    }

    @Override
    public void InOrder(IVisitar<K, T> visitNode, NodoArbol<K, T> actual) {
        if (actual != null) {
            InOrder(visitNode, actual.hijoIzquierdo);

            visitNode.VisitarNodo(actual);

            InOrder(visitNode, actual.hijoDerecho);
        }

    }
    @Override
    public void PreOrder(IVisitar<K, T> visitNode, NodoArbol<K, T> actual) {
        if (actual != null) {
            visitNode.VisitarNodo(actual);

            PreOrder(visitNode, actual.hijoIzquierdo);

            PreOrder(visitNode, actual.hijoDerecho);
        }

    }

    @Override
    public void PostOrder(IVisitar<K, T> visitNode, NodoArbol<K, T> actual) {
        if (actual != null) {

            PostOrder(visitNode, actual.hijoIzquierdo);

            PostOrder(visitNode, actual.hijoDerecho);

            visitNode.VisitarNodo(actual);
        }

    }
}
