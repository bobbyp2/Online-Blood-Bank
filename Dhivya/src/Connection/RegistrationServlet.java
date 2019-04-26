package Connection;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegistrationDAOImpl;
import Model.registration;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int pincode;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		
		String fn=request.getParameter("tf1");
		String ln=request.getParameter("tf2");
		int ag=Integer.parseInt(request.getParameter("tf3"));
		String gn=request.getParameter("tf4");
	 long cn=Long.parseLong(request.getParameter("tf5"));
		String em=request.getParameter("tf6");
		String ps=request.getParameter("tf7");
		int wt=Integer.parseInt(request.getParameter("tf8"));
		String st=request.getParameter("tf9");
		String ar=request.getParameter("tf10");
		int pn=Integer.parseInt(request.getParameter("tf11"));
		String bg=request.getParameter("tf12");
		registration obj=new registration(fn, ln, ag, gn, cn, em, ps, wt, st, ar, pn, bg);
		 RegistrationDAOImpl dao=new  RegistrationDAOImpl();
		 dao.newregistration(obj);
		 PrintWriter out=response.getWriter();
		 out.println("<html><head></head><body>");
		 out.println("<html><head></head><body><center><font color=#1589FF><font size=5>Registration Successful. Thank you visit Again</font></font></center></body></html> ");
		 System.out.println("sucess");
	}

}
