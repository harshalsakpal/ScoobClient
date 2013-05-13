package edu.cmpe273.univclient.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.beans.InstructorCourse;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

/**
 * Servlet implementation class EditAssignClass
 */
public class EditAssignClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAssignClass() {
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
				
			  String dept=request.getParameter("department");
			  String coursenum=request.getParameter("course_number");
			  String section=request.getParameter("section");
			  
			  InstructorCourse ic = new InstructorCourse();
		  		
		  		ic.setDepartment(dept);
		  		ic.setCourseNumber(coursenum);
		  		ic.setSection(section);
		  		
			  UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
				proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
				
				InstructorCourse newic=proxy.getAssignedCourse(ic);
				System.out.println(newic.getSjsuid());
				if(newic.getSjsuid()==null)
				{
					response.sendRedirect("view/EditAssignCourse.jsp");
					hs.setAttribute("status", "Course Does not Exit/Course Not Assigned");
				}
				else
				{
					hs.setAttribute("newic", newic);
					response.sendRedirect("view/UpdateAssignCourse.jsp");	
				}
				
			} 
	}

}
