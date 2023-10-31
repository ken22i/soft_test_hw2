import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrencyTest {

  @ParameterizedTest
  @CsvSource({"NT, NT, 200, NT", "US, US, 200, US", "NT, US, 3100, NT", "US, NT, 103, US"})
  void testAdd(String symbol1, String symbol2, int amount, String expectedSymbol) {
    Currency currency1 = new Currency(100, symbol1);
    Currency currency2 = new Currency(100, symbol2);
    Currency result = currency1.add(currency2);

    assertEquals(amount, result.amount);
    assertEquals(expectedSymbol, result.symbol);
  }

  @Test
  void testAddSameCurrencies() {
    Currency currency1 = new Currency(100, "NT");
    Currency currency2 = new Currency(200, "NT");
    Currency result = currency1.add(currency2);

    assertEquals(300, result.amount);
    assertEquals("NT", result.symbol);
  }
}
