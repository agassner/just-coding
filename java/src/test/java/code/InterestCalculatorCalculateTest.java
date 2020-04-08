package code;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class InterestCalculatorCalculateTest {

    @Test
    public void testCalculateWithZeroAmount() {
        assertEquals(BigDecimal.valueOf(0), new InterestCalculator(BigDecimal.valueOf(0)).calculate());
    }

    @Test
    public void testCalculateWithNegativeAmount() {
        assertEquals(BigDecimal.valueOf(0), new InterestCalculator(BigDecimal.valueOf(-1)).calculate());
    }

    @Test
    public void testCalculateFirstTier() {
        assertEquals(new BigDecimal("913.500"), new InterestCalculator(BigDecimal.valueOf(900)).calculate());
    }

    @Test
    public void testCalculateSecondTier() {
        assertEquals(new BigDecimal("1122.00"), new InterestCalculator(BigDecimal.valueOf(1100)).calculate());
    }

    @Test
    public void testCalculateThirdTier() {
        assertEquals(new BigDecimal("3280.000"), new InterestCalculator(BigDecimal.valueOf(3200)).calculate());
    }

}
