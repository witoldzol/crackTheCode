package src;

public class MyLinkedList implements LinkedList{
    
    //head element
    Node head;
    //constr
    public MyLinkedList(){
        head = null;
    }

    @Override
    public void add(int v) {
        Node newNode = new Node(v);
        if(head == null) {
            head = newNode;
            return;
        }
        Node n = head;
        //iterate to the end
        while(n.next!=null){
            n=n.next;
        }
        n.next = newNode;
    }

    @Override
    public void remove(int i) {
        Node v = new Node(i);
        if(head == null)return;
        if(head.value==v.value) head = head.next;
        Node temp = head;
        while(temp.next != null){
            if(temp.next.value == i)
                temp.next = (temp.next.next!=null) ? temp.next.next : null;
            temp=temp.next;
        }
    }

    @Override
    public boolean isEmpty() {
        if(head == null) return true;
        return false;
    }

    @Override
    public boolean find(Node v) {
        
        Node n = head;
        if(n == null)return false;
        while(n.next != null){
            if(n.next.value == v.value)
                return true;
            else
                n=n.next;
        }
        return false;
    }

    @Override
    public void printAll() {
        Node n = head;
        while(n!=null){
            System.out.println(n.value);
            n=n.next;
        }
    }
    
    
}