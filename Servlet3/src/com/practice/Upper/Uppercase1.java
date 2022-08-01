package com.practice.Upper;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class Uppercase1 extends HttpServlet{
	
	public void service(ServletRequest req,ServletResponse rep) throws IOException
	{
		PrintWriter pw=rep.getWriter();
		
		String s=req.getParameter("message");
		String s1=s.toUpperCase();
		pw.println(s1);
		
		
		
	}
	

	
	
}

