package sb;

public class StringBuilder implements SBInterface {
//initialization
    private static final int BUFFER_MULTIPLIER = 2;
    private static final int DEFAULT_BUFFER_SIZE = 16;
        

//converting char to Character is inefficient
//don't use ArrayList, rely on array of primitive chars  
    private char[] charArr;
    private int size;
    private int charCount;
    
//constructors
    public StringBuilder(){
        this.size = DEFAULT_BUFFER_SIZE;
        this.charArr = new char[DEFAULT_BUFFER_SIZE];
    }
    public StringBuilder(int size){
        this.size = size;
    }
    public StringBuilder(char[] str){
        this.charArr = str;
    }
    public StringBuilder(String str){
        this.charArr = str.toCharArray();
    }
    //implement adding chars
    public StringBuilder append(String str){
        //out of bounds cheker
        while(resizeRequired(str)){
            resize();
        }
        //add string
        addString(str);
        //update count
        updateCharCount(str.length());
        return this;
    }
    public void insert(int start, String str){
        
    }
    //implements getSize
    public int getSize(){
        return this.size;
    }
    //implements toString
    public String toString(){
        return new String(charArr);
    }
    
    public void resize(){
        int oldSize = this.size;
        this.size *= BUFFER_MULTIPLIER;
        char[] newArr = new char[size];
        System.arraycopy(charArr, 0, newArr, 0, oldSize);
        this.charArr = newArr;
        System.out.println("resized array from size : " + oldSize + "to "+ this.size);
    }
    
    public boolean resizeRequired (String str){
        int requiredSize = str.length() + this.charCount;
        return size < requiredSize;
    }
    private void addString(String str){
        //null checker
        if(str == null) return;
        //copy from string turned into char arr, start at index 0, copy into our 
        //main buffer array, at index charCount, copy a number of chars equeal str.length()
        System.arraycopy(str.toCharArray(), 0, charArr, this.charCount, str.length());
    }
    private void updateCharCount(int length){
        this.charCount+=length;
    }
}