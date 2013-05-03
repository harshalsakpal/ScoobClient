/**
 * UniversityServerServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.cmpe273.univserver.service;

public interface UniversityServerServiceService extends javax.xml.rpc.Service {
    public java.lang.String getUniversityServerServiceAddress();

    public edu.cmpe273.univserver.service.UniversityServerService getUniversityServerService() throws javax.xml.rpc.ServiceException;

    public edu.cmpe273.univserver.service.UniversityServerService getUniversityServerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
