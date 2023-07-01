package pl.sdacademy.factory;

public class SimpleFactory {

    public TemperatureConverter create(String from, String to) {
        if ("kel".equals(from)) {
            return new KelvinToCelsius();
        } else if ("fah".equals(from) ) {
            return new FahrenheitToCelsius();
        } else if ("cel".equals(from) && "kel".equals(to)) {
            return new CelsiusToKelvin();
        } else {
            return new CelsiusToFahrenheit();
        }
    }
}
