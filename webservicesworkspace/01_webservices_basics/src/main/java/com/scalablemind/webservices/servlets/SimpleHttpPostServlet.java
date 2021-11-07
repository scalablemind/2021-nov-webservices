package com.scalablemind.webservices.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateorder")
public class SimpleHttpPostServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6955739202183718258L;

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter writer = resp.getWriter();
		writer.println("<html><title>Order update status</title><body>");
		String orderId = req.getParameter("orderid");
		String message = "no order to update!";
		if(orderId!=null) {
			message = String.format("order #%s updated",orderId);
		}
		writer.println(String.format("<h1>%s</h1>",message));
		writer.println("</body></html>");
	}

}
