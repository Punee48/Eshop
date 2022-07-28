package com.eshop1.product;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProduct
 */
@WebServlet("/add-product.do")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("productid");
		String productname = request.getParameter("productname");
		String price = request.getParameter("productprice");
		String weight = request.getParameter("productweight");
		int productid = Integer.parseInt(id);
		int productprice  = Integer.parseInt(price);
		int productweight = Integer.parseInt(weight);
		Product product = new Product(productid,productname,productweight,productprice);
	}

}
