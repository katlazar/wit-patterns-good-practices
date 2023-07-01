package pl.sdacademy.factory;

public class CelsiusToKelvin implements TemperatureConverter {
    @Override
    public double convert(double temp) {
        return temp + 273.15;
    }
}