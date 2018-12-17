package src;

public class Main{
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();
        ll.add(5);
        ll.add(1);
        ll.add(4);
        ll.add(7);
        ll.add(8);
        ll.add(9);
        ll.add(2);
        ll.add(1);
        ll.add(411);
        ll.add(799);
        ll.add(8);
        ll.add(9);
        ll.printAll();
        System.out.println("---");

        Node n = ll.getMiddle(ll.getHead());

        System.out.println("Node n is "+n.value);
        System.out.println("delte the node");
        ll.deleteNodeAndShiftList(n);
        System.out.println("---------------");
        ll.printAll();
        
    }
}