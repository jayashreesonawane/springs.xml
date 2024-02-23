package springs.xml;

public class User {

	String name;
	long phone;
	String address;
	String email;

	public User(String name, long phone, String address, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", address=" + address + ", email=" + email + "]";
	}

}
