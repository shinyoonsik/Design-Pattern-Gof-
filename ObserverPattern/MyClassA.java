
public class MyClassA implements Observer{
	
	private boolean aPlay;

	@Override
	public void update(boolean play) {
		this.aPlay = play;
		myActControl();
	}
	
	public void myActControl() {
		if(aPlay) {
			System.out.println("MyclassA 동작을 시작합니다.");
		}else {
			System.out.println("MyclassA 동작을 정지합니다");
		}
	}
	
	
}
