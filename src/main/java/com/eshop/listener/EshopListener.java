package com.eshop.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.eshop1.product.Product;

/**
 * Application Lifecycle Listener implementation class EshopListener
 *
 */
@WebListener
public class EshopListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public EshopListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	List<Product> products = new ArrayList<Product>();
    	ServletContext ctx = sce.getServletContext();
    	ctx.setAttribute("products", products);
    }
	
}
