package com.practice.Concat1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GenericServ extends GenericServlet{
	
	 @Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		pw.println("m1");
		pw.println("m2");
		
		
	}

}
