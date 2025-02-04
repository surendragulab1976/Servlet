package com.dest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Program1 extends HttpServlet {
	private PrintWriter writer;

	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name = req.getParameter("name");
		System.out.println(name);
		writer = res.getWriter();
		writer.print(name);
	}
}