package TempConvert;

public class TemperatureConvertor {
        private static final double ABSOLUTE_ZERO_CELSIUS = -273.0;
        private static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.0;

        public static double convertToCelsius(double fahrenheit) {
            if (fahrenheit < ABSOLUTE_ZERO_FAHRENHEIT) {
                throw new IllegalArgumentException("Temperature is below absolute zero.");
            }return (fahrenheit - 32) / 1.8;
        }

        public static double convertToFahrenheit(double celsius) {
            if (celsius < ABSOLUTE_ZERO_CELSIUS) {
                throw new IllegalArgumentException("Temperature is below absolute zero.");
            }return (celsius * 1.8) + 32;
        }
    }
