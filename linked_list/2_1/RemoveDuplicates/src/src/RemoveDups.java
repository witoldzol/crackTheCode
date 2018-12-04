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
        if(h==null)return h;
        set.add(h.value);
        
        Node temp = h;
        while(temp.next != null){
            Integer val = temp.next.value;
            if(set.contains(val)){
                if(temp.next.next != null){
                    temp.next = temp.next.next;                    
                } else {
                    temp.next = null;
                    break;
                }
            }
            else{
                set.add(temp.next.value);
            }
            temp = temp.next;
        }
        return h;
    }
}