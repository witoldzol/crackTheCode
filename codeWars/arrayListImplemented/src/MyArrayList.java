import java.util.List;

/*
add
get
remove
size
isEmpty
isFull
 */

public class MyArrayList {
    //define starting size & size multiplier
    final int DEFAULT_SIZE = 5;
    final int MULTIPLIER = 3;

    //vars
    private int size=0;
    private int index;
    private Object[] arr;

    //constructor
    MyArrayList(){
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(Object obj){
        if( isFull() ) resizeArray();
        arr[size] = obj;
        size++;
    }

    //check if array is full
    private boolean isFull(){
        return size == arr.length;
    }

    private void resizeArray(){
        Object[] temp = arr;
        arr = new Object[arr.length * MULTIPLIER];
        System.arraycopy(temp,0,arr,0,temp.length);
        temp = null;
    }

    public void printAll(){
        for( Object o : arr ){
            System.out.println(o);
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Object get(int index) throws IndexOutOfBoundsException {
        try{
            return arr[index];
        } catch( IndexOutOfBoundsException e){
            System.out.println("stack trace : ");
            System.out.println(e.getStackTrace());
            return null;
        }

    }

    public void remove (int index) throws IndexOutOfBoundsException {
        try{
            if( arr[index] == null ) return;
            size--;
            arr[index] = null;
        } catch (IndexOutOfBoundsException e){
            System.out.println("stack trace : ");
            e.printStackTrace();
        } finally {
            System.out.println("close down operations");
        }

    }

    public int getSize(){
        return size;
    }
}
