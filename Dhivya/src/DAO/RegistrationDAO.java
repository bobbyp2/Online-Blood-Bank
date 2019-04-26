package DAO;

import Model.registration;

public interface RegistrationDAO {

	public void newregistration(registration obj);
	public String getpasswordbyloginId(String loginid);
	
}
