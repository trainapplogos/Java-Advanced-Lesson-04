package ua.lviv.trainapplogos;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		UserService userService = UserService.getUserService();
		UserAccount user = userService.getUser(login);
		
		if (user != null) {
			if (user.getPassword().equals(password)) {
				//request.setAttribute("userEmail", login);
				request.getRequestDispatcher("cabinet.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
				
		} else {
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		
	}

}
