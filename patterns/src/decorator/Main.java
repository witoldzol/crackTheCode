package decorator;

class Main{
    public static void main(String[] args) {
        Beverage espressoWhip = new Whip(new Espresso());
        Beverage a = new Whip(new Mocha(new HouseBlend()));
        System.out.println(a.getDescription());
        System.out.println(a.cost());
        
        Beverage amazingLatte = new HouseBlend();
        amazingLatte = new Whip(amazingLatte);
        amazingLatte = new Mocha(amazingLatte);
        amazingLatte = new Mocha(amazingLatte);
        
        System.out.println(amazingLatte.getDescription());
        System.out.println(amazingLatte.cost());
    }
}