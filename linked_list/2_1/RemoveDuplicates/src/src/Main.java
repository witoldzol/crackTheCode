package src;
import ll.MyLinkedList;
import ll.Node;

public class Main {
    public static void main(String[] args) {
        RemoveDups rd = new RemoveDups();
        MyLinkedList ll = new MyLinkedList();
        
        ll.add(5);
        ll.add(2);
        ll.add(1);
        ll.add(4);
        ll.add(2);
        ll.add(7);
        ll.add(1);
        ll.add(1);
        ll.add(1);
        
        System.out.println(        rd.getMiddle(ll.getHead()).value);
    }

    
}