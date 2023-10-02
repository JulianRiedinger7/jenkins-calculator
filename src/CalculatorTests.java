import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

public class CalculatorTests {

  static Calculator calc;

  @BeforeAll
  public static void setUp() {
    calc = new Calculator();
  }

  @Test
  public void testPositiveAdd() {
    int result = calc.add(5, 10);

    assertEquals("5 + 10 should be 15",15, result);
  }
  
  @Test
  public void testNegativeAdd() {
    int result = calc.add(-3, 7);

    assertEquals("-3 + 7 should be 4",4, result);
  }

  @Test
  public void testSubtract() {
    int result = calc.subtract(8, 2);

    assertEquals("8 - 2 should be 6",6, result);
  }

  @Test
  public void testMultiply() {
    int result = calc.multiply(5, 10);

    assertEquals("5 * 10 should be 50",50, result);
  }

  @Test
  public void testDivide() {
    int result = calc.divide(10, 2);

    assertEquals("10 / 2 should be 5",5, result);
  }
}
