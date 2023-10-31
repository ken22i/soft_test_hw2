import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateUtils {

  public static String getNextDay(String inputDate) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    LocalDate date = LocalDate.parse(inputDate, formatter);
    LocalDate nextDay = date.plusDays(1);
    return nextDay.format(formatter);
  }

  @ParameterizedTest
  @CsvSource({"2023-01-01, 2023-01-02", "2023-03-15, 2023-03-16", "2023-12-31, 2024-01-01"})
  void testGetNextDay(String inputDate, String expectedNextDay) {
    String result = getNextDay(inputDate);
    assertEquals(expectedNextDay, result);
  }
}
