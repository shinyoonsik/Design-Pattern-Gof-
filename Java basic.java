public class test {
    public static void memberUse1(){
        // 에러 발생
        Member m1 = new Member();
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