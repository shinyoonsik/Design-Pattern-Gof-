package case1;

public class IceCreamCone extends IceCream{
	public IceCreamCone() {
		this.description = "아이스크림 콘";
	}

	@Override
	public int price() {
		return 1200;
	}
}
