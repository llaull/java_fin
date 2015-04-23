package decorator;

public class Mocha extends CondimentDecorator{
    
    
    Beverage beverage;
    
    //le mocha est composer de la boisson 
    public Mocha(Beverage beverage) {
            this.beverage = beverage;
    }

    // point de logique particulier /!\
    // chaque ingredient et ajouter aux autres
    @Override
    public String getDescription() {
            return beverage.getDescription() + ", Mocha";
    }
    
    @Override
    public double cost() {

        System.out.println("beverage Mocha "+beverage);
            return .20 + beverage.cost();
    }
    
}
