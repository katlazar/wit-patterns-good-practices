package pl.sdacademy.factory;

public class CelsiusToKelvinFactory implements TempConverterFactory {
    @Override
    public TemperatureConverter create(String... parameters) {
        // dodatkowa logika potrzebna do utworzenia obiektu
        // obiektPotrzebny = new ObiektPotrzebny
        // obiektPotrzny.zachowaniePotrzebne()
        // obiektPotrzeby2 = new ObiektPotrzebny2()
        // obiektPotrzebny.zachowanie(obiektPotrzebny2)

        // return new CelsiusToKelvin(obiektPotrzebny.danePoczatkowe());
        return new CelsiusToKelvin();
    }
}
