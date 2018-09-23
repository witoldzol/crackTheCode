package singleton;
public class TestLogger{
    public static void main(String[] args){
        //we canot create instances outside of the logger class
        //because we hid the constructor
        //--->
        //Logger l1 = new Logger();

        Logger l1 = Logger.getLogger();
        Logger l2 = Logger.getLogger();
        //System.out.println(l1.getName());
        //System.out.println(l2.getName());
        System.out.println(l1);
        System.out.println(l1==l2);
        System.out.println(l1.getName());
        System.out.println(l2.getName());
    }
}