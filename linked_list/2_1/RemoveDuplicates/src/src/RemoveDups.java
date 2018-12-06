package src;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ll.Node;


class RemoveDups{

    Node removeD(Node head){
        Map<Node,Integer> map = new HashMap();
        if(head==null) return null;
        
        map.put(head, new Integer(head.value) );
        Node temp = head;
        
        while(temp.next != null){
            Integer val = new Integer( temp.next.value );
            if(map.containsValue(val) ){
                if( temp.next.next != null )
                    temp.next = temp.next.next;
                else{
                    temp.next = null;                    
                    break;
                }
            } else {
                map.put(temp.next, val);
            }
            temp = temp.next;
        }
        return head;
    }
    
    Node removeEasy(Node h){
        Set<Integer> set = new HashSet();
        Node head = h;
        Node previous = null;
        
        while(h!=null){
            if(set.contains(new Integer(h.value)))
                previous.next = h.next;
            else{
                set.add(new Integer(h.value));
                previous = h;
            }
            h=h.next;
        }
        return head;
    }
    
    Node getMiddle(Node head){
        Node slowP = head;
        Node fastP = head.next;
        while(fastP!=null){
            fastP = fastP.next;
            if(fastP!=null){
                fastP=fastP.next;
                slowP=slowP.next;
            }
        }
        return slowP;
    }
    
    void merge(Node head){
        
    }
}