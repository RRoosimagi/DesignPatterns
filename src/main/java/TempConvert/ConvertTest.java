package TempConvert;

public class ConvertTest {
        public static void main(String[] args) {
            double fahrenheit = 68.0;
            double celsius = TemperatureConvertor.convertToCelsius(fahrenheit);
            System.out.println(fahrenheit + "F = " + celsius + "C");

            celsius = 20.0;
            fahrenheit = TemperatureConvertor.convertToFahrenheit(celsius);
            System.out.println(celsius + "C = " + fahrenheit + "F");
        }
    }
