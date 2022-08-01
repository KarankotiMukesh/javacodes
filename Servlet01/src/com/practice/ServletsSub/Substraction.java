package com.practice.ServletsSub;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Substraction extends HttpServlet {
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
	  PrintWriter pw=res.getWriter();
	 String n1=req.getParameter("num1");
	  String n2=req.getParameter("num2");
	  
	  int nu1=Integer.parseInt(n1);
	  int nu2=Integer.parseInt(n2);
	  pw.println(nu1-nu2);

	}
	

}
