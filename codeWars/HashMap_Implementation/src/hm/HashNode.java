package hm;

public class HashNode<K,V>{
    K key;
    V value;
    //reference to next node
    HashNode<K,V> next;
    //constructor
    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
    }
}