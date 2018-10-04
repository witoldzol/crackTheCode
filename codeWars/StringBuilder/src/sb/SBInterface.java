package sb;

public interface SBInterface {
    
    public StringBuilder append(String str);
    public int getSize();
    public String toString();
    public void insert(int start, String str);
    public boolean resizeRequired(String str);
    public void resize();
}
