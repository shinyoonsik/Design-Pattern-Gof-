package case1;

public class IceCreamCake extends IceCream{
	
	public IceCreamCake() {
		this.description = "아이스크림 케이크";
	}

	@Override
	public int price() {
		return 1500;
	}
}
