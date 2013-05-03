package edu.cmpe273.univclient.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.beans.StudentCourse;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

/**
 * Servlet implementation class InvoiceServlet
 */
public class InvoiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InvoiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		System.out.println("In Invoice Servlet");
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		StudentCourse[] invoiceReply = proxy.getCourseInvoice("8646111");
		session.setAttribute("invoiceReply", invoiceReply);
		response.sendRedirect("view/studentInvoice.jsp");
	}

}
