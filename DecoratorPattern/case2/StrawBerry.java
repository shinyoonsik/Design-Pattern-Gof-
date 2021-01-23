package case2;

import case1.IceCream;

public class StrawBerry extends Decorator{
	IceCream icecream;
	
	public StrawBerry(IceCream ice) {
		this.icecream = ice;
	}

	@Override
	public String getDescription() {
		return icecream.getDescription() + " + 딸기";
	}

	@Override
	public int price() {
		return 500 + icecream.price();
	}
	
	
}
