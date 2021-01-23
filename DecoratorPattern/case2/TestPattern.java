package case2;

import case1.IceCream;
import case1.IceCreamCake;
import case1.IceCreamCone;

public class TestPattern {
	
	public static void main(String[] args) {
		
		IceCream ice0 = new IceCreamCone();
		System.out.println(ice0.getDescription() + " cost: " + ice0.price());
		
		IceCream ice1 = new IceCreamCone();
		ice1 = new Melon(ice1);
		System.out.println(ice1.getDescription() + " cost: " + ice1.price());

		
		IceCream ice2 = new IceCreamCake();
		ice2 = new StrawBerry(ice2);
		System.out.println(ice2.getDescription() + " cost: " + ice2.price());

	
	}
	
}
