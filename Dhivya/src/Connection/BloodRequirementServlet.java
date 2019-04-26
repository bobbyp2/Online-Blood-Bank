package Connection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegistrationDAOImpl;
import DAO.bloodDAOImpl;
import Model.Bloodavailable;
import Model.registration;

/**
 * Servlet implementation class BloodRequirementServlet
 */
public class BloodRequirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloodRequirementServlet() {
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
	
		String bg=request.getParameter("tf1");
		String st=request.getParameter("tf2");
		String ar=request.getParameter("tf3");
		int pn=Integer.parseInt(request.getParameter("tf4"));
	    long cn=Long.parseLong(request.getParameter("tf5"));
		
		Bloodavailable obj=new Bloodavailable(bg, st, ar, pn, cn);
		 bloodDAOImpl dao=new bloodDAOImpl();
		 dao.requirement(obj);
		 PrintWriter out=response.getWriter();
		 out.println("<html><head></head><body><center><font color=#1589FF><font size=5>Your Requirement is posted sucessfully</font></font></center></body></html> ");
		 System.out.println("sucess");
	}

}
