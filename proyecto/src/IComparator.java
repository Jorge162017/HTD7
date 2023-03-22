/**
 * Compara dos llaves
 * Devuelve 0 si son iguales, 1 si abb1 es mayor que abb2 (abb1 > abb2) y -1 de lo contrario (abb1 < abb2)
 */
public interface IComparator<K, T>  {
    public int Compare(K abb1, K abb2);
}
