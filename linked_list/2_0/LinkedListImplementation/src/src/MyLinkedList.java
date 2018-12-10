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
    public boolean find(int v) {
        Node n = head;
        while(n.next != null){
            if(n.next.value == v)
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
    
    //get middle
    Node getMiddle(Node head){
        //base case 
        if(head == null)
            return head;
        Node fastPointer = head.next;
        Node slowPointer = head;
        
        //move fast p by 2, slow by 1
        //when fast reaches end, slow will be half way through
        while(fastPointer != null){
            fastPointer = fastPointer.next;
            if(fastPointer != null){
                fastPointer = fastPointer.next;
                slowPointer = slowPointer.next;
            }
        }
        return slowPointer;
    }
    Node merge(Node a, Node b){
        Node result = null;
        //base case
        if(a == null)
            return b;
        if(b == null)
            return a;
        //recursion
        if(a.value <= b.value){
            result = a;
            result.next = merge(a.next, b);
        } else {
            result = b;
            result.next = merge(a, b.next);
        }
        return result;
    }
    //sort
    Node mergeSort(Node head){
        //base case
        if(head == null || head.next == null)
            return head;
        
        //get the middle of the list
        Node middle = getMiddle(head);
        Node nextToMiddle = middle.next;
        
        //zero-out next to middle ( we split the list into two halfs)
        middle.next = null;
        
        //left side
        Node left = mergeSort(head);
        
        //right side
        Node right = mergeSort(nextToMiddle);
        
        //merge left & right
        Node sortedList = merge(left,right);
        return sortedList;
    }
    
    Node getHead(){
        return head;
    }
    
    Node findFromEnd(Node head, int fromEnd){
        //FIND last
        if(head==null || head.next==null) return null;
        int end = 0;
        int mid = 0;
        Node slowP = head;
        Node fastP = head.next;
        
        while(fastP!=null && fastP.next!=null){
            fastP=fastP.next;
            end++;
            if(fastP!=null){
                mid++;
                end++;
                fastP=fastP.next;
                slowP=slowP.next;
            }
        }
        System.out.println("end" + fastP.value);
        System.out.println("mid" + slowP.value);
        //find index
        int index = end-fromEnd;
        //quick test
        if (index==end) return fastP;
        if (index==mid) return slowP;
        if (index==0)   return head;
        
        return (index==end) ? fastP :
               (index==mid) ? slowP :
               (index==0) ? head :
               (index>mid) ? getNode(slowP,index-mid) :
               getNode(head, index);
    }
    
    private Node getNode(Node start, int index) {
        int counter=0;
        while(counter<index){
            start=start.next;
            counter++;
        }
        return start;
    }
}