
public class Light {
	private boolean btn = false;
	
	public void turnOn() {
		btn = true;
		System.out.println("Light를 켬");
	}
	
	public void turnOff() {
		btn = false;
		System.out.println("Light를 끔");
	}
	
	public boolean isTurnOn() {
		return btn;
	}
	
}
