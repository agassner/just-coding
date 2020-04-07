require 'test/unit'
require_relative './interest_calculator'

class InterestCalculatorInterestTest < Test::Unit::TestCase

    def test_test_interest_with_zero_amount
        assert_equal 0, InterestCalculator.new(0).interest()
    end

    def test_test_interest_with_negative_amount
        assert_equal 0, InterestCalculator.new(-1).interest()
    end

    def test_interest_first_tier
        assert_equal 0.015, InterestCalculator.new(900).interest()
    end

    def test_interest_second_tier
        assert_equal 0.02, InterestCalculator.new(1100).interest()
    end

    def test_interest_third_tier
        assert_equal 0.025, InterestCalculator.new(3200).interest()
    end

end

class InterestCalculatorCalculateTest < Test::Unit::TestCase

    def test_calculate_with_zero_amount
        assert_equal 0, InterestCalculator.new(0).calculate()
    end

    def test_calculate_with_negative_amount
        assert_equal 0, InterestCalculator.new(-1).calculate()
    end

    def test_interest_first_tier
        assert_equal 913.5, InterestCalculator.new(900).calculate()
    end

    def test_interest_second_tier
        assert_equal 1122, InterestCalculator.new(1100).calculate()
    end

    def test_interest_third_tier
        assert_equal 3280, InterestCalculator.new(3200).calculate()
    end

end