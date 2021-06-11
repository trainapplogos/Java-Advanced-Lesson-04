package ua.lviv.trainapplogos;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = UserService.getUserService();
			
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		String lastName = request.getParameter("lastname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		userService.saveUser(new UserAccount(firstName, lastName, email, password));
		HttpSession session = request.getSession(true);
		session.setAttribute("userEmail", email);
		session.setAttribute("userFirstName", firstName);
		
		request.getRequestDispatcher("cabinet.jsp").forward(request, response);
	}

}
