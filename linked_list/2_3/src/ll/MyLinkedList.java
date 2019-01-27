package ll;

public class MyLinkedList implements LinkedList{
    
    Node head;
    
    @Override
    public void add(int value) {
        Node n = new Node(value);
        if(head==null)
            head = n;
        else{
            Node temp = head.next;
            while(temp!=null){
                temp = temp.next;
            }
            temp = n;
        }
    }

    @Override
    public void remove(int value) {
        if(head==null) return;
        if(head.value==value){
            head=null;
            return;
        }
        Node previous=head;
        Node curr = head.next;
        while(curr!=null){
            if(curr.value == value){
                if(curr.next!=null){
                    previous.next=curr.next;
                } else {
                    previous.next = null;
                    return;
                }
            }
            previous=previous.next;
            curr=curr.next;
        }
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void printAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}