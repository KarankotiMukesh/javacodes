package com.practice.tech;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutKeka extends HttpServlet {
	
  
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	     PrintWriter pw=resp.getWriter();
	     
	     req.getRequestDispatcher("Links.html").include(req,resp);
	     
	     Cookie ck=new Cookie("name","");
	     ck.setMaxAge(0);
	    resp.addCookie(ck);
	     pw.println("you have successfully logedOut");
	     
	     pw.close();
	
	
}

}
