import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMITest {

  @ParameterizedTest
  @CsvSource({"160, 50, 19.53", "175, 70, 22.86", "180, 80, 24.69"})
  void testBMI(double height, double weight, double expectedBMI) {
    double calculatedBMI = calculateBMI(height, weight);
    assertEquals(expectedBMI, calculatedBMI, 0.01);
  }

  double calculateBMI(double height, double weight) {
    // BMI公式：BMI = 體重（kg） / (身高（m） * 身高（m）)
    return weight / ((height / 100) * (height / 100));
  }
}
