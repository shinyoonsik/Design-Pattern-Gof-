
public class TestPattern {
	public static void main(String[] args) {
		// SubjectController클래스 상태에 의존하는 ob1, ob2를 확인하기 위한 예제
		// subject객체는 observer객체를 컨트롤하기 위한 인터페이스를  구현해야 한다
		// observer객체들은 observer가 되기 위해 observer인터페이스를 구현해야 한다
		
		SubjectController subObj = new SubjectController();
		Observer ob1 = new MyClassA();
		Observer ob2 = new MyClassB();
		
		// 옵져버 등록
		subObj.addObserver(ob1);
		subObj.addObserver(ob2);
		
		// 메시지 등록
		subObj.setPlay(false);
		System.out.println();
		// 메시지 등록
		subObj.setPlay(true);
		
		// 옵져버 해지
		subObj.deleteObserver(ob1);
		System.out.println();
		
		// 확인
		subObj.setPlay(true);
		
	}
}
