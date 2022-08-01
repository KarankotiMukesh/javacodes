package com.practice.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecondSer extends HttpServlet {
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		HttpSession s1=req.getSession();
		
		String n=(String)s1.getAttribute("urname");
		int n1=(Integer)s1.getAttribute("age");
		
		pw.println("welcome "+ n +"your age is : "+n1);
		
	}
	

}
