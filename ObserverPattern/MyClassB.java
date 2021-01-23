
public class MyClassB implements Observer{
	
	private boolean bPlay;

	@Override
	public void update(boolean play) {
		this.bPlay = play;
		myActControl();
	}
	
	public void myActControl() {
		if(bPlay) {
			System.out.println("MyclassB 동작을 시작합니다.");
		}else {
			System.out.println("MyclassB 동작을 정지합니다");
		}
	}
	
	
}
