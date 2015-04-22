package singleton;

/**
 *
 * @author Moi
 */
public class TestSingleton {
    
    public static void perfom(){
        Log j = Log.getInstance();
        System.out.println("journal => " + j);
        
        Log j2 = Log.getInstance();
        System.out.println("journal => " + j2);
    }
    
}
