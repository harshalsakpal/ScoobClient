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
  
  public java.lang.String testService() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.testService();
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
  
  public java.lang.String assignCourseToAProfessor(edu.cmpe273.univserver.beans.InstructorCourse ic) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.assignCourseToAProfessor(ic);
  }
  
  public edu.cmpe273.univserver.beans.Person[] listAllProfessors() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.listAllProfessors();
  }
  
  public edu.cmpe273.univserver.beans.Person[] listAllPersons() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.listAllPersons();
  }
  
  public edu.cmpe273.univserver.beans.Person[] listAllStudents() throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.listAllStudents();
  }
  
  public java.lang.String adminEditCourse(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminEditCourse(course);
  }
  
  public java.lang.String adminDeleteCourse(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminDeleteCourse(course);
  }
  
  public java.lang.String adminAddCourse(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminAddCourse(course);
  }
  
  public java.lang.String removeCourseFromCart(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.removeCourseFromCart(studentCourse);
  }
  
  public java.lang.String addCourseToCart(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.addCourseToCart(studentCourse);
  }
  
  public edu.cmpe273.univserver.beans.StudentCourse[] viewRegisteredCourse(java.lang.String sjsuid) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.viewRegisteredCourse(sjsuid);
  }
  
  public edu.cmpe273.univserver.beans.Course[] searchAllCourses(java.lang.String category, java.lang.String input) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.searchAllCourses(category, input);
  }
  
  public edu.cmpe273.univserver.beans.Person searchStudentInformation(java.lang.String input) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.searchStudentInformation(input);
  }
  
  public edu.cmpe273.univserver.beans.Person searchInstructorInformation(java.lang.String input) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.searchInstructorInformation(input);
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
  
  public edu.cmpe273.univserver.beans.Course getCourseDetails(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.getCourseDetails(course);
  }
  
  public int addCourseInBatch(edu.cmpe273.univserver.beans.Course[] co) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.addCourseInBatch(co);
  }
  
  public edu.cmpe273.univserver.beans.InstructorCourse getAssignedCourse(edu.cmpe273.univserver.beans.InstructorCourse ic) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.getAssignedCourse(ic);
  }
  
  public java.lang.String dropCourse(java.lang.String sjsu_id, java.lang.String name, java.lang.String section) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.dropCourse(sjsu_id, name, section);
  }
  
  public edu.cmpe273.univserver.beans.Person signIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.signIn(username, password);
  }
  
  public java.lang.String addCourse(java.lang.String sjsuid, java.lang.String courseNumber, java.lang.String courseName, java.lang.String section, java.lang.String day, java.lang.String time, java.lang.String location) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.addCourse(sjsuid, courseNumber, courseName, section, day, time, location);
  }
  
  public java.lang.String registerUser(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.registerUser(person);
  }
  
  public boolean adminSignIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.adminSignIn(username, password);
  }
  
  public java.lang.String editCourseAssignedToAProfessor(edu.cmpe273.univserver.beans.InstructorCourse ic) throws java.rmi.RemoteException{
    if (universityServerService == null)
      _initUniversityServerServiceProxy();
    return universityServerService.editCourseAssignedToAProfessor(ic);
  }
  
  
}