package edu.cmpe273.univclient.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.beans.Course;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

/**
 * Servlet implementation class SearchCourses
 */
public class SearchCourses extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCourses() {
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
		String department="", courseNumber=""; 
		if(request.getParameter("department")!=null || "".equals(request.getParameter("department"))){
			department = request.getParameter("department");
		}
		if(request.getParameter("courseNumber")!=null || "".equals(request.getParameter("department"))){
			courseNumber = request.getParameter("courseNumber");
		}
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		Course[] coursesReply = proxy.searchAllCourses(department, courseNumber);
		session.setAttribute("coursesReply", coursesReply);
		response.sendRedirect("view/studentAddCourse.jsp");
	}

}
