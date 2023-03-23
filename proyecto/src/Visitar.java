public class Visitar <K, T> implements IVisitar<K, T>{
    public void VisitarNodo(NodoArbol<K, T> arbol) {
        // TODO Auto-generated method stub
        Data datos = (Data)arbol.Value;
        System.out.println("Inglés: " + datos.getEnglish() + " Español: " + datos.getSpanish() + " Francés: " + datos.getFrench());
    }
}
