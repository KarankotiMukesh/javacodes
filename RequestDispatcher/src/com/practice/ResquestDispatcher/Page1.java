package com.practice.ResquestDispatcher;

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

		PrintWriter pw = resp.getWriter();
		String s = req.getParameter("userName1");
		String s1 = req.getParameter("password1");
		if (s1.equals("Mukki")) {
			
			 RequestDispatcher rd=req.getRequestDispatcher("servlet2");
			 rd.forward(req,resp);
			 
		//	System.out.println("You are logged in ");
		} else {
			pw.println("sorry your password is not correct");
			RequestDispatcher rd = req.getRequestDispatcher("/Dispatch.html");
			rd.include(req, resp);
		}

	}

}
