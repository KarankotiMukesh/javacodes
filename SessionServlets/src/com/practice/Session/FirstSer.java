package com.practice.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

public class FirstSer extends HttpServlet {
	
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter pw=resp.getWriter();
		
		String name=req.getParameter("name");
		String num=req.getParameter("number");
		int n=Integer.parseInt(num);
		HttpSession s=req.getSession();
		s.setAttribute("urname",name);
		s.setAttribute("age", n);
		
		req.getRequestDispatcher("Second").forward(req,resp);
		pw.close();
	}

}
