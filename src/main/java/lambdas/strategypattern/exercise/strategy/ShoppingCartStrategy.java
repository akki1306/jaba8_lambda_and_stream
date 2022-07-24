package lambdas.strategypattern.exercise.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import lambdas.strategypattern.exercise.Item;
import lambdas.strategypattern.exercise.PaymentStatus;

public class ShoppingCartStrategy {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	public PaymentStatus pay(PaymentStrategy paymentStrategy) {

		BigDecimal total = getTotal();

		return paymentStrategy.pay(total);
	}

	private BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Item item : items) {
			total = total.add(item.getPrice());
		}
		return total;
	}
}
