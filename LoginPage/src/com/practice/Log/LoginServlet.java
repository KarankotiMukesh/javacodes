package com.practice.Log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		req.getRequestDispatcher("Links.html").include(req,res);
		String name=req.getParameter("name");
		String password=req.getParameter("password");
		
		if(password.equals("Mukki"))
		{
			pw.println("you are successfully logged in");
			pw.println("welcome " +name);
			
			Cookie ck=new Cookie("name",name);
			res.addCookie(ck);
			
		}
		else
		{
			pw.println("sorry your password is incorrect");
			req.getRequestDispatcher("Login.html").include(req,res);
		}
		
		
	}

}
