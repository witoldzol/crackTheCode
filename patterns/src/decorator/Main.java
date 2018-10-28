package decorator;

class Main{
    public static void main(String[] args) {
        Beverage espressoWhip = new Whip(new Espresso());
        System.out.println("des "+espressoWhip.getDescription());
        System.out.println("cost "+espressoWhip.cost());
    }
}