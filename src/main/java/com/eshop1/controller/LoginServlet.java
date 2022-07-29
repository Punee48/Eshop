package com.eshop1.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.eshop1.product.Product;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Username = request.getParameter("uname");
		String Password = request.getParameter("passw");

		if (Username.equals("admin") && Password.equals("admin")) {

			RequestDispatcher rd = request.getRequestDispatcher("admin-home.jsp");
			rd.forward(request, response);
		} else {
			List<Product> products  = new ArrayList<Product>();
			HttpSession session = request.getSession();
			session.setAttribute("cart", products);
			RequestDispatcher rd = request.getRequestDispatcher("user-home.jsp");
			rd.forward(request, response);
		}
	}

}
