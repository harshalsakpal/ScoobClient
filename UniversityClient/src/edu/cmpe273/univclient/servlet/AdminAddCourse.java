package edu.cmpe273.univclient.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.beans.Course;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

public class AdminAddCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession hs = request.getSession(false);
		if(hs==null)
		{
			response.sendRedirect("view/AdminLogin.jsp");
		}
		else
		{
			Course c = new Course();
		  String dept=request.getParameter("department");
		  String coursenum=request.getParameter("course_number");
		  String coursename=request.getParameter("course_name");
		  String section=request.getParameter("section");
		  String credits=request.getParameter("credits");
		  String desc=request.getParameter("description");
		  
		 System.out.println(coursename);
		  		c.setDepartment(dept);
		  		c.setCourseNumber(coursenum);
		  		c.setCourseName(coursename);
		  		c.setSection(section);
		  		c.setCredits(credits);
		  		c.setCourseDesc(desc);
		  
		  
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		
		String status = proxy.adminAddCourse(c);
		hs.setAttribute("Status", status);
		response.sendRedirect("view/AdminAddClass.jsp");
		}
	}

}
