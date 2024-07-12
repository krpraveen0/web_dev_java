package com.praveen.trainings.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class CalculatorServlet
 */
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// check if we are getting two inputs form the web browser in request object 
		if(request.getParameter("number1") != null && request.getParameter("number2") != null) {
			Long num1 = Long.parseLong(request.getParameter("number1"));
			Long num2 = Long.parseLong(request.getParameter("number2"));
			PrintWriter writer = response.getWriter();
			writer.println("The sum of the number is :: " + (num1 + num2));
		}
	}

}
