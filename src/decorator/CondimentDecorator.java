package decorator;

//les deco ont le mm supertype que les objet qu'ils decorent
public abstract class CondimentDecorator extends Beverage {
	
    
    @Override
    public abstract String getDescription();
}
