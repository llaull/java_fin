package decorator;

public class TestDemoDecorator {

    public static void perform() {

        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2.getDescription());
        System.out.println(" $" + beverage2.cost());

// BEVERAGE2 EXISTE TOUJOURS MAIS EN TANT QU ARGUMENT D UN MOKA ... QUI VA ETRE CONSTRUIT AVEC CE MEME BEVERAGE2
        beverage2 = new Mocha(beverage2);
// !!! BEVERAGE2 est mai
        System.out.println(beverage2.getDescription());
        System.out.println(" $" + beverage2.cost());

// BEVERAGE2 EST DETRUIT EN ETANT REMPLACE PAR UN MILK QUI VA ETRE CONSTRUIT AVEC BEVERAGE2
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println(beverage2.getDescription());
        System.out.println(" $" + beverage2.cost());
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2);
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
