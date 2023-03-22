public class Visitar <K, T> implements IVisitar<K, T>{
    public void VisitarNodo(NodoArbol<K, T> arbol) {
        // TODO Auto-generated method stub
        Data datos = (Data)arbol._value;
        System.out.println("Inglés: " + datos.getEnglish() + " Español: " + datos.getSpanish() + " Francés: " + datos.getFrench());
    }
}
