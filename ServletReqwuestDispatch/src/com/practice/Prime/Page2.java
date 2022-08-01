package com.practice.Prime;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw1=resp.getWriter();
		
		
		String s=req.getParameter("number");
		int n1=Integer.parseInt(s);
		for(int i=0;i<=n1;i++)
		{
			pw1.println(i);
		}
		
		
	}

}
