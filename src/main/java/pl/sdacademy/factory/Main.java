package pl.sdacademy.factory;

public class Main {
    public static void main(String[] args)
    {
        TemperatureConverter convCelsiusToKelvin = new CelsiusToKelvin();
        TemperatureConverter convKelvinToCelsius = new KelvinToCelsius();
        TemperatureConverter convCelsiusToFahrenheit = new CelsiusToFahrenheit();
        TemperatureConverter convFahrenheitToCelsius = new FahrenheitToCelsius();

        double celsius = 5.0;
        System.out.printf("%5.2f st C = %5.2f st K%n", celsius, convCelsiusToKelvin.convert(celsius));
        double kelvin = 300;
        System.out.printf("%5.2f st K = %5.2f st C%n", kelvin, convKelvinToCelsius.convert(kelvin));
        System.out.printf("%5.2f st C = %5.2f st F%n", celsius, convCelsiusToFahrenheit.convert(celsius));
        double fahrenheit = 45;
        System.out.printf("%5.2f st F = %5.2f st C%n", fahrenheit, convFahrenheitToCelsius.convert(fahrenheit));

        SimpleFactory factory = new SimpleFactory();
        TemperatureConverter converter = factory.create("cel", "kel");
        System.out.printf("%5.2f st C = %5.2f st K%n", celsius, converter.convert(celsius));
        converter = factory.create("kel", "nie istotny");
        System.out.printf("%5.2f st K = %5.2f st C%n", kelvin, converter.convert(kelvin));

    }
}