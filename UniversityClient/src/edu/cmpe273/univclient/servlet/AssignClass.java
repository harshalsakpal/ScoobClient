package edu.cmpe273.univclient.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.beans.Course;
import edu.cmpe273.univserver.beans.InstructorCourse;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;


public class AssignClass extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AssignClass() {
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
		  String availableSeats=request.getParameter("availableSeats");
		  String day=request.getParameter("day");
		  String sjsuid=request.getParameter("sjsuid");
		  String location=request.getParameter("location");
		  String fhrs=request.getParameter("fhrs");
		  String fmins=request.getParameter("fmins");
		  String fampm=request.getParameter("fampm");
		  String ftime=fhrs+":"+fmins+" "+fampm;
		  
		  String thrs=request.getParameter("thrs");
		  String tmins=request.getParameter("tmins");
		  String tampm=request.getParameter("tampm");
		  String ttime=thrs+":"+tmins+" "+tampm;
		  
		  		String time =ftime+" to "+ttime;
		  
		  		InstructorCourse ic = new InstructorCourse();
		  		
		  		ic.setDepartment(dept);
		  		ic.setCourseNumber(coursenum);
		  		ic.setSection(section);
		  		ic.setAvailableSeats(availableSeats);
		  		ic.setDay(day);
		  		ic.setSjsuid(sjsuid);
		  		ic.setLocation(location);
		  		ic.setTime(time);
		  		
		  		
		  		
		  
		  
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		
		String status=proxy.assignCourseToAProfessor(ic);
		hs.setAttribute("status", status);
		response.sendRedirect("view/AssignCourse.jsp");
		
		}
	}

}
