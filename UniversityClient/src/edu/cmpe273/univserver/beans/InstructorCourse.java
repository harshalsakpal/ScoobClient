/**
 * InstructorCourse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.cmpe273.univserver.beans;

public class InstructorCourse  implements java.io.Serializable {
    private java.lang.String availableSeats;

    private java.lang.String courseNumber;

    private java.lang.String day;

    private java.lang.String department;

    private java.lang.String filledSeats;

    private java.lang.String location;

    private java.lang.String section;

    private java.lang.String sjsuid;

    private java.lang.String time;

    public InstructorCourse() {
    }

    public InstructorCourse(
           java.lang.String availableSeats,
           java.lang.String courseNumber,
           java.lang.String day,
           java.lang.String department,
           java.lang.String filledSeats,
           java.lang.String location,
           java.lang.String section,
           java.lang.String sjsuid,
           java.lang.String time) {
           this.availableSeats = availableSeats;
           this.courseNumber = courseNumber;
           this.day = day;
           this.department = department;
           this.filledSeats = filledSeats;
           this.location = location;
           this.section = section;
           this.sjsuid = sjsuid;
           this.time = time;
    }


    /**
     * Gets the availableSeats value for this InstructorCourse.
     * 
     * @return availableSeats
     */
    public java.lang.String getAvailableSeats() {
        return availableSeats;
    }


    /**
     * Sets the availableSeats value for this InstructorCourse.
     * 
     * @param availableSeats
     */
    public void setAvailableSeats(java.lang.String availableSeats) {
        this.availableSeats = availableSeats;
    }


    /**
     * Gets the courseNumber value for this InstructorCourse.
     * 
     * @return courseNumber
     */
    public java.lang.String getCourseNumber() {
        return courseNumber;
    }


    /**
     * Sets the courseNumber value for this InstructorCourse.
     * 
     * @param courseNumber
     */
    public void setCourseNumber(java.lang.String courseNumber) {
        this.courseNumber = courseNumber;
    }


    /**
     * Gets the day value for this InstructorCourse.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this InstructorCourse.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the department value for this InstructorCourse.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this InstructorCourse.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the filledSeats value for this InstructorCourse.
     * 
     * @return filledSeats
     */
    public java.lang.String getFilledSeats() {
        return filledSeats;
    }


    /**
     * Sets the filledSeats value for this InstructorCourse.
     * 
     * @param filledSeats
     */
    public void setFilledSeats(java.lang.String filledSeats) {
        this.filledSeats = filledSeats;
    }


    /**
     * Gets the location value for this InstructorCourse.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InstructorCourse.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the section value for this InstructorCourse.
     * 
     * @return section
     */
    public java.lang.String getSection() {
        return section;
    }


    /**
     * Sets the section value for this InstructorCourse.
     * 
     * @param section
     */
    public void setSection(java.lang.String section) {
        this.section = section;
    }


    /**
     * Gets the sjsuid value for this InstructorCourse.
     * 
     * @return sjsuid
     */
    public java.lang.String getSjsuid() {
        return sjsuid;
    }


    /**
     * Sets the sjsuid value for this InstructorCourse.
     * 
     * @param sjsuid
     */
    public void setSjsuid(java.lang.String sjsuid) {
        this.sjsuid = sjsuid;
    }


    /**
     * Gets the time value for this InstructorCourse.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this InstructorCourse.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InstructorCourse)) return false;
        InstructorCourse other = (InstructorCourse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availableSeats==null && other.getAvailableSeats()==null) || 
             (this.availableSeats!=null &&
              this.availableSeats.equals(other.getAvailableSeats()))) &&
            ((this.courseNumber==null && other.getCourseNumber()==null) || 
             (this.courseNumber!=null &&
              this.courseNumber.equals(other.getCourseNumber()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.filledSeats==null && other.getFilledSeats()==null) || 
             (this.filledSeats!=null &&
              this.filledSeats.equals(other.getFilledSeats()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
            ((this.sjsuid==null && other.getSjsuid()==null) || 
             (this.sjsuid!=null &&
              this.sjsuid.equals(other.getSjsuid()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAvailableSeats() != null) {
            _hashCode += getAvailableSeats().hashCode();
        }
        if (getCourseNumber() != null) {
            _hashCode += getCourseNumber().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getFilledSeats() != null) {
            _hashCode += getFilledSeats().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        if (getSjsuid() != null) {
            _hashCode += getSjsuid().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InstructorCourse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "InstructorCourse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "availableSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filledSeats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "filledSeats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("section");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "section"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sjsuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "sjsuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
