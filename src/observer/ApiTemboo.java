package observer;

import com.temboo.Library.Yahoo.Weather.GetWeatherByCoordinates;
import com.temboo.Library.Yahoo.Weather.GetWeatherByCoordinates.GetWeatherByCoordinatesInputSet;
import com.temboo.Library.Yahoo.Weather.GetWeatherByCoordinates.GetWeatherByCoordinatesResultSet;
import com.temboo.core.TembooException;
import com.temboo.core.TembooSession;

/**
 *
 * @author Arkesys
 */
public class ApiTemboo {
   
    /**
     *
     * @return @throws TembooException
     */
    static GetWeatherByCoordinatesResultSet plup() throws TembooException {

        // Instantiate the choreography, using a previously instantiated TembooSession object, eg:
        TembooSession session = new TembooSession("laul", "myFirstApp", "716466d30e44421b88c0fd11afa2da8d");
        GetWeatherByCoordinates getWeatherByCoordinatesChoreo = new GetWeatherByCoordinates(session);

        // Get an InputSet object for the choreo
        GetWeatherByCoordinatesInputSet getWeatherByCoordinatesInputs = getWeatherByCoordinatesChoreo.newInputSet();

        // Set inputs
        getWeatherByCoordinatesInputs.set_Units("c");
        getWeatherByCoordinatesInputs.set_ResponseFormat("json");
        getWeatherByCoordinatesInputs.set_Latitude("45.727004799999996");
        getWeatherByCoordinatesInputs.set_Longitude("4.844460499999999");

        // Execute Choreo
        GetWeatherByCoordinatesResultSet getWeatherByCoordinatesResults = getWeatherByCoordinatesChoreo.execute(getWeatherByCoordinatesInputs);

        return getWeatherByCoordinatesResults;
    }

    /**
     *
     * @return temperature faible
     */
    public String tempLow() {

        try {
            return ApiTemboo.plup().get_Low();
        } catch (Exception e) {
            return "echec";
        }

    }

    /**
     *
     * @return temperature faible
     */
    public String tempHight() {

        try {
            return ApiTemboo.plup().get_High();
        } catch (Exception e) {
            return "echec";
        }

    }

    /**
     *
     * @return Humidité
     */
    public String tempHumi() {

        try {
            return ApiTemboo.plup().get_Humidity();
        } catch (Exception e) {
            return "echec";
        }

    }

    /**
     *
     * @return pression
     */
    public String tempPress() {

        try {
            return ApiTemboo.plup().get_Pressure();
        } catch (Exception e) {
            return "echec";
        }

    }
}
