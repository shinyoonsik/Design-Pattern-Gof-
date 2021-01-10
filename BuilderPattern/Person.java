
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String sex;
	private boolean driverLicense;
	private boolean married;
	
	/* 아래와 같이 가능한 모든 생성자함수의 조합을 만드는 것은 매우 비효율적.
	 * 따라서, Builder Pattern을 적용하자
	 */
	public Person() {}
	
	public Person(String firstName) {
		this.firstName = firstName;
	}
	
	public Person(String firstName, boolean married) {
		this.married = married;
	}
	
	public Person(String firstName, String lastName, String address, String sex, boolean driverLicense,
			boolean married) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.sex = sex;
		this.driverLicense = driverLicense;
		this.married = married;
	}
	
	// *******************************************************************
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public void setDriverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getSex() {
		return sex;
	}

	public boolean isDriverLicense() {
		return driverLicense;
	}

	public boolean isMarried() {
		return married;
	}

	public static PersonBuilder builder() {
		return new PersonBuilder();
	}
	
	
	
	
}
