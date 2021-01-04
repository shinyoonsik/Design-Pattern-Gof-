/**
* 1. 레퍼런스타입 사이에서의 형변환
*     - 하위클래스의 객체는 상위클래스의 객체에 대입할 수 있다(상위타입의 변수가 하위타입의 인스턴스를 참조한다 == 다형성)
* 2. 객체를 생성하는 두 가지 방법
*     - 강한 결합: A a = new A(); 직접 생성하는 경우, 이 경우 개발자가 해당 인스턴스의 라이프 사이클을 관리해야 함
*     - 약한 결합: A a = m; m이 외부에서 생성되어 주입(할당)되는 경우, 인스턴스의 라이프 사이클을 개발자가 아닌 생성한 주체가 관리함
*/
public class test {
    public static void memberUse1(){
        // 강한 결합: 인스턴스를 직접 생성
        Member m1 = new Member(); // 에러 발생
    }

    public static void memberUse2(Member m){
        // 약하 결합: 생성된 것을 주입 받음(Dependency Injection)
        // 싱글톤 객체의 경우, 생성자가 private으로 되어있어 강한 결합으로 구현했을시, 에러가 발생함
        // 하지만, 약한 결합으로 구현했다면 해당 객체가 만들어지는지 만들어지지 않는지에 대해 생각할 필요가 없다
        // 즉, 다른 클래스의 변환에 안전하고 유연하게 대처할 수 있어 약한 결합이 강한 결합에 비해 프로그래밍에 있어 유리하다
        Member m2 = m;

    }
}

class Member{
    String name;
    String nickname;

    private Member() {};
}
