package com.webtech.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String email, password;
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		email = req.getParameter("email");
		password = req.getParameter("pass");
		
		if("audi@yahoo.com".equals(email) && "1234567".equals(password)) {
			try {
				res.sendRedirect("Student_Admission.html");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else {
			res.sendRedirect("ForgetPassword.html");
		}
		
		
	}
	
}
