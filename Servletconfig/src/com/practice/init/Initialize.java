package com.practice.init;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class Initialize extends HttpServlet {
	
	int n;
	public void init(ServletConfig sc) {
		
		
		 n=Integer.parseInt(sc.getInitParameter("m1"));
		
		

	}
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw=res.getWriter();
		n=n+Integer.parseInt(req.getParameter("v1"));
		pw.println(n);
		
	}
	
	@Override
	public void destroy() {
		
	}

	
}

