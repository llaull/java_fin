package decorator;

//composant concret
public class DarkRoast extends Beverage{
    
    public DarkRoast() {
       //redifinition
        description = "Dark Roast Coffee";
    }

    //redifition obligation 
    @Override
    public double cost() {
        System.out.println("beverage DarkRoast ");
            return .99;
    }
    
}
