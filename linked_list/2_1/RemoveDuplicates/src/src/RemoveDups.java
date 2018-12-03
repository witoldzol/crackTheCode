package src;

import java.util.HashMap;
import java.util.Map;
import src.Node;

class RemoveDups{

    Node removeD(Node head){
        Map<Node,Integer> map = new HashMap();
        if(head==null) return null;
        
        map.put(head, new Integer(head.value) );
        Node temp = head;
        
        while(temp.next != null){
            Integer val = new Integer( head.next.value );
            if(map.containsValue(val)){
                temp.next = temp.next.next;
            } else {
                map.put(temp.next, val);
            }
        }
        
    }
}