package bstt00;
public interface Map<K, V> {
    public void put(K key, V value);
    public V get(K key);
}