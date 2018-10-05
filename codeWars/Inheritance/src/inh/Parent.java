package inh;


public class Parent extends GrandParent{
    public void p(){
        System.out.print("Im the parent method");
    }
    @Override
    public void shout(){
        System.out.println("Parent shouts");
    }
}
