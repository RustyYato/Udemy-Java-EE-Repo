package com.airline.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightService;

/**
 * Servlet implementation class FlightDetails
 */
@WebServlet("/FlightDetails")
public class FlightDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private FlightService fs1;
	
	@EJB
	private FlightService fs2;
	
	@EJB
	private FlightService fs3;
	
	@EJB
	private FlightService fs4;
	
	@EJB
	private FlightService fs5;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FlightDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		// TODO Auto-generated method stub
		PrintWriter view = response.getWriter();
		
		view.println("The flight detail servlet has been called...");
		
		fs1.setFrom("London");
		view.println(fs1.getFrom());
		
		fs2.setFrom("New York");
		view.println(fs1.getFrom());
		
		fs3.setFrom("Gondor");
		view.println(fs1.getFrom());
		
		fs4.setFrom("Rohan");
		view.println(fs1.getFrom());
		
		fs5.setFrom("Mordor");
		view.println(fs1.getFrom());
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {
		// TODO Auto-generated method stub
		doGet(request , response);
	}
	
}
