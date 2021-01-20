
public class TestPattern {
	public static void main(String[] args) {
		// 기존에 사용하던 방식
		Aplayer player1 = new AplayerImpl();
		player1.play("aaa.mp3");
		
		// 계약기간 만료로 더 이상 AplayerImpl()을 사용할 수 없다
		// Bplayer <- 새로 도입된 방식
		Bplayer player2 = new BplayerImpl();
		player2.playFile("bbb.mp3");
		
		/* 하지만, 기존의 것들이 Aplayer기준으로 되어있기 때문에
		 * Aplayer를 통해 Bplayer를 제어하고 싶다.
		 * 그렇다고 Bplayer의 모든 코드를 고칠수도 고치고 싶지도 않다
		 * 이런 상황에서 기존의 코드를 변경하지 않고 사용할 수 있도록 Adpater를 만들자.
		 * 결론, Aplayer obj = (어뎁터) = new BplayerImpl();
		*/
		Aplayer player3 = new BtoAadapter(new BplayerImpl());
		player3.play("ccc.mp3");
	
	}
}
