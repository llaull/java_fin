package singleton;

/**
 *
 * @author Moi
 */
public class Log {

    //instance de log
    private static Log journal = null;
            
    private Log() {}
    
    //nom conventionné
    public static Log getInstance(){
        
        if (journal == null) {
            journal = new Log();
        }
        
        return journal;
        
    }
    
    
}
