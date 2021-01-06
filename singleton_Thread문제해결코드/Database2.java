package singleton_Thread문제해결코드;

public class Database2 {
    private static Database2 singleton = new Database2("products");
    private String name;

    private Database2(String name){
        try{
            Thread.sleep(100);
            this.name = name;
        }catch (Exception e) {

        }
    }

    public static Database2 getInstance(String name){
        // null값 비교는 초기 생성시에만 필요한 것이므로 애초에 객체를 만들어 놓았다면 null비교 구문이 필요없다.
        return  singleton;
    }

}
