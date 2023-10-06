package com.webtech.servlets;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUP extends HttpServlet {
	String first, last, birth, email, number;
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		first = req.getParameter("first_name");
		last = req.getParameter("last_name");
		birth = req.getParameter("birthday");
		email = req.getParameter("email");
		number = req.getParameter("phone");
		
		if(first != null && last != null && birth != null && email != null && number != null) {
			res.sendRedirect("index.html");
		}else {
			System.out.println("Fill in all fields");
		}
	}
}
