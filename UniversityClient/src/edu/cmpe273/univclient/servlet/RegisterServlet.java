package edu.cmpe273.univclient.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.cmpe273.univserver.beans.Person;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		session.setAttribute("registerReply", "");
		Person person = new Person(); 
		
		//String firstname="", lastname="", gender="", dateofbirth="", address1="", address2="", email="", password="", city="", zipcode="", role="", department="";
		
		if(request.getParameter("firstname")!=null || !"".equals(request.getParameter("firstname"))){
			person.setFirstName(request.getParameter("firstname").trim());
		}
		if(request.getParameter("lastname")!=null || !"".equals(request.getParameter("lastname"))){
			person.setLastName(request.getParameter("lastname").trim());
		}	
		if(request.getParameter("gender")!=null || !"".equals(request.getParameter("gender"))){
			person.setGender(request.getParameter("gender").trim());
		}	
		if(request.getParameter("dateofbirth")!=null || !"".equals(request.getParameter("dateofbirth"))){
			person.setDateOfBirth(request.getParameter("dateofbirth").trim());
		}	
		if(request.getParameter("address1")!=null || !"".equals(request.getParameter("address1"))){
			person.setAddrLine1(request.getParameter("address1").trim());
		}	
		if(request.getParameter("address2")!=null || !"".equals(request.getParameter("address2"))){
			person.setAddrLine2(request.getParameter("address2").trim());
		}	
		if(request.getParameter("email")!=null || !"".equals(request.getParameter("email"))){
			person.setEmailid(request.getParameter("email").trim());
		}	
		if(request.getParameter("password")!=null || !"".equals(request.getParameter("password"))){
			person.setPassword(request.getParameter("password").trim());
		}	
		if(request.getParameter("city")!=null || !"".equals(request.getParameter("city"))){
			person.setCityName(request.getParameter("city").trim());
		}
		if(request.getParameter("state")!=null || !"".equals(request.getParameter("state"))){
			person.setStateName(request.getParameter("state").trim());
		}
		if(request.getParameter("zipcode")!=null || !"".equals(request.getParameter("zipcode"))){
			person.setZipCode(request.getParameter("zipcode").trim());
		}
		if(request.getParameter("role")!=null || !"".equals(request.getParameter("role"))){
			person.setRole(request.getParameter("role").trim());
		}
		if(request.getParameter("department")!=null || !"".equals(request.getParameter("department"))){
			person.setDepartment(request.getParameter("department").trim());
		}
		
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		String registerReply = proxy.registerUser(person);
		System.out.println("Reply from service is :: "+registerReply);
		session.setAttribute("registerReply", registerReply);
		
		if("Email id already Exists".equals(registerReply))
			response.sendRedirect("view/Register.jsp");
		else
			response.sendRedirect("view/Login.jsp");
		
	}
}
