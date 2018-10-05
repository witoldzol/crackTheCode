package hm;

import java.util.ArrayList;

public class HashTable implements HashStructure{
    
    
    ArrayList<HashNode<K,V>> bucket;
    private int size;
    
    
    public HashTable (){
        bucket = new ArrayList<>();
    }
    
    @Override
    public void add(String key, String value) {
        
    }

    @Override
    public void remove(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getValue(String key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getKey(String value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getKeys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String[] getValues() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int getHashCode(String key){
        
    }
    
    private int commpressor(int hashCode){
        
    }
    
    private void calculateIndex(int hashCode){
        
    }

    @Override
    public int getSize() {
        
    }

}