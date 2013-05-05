<%@page import="edu.cmpe273.univserver.service.UniversityServerServiceProxy"%>

<%


UniversityServerServiceProxy proxy = new UniversityServerServiceProxy();
proxy.setEndpoint("http://localhost:8080/UniversityServer/services/UniversityServerService");
%>