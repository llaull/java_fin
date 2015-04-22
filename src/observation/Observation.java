
package observation;

import observer.TestDemoObserver1;
import observer2.TestDemoObserver2;
import singleton.TestSingleton;

/**
 *
 * @author 

 */
public class Observation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //TestDemoObserver1.perform();
        //TestDemoObserver2.perform();
        TestSingleton.perfom();
    }
    
}
