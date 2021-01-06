package singleton_Thread사용시발생문제;

public class SingletonPattern {

    static int nNum = 0;
    public static void main(String[] args) {

        Runnable task = () -> {
            try{
                nNum++;
                Database database = Database.getInstance(nNum + "번째 Database");
                System.out.println("This is the " + database.getName() + "!!!");
            }catch (Exception e){

            }
        };
        // Thread프로그래밍시에 발생하는 싱글톤 패턴의 문제점 --> 개선 필요
        // 싱글톤으로 설계했는데, 서로 다른 Database객체가 만들어졌다...
        // Thread는 간단하게 start()순서와 상관없이 동시에 실행된다고 생각하자!
        // for문이 매우 빠르기 때문에 getInstance()접근시, singleton을 모두 null한 상태로 인식하게 된다. 따라서 여러개의 객체가 만들어지는 것이다
        for(int i=0; i<10; i++){
            Thread t = new Thread(task);
            t.start();
        }
    }
}
