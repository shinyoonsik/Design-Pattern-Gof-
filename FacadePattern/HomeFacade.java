
public class HomeFacade {

	private Computer computer;
	private Light light;
	private Radio radio;
	
	public HomeFacade(Computer computer, Light light, Radio radio) {
		super();
		this.computer = computer;
		this.light = light;
		this.radio = radio;
	}
	
	public void homIn() {
		System.out.println("집에 들어오면 Computer, Radio, Light를 켜줘(꺼져있다면)");
		if(!computer.isTurnOn()) {
			computer.turnOn();
		}
		
		if(!light.isTurnOn()) {
			light.turnOn();
		}
		
		if(!radio.isTurnOn()) {
			radio.turnOn();
		}
	}
	
	public void homOut() {
		System.out.println("집에서 나갈때 Computer, Radio, Light를 꺼줘(켜져있다면)");
		if(computer.isTurnOn()) {
			computer.turnOff();
		}
		
		if(light.isTurnOn()) {
			light.turnOff();
		}
		
		if(radio.isTurnOn()) {
			radio.turnOff();
		}
	}
	
	
}
