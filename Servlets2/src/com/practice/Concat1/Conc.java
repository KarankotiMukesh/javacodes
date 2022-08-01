package com.practice.Concat1;

import javax.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
public class Conc extends HttpServlet {
	
	
	public void service(ServletRequest req,ServletResponse resp) throws IOException
	{
		
		PrintWriter pw=resp.getWriter();
		
		String s=req.getParameter("FirstName");
		String s1=req.getParameter("LastName");
		String h=s+" "+s1;
		pw.println("your full name is:  "+h);
		
	}

}
