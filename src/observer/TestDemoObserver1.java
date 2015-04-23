package observer;

// ICI, ON SIMULE LA STATION METEO
public class TestDemoObserver1 {

    public static void perform() {

        ApiTemboo t = new ApiTemboo();
        // DEMO OBSERVER 'NATUREL'

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    // Chaque fois que la méthode 'setMeasurements' sera invoquée, la vue sera mise à jour
        // getTemperature
        // getHumidity
        // getPressure
        weatherData.setMeasurements(Float.parseFloat(t.tempLow()), Float.parseFloat(t.tempHumi()), Float.parseFloat(t.tempPress()));
        //weatherData.setMeasurements(82, 70, 29.2f);
        //weatherData.setMeasurements(78, 90, 29.2f);

    }

}
