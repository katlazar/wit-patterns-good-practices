package pl.sdacademy.factory;

public class FahrenheitToCelsiusFactory implements TempConverterFactory {
    @Override
    public TemperatureConverter create(String... parameters) {
        return new FahrenheitToCelsius();
    }
}
