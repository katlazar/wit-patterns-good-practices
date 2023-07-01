package pl.sdacademy.factory;

public interface TempConverterFactory {

    TemperatureConverter create(String... parameters);
}
