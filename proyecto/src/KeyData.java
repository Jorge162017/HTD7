public class KeyData <K, T> implements IKeyCalculator<K, T>  {
    public K GetKey(T value) {
        // TODO Auto-generated method stub
        Data datos = (Data) value;
        return (K) datos.getWord();
    }
}
