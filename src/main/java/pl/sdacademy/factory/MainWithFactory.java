package pl.sdacademy.factory;

public class MainWithFactory {

    public static void main(String[] args) {
        TempConverterFactory celsiusToFahrenheitFactory = new CelsiusToFahrenheitFactory();
        TempConverterFactory kelvinToCelsiusFactory = new KelvinToCelsiusFactory();

        TemperatureConverter celsiusToFahrenheit = celsiusToFahrenheitFactory.create(null, null);
        TemperatureConverter kelvinToCelsius = kelvinToCelsiusFactory.create();

        double celsius = 5.0;
        System.out.printf("%5.2f st C = %5.2f st K%n", celsius, celsiusToFahrenheit.convert(celsius));


    }
}
