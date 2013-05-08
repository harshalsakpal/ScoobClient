package edu.cmpe273.univclient.servlet;

import java.io.IOException;
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
		for(int i=0;i<selctedCourseList.length;i++)
		{
			String selectedAnswers = selctedCourseList[i];
			System.out.println(" selctedCourseList: "+selctedCourseList[i]);
			proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
	/*		courseNumber = selectedAnswers.substring(0, selectedAnswers.indexOf(","));
			System.out.println("courseNumber>>"+courseNumber);
			
			selectedAnswers = selectedAnswers.substring(courseNumber.length() + 1);
			courseName = selectedAnswers.substring(0, selectedAnswers.indexOf(","));
			System.out.println("courseName>>"+courseName);
			
			selectedAnswers = selectedAnswers.substring((courseName.length()) + 1);
			section = selectedAnswers.substring(0, selectedAnswers.indexOf(","));
			System.out.println("section>>"+section);

			selectedAnswers = selectedAnswers.substring((section.length()) + 1);
			day = selectedAnswers.substring(0, selectedAnswers.indexOf(","));
			System.out.println("day>>"+day);

			selectedAnswers = selectedAnswers.substring((day.length()) + 1);
			time = selectedAnswers.substring(0, selectedAnswers.length());
			System.out.println("time>>"+time);
			
			selectedAnswers = selectedAnswers.substring((time.length()) + 1);
			location = selectedAnswers.substring(0, selectedAnswers.length());*/	
			//System.out.println("location>>"+location);
			
			//addCourseMessage = proxy.addCourse(sjsuid, courseNumber, courseName, section, day, time, location);
			addCourseMessage = proxy.addCourse("42", "CMPE273", "EST", "02", "Monday", "11:45", "BBC");
		}
		session.setAttribute("addCourseMessage", addCourseMessage);
		response.sendRedirect("view/StudentHome.jsp");

	}

}
