package Desafio03;

public class ChaveValor<K,V> {
    
    private K key;
    private V value;
    
    public ChaveValor(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
