package src;

public class Main{
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.printAll();
        ll.remove(3);
        System.out.println("---");
        ll.printAll();
    }
}