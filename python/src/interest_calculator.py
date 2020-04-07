"""
Story - Calculate Interest Rate

Interest is paid annually on customer Savings Accounts, the rate being
determined by the balance in the account. Interest rates are tired as follows:
• Under £1000 pays 1.5%
• Between £1000 and £3000 pays 2%
• Above £3000 pays 2.5%

Implement a solution to determine the amount of annual interest which
will be received.
"""


class InterestCalculator:

    def __init__(self, amount):
        self.amount = amount

    def interest(self):
        if self.amount <= 0:
            return 0

        if self.amount <= 1000:
            return 0.015

        if self.amount > 1000 and self.amount <= 3000:
            return 0.02

        if self.amount > 3000:
            return 0.025

    def calculate(self):
        if self.amount <= 0:
            return 0

        return self.amount + (self.amount * self.interest())
