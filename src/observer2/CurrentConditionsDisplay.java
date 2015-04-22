package observer2;


public class CurrentConditionsDisplay implements Observer, DisplayElement{
    
    private float temperature;
    private float humidity;
    private float pressure;

    //private Subject weatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        //this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("Conditions courantes: " + temperature + "F degrés et  " + humidity + "% d'humidité et " + pressure + " pour la pression ");
    }
    
}
