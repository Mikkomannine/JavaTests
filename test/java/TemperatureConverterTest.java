import Temperature.TemperatureConverter;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TemperatureConverterTest {

    private TemperatureConverter temperatureConverter;

    @BeforeEach
    public void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void testFahrenheitToCelsius() {
        assertEquals(0, temperatureConverter.fahrenheitToCelsius(32), 0.001);
        assertEquals(100, temperatureConverter.fahrenheitToCelsius(212), 0.001);

        assertEquals(-40, temperatureConverter.fahrenheitToCelsius(-40), 0.001);
        assertEquals(37.778, temperatureConverter.fahrenheitToCelsius(100), 0.001);

        assertEquals(-17.778, temperatureConverter.fahrenheitToCelsius(0), 0.001);
    }

    @Test
    public void testCelsiusToFahrenheit() {

        assertEquals(32, temperatureConverter.celsiusToFahrenheit(0), 0.001);
        assertEquals(212, temperatureConverter.celsiusToFahrenheit(100), 0.001);

        assertEquals(-40, temperatureConverter.celsiusToFahrenheit(-40), 0.001);
        assertEquals(104, temperatureConverter.celsiusToFahrenheit(40), 0.001);

        assertEquals(14, temperatureConverter.celsiusToFahrenheit(-10), 0.001);
    }

    @Test
    public void testIsExtremeTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(-50));

        assertFalse(temperatureConverter.isExtremeTemperature(0));
        assertFalse(temperatureConverter.isExtremeTemperature(25));

        assertTrue(temperatureConverter.isExtremeTemperature(60));
    }

}
