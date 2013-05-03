/**
 * UniversityServerServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.cmpe273.univserver.service;

public class UniversityServerServiceServiceLocator extends org.apache.axis.client.Service implements edu.cmpe273.univserver.service.UniversityServerServiceService {

    public UniversityServerServiceServiceLocator() {
    }


    public UniversityServerServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UniversityServerServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UniversityServerService
    private java.lang.String UniversityServerService_address = "http://localhost:8080/UniversityServer/services/UniversityServerService";

    public java.lang.String getUniversityServerServiceAddress() {
        return UniversityServerService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UniversityServerServiceWSDDServiceName = "UniversityServerService";

    public java.lang.String getUniversityServerServiceWSDDServiceName() {
        return UniversityServerServiceWSDDServiceName;
    }

    public void setUniversityServerServiceWSDDServiceName(java.lang.String name) {
        UniversityServerServiceWSDDServiceName = name;
    }

    public edu.cmpe273.univserver.service.UniversityServerService getUniversityServerService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UniversityServerService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUniversityServerService(endpoint);
    }

    public edu.cmpe273.univserver.service.UniversityServerService getUniversityServerService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            edu.cmpe273.univserver.service.UniversityServerServiceSoapBindingStub _stub = new edu.cmpe273.univserver.service.UniversityServerServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUniversityServerServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUniversityServerServiceEndpointAddress(java.lang.String address) {
        UniversityServerService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (edu.cmpe273.univserver.service.UniversityServerService.class.isAssignableFrom(serviceEndpointInterface)) {
                edu.cmpe273.univserver.service.UniversityServerServiceSoapBindingStub _stub = new edu.cmpe273.univserver.service.UniversityServerServiceSoapBindingStub(new java.net.URL(UniversityServerService_address), this);
                _stub.setPortName(getUniversityServerServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UniversityServerService".equals(inputPortName)) {
            return getUniversityServerService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.univserver.cmpe273.edu", "UniversityServerServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.univserver.cmpe273.edu", "UniversityServerService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UniversityServerService".equals(portName)) {
            setUniversityServerServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
