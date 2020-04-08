/*
Story - Calculate Interest Rate

Interest is paid annually on customer Savings Accounts, the rate being
determined by the balance in the account. Interest rates are tired as follows:
• Under £1000 pays 1.5%
• Between £1000 and £3000 pays 2%
• Above £3000 pays 2.5%

Implement a solution to determine the amount of annual interest which
will be received.
*/

package code;

import java.math.BigDecimal;

public final class InterestCalculator {

    private BigDecimal amount;

    public InterestCalculator(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal interest() {
        if (this.amount.compareTo(BigDecimal.valueOf(0)) <= 0) {
            return BigDecimal.valueOf(0);
        }

        if (this.amount.compareTo(BigDecimal.valueOf(1000)) <= 0) {
            return new BigDecimal("0.015");
        }

        if (this.amount.compareTo(BigDecimal.valueOf(1000)) > 0 &&
            this.amount.compareTo(BigDecimal.valueOf(3000)) <= 0) {
            return new BigDecimal("0.02");
        }

        if (this.amount.compareTo(BigDecimal.valueOf(3000)) >= 0) {
            return new BigDecimal("0.025");
        }

        return BigDecimal.valueOf(0);
    }

    public BigDecimal calculate() {
        if (this.amount.compareTo(BigDecimal.valueOf(0)) <= 0) {
            return BigDecimal.valueOf(0);
        }

        return this.amount.add(this.amount.multiply(this.interest()));
    }

}
