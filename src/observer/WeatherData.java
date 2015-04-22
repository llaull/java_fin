//This class represents an observable object, or "data" in the model-view paradigm. It can be subclassed to represent an object that the application wants to have observed.
package observer;

import java.util.Observable;

/**
 *
 * @author naxos
 */
public class WeatherData extends Observable {
    
    // WeatherData EST un objet observable. Il le devient en étendant la classe 'Observable'
    // Il peut avoir 1 ou plusieurs observateurs. 1 observateur sera une classe qui implémente l'interface 'Observer'
    // Quand 1 instance de 'WeatherData' change les observateurs en seront notifiés.
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() { }

    public void measurementsChanged() {
        // marque l'objet observable comme changé. (la méthode 'hasChanged' retourne true)
        setChanged();
        // si l'objet a changé, notifie ses observateurs
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
