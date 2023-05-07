package Week3.Day1;

public class Students {

	int id;
	String name;
	String email;
	String PhoneNumber;

	public Students(int id, String name, String email, String PhoneNumber) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.PhoneNumber = PhoneNumber;
	}

	public String getStudentInfo(int id) {
		return name;

	};

	public String getStudentInfo(int id, String name) {
		return name;
	};

	public String getStudentInfo(String email, String phoneNumber) {
		return name;
	};

	public static void main(String[] args) {
		Students st = new Students(1,"Ram", "ram@test.com", "1234567890");
		System.out.println(st.getStudentInfo(1));
		System.out.println(st.getStudentInfo(1,"Ram"));
		System.out.println(st.getStudentInfo("ram@test.com", "1234567890"));

	}
}
