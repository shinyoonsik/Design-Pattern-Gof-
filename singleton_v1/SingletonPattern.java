package singleton_v1;

public class SingletonPattern {

    public static void main(String[] args) {
        Database database = Database.getInstance("firstDatabase");
        System.out.println("첫 번째 DB: " +  database.getName() +"  "+ database.toString()); // 클래스 이름@객체의 메모리상 주소값(16진수)

        Database database2 = Database.getInstance("secondDatabase");  // 첫 번째 DB인스턴스를 반환함
        System.out.println("두 번째 DB: " +  database2.getName()+"  " + database2.toString());
    }
}
