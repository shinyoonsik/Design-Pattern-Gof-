package FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private  static Map<String, Subject> map = new HashMap<>();

    public Subject getSubject(String key){
        Subject sub = map.get(key);
        if(sub == null){
            sub = new Subject(key);
            map.put(key, sub);
            System.out.println("새로 생성: " + key);
        }
        else{
            System.out.println("재사용: " + key);
        }
        return sub;
    }
}
