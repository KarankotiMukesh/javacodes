package com.practice.Log;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProfileServlet extends HttpServlet {
	

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=res.getWriter();
		
		req.getRequestDispatcher("Links.html").include(req,res);
		
		Cookie ck[]=req.getCookies();  
        if(ck!=null){  
         String name=ck[0].getValue();  
        if(!name.equals("")||name!=null){  
            pw.print("<b>Welcome to Profile</b>");  
            pw.print("<br>Welcome, "+name);  
        }  
        }else{  
            pw.print("Please login first");  
            req.getRequestDispatcher("login.html").include(req, res);  
        }  
        pw.close();  
		
	}
	

}
