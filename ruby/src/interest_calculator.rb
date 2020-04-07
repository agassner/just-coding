# Story - Calculate Interest Rate
#
# Interest is paid annually on customer Savings Accounts, the rate being
# determined by the balance in the account. Interest rates are tired as follows:
# • Under £1000 pays 1.5%
# • Between £1000 and £3000 pays 2%
# • Above £3000 pays 2.5%
#
# Implement a solution to determine the amount of annual interest which
# will be received.

class InterestCalculator

    def initialize(amount)
        @amount = amount
    end

    def interest
        if @amount <= 0
            return 0
        end

        if @amount <= 1000
            return 0.015
        end

        if @amount > 1000 and @amount <= 3000
            return 0.02
        end

        if @amount > 3000
            return 0.025
        end
    end

    def calculate
        if @amount <= 0
            return 0
        end

        return @amount + (@amount * interest())
    end
end