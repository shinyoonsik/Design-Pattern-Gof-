
public class Main {

	public static void main(String[] args) {
		// chaining을 이용하여 인스턴스 생성
		Person p1 = Person.builder()
				.firstName("신") // 값을 초기화시키고 자기 자신을 리턴하도록 만듬
				.lastName("김신이용")
				.address("부산서울")
				.sex("만염")
				.driverLicense(true)
				.build();
		
		System.out.println(p1.getAddress());
		System.out.println(p1.getFirstName());
		
		
		Person p2 = Person.builder()
				.firstName("김")
				.address("몰라")
				.build();
		
		System.out.println(p2.getAddress());
		System.out.println(p2.getSex());
	}

}
