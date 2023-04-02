package TempConvert;

import java.util.function.DoubleUnaryOperator;

public class TemperatureConvertor {
    private static final double ABSOLUTE_ZERO_CELSIUS = -273.0;
    private static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.0;

    public static double convertToCelsius(double fahrenheit) {
        if (fahrenheit < ABSOLUTE_ZERO_FAHRENHEIT) {
            throw new IllegalArgumentException("Temperature is below absolute zero.");
        }

        DoubleUnaryOperator fahToCel = (fah) -> (fah - 32) / 1.8;
        return fahToCel.applyAsDouble(fahrenheit);
    }

    public static double convertToFahrenheit(double celsius) {
        if (celsius < ABSOLUTE_ZERO_CELSIUS) {
            throw new IllegalArgumentException("Temperature is below absolute zero.");
        }

        DoubleUnaryOperator celToFah = (cel) -> (cel * 1.8) + 32;
        return celToFah.applyAsDouble(celsius);
    }
}
