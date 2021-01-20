
public class BtoAadapter implements Aplayer{ // Aplayer로 Bplayer를 다루고 싶기 때문에 Aplayer가 리모콘 역할(인터페이스)을 한다
											 // 내부적으로는 Bplayer로 구현됨. 즉 A로도 B를 다룰수 있게 된것이다
	private Bplayer media;

	public BtoAadapter(Bplayer obj) {
		this.media = obj;
	}
	
	@Override
	public void play(String fileName) {
		media.playFile(fileName);
		System.out.println("Adapter사용!!!!");
	}

	@Override
	public void stop() {
		
	}
}
