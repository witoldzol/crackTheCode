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
        //index adjustment
        if(fromEnd!=0) fromEnd--;
        //FIND last
        if(head==null || head.next==null) return null;
        int end = 1;
        int mid = 1;
        Node slowP = head;
        Node fastP = head.next;
        Node previous = null;
        
        while(fastP!=null){
            fastP=fastP.next;
            previous=fastP;
            mid++;
            end++;
            if(fastP!=null){
                slowP=slowP.next;
                fastP=fastP.next;
                end++;
            }
        }
        fastP = (fastP!=null) ? fastP : previous;
        
        //find index
        int index = end-fromEnd;
        
        return (index==end) ? fastP :
               (index==0)   ? head  :
               (index>mid)  ? getNode(slowP,index-mid) :
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
    //recursive
    public int getKth(Node head, int k){
        //base condition
        if(head == null) return 0;
        
        //recursion
        int index = getKth(head.next, k) + 1;
        
        if(index == k) 
            System.out.println(k+"th to last node is "+head.value);
        return index;
    }
    
    //book solutions
    //using recursion with pointer
    Node getNth(Node head, int k){
        Pointer pointer = new Pointer();
        
        return getNth(head, k, pointer);
    
    }
    
    Node getNth(Node head, int k, Pointer pointer){
        //base condition
        if(head == null ) return null;
        
        //recursion
        Node n = getNth(head.next, k, pointer );
        pointer.p++;
        if(k==pointer.p) return head;
        
        return n;
    }
    
    //delete middle node
    void deleteNodeAndShiftList(Node n){
        //do not delete head or tail
        if(n == head || n.next == null) return;
        //replace ONLY one ahead (so instead of removing previous reference,
        //you remove the future reference...brilliant!
        n.value = n.next.value;
        n.next = n.next.next;

    }
}

class Pointer{
    public int p = 0;
}