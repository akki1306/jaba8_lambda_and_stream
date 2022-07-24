package lambdas.strategypattern.exercise.strategy;

import java.math.BigDecimal;

import lambdas.strategypattern.exercise.PaymentStatus;

public class CreditCardPayment implements PaymentStrategy {
	

	@Override
	public PaymentStatus pay(BigDecimal money) {
		System.out.println("Paying by credit card : " + money);
		return PaymentStatus.SUCCESS;
	}

}
