package src;

public class Main{
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(5);
        ll.add(2);
        ll.add(1);
        ll.add(4);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.printAll();
        ll.mergeSort(ll.getHead());
        System.out.println("---------");
        ll.printAll();
    }
}