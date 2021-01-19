
public class Test {
	public static void main(String[] args) {
		Computer com = new Computer();
		Light lig = new Light();
		Radio rad = new Radio();
		
		// 개별적으로 사용시
		// 불 켜기
		com.turnOn();
		lig.turnOn();
		rad.turnOn();
		
		// 불 끄기
		com.turnOff();
		lig.turnOff();
		rad.turnOff();
		
		// 파사드 패턴 적용
		HomeFacade home = new HomeFacade(com, lig, rad);
		
		// 불 켜기
		home.homIn();
		
		// 불 끄기
		home.homOut();
	}
}
