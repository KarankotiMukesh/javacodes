package com.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;
public class Serv  extends HttpServlet{
	
	public void service(ServletRequest req,ServletResponse resp) throws IOException
	{
		PrintWriter pw=resp.getWriter();

	String s=req.getParameter("completeName");
		String t=req.getParameter("something");
		int n=Integer.parseInt(s);
		int n1=Integer.parseInt(t);
	
		
		pw.println(n+n1);
		
		
		
	}
}
