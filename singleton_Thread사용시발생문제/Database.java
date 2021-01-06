package singleton_Thread사용시발생문제;

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

    public static Database getInstance(String name){
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
}
