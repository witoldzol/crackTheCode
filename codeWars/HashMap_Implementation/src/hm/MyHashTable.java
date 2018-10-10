package hm;

import java.util.ArrayList;

//implement:
/*
constructor
insert
remove
get
getSize
isEmpty

*/

public class MyHashTable<K,V> {
        
    //this const defines point when we will resize bucket list
    //to lower the collisions (ie. 70% of buckets has been filled)
    final double LOAD_FACTOR = 0.7;
    final int DEFAULT_CAPACITY = 5;
    final int RESIZE_MULTIPLIER = 2;
    
    //vars
    ArrayList<HashNode<K,V>> bucketList;
    private int listCapacity;
    private int listSize;
    
    //constructor
    public MyHashTable (){
        bucketList = new ArrayList();
        listCapacity = DEFAULT_CAPACITY;
        //create starting list with 10 empty buckets
        for (int i = 0; i < listCapacity; i++) {
            bucketList.add(null);
        }
    }

    void insert(K key, V value) {
        
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
        bucketList.set(index, newNode);
        //increment size
        listSize++;
        System.out.println("incrementing for key "+key);
        //check if we have to resize array ( too many buckets taken )
        System.out.println("is resize required ? "+ isResizeRequired());
        if ( isResizeRequired() ) {
            resizeList();
        }
    }
    
    public V get(K key){

        int index = getBucketIndex(key);
        HashNode<K,V> node = bucketList.get(index);
        
        while ( node != null ){
            if( node.key.equals(key) ) return node.value;
            node = node.next;
        }
        return null;
    }
    
    public void remove(K key){

        int index = getBucketIndex(key);
        HashNode<K,V> head = bucketList.get(index);
        


    }


    
    //take in key, convert to hashcode and return modulo agains list capacity
    private int getBucketIndex(K key){ return key.hashCode() % listCapacity;}
    
    private boolean isResizeRequired(){
        double result=  1.0*listSize / listCapacity;
        System.out.println("result "+ result);
        return result > LOAD_FACTOR;
    }
    
    private void resizeList(){
        listCapacity *= RESIZE_MULTIPLIER;
        listSize = 0;
        ArrayList<HashNode<K,V>> temp = bucketList;
        bucketList = new ArrayList<HashNode<K,V>>();
        for (int i = 0; i < listCapacity; i++) {
            bucketList.add(null);
        }
        reindexNodes(temp, bucketList);
    }
    
    private void reindexNodes(ArrayList<HashNode<K,V>> temp, ArrayList<HashNode<K,V>> list){
        for (HashNode<K,V> node : temp) {
            while(node != null){
                System.out.println("node from temp "+node.key);
                insert(node.key, node.value);                
                node = node.next;
            }
        }
    }
    
    int getSize(){
        return listSize;
    }
    
    void printAll(){
        for( HashNode<K,V> node : bucketList){
            while(node != null){
                System.out.println("key "+ node.key+" val: "+node.value);
                node = node.next;
            }

    }
    }
}

