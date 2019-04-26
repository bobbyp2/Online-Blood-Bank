package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Model.ConnectionClass;
import Model.registration;

/*
 * private String firstname;
	private String lasttname;
	private int age;
	private long contactnumber;
	private String email;
	private String password;
	private int weight;
	private String state;
	private String area;
	private String pincode;
	private String bloodgroup;
	public String getFirstname() {
		return fir*/

public class RegistrationDAOImpl implements RegistrationDAO{

	@Override
	public void newregistration(registration obj) {
		
		try {
			Connection con = ConnectionClass.getConnection();
			String sql = "insert into registration values (?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, obj.getFirstname());
			ps.setString(2, obj.getLasttname());
			ps.setInt(3, obj.getAge());
			ps.setString(4, obj.getGender());
			ps.setLong(5, obj.getContactnumber());
			ps.setString(6, obj.getEmail());
			ps.setString(7, obj.getPassword());
			ps.setInt(8, obj.getWeight());
			ps.setString(9, obj.getState());
			ps.setString(10, obj.getArea());
			ps.setInt(11, obj.getPincode());
			ps.setString(12, obj.getBloodgroup());
			
			int rowaffected = 	ps.executeUpdate();
		
			System.out.println(rowaffected + " rows inserted");		
			con.close();
			 }catch(Exception e){
				 System.out.println("Error registration: " + e);
			 }
		
		
	}

	@Override
	public String getpasswordbyloginId(String loginid) {
		String cpwd=null;
		try{
			System.out.println("entered impl");
			Connection con = ConnectionClass.getConnection();
		String sql = "Select Password from registration where Email ='"+loginid+"'";
		System.out.println("qry executed"); 
		Statement stmt=con.createStatement();
		    ResultSet rs=stmt.executeQuery(sql);
		    if(rs.next()) {
		    cpwd=rs.getString(1);
		    if(cpwd!=null)
		    {
		    	return cpwd;
		    }
		    else
		    	return null;}
}catch(Exception ex){
	System.out.println("Error in getting password :"+ex);
}
		return cpwd;
	}
}
