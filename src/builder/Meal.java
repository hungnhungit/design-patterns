package builder;

import java.util.*;

public class Meal {
	private List<Item> list_item= new ArrayList<>(); 
	
	public void addItem(Item item) {
		list_item.add(item);
	}
	
	public void showItem() {
		for (Item item : list_item) {
			System.out.println(item.name());
			System.out.println(item.packing().pack());
			item.eat();
		}
	}
}
