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

public class LogoutServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		
		req.getRequestDispatcher("Links.html").include(req,res);
		 Cookie ck=new Cookie("name","");  
	        ck.setMaxAge(0);  
	        res.addCookie(ck);  
	        pw.println("you are successfully logedout");
		
		
	}

}
