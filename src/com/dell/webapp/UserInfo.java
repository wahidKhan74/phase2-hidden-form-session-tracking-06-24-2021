package com.dell.webapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserInfo
 */
@WebServlet("/user-info")
public class UserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public UserInfo() { }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("userId");
		String userName = request.getParameter("username");
		
		// generate new hidden form
		out.print("<form method='post' action='profile'>");
		
		out.print("<input type='hidden' name='userId' id='userId' value='"+userId+"'>");
		out.print("<input type='hidden' name='username' id='username' value='"+userName+"'>");		
		out.print("<input type='submit' value='Go to profile'>");
		out.print("</form>");		
		out.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
