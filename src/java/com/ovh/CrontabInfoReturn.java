/**
 * CrontabInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class CrontabInfoReturn  implements java.io.Serializable {
    private int id;

    private java.lang.String path;

    private java.lang.String desc;

    private java.lang.String email;

    private boolean enabled;

    private java.lang.String programLanguage;

    private java.lang.String weekDay;

    private int[] days;

    private int[] hours;

    public CrontabInfoReturn() {
    }

    public CrontabInfoReturn(
           int id,
           java.lang.String path,
           java.lang.String desc,
           java.lang.String email,
           boolean enabled,
           java.lang.String programLanguage,
           java.lang.String weekDay,
           int[] days,
           int[] hours) {
           this.id = id;
           this.path = path;
           this.desc = desc;
           this.email = email;
           this.enabled = enabled;
           this.programLanguage = programLanguage;
           this.weekDay = weekDay;
           this.days = days;
           this.hours = hours;
    }


    /**
     * Gets the id value for this CrontabInfoReturn.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CrontabInfoReturn.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the path value for this CrontabInfoReturn.
     * 
     * @return path
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this CrontabInfoReturn.
     * 
     * @param path
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the desc value for this CrontabInfoReturn.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this CrontabInfoReturn.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the email value for this CrontabInfoReturn.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CrontabInfoReturn.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the enabled value for this CrontabInfoReturn.
     * 
     * @return enabled
     */
    public boolean isEnabled() {
        return enabled;
    }


    /**
     * Sets the enabled value for this CrontabInfoReturn.
     * 
     * @param enabled
     */
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }


    /**
     * Gets the programLanguage value for this CrontabInfoReturn.
     * 
     * @return programLanguage
     */
    public java.lang.String getProgramLanguage() {
        return programLanguage;
    }


    /**
     * Sets the programLanguage value for this CrontabInfoReturn.
     * 
     * @param programLanguage
     */
    public void setProgramLanguage(java.lang.String programLanguage) {
        this.programLanguage = programLanguage;
    }


    /**
     * Gets the weekDay value for this CrontabInfoReturn.
     * 
     * @return weekDay
     */
    public java.lang.String getWeekDay() {
        return weekDay;
    }


    /**
     * Sets the weekDay value for this CrontabInfoReturn.
     * 
     * @param weekDay
     */
    public void setWeekDay(java.lang.String weekDay) {
        this.weekDay = weekDay;
    }


    /**
     * Gets the days value for this CrontabInfoReturn.
     * 
     * @return days
     */
    public int[] getDays() {
        return days;
    }


    /**
     * Sets the days value for this CrontabInfoReturn.
     * 
     * @param days
     */
    public void setDays(int[] days) {
        this.days = days;
    }


    /**
     * Gets the hours value for this CrontabInfoReturn.
     * 
     * @return hours
     */
    public int[] getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this CrontabInfoReturn.
     * 
     * @param hours
     */
    public void setHours(int[] hours) {
        this.hours = hours;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CrontabInfoReturn)) return false;
        CrontabInfoReturn other = (CrontabInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.enabled == other.isEnabled() &&
            ((this.programLanguage==null && other.getProgramLanguage()==null) || 
             (this.programLanguage!=null &&
              this.programLanguage.equals(other.getProgramLanguage()))) &&
            ((this.weekDay==null && other.getWeekDay()==null) || 
             (this.weekDay!=null &&
              this.weekDay.equals(other.getWeekDay()))) &&
            ((this.days==null && other.getDays()==null) || 
             (this.days!=null &&
              java.util.Arrays.equals(this.days, other.getDays()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              java.util.Arrays.equals(this.hours, other.getHours())));
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
        _hashCode += getId();
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += (isEnabled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getProgramLanguage() != null) {
            _hashCode += getProgramLanguage().hashCode();
        }
        if (getWeekDay() != null) {
            _hashCode += getWeekDay().hashCode();
        }
        if (getDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHours(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CrontabInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "crontabInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("programLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "programLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weekDay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weekDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("days");
        elemField.setXmlName(new javax.xml.namespace.QName("", "days"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
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
