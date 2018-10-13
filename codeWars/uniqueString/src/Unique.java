import java.util.HashSet;
import java.util.Set;

public class Unique {
    public static void main(String[] args) {

        String str = "aabcda";

        //LONG WAY
        System.out.println(lookForDuplicate(str));

        //QUICK WAY
        Set set = new HashSet();
        set.add(str);
        System.out.println("are there duplicates = "+ !(str.length() == set.size() ));
    }

    static boolean lookForDuplicate(String str){
        //base
        if(str.length() == 1) return false;
        if(str.indexOf(str.charAt(0),1) != -1) return true;
        System.out.println("substring : "+ str.substring(1));
        return lookForDuplicate(str.substring(1));
    }
}
