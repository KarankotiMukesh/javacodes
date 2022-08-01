package com.practice.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginKeka extends HttpServlet  {
	
	
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		req.getRequestDispatcher("Links.html").include(req,resp);
		
		String mail=req.getParameter("mail");
		String password=req.getParameter("Password");
		if(mail.equals("mukesh.k@techouts.com") && password.equals("Mukesh"))
		{
			pw.println("hii welcome to techouts ");
			Cookie ck=new Cookie("name",mail);
			resp.addCookie(ck);
		}
		else
		{
			pw.println("your password or mail is Incorrect");
			req.getRequestDispatcher("Login.html").include(req,resp);
		}
		
		pw.close();
		
	}

}
