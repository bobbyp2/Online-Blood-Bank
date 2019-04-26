package DAO;

import java.util.List;

import Model.BloodDonation;
import Model.Bloodavailable;


public interface DonationDAO {

	public boolean checkdet(String hosp,String city,String date,String slot);
	public void Donation(BloodDonation obj);
	public void feedback (BloodDonation obj);
	public List<BloodDonation> listAllfeedback();
	
}
