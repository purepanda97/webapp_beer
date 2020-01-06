package com.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.model.BeerExpert;

/**
 * Servlet implementation class SelectBeer
 */
@WebServlet("/SelectBeer.do")
public class SelectBeer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SelectBeer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String c = request.getParameter("color"); 
		HttpSession session=request.getSession();
		session.setAttribute("color", c);
		
		
	   /* BeerExpert be = new BeerExpert(); 
	    List result = be.getBrands(c); 
	    
	    
	     request.setAttribute("styles", result); 
	     RequestDispatcher view = request.getRequestDispatcher("result.jsp");
	     view.forward(request, response); */
	  

/*
	    response.setContentType("text/html"); 
	    PrintWriter out = response.getWriter(); 
	    out.println("Beer Selection Advice<br>"); 
	    Iterator it = result.iterator(); 
	    while(it.hasNext()) { 
	        out.print("<br>try: " + it.next()); 
	        	
	    }
*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
