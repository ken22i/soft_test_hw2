import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfWeekTest {

  @ParameterizedTest
  @CsvFileSource(resources = "/dates.csv",numLinesToSkip = 1)
  void testDayOfWeek(int month, int day, String expectedDayOfWeek) {
    LocalDate date = LocalDate.of(2021, month, day);
    DayOfWeek actualDayOfWeek = date.getDayOfWeek();
    assertEquals(expectedDayOfWeek, actualDayOfWeek.toString());
  }
}
