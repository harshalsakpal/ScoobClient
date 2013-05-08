/**
 * Course.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.cmpe273.univserver.beans;

public class Course  implements java.io.Serializable {
    private java.lang.String courseDesc;

    private java.lang.String courseName;

    private java.lang.String courseNumber;

    private java.lang.String credits;

    private java.lang.String day;

    private java.lang.String department;

    private java.lang.String location;

    private java.lang.String section;

    private java.lang.String time;

    public Course() {
    }

    public Course(
           java.lang.String courseDesc,
           java.lang.String courseName,
           java.lang.String courseNumber,
           java.lang.String credits,
           java.lang.String day,
           java.lang.String department,
           java.lang.String location,
           java.lang.String section,
           java.lang.String time) {
           this.courseDesc = courseDesc;
           this.courseName = courseName;
           this.courseNumber = courseNumber;
           this.credits = credits;
           this.day = day;
           this.department = department;
           this.location = location;
           this.section = section;
           this.time = time;
    }


    /**
     * Gets the courseDesc value for this Course.
     * 
     * @return courseDesc
     */
    public java.lang.String getCourseDesc() {
        return courseDesc;
    }


    /**
     * Sets the courseDesc value for this Course.
     * 
     * @param courseDesc
     */
    public void setCourseDesc(java.lang.String courseDesc) {
        this.courseDesc = courseDesc;
    }


    /**
     * Gets the courseName value for this Course.
     * 
     * @return courseName
     */
    public java.lang.String getCourseName() {
        return courseName;
    }


    /**
     * Sets the courseName value for this Course.
     * 
     * @param courseName
     */
    public void setCourseName(java.lang.String courseName) {
        this.courseName = courseName;
    }


    /**
     * Gets the courseNumber value for this Course.
     * 
     * @return courseNumber
     */
    public java.lang.String getCourseNumber() {
        return courseNumber;
    }


    /**
     * Sets the courseNumber value for this Course.
     * 
     * @param courseNumber
     */
    public void setCourseNumber(java.lang.String courseNumber) {
        this.courseNumber = courseNumber;
    }


    /**
     * Gets the credits value for this Course.
     * 
     * @return credits
     */
    public java.lang.String getCredits() {
        return credits;
    }


    /**
     * Sets the credits value for this Course.
     * 
     * @param credits
     */
    public void setCredits(java.lang.String credits) {
        this.credits = credits;
    }


    /**
     * Gets the day value for this Course.
     * 
     * @return day
     */
    public java.lang.String getDay() {
        return day;
    }


    /**
     * Sets the day value for this Course.
     * 
     * @param day
     */
    public void setDay(java.lang.String day) {
        this.day = day;
    }


    /**
     * Gets the department value for this Course.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this Course.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the location value for this Course.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Course.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the section value for this Course.
     * 
     * @return section
     */
    public java.lang.String getSection() {
        return section;
    }


    /**
     * Sets the section value for this Course.
     * 
     * @param section
     */
    public void setSection(java.lang.String section) {
        this.section = section;
    }


    /**
     * Gets the time value for this Course.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this Course.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Course)) return false;
        Course other = (Course) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courseDesc==null && other.getCourseDesc()==null) || 
             (this.courseDesc!=null &&
              this.courseDesc.equals(other.getCourseDesc()))) &&
            ((this.courseName==null && other.getCourseName()==null) || 
             (this.courseName!=null &&
              this.courseName.equals(other.getCourseName()))) &&
            ((this.courseNumber==null && other.getCourseNumber()==null) || 
             (this.courseNumber!=null &&
              this.courseNumber.equals(other.getCourseNumber()))) &&
            ((this.credits==null && other.getCredits()==null) || 
             (this.credits!=null &&
              this.credits.equals(other.getCredits()))) &&
            ((this.day==null && other.getDay()==null) || 
             (this.day!=null &&
              this.day.equals(other.getDay()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.section==null && other.getSection()==null) || 
             (this.section!=null &&
              this.section.equals(other.getSection()))) &&
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
        if (getCourseDesc() != null) {
            _hashCode += getCourseDesc().hashCode();
        }
        if (getCourseName() != null) {
            _hashCode += getCourseName().hashCode();
        }
        if (getCourseNumber() != null) {
            _hashCode += getCourseNumber().hashCode();
        }
        if (getCredits() != null) {
            _hashCode += getCredits().hashCode();
        }
        if (getDay() != null) {
            _hashCode += getDay().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSection() != null) {
            _hashCode += getSection().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Course.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "Course"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseName"));
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
        elemField.setFieldName("credits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "credits"));
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
