package pl.sdacademy.factory;

public class KelvinToCelsiusFactory implements TempConverterFactory {


    @Override
    public TemperatureConverter create(String... parameters) {
        return new KelvinToCelsius();
    }
}
