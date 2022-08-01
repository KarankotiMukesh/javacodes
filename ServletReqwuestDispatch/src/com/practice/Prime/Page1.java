package com.practice.Prime;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Page1 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		String s=req.getParameter("number");
		int count=0;
		int n=Integer.parseInt(s);
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			RequestDispatcher rd=req.getRequestDispatcher("Servlet");
			rd.forward(req,resp);
		}
		else
		{
			pw.println("number is not a prime ");
			RequestDispatcher rd=req.getRequestDispatcher("/dispatch.html");
			rd.include(req,resp);
		}
		
		
	}
	

}
