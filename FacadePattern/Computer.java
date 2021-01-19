
public class Computer {
	
	private boolean btn = false;
	
	public void turnOn() {
		btn = true;
		System.out.println("Computer를 켬");
	}
	
	public void turnOff() {
		btn = false;
		System.out.println("Computer를 끔");
	}
	
	public boolean isTurnOn() {
		return btn;
	}
}
