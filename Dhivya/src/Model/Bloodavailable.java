package Model;

public class Bloodavailable 
{
 private String bloodgroup;
 private String state;
 private String area;
 private int pincode;
 private long contactnumber;
public long getContactnumber() {
	return contactnumber;
}
public void setContactnumber(long contactnumber) {
	this.contactnumber = contactnumber;
}
public String getBloodgroup() {
	return bloodgroup;
}
public void setBloodgroup(String bloodgroup) {
	this.bloodgroup = bloodgroup;
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
public Bloodavailable() {
	super();
	// TODO Auto-generated constructor stub
}
public Bloodavailable(String bloodgroup, String state, String area, int pincode) {
	super();
	this.bloodgroup = bloodgroup;
	this.state = state;
	this.area = area;
	this.pincode = pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Bloodavailable(String bloodgroup, String state, String area, int pincode, long contactnumber) {
	super();
	this.bloodgroup = bloodgroup;
	this.state = state;
	this.area = area;
	this.pincode = pincode;
	this.contactnumber = contactnumber;
}

}
