package com.practice.ServletsSub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Servlet2 extends HttpServlet {
	

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	PrintWriter p=res.getWriter();
	
	String s=req.getParameter("number1");
	
	String s1=req.getParameter("number2");
	String s2=s+s1;
	
	p.println(s2);
		
	}
}
