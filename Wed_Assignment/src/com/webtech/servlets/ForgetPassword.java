package com.webtech.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForgetPassword extends HttpServlet {
	String email;
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		email = req.getParameter("email");
				if(email != null) {
		res.sendRedirect("index.html");
	}else {
		System.out.println("Fill in the email field!");
	}
	}
}
