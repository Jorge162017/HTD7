public class Comparador <K, T> implements IComparator<K,T>{
    public int Compare(K abb1, K abb2) {
        // TODO Auto-generated method stub
        String uno = (String)abb1;
        String dos = (String)abb2;
        return uno.compareTo(dos);
    }
}
