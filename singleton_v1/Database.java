package singleton_v1;

public class Database {

    private static Database singleton;
    private String name;

    private Database(String name) {
        this.name = name;
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
