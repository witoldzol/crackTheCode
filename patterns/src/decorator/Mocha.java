package decorator;

class Mocha extends CondimentDecorator {
    //reference to the object
    Beverage beverage;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
    
}