import unittest

from interest_calculator import InterestCalculator


class TestInterestCalculatorInterest(unittest.TestCase):

    def test_interest_with_zero_amount(self):
        assert InterestCalculator(0).interest() == 0

    def test_interest_with_negative_amount(self):
        assert InterestCalculator(-1).interest() == 0

    def test_interest_first_tier(self):
        assert InterestCalculator(900).interest() == 0.015

    def test_interest_second_tier(self):
        assert InterestCalculator(1100).interest() == 0.02

    def test_interest_third_tier(self):
        assert InterestCalculator(3200).interest() == 0.025


class TestInterestCalculatorCalculate(unittest.TestCase):

    def test_calculate_with_zero_amount(self):
        assert InterestCalculator(0).calculate() == 0

    def test_calculate_with_negative_amount(self):
        assert InterestCalculator(-1).calculate() == 0

    def test_interest_first_tier(self):
        assert InterestCalculator(900).calculate() == 913.5

    def test_interest_second_tier(self):
        assert InterestCalculator(1100).calculate() == 1122

    def test_interest_third_tier(self):
        assert InterestCalculator(3200).calculate() == 3280
