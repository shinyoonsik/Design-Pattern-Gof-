package case1;

public class IcePop extends IceCream{
	public IcePop() {
		this.description = "아이스크림 팝";
	}

	@Override
	public int price() {
		return 500;
	}
}
