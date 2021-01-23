package case2;

import case1.IceCream;

public class Melon extends Decorator{
	IceCream icecream;
	
	public Melon(IceCream ice) {
		this.icecream = ice;
	}

	@Override
	public String getDescription() {
		return icecream.getDescription() + " + 멜론";
	}

	@Override
	public int price() {
		return 800 + icecream.price();
	}
	
	
}
