
public class Radio {
	private boolean btn = false;
	
	public void turnOn() {
		btn = true;
		System.out.println("Radio를 켬");
	}
	
	public void turnOff() {
		btn = false;
		System.out.println("Radio를 끔");
	}
	
	public boolean isTurnOn() {
		return btn;
	}
}
