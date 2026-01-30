import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver;
    private Car car;

    @BeforeEach
    public void setUp() {
        driver = new Driver("John", 20);
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void testIsAdult() {
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void testStartCar() {
        driver.startCar();
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testStopCar() {
        driver.stopCar();
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testSwitchSpeed() {

        driver.switchSpeed(car, 80);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
}
