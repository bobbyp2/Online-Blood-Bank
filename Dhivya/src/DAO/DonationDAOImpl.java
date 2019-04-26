package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.BloodDonation;
import Model.Bloodavailable;
import Model.ConnectionClass;
import Model.registration;

public class DonationDAOImpl implements DonationDAO
{


	 	public void Donation(BloodDonation obj) {
	try {
		Connection con = ConnectionClass.getConnection();
		String sql = "insert into BD_Donation values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, obj.getHospitalName());
		ps.setString(2, obj.getCity());
		ps.setString(3, obj.getDate());
		ps.setString(4, obj.getTime());
		
		
		int rowaffected = 	ps.executeUpdate();
	
		System.out.println(rowaffected + " rows inserted");		
		con.close();
		 }catch(Exception e){
			 System.out.println("Error registration: " + e);
		 }
	

}

		@Override
		public void feedback(BloodDonation obj) {
			// TODO Auto-generated method stubpublic void feedback(BloodDonation obj) 
			{
				// TODO Auto-generated method stub
				try {
					Connection con = ConnectionClass.getConnection();
					String sql = "insert into feedback values (?,?,?)";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, obj.getHospitalName());
					ps.setString(2, obj.getCity());
					ps.setString(3, obj.getDate());
					
					int rowaffected = 	ps.executeUpdate();
				
					System.out.println(rowaffected + " rows inserted");		
					con.close();
					 }catch(Exception e){
						 System.out.println("Error feedback: " + e);
					 }
				
			}
	}

		@Override
		public List<BloodDonation> listAllfeedback() {
			// TODO Auto-generated method stub
		

				List<BloodDonation> al1 = new ArrayList<>();
				try {

					Connection con = ConnectionClass.getConnection();
					String sql = "select * from feedback ";
					Statement stmt = con.createStatement();
					ResultSet rs = stmt.executeQuery(sql);
					while (rs.next()) {
						BloodDonation rq = new BloodDonation(rs.getString(1), rs.getString(2), rs.getString(3));
						al1.add(rq);
					}
					return al1;
				
				} catch (Exception e) {
					System.out.println("error ind blooddaoimpl -> feedback " + e);
					return al1;
				}
			}

		@Override
		public boolean checkdet(String hosp,String city,String date, String slot) {
			boolean resp=false;
			int count=0;
			try {
				Connection con = ConnectionClass.getConnection();
				String qry="Select count(Time) from bd_donation where Hospital_Name='"+hosp+"'"+" and City='"+city+"'"+" and Date='"+date+"'"+" and Time='"+slot+"'";
					
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery(qry);
				rs.next();
				count=rs.getInt(1);
				if(count>=3) resp=false;
				else resp=true;
			}catch(Exception E) {
				System.out.println("Problem in Checking "+E);
			}			
					
		return resp;}

		}
			
		

