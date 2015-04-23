package decorator;

public class Milk extends CondimentDecorator {
    
Beverage beverage;

public Milk(Beverage beverage) {
        this.beverage = beverage;
}

public String getDescription() {
        return beverage.getDescription() + ", Milk";
}

public double cost() {
    System.out.println("beverage Milk "+beverage);
        return .10 + beverage.cost();
}
}
