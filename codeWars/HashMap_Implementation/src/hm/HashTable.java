package hm;

import java.util.ArrayList;

public class HashTable implements HashStructure{
        
    //this const defines point when we will resize bucket list
    //to lower the collisions (ie. 70% of buckets has been filled)
    final double LOAD_FACTOR = 0.7;
    final int DEFAULT_CAPACITY = 10;
    final int RESIZE_MULTIPLIER = 2;
    
    //vars
    ArrayList<HashNode<K,V>> bucketList;
    private int listCapacity;
    private int listSize;
    
    //constructor
    public HashTable (){
        bucketList = new ArrayList();
        listCapacity = DEFAULT_CAPACITY;
        //create starting list with 10 empty buckets
        for (int i = 0; i < listCapacity; i++) {
            bucketList.add(null);
        }
    }
    
    //take in key, convert to hashcode and return modulo agains list capacity
    private int getBucketIndex(K key){ return key.hashCode() % listCapacity;}
    
    @Override
    public void add(K key, V value) {
        //check if we have to resize array ( too many buckets taken )
        if ( resizeRequired() ) {
            resizeList();
            reindexNodes();
        }
        //calculate index of the bucket
        int index = getBucketIndex(key);
        //get the index
        HashNode node = bucketList.get(index);
        //check for duplicate
        while ( node != null){
            if(node.key.equals(key)){
                return;
            }
            node = node.next;
        }
        //add new node
        HashNode newNode = new HashNode(key, value);
        //PUT AT THE FRONT -- this way if the original node was null...
        newNode.next = node;
        //add to list
        bucketList.add(index, newNode);
        //increment size
        listSize++;
        
    }
    
    private boolean resizeRequired(){
        return listSize / listCapacity >= LOAD_FACTOR;
    }
    
    private void resizeList(){
        
    }
    
    private void reindexNodes(){
        
    }
    
    @Override
    public void remove(K key) {
        
    }
    
    @Override
    public V getValue(K key) {
        
    }
    
    @Override
    public K getKey(V value) {
        
    }
    
    @Override
    public int getSize() { return listSize; }
    
    @Override
    public boolean isEmpty(){ return listSize == 0;}
    
    
    
}