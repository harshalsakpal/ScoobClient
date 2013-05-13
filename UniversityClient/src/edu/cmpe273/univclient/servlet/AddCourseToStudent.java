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
 * Servlet implementation class AddCourseToStudent
 */
public class AddCourseToStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourseToStudent() {
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
		System.out.println("in AddCourseToStudent");
		
		String sjsuid = (String)session.getAttribute("user");
		String[] selctedCourseList = request.getParameterValues("checkedCourses");
		System.out.println(selctedCourseList.length);
		
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		String addCourseMessage = "";
		
		String courseNumber="", courseName="", section="", day="", time="", location="";
		
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		ArrayList<String> courseadded = new ArrayList<String>();
		for (int i = 0; i < selctedCourseList.length; i++) {
			if(selctedCourseList[i].equals(""))
			{
				continue;
			}
			else
			{	
				String[] data=selctedCourseList[i].split(",");
				courseNumber =data[0]; 
						courseName = data[1];
								section = data[2];
										day = data[3];
												time =data[4]; 
														location =data[5]; 
			
														addCourseMessage = proxy.addCourse(sjsuid, courseNumber, courseName, section, day, time, location);
														if(addCourseMessage.equals("Enrolled Successfully"))
														{
															courseadded.add(courseNumber);
														}
			}
		}
		session.setAttribute("coursesadded", courseadded);
		response.sendRedirect("view/StudentHome.jsp");

	}

}
