package pl.sdacademy.factory;

public class CelsiusToFahrenheitFactory implements TempConverterFactory {
    @Override
    public TemperatureConverter create(String... parameters) {
        return new CelsiusToFahrenheit();
    }
}
