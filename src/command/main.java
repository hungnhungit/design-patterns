package command;

public class main {
	public static void main(String[] args) {
		Stock stock = new Stock();
		BuyStock buyStockOrder = new BuyStock(stock);
		SellStock sellStockOrder = new SellStock(stock);
		ListOrder broker = new ListOrder();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);

		broker.placeOrders();
	}
}
