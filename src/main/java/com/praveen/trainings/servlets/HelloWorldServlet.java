package com.praveen.trainings.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloWorldServlet
 */
public class HelloWorldServlet extends GenericServlet {

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Hello world from first servlet component</h1>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
