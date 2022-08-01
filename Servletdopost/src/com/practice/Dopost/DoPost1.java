package com.practice.Dopost;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoPost1 extends HttpServlet {
//
//	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		
//      	PrintWriter pw=resp.getWriter();
//	  String s=req.getParameter("bird");
//	  String s1=s.toLowerCase();
//	  pw.println(s1);
//	
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		  String s=req.getParameter("bird");
		  String s1=s.toLowerCase();
		  pw.println(s1);
	}
	
}
