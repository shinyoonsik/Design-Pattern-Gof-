package singleton_Thread문제해결코드;


public class Database {

    private static Database singleton;
    private String name;

    private Database(String name) {
        try{
            Thread.sleep(100);  // 실제로 db에 접근하는 것이 아니므로 너무 빠르게 생성자가 생성된다. 따라서, 의도적으로 늦춤
            this.name = name;
        } catch (Exception e){

        }
    }

    public synchronized static Database getInstance(String name){  // syncronized: 자신이 속한 객체에 lock을 건다. 즉 여러개의 Thread마다 getInstance()를 호출한다 하더라도 동기적으로 수행됨
        if(singleton == null){
            singleton = new Database(name);
        }
        return singleton;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // synchronized는 비용이 많이 든다 -> Database2로 개선
}
