package com.cookiesdemo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookyServlet")
public class SetCookyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String uname = 
				request.getParameter("txtUname");
		String choice = 
				request.getParameter("radSite");
		String site = "";
		
		switch (choice) {
		case "f":
			site = "www.facebok.com";
			break;
		case "i":
			site = "www.instagram.com";
			break;	
		case "t":
			site = "www.twitter.com";
			break;
		}
		
		Cookie cn = new Cookie("namecooky", uname);
		Cookie cs = new Cookie("sitecooky", site);
		
		cn.setMaxAge(120);
		cs.setMaxAge(120);
		
		response.addCookie(cn);
		response.addCookie(cs);
		
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
		pw.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		pw.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>");
		pw.println("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>");
		pw.println("</head>");
		pw.println("<body>");
		pw.println("<h1 style=\"color:green;"
		+ "text-align:center\"> Cookies saved on your"
		+ " machine</h1>");
		pw.println("<a href=\"getcooky\">GET COOKIES"
				+ "</a>");
		pw.println("</body>");
		pw.println("</html>");
	}

}
