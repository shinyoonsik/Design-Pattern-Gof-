
public class PersonBuilder {
	private String firstName;
	private String lastName;
	private String address;
	private String sex;
	private boolean driverLicense;
	private boolean married;
	
	public PersonBuilder firstName(String firstName) {
		this.firstName = firstName;
		return this; // this는 자기 자신을 참조하는 변수
	}
	public PersonBuilder lastName(String lastName) {
		this.lastName = lastName;
		return this; // 자기 자신을 리턴시킴으로 chaining이 가능
	}
	public PersonBuilder address(String address) {
		this.address = address;
		return this;
	}
	public PersonBuilder sex(String sex) {
		this.sex = sex;
		return this;
	}
	public PersonBuilder driverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
		return this;
	}
	public PersonBuilder married(boolean married) {
		this.married = married;
		return this;
	}
	
	public Person build() {
		Person p = new Person();
		p.setAddress(this.address);
		p.setDriverLicense(this.driverLicense);
		p.setFirstName(this.firstName);
		p.setLastName(this.lastName);
		p.setMarried(this.married);
		p.setSex(this.sex);
		return p;
	}
}
