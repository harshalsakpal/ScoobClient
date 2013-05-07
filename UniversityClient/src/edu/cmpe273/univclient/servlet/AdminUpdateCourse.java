package edu.cmpe273.univclient.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.beans.Course;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

public class AdminUpdateCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public AdminUpdateCourse() {
        super();
        
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession hs = request.getSession(false);
		if(hs==null)
		{
			response.sendRedirect("view/AdminLogin.jsp");
		}
		else 
		{	
			
			Course c = (Course)hs.getAttribute("course");
			
			if(c!=null)
			{
			
				
			
			
		  
		  
		  c.setCourseName(request.getParameter("course_name"));
		  c.setCredits(request.getParameter("credits"));
		  c.setCourseDesc(request.getParameter("description"));
		  
		 
		  
		  
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		
		String status = proxy.adminEditCourse(c);
		hs.setAttribute("Status", status);
		
		hs.removeAttribute("course");
		response.sendRedirect("view/AdminEditClass.jsp");
		}

	}

	}
}
