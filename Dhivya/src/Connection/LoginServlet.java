package Connection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegistrationDAO;
import DAO.RegistrationDAOImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		String m=request.getParameter("tf1");
		String m1=request.getParameter("tf2");
		RegistrationDAO dao = new RegistrationDAOImpl();
		String pass = dao.getpasswordbyloginId(m);
		if(pass==null) {
			request.getSession().setAttribute("logstatus", "Invalid Credentials");
			 response.sendRedirect("login.jsp");
		}
		else { 
						if(pass.equals(m1) && pass!=null)
						{
							response.sendRedirect("home1.jsp");
						}else {
							request.getSession().setAttribute("logstatus", "Invalid Credentials");
							response.sendRedirect("login.jsp");
							}
		}
		}
	

}
