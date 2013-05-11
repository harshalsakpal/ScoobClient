package edu.cmpe273.univclient.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

/**
 * Servlet implementation class DropCourseToStudent
 */
public class DropCourseToStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DropCourseToStudent() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		System.out.println("in DropCourseToStudent");
		
		String sjsuid = (String)session.getAttribute("user");
		String[] selctedCourseList = request.getParameterValues("checkedCourses");
		System.out.println(selctedCourseList.length);
		
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		String addCourseMessage = "";
		
		String courseNumber="", courseName="", section="", day="", time="", location="";
		
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		
		ArrayList<String> coursedropped = new ArrayList<String>();
		System.out.println(selctedCourseList.length);
		for (int i = 0; i < selctedCourseList.length; i++) {
			if(selctedCourseList[i].equals(""))
			{
				continue;
			}
			else
			{	
				String[] data=selctedCourseList[i].split(",");
				courseNumber =data[0]; 
						
								section = data[1];
										
														addCourseMessage = proxy.dropCourse(sjsuid, courseNumber,  section);
														System.out
																.println(addCourseMessage);
														if(addCourseMessage.equals("Dropped Successfully"))
														{
															coursedropped.add(courseNumber);
														}
			}
		}
		session.setAttribute("coursedropped", coursedropped);
		response.sendRedirect("StudentHome.jsp");
			

			
			
			

			
			
		
			
			
			
		
			
			

		

	}

}
