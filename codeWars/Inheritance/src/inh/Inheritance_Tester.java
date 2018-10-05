package inh;

public class Inheritance_Tester{
    
    public static void main(String[] args) {
        Child c = new Child();
        
        c.shout();
        
        GrandParent gp = new Child();
        
        gp.shout();
    }
}