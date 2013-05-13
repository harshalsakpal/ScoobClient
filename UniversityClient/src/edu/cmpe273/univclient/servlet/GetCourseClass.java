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
 * Servlet implementation class GetCourseClass
 */
public class GetCourseClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCourseClass() {
        super();
        // TODO Auto-generated constructor stub
    }



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
		  String section=request.getParameter("section");
		
		  
		 
		  		c.setDepartment(dept);
		  		c.setCourseNumber(coursenum);
		  		c.setSection(section);
		  		
		  		
		  
		  
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		
		Course newcourse = proxy.getCourseDetails(c);
		if(newcourse!=null)
		{
			hs.setAttribute("course", newcourse);	
			System.out.println("Course name:"+newcourse.getCourseName());
			System.out.println("Course desc:"+newcourse.getCourseDesc());
			System.out.println("Course number:"+newcourse.getCourseNumber());
			System.out.println("Course section:"+newcourse.getSection());
			System.out.println("Course department:"+newcourse.getDepartment());
			System.out.println("Course credits:"+newcourse.getCredits());
			
			response.sendRedirect("view/AdminUpdateClass.jsp");
		}
		else
		{
			hs.setAttribute("Status", "Course does not exist");
			response.sendRedirect("view/AdminEditClass.jsp");
		}
		
		
		
		}
	}

			
	

}
