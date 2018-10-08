package hm;

public interface HashStructure {
    public void add(K key, V value);
    public void remove(K key);
    public V getValue(K key);
    public K getKey(V value);
    public int getSize();
    public boolean isEmpty();
}
