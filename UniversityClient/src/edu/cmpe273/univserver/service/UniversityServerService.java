/**
 * UniversityServerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.cmpe273.univserver.service;

public interface UniversityServerService extends java.rmi.Remote {
    public edu.cmpe273.univserver.beans.Person[] listAllProfessors() throws java.rmi.RemoteException;
    public java.lang.String removeCourseFromCart(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException;
    public java.lang.String assignCourseToAProfessor(edu.cmpe273.univserver.beans.InstructorCourse ic) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.Course[] searchAllCourses(java.lang.String category, java.lang.String input) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.Person[] listAllPersons() throws java.rmi.RemoteException;
    public java.lang.String deleteStudentInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException;
    public java.lang.String deleteProfessorInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException;
    public java.lang.String addCourseToCart(edu.cmpe273.univserver.beans.StudentCourse[] studentCourse) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.Person searchInstructorInformation(java.lang.String input) throws java.rmi.RemoteException;
    public java.lang.String adminEditCourse(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException;
    public java.lang.String editProfessorInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException;
    public java.lang.String editStudentInformation(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.Person searchStudentInformation(java.lang.String input) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.StudentCourse[] viewRegisteredCourse(java.lang.String sjsuid) throws java.rmi.RemoteException;
    public java.lang.String adminAddCourse(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.Person[] listAllStudents() throws java.rmi.RemoteException;
    public java.lang.String adminDeleteCourse(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.InstructorCourse[] viewAssignedCourses(java.lang.String sjsuid) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.StudentCourse[] getCourseInvoice(java.lang.String sjsuid) throws java.rmi.RemoteException;
    public int addCourseInBatch(edu.cmpe273.univserver.beans.Course[] co) throws java.rmi.RemoteException;
    public java.lang.String testService() throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.Person signIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public boolean adminSignIn(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String addCourse(java.lang.String sjsuid, java.lang.String courseNumber, java.lang.String courseName, java.lang.String section, java.lang.String day, java.lang.String time, java.lang.String location) throws java.rmi.RemoteException;
    public java.lang.String dropCourse(java.lang.String sjsu_id, java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String registerUser(edu.cmpe273.univserver.beans.Person person) throws java.rmi.RemoteException;
    public edu.cmpe273.univserver.beans.Course getCourseDetails(edu.cmpe273.univserver.beans.Course course) throws java.rmi.RemoteException;
    public java.lang.String editCourseAssignedToAProfessor() throws java.rmi.RemoteException;
}
