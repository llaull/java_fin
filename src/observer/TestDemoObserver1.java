package observer;

// ICI, ON SIMULE LA STATION METEO
public class TestDemoObserver1 {
    
    public static void perform() {

    // DEMO OBSERVER 'NATUREL'

    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    
    // Chaque fois que la méthode 'setMeasurements' sera invoquée, la vue sera mise à jour
    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(82, 70, 29.2f);
    weatherData.setMeasurements(78, 90, 29.2f);

    }
    
    
}
