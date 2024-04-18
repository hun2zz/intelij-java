package day08.final_.prac;

public enum WeatherConstants {

    //    static final double MAX_TEMPERATURE_ALERT = 40.0;
//    static final double MIN_TEMPERATURE_ALERT = -10.0;
//    static final double PRECIPITATION_ALERT = 50.0;
    MAX_TEMPERATURE_ALERT(40.0), MIN_TEMPERATURE_ALERT(-10.0), PRECIPITATION_ALERT(50.0);

    private double numuricDAta;

    WeatherConstants(double numuricDAta) {
        this.numuricDAta = numuricDAta;
    }

    public double getNumuricDAta(){
        return numuricDAta;
    }
}
