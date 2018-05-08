package jjdz4.mateusz.zalewski;

public class UnitConverterImpl implements UnitConverter {
    @Override
    public double celsiusToFahrenheit(double c) {
        return (1.8*c + 32);
    }

    @Override
    public double fahrenheitToCelsius(double f) {
        return (f-32)*0.55555555555;
    }

    @Override
    public double milesToKilometers(double m) {
        return 1.60934*m;
    }

    @Override
    public double kilometersToMiles(double k) {
        return 0.621371*k;
    }

    @Override
    public double poundsToKilograms(double p) {
        return 0.453592*p;
    }

    @Override
    public double kilogramsToPounds(double k) {
        return 2.2046208*k;
    }
}
