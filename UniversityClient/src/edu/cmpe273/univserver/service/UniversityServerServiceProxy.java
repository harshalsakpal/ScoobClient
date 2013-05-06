package edu.cmpe273.univserver.service;

public class UniversityServerServiceProxy implements edu.cmpe273.univserver.service.UniversityServerService {
  private String _endpoint = null;
  private edu.cmpe273.univserver.service.UniversityServerService universityServerService = null;
  
  public UniversityServerServiceProxy() {
    _initUniversityServerServiceProxy();
  }
  
  public UniversityServerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initUniversityServerServiceProxy();
  }
  
  private void _initUniversityServerServiceProxy() {
    try {
      universityServerService = (new edu.cmpe273.univserver.service.UniversityServerServiceServiceLocator()).getUniversityServerService();
      if (universityServerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)universityServerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)universityServerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (universityServerService != null)
      ((javax.xml.rpc.Stub)universityServerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public edu.cmpe273.univserver.service.UniversityServerService getUniversityServerService() {
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService;
  }
  
  public java.lang.String editCourseAssignedToAProfessor() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.editCourseAssignedToAProfessor();
  }
  
  public edu.cmpe273.univserver.beans.StudentCourse[] viewRegisteredCourse(java.lang.String sjsuid) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.viewRegisteredCourse(sjsuid);
  }
  
  public java.lang.String addCourseToCart(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.addCourseToCart(studentCourse);
  }
  
  public java.lang.String removeCourseFromCart(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.removeCourseFromCart(studentCourse);
  }
  
  public java.lang.String adminAddCourse(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminAddCourse(course);
  }
  
  public edu.cmpe273.univserver.beans.Course searchAllCourses(java.lang.String category, java.lang.String input) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.searchAllCourses(category, input);
  }
  
  public java.lang.String adminDeleteCourse(int course_number, java.lang.String dept) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminDeleteCourse(course_number, dept);
  }
  
  public java.lang.String adminEditCourse(int course_number, java.lang.String dept) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminEditCourse(course_number, dept);
  }
  
  public edu.cmpe273.univserver.beans.Person listAllStudents() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.listAllStudents();
  }
  
  public edu.cmpe273.univserver.beans.Person listAllProfessors() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.listAllProfessors();
  }
  
  public java.lang.String assignCourseToAProfessor() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.assignCourseToAProfessor();
  }
  
  public java.lang.String editStudentInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.editStudentInformation(person);
  }
  
  public java.lang.String deleteStudentInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.deleteStudentInformation(person);
  }
  
  public java.lang.String deleteProfessorInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.deleteProfessorInformation(person);
  }
  
  public java.lang.String editProfessorInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.editProfessorInformation(person);
  }
  
  public edu.cmpe273.univserver.beans.InstructorCourse[] viewAssignedCourses(java.lang.String sjsuid) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.viewAssignedCourses(sjsuid);
  }
  
  public edu.cmpe273.univserver.beans.StudentCourse[] getCourseInvoice(java.lang.String sjsuid) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.getCourseInvoice(sjsuid);
  }
  
  public boolean adminSignIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminSignIn(username, password);
  }
  
  public edu.cmpe273.univserver.beans.Person signIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.signIn(username, password);
  }
  
  public java.lang.String registerUser(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.registerUser(person);
  }
  
  public java.lang.String dropCourse(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.dropCourse(studentCourse);
  }
  
  public java.lang.String addCourse(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.addCourse(studentCourse);
  }
  
  public java.lang.String testService() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.testService();
  }
  
  
}