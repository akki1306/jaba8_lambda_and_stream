package lambdas.functionalinterface.exercise;

import java.math.BigDecimal;

import lambdas.strategypattern.exercise.PaymentStatus;

public class Payment {

	public static PaymentStatus payByCreditCard(BigDecimal money) {
		System.out.println("Paying by credit card : " + money);
		return PaymentStatus.SUCCESS;
	}

	public static PaymentStatus payByDebitCard(BigDecimal money) {
		System.out.println("Paying by debit card : " + money);
		return PaymentStatus.SUCCESS;
	}

	public static PaymentStatus cashOnDelivery(BigDecimal money) {
		System.out.println("Paying by cash on delivery : " + money);
		return PaymentStatus.PENDING;
	}

}
