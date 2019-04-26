package Connection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DonationDAO;
import DAO.DonationDAOImpl;
import DAO.bloodDAOImpl;
import Model.BloodDonation;
import Model.Bloodavailable;

/**
 * Servlet implementation class BloodDonationServlet1
 */
public class BloodDonationServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloodDonationServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hn=request.getParameter("tf1");
		String ct=request.getParameter("tf2");
		
		String dt=request.getParameter("tf3");
		 String tm=request.getParameter("tf4");
	DonationDAO verify=new DonationDAOImpl();
	boolean resp=verify.checkdet(hn,ct,dt, tm);
	PrintWriter out=response.getWriter();
	if(resp) {
	BloodDonation obj=new BloodDonation(hn,ct,dt,tm);
	 DonationDAOImpl dao=new DonationDAOImpl();
	 dao.Donation(obj);
	
	 out.println("<html><head></head><body><center><font color=#1589FF><font size=5> You are going to save a life</font></font></center></body></html>");
	 
		 }
		 else {
			 out.println("<html><head></head><body><center><font color=#1589FF><font size=5>Sorry the selected slot is already filled. Please try for some different Slot</font></font></center></body></html>");
			 
		
		 		 }
		
	}

}
