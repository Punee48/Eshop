package com.eshop1.product;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddToCart
 */
@WebServlet("/add-to-cart.do")
public class AddToCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddToCart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		int productid = Integer.parseInt(id);
		ServletContext ctx = request.getServletContext();
		List<Product> products = (List<Product>) ctx.getAttribute("products");
		Product p = null;
		for (Product curr : products) {
			if (curr.getProductId() == productid) {
				p = curr;
			}

		}
		HttpSession session = request.getSession();
		List<Product> cart = (List<Product>) session.getAttribute("cart");
		cart.add(p);
		session.setAttribute("cart", products);
		RequestDispatcher rd = request.getRequestDispatcher("add-to-cart.jsp");
		rd.forward(request, response);

	}

}
