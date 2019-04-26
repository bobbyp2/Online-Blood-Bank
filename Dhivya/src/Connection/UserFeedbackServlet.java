package Connection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DonationDAOImpl;
import Model.BloodDonation;

/**
 * Servlet implementation class UserFeedbackServlet
 */
public class UserFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserFeedbackServlet() {
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
		String fb=request.getParameter("tf3");
		 
	BloodDonation obj=new BloodDonation(hn, ct, fb);
	 DonationDAOImpl dao=new DonationDAOImpl();
	 dao.Donation(obj);
	 PrintWriter out=response.getWriter();
	 out.println("Thank you");
	 System.out.println("sucess");
		
	}

}
