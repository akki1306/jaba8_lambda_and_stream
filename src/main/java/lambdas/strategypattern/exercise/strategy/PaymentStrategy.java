package lambdas.strategypattern.exercise.strategy;

import java.math.BigDecimal;

import lambdas.strategypattern.exercise.PaymentStatus;

public interface PaymentStrategy {
	
	public PaymentStatus pay(BigDecimal money);

}
