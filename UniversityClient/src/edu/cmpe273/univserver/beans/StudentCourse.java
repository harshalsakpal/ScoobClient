/**
 * StudentCourse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package edu.cmpe273.univserver.beans;

public class StudentCourse  implements java.io.Serializable {
    private java.lang.String courseDay;

    private java.lang.String courseLocation;

    private java.lang.String courseNumber;

    private java.lang.String courseProfessor;

    private java.lang.String courseSection;

    private java.lang.String courseTime;

    private java.lang.String sjsuid;

    public StudentCourse() {
    }

    public StudentCourse(
           java.lang.String courseDay,
           java.lang.String courseLocation,
           java.lang.String courseNumber,
           java.lang.String courseProfessor,
           java.lang.String courseSection,
           java.lang.String courseTime,
           java.lang.String sjsuid) {
           this.courseDay = courseDay;
           this.courseLocation = courseLocation;
           this.courseNumber = courseNumber;
           this.courseProfessor = courseProfessor;
           this.courseSection = courseSection;
           this.courseTime = courseTime;
           this.sjsuid = sjsuid;
    }


    /**
     * Gets the courseDay value for this StudentCourse.
     * 
     * @return courseDay
     */
    public java.lang.String getCourseDay() {
        return courseDay;
    }


    /**
     * Sets the courseDay value for this StudentCourse.
     * 
     * @param courseDay
     */
    public void setCourseDay(java.lang.String courseDay) {
        this.courseDay = courseDay;
    }


    /**
     * Gets the courseLocation value for this StudentCourse.
     * 
     * @return courseLocation
     */
    public java.lang.String getCourseLocation() {
        return courseLocation;
    }


    /**
     * Sets the courseLocation value for this StudentCourse.
     * 
     * @param courseLocation
     */
    public void setCourseLocation(java.lang.String courseLocation) {
        this.courseLocation = courseLocation;
    }


    /**
     * Gets the courseNumber value for this StudentCourse.
     * 
     * @return courseNumber
     */
    public java.lang.String getCourseNumber() {
        return courseNumber;
    }


    /**
     * Sets the courseNumber value for this StudentCourse.
     * 
     * @param courseNumber
     */
    public void setCourseNumber(java.lang.String courseNumber) {
        this.courseNumber = courseNumber;
    }


    /**
     * Gets the courseProfessor value for this StudentCourse.
     * 
     * @return courseProfessor
     */
    public java.lang.String getCourseProfessor() {
        return courseProfessor;
    }


    /**
     * Sets the courseProfessor value for this StudentCourse.
     * 
     * @param courseProfessor
     */
    public void setCourseProfessor(java.lang.String courseProfessor) {
        this.courseProfessor = courseProfessor;
    }


    /**
     * Gets the courseSection value for this StudentCourse.
     * 
     * @return courseSection
     */
    public java.lang.String getCourseSection() {
        return courseSection;
    }


    /**
     * Sets the courseSection value for this StudentCourse.
     * 
     * @param courseSection
     */
    public void setCourseSection(java.lang.String courseSection) {
        this.courseSection = courseSection;
    }


    /**
     * Gets the courseTime value for this StudentCourse.
     * 
     * @return courseTime
     */
    public java.lang.String getCourseTime() {
        return courseTime;
    }


    /**
     * Sets the courseTime value for this StudentCourse.
     * 
     * @param courseTime
     */
    public void setCourseTime(java.lang.String courseTime) {
        this.courseTime = courseTime;
    }


    /**
     * Gets the sjsuid value for this StudentCourse.
     * 
     * @return sjsuid
     */
    public java.lang.String getSjsuid() {
        return sjsuid;
    }


    /**
     * Sets the sjsuid value for this StudentCourse.
     * 
     * @param sjsuid
     */
    public void setSjsuid(java.lang.String sjsuid) {
        this.sjsuid = sjsuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StudentCourse)) return false;
        StudentCourse other = (StudentCourse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.courseDay==null && other.getCourseDay()==null) || 
             (this.courseDay!=null &&
              this.courseDay.equals(other.getCourseDay()))) &&
            ((this.courseLocation==null && other.getCourseLocation()==null) || 
             (this.courseLocation!=null &&
              this.courseLocation.equals(other.getCourseLocation()))) &&
            ((this.courseNumber==null && other.getCourseNumber()==null) || 
             (this.courseNumber!=null &&
              this.courseNumber.equals(other.getCourseNumber()))) &&
            ((this.courseProfessor==null && other.getCourseProfessor()==null) || 
             (this.courseProfessor!=null &&
              this.courseProfessor.equals(other.getCourseProfessor()))) &&
            ((this.courseSection==null && other.getCourseSection()==null) || 
             (this.courseSection!=null &&
              this.courseSection.equals(other.getCourseSection()))) &&
            ((this.courseTime==null && other.getCourseTime()==null) || 
             (this.courseTime!=null &&
              this.courseTime.equals(other.getCourseTime()))) &&
            ((this.sjsuid==null && other.getSjsuid()==null) || 
             (this.sjsuid!=null &&
              this.sjsuid.equals(other.getSjsuid())));
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
        if (getCourseDay() != null) {
            _hashCode += getCourseDay().hashCode();
        }
        if (getCourseLocation() != null) {
            _hashCode += getCourseLocation().hashCode();
        }
        if (getCourseNumber() != null) {
            _hashCode += getCourseNumber().hashCode();
        }
        if (getCourseProfessor() != null) {
            _hashCode += getCourseProfessor().hashCode();
        }
        if (getCourseSection() != null) {
            _hashCode += getCourseSection().hashCode();
        }
        if (getCourseTime() != null) {
            _hashCode += getCourseTime().hashCode();
        }
        if (getSjsuid() != null) {
            _hashCode += getSjsuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StudentCourse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "StudentCourse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseLocation"));
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
        elemField.setFieldName("courseProfessor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseProfessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseSection");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseSection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("courseTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "courseTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sjsuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans.univserver.cmpe273.edu", "sjsuid"));
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
