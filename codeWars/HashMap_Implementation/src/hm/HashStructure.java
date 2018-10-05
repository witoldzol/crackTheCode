package hm;

public interface HashStructure {
    public void add(String key, String value);
    public void remove(String key);
    public String getValue(String key);
    public String getKey(String value);
    public String[] getKeys();
    public String[] getValues();
    public int getSize();
}
