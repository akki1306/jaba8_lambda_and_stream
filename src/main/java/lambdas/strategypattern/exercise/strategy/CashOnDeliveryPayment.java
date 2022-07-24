package lambdas.strategypattern.exercise.strategy;

import java.math.BigDecimal;

import lambdas.strategypattern.exercise.PaymentStatus;

public class CashOnDeliveryPayment implements PaymentStrategy {

	
	public PaymentStatus pay(BigDecimal money) {
		System.out.println("Paying by cash on delivery : " + money);
		return PaymentStatus.PENDING;
	}
	
	

}
