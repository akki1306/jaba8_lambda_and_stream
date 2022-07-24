package lambdas.functionalinterface.exercise;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

import lambdas.strategypattern.exercise.Item;
import lambdas.strategypattern.exercise.PaymentStatus;

//Notice no strategy classes. Look at Payment class.
public class ShoppingCartLambdas {

	private List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}


	public PaymentStatus pay(Function<BigDecimal, PaymentStatus> payment) {

		Objects.requireNonNull(payment);

		BigDecimal total = getTotal();
		
		//no strategy classes
		return payment.apply(total);
	}

	private BigDecimal getTotal() {
		BigDecimal total = BigDecimal.ZERO;
		for (Item item : items) {
			total = total.add(item.getPrice());
		}
		return total;
	}
}
