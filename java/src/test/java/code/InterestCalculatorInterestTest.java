package code;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class InterestCalculatorInterestTest {

    @Test
    public void testInterestWithZeroAmount() {
        assertEquals(BigDecimal.valueOf(0), new InterestCalculator(BigDecimal.valueOf(0)).interest());
    }

    @Test
    public void testInterestWithNegativeAmount() {
        assertEquals(BigDecimal.valueOf(0), new InterestCalculator(BigDecimal.valueOf(-1)).interest());
    }

    @Test
    public void testInterestFirstTier() {
        assertEquals(new BigDecimal("0.015"), new InterestCalculator(BigDecimal.valueOf(900)).interest());
    }

    @Test
    public void testInterestSecondTier() {
        assertEquals(new BigDecimal("0.02"), new InterestCalculator(BigDecimal.valueOf(1100)).interest());
    }

    @Test
    public void testInterestThirdTier() {
        assertEquals(new BigDecimal("0.025"), new InterestCalculator(BigDecimal.valueOf(3200)).interest());
    }

}