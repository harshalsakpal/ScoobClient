package edu.cmpe273.univclient.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
    /**
     * Default constructor. 
     */
    public ActionServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{
			proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
			System.out.println("After setting endPoint");
			String reply = proxy.testService();
			System.out.println("reply from test service is "+reply);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
