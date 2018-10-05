package inh;


public class Child extends Parent{
    public void c(){
        System.out.println("Im the child method");
    }
    @Override
    public void shout(){
        System.out.println("Child shouts");
    }
}

