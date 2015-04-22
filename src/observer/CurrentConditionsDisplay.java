package observer;

import java.util.Observable;
import java.util.Observer;

// A class can implement the Observer interface when it wants to be informed of changes in observable objects
// Cette classe est capable d'observer (de devenir un observateur en s'abonnant) une instance observable
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {

        // Abonnement
        // La station météo a un nouvel observateur : l'instance de CurrentConditionsDisplay
        observable.addObserver(this);
    }

    // Invoquée chaque fois que l'observable change
    // Chaque fois que la station météo change, l'affichage des current conditions est mis à jour
    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
            System.out.println("Conditions courantes: " + temperature + "F degrés et  " + humidity + "% d'humidité et " + pressure + " pour la pression ");
    }
}
