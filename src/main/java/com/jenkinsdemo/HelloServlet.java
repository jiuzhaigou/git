package com.jenkinsdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter out = new PrintWriter(resp.getOutputStream());
		out.println("<html>");
		out.println("<head><title>Servlet1</title></head>");
		out.println("<body>hello world!");
		out.println("</body></html>");
		out.close();

		//add 70B branch
		//70B commit 1;

		//70B commit 2;
		//70B commit 3;
		//70B commit 4;
                //70B commit 5;
//70B commit 6;
		//70B commit 7;
	}
}
