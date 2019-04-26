package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ResultTreeType;

import Model.ConnectionClass;
import Model.Bloodavailable;;

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

public class bloodDAOImpl implements bloodDAO {

	@Override
	public List<Bloodavailable> availability(Bloodavailable obj) {
		Bloodavailable blood = new Bloodavailable();
		List<Bloodavailable> al = new ArrayList<>();
		try {

			Connection con = ConnectionClass.getConnection();
			String sql = "select * from BD_Availability where Blood_Group='" + obj.getBloodgroup() + "' and State='"
					+ obj.getState() + "' and Area='" + obj.getArea() + "' and Pin_Code='" + obj.getPincode() + "'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Bloodavailable bd = new Bloodavailable(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getLong(5));
				al.add(bd);
			}
			return al;
		} catch (Exception e) {
			System.out.println("error ind blooddaoimpl -> availability() " + e);
			return al;
		}

	}

	@Override
	public void requirement(Bloodavailable obj) {
		// TODO Auto-generated method stub

		try {

			Connection con = ConnectionClass.getConnection();
			String sql = "insert into bd_requirement values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, obj.getBloodgroup());
			ps.setString(2, obj.getState());
			ps.setString(3, obj.getArea());
			ps.setInt(4, obj.getPincode());
			ps.setLong(5, obj.getContactnumber());
			int count = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("error ind blood rqmt -> availability() " + e);

		}

	}
 

	@Override
	public List<Bloodavailable> listAllRequiredBloodDetails() {

		List<Bloodavailable> al1 = new ArrayList<>();
		try {

			Connection con = ConnectionClass.getConnection();
			String sql = "select * from BD_requirement ";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Bloodavailable rq = new Bloodavailable(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4),
						rs.getLong(5));
				al1.add(rq);
			}
			return al1;
		} catch (Exception e) {
			System.out.println("error ind blooddaoimpl -> availability() " + e);
			return al1;
		}
	}

	@Override
	public void Donation(Bloodavailable obj) 
	{
		// TODO Auto-generated method stub

		try {

			Connection con = ConnectionClass.getConnection();
			String sql = "insert into bd_availability values (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, obj.getBloodgroup());
			ps.setString(2, obj.getState());
			ps.setString(3, obj.getArea());
			ps.setInt(4, obj.getPincode());
			ps.setLong(5, obj.getContactnumber());
			int count = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("error ind blood donate -> availability() " + e);

		}

	
	}

}
