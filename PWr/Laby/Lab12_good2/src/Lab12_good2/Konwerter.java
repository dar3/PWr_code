package Lab12_good2;

public class Konwerter {

    private static final double przelicznik = 1.8000;
    private static final double constVal = 32.0;


    public static double toFahrenheit(double celsiusValue) {
        return Math.round(celsiusValue * przelicznik + constVal);
    }

    public static double toCelsius(double fahrenheitValue) {
        return Math.round(fahrenheitValue - constVal) / przelicznik;
    }

}