package Connection;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegistrationDAOImpl;
import DAO.bloodDAOImpl;
import Model.Bloodavailable;

/**
 * Servlet implementation class BloodAvailabiltyServlet
 */
public class BloodAvailabiltyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BloodAvailabiltyServlet() {
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
		String bg=request.getParameter("tf1");
		String st=request.getParameter("tf2");
		String ar=request.getParameter("tf3");
		int pn=Integer.parseInt(request.getParameter("tf4"));
		System.out.println(bg + " " + st+" " + ar +" " + pn );
		System.out.println("Testing...");
		Bloodavailable obj=new Bloodavailable(bg, st, ar, pn);
		 bloodDAOImpl dao=new  bloodDAOImpl();
		 List<Bloodavailable> obj1 =dao.availability(obj);
		 
		 if(obj1.isEmpty()) {
			 request.getSession().setAttribute("Access", "Denied");
			 response.sendRedirect("available.jsp");
			 			 
		 }
		 else {
	 			request.getSession().setAttribute("Listobj", obj1);
				response.sendRedirect("NewFile.jsp");}
		
}
}
