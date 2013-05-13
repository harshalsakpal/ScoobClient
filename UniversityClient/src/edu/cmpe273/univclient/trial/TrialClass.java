package edu.cmpe273.univclient.trial;

import java.rmi.RemoteException;

import edu.cmpe273.univserver.beans.Course;
import edu.cmpe273.univserver.beans.Person;
import edu.cmpe273.univserver.service.UniversityServerServiceProxy;

public class TrialClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String status = "";
		//Person person = new Person();
		Course course = new Course();
		
		UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
		proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
		
		for (int iCount = 0; iCount < 100000; iCount++) {
			
			course.setCourseDesc("Description "+Integer.valueOf(iCount));
			course.setCourseName("EST COURSE NAME "+Integer.valueOf(iCount));
			course.setCourseNumber("1000"+Integer.valueOf(iCount));
			course.setCredits("3");
			if (iCount >= 0 && iCount < 20000)
				course.setDay("MONDAY");
			else if(iCount >= 20000 && iCount < 30000)
				course.setDay("TUESDAY");
			else if(iCount >= 20000 && iCount < 30000)
				course.setDay("WEDNESDAY");
			else if(iCount >= 30000 && iCount < 40000)
				course.setDay("THURSDAY");
			else if(iCount >= 40000 && iCount < 50000)
				course.setDay("FRIDAY");
			else if(iCount >= 50000 && iCount < 100000)
				course.setDay("TUESDAY");

			if (iCount >= 0 && iCount < 20000)
				course.setDepartment("CMPE");
			else if(iCount >= 20000 && iCount < 30000)
				course.setDepartment("CS");
			else if(iCount >= 20000 && iCount < 30000)
				course.setDepartment("SE");
			else if(iCount >= 30000 && iCount < 40000)
				course.setDepartment("EE");
			else if(iCount >= 40000 && iCount < 50000)
				course.setDepartment("ME");
			else if(iCount >= 50000 && iCount < 100000)
				course.setDepartment("LIB");			
		
			course.setLocation("BBC");
			course.setSection(""+Integer.valueOf(iCount));
			course.setTime("1PMto2PM");
			

			/*person.setFirstName("HariFirst");
			person.setLastName("HariLast");
			person.setDateOfBirth("05/01/1988");
			person.setAddrLine1("Address Line of ");
			person.setAddrLine2("Address Line of ");
			person.setEmailid("email"+Integer.valueOf(iCount)+"@email.com");
			person.setPassword("a");
			person.setCityName("San Jose");

			if (iCount >= 10000 && iCount < 11000)
				person.setStateName("CA");
			else if (iCount >= 11000 && iCount < 14000)
				person.setStateName("AZ");
			else if (iCount >=14000 && iCount < 17000)
				person.setStateName("DN");
			else
				person.setStateName("OR");

			person.setZipCode("95112");
			person.setRole("INSTRUCTOR");

			if (iCount >= 10000 && iCount < 11000)
				person.setDepartment("CMPE");
			else if (iCount >= 11000 && iCount < 14000)
				person.setDepartment("SE");
			else if (iCount >= 14000 && iCount < 17000)
				person.setDepartment("CS");
			else if (iCount >= 17000 && iCount < 18500)
				person.setDepartment("ME");
			else
				person.setDepartment("EE");
*/
			try {
				status = proxy.adminAddCourse(course);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(status);
		}
	}
}
