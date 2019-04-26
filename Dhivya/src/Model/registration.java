package Model;

public class registration {
	private String firstname;
	private String lasttname;
	private int age;
	private String gender;
	private long contactnumber;
	private String email;
	private String password;
	private int weight;
	private String state;
	private String area;
	private int pincode;
	private String bloodgroup;
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public  String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLasttname() {
		return lasttname;
	}
	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(long contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getBloodgroup() {
		return bloodgroup;
	}
	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}
	
	public registration(String firstname, String lasttname, int age, String gender, long contactnumber, String email,
			String password, int weight, String state, String area, int pincode, String bloodgroup) {
		super();
		this.firstname = firstname;
		this.lasttname = lasttname;
		this.age = age;
		this.gender = gender;
		this.contactnumber = contactnumber;
		this.email = email;
		this.password = password;
		this.weight = weight;
		this.state = state;
		this.area = area;
		this.pincode = pincode;
		this.bloodgroup = bloodgroup;
	}
	public registration() {
		super();
	}
	
	
	

}
