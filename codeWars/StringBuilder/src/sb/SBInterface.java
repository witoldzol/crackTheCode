package sb;

public interface SBInterface {
    
    public void append(String str);
    public int getSize();
    public String toString();
    public void insert(int start);
    private boolean resizeRequired(String str);
    private int resize(String str);
}
