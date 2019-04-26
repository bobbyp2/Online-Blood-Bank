package Model;

public class BloodDonation 
{
private String HospitalName;
public BloodDonation() {
	super();
	// TODO Auto-generated constructor stub
}
public BloodDonation(String hospitalName, String city, String date, String time) {
	super();
	HospitalName = hospitalName;
	this.city = city;
	Date = date;
	Time = time;
}
public String getHospitalName() {
	return HospitalName;
}
public void setHospitalName(String hospitalName) {
	HospitalName = hospitalName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getDate() {
	return Date;
}
public void setDate(String date) {
	Date = date;
}
public String getTime() {
	return Time;
}
public void setTime(String time) {
	Time = time;
}
private String city;
private String Date;
private String Time;
private String Feedback;
public BloodDonation(String hospitalName, String city, String feedback) {
	super();
	HospitalName = hospitalName;
	this.city = city;
	Feedback = feedback;
}
public String getFeedback() {
	return Feedback;
}
public void setFeedback(String feedback) {
	Feedback = feedback;
}
}

