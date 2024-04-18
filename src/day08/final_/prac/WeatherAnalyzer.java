package day08.final_.prac;

import static day08.final_.prac.WeatherConstants.*;

public class WeatherAnalyzer{
    public static boolean checkTemperatureAlert(double currentTemperature) {
        return currentTemperature > MAX_TEMPERATURE_ALERT.getNumuricDAta() || currentTemperature < MIN_TEMPERATURE_ALERT.getNumuricDAta();
    }

    public static boolean checkPrecipitationAlert(double currentPrecipitation) {
        if (PRECIPITATION_ALERT.getNumuricDAta() < currentPrecipitation) {
            return true;
        } else {
            return false;
        }
    }
}
