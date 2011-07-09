/**
 * TelephonyHuntingGenericScreenStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyHuntingGenericScreenStruct  implements java.io.Serializable {
    private java.lang.String status;

    private java.lang.String timeEnd;

    private java.lang.String timeStart;

    private java.lang.String dayType;

    private java.lang.String forwardPolicyIndex;

    public TelephonyHuntingGenericScreenStruct() {
    }

    public TelephonyHuntingGenericScreenStruct(
           java.lang.String status,
           java.lang.String timeEnd,
           java.lang.String timeStart,
           java.lang.String dayType,
           java.lang.String forwardPolicyIndex) {
           this.status = status;
           this.timeEnd = timeEnd;
           this.timeStart = timeStart;
           this.dayType = dayType;
           this.forwardPolicyIndex = forwardPolicyIndex;
    }


    /**
     * Gets the status value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the timeEnd value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @return timeEnd
     */
    public java.lang.String getTimeEnd() {
        return timeEnd;
    }


    /**
     * Sets the timeEnd value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @param timeEnd
     */
    public void setTimeEnd(java.lang.String timeEnd) {
        this.timeEnd = timeEnd;
    }


    /**
     * Gets the timeStart value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @return timeStart
     */
    public java.lang.String getTimeStart() {
        return timeStart;
    }


    /**
     * Sets the timeStart value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @param timeStart
     */
    public void setTimeStart(java.lang.String timeStart) {
        this.timeStart = timeStart;
    }


    /**
     * Gets the dayType value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @return dayType
     */
    public java.lang.String getDayType() {
        return dayType;
    }


    /**
     * Sets the dayType value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @param dayType
     */
    public void setDayType(java.lang.String dayType) {
        this.dayType = dayType;
    }


    /**
     * Gets the forwardPolicyIndex value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @return forwardPolicyIndex
     */
    public java.lang.String getForwardPolicyIndex() {
        return forwardPolicyIndex;
    }


    /**
     * Sets the forwardPolicyIndex value for this TelephonyHuntingGenericScreenStruct.
     * 
     * @param forwardPolicyIndex
     */
    public void setForwardPolicyIndex(java.lang.String forwardPolicyIndex) {
        this.forwardPolicyIndex = forwardPolicyIndex;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyHuntingGenericScreenStruct)) return false;
        TelephonyHuntingGenericScreenStruct other = (TelephonyHuntingGenericScreenStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.timeEnd==null && other.getTimeEnd()==null) || 
             (this.timeEnd!=null &&
              this.timeEnd.equals(other.getTimeEnd()))) &&
            ((this.timeStart==null && other.getTimeStart()==null) || 
             (this.timeStart!=null &&
              this.timeStart.equals(other.getTimeStart()))) &&
            ((this.dayType==null && other.getDayType()==null) || 
             (this.dayType!=null &&
              this.dayType.equals(other.getDayType()))) &&
            ((this.forwardPolicyIndex==null && other.getForwardPolicyIndex()==null) || 
             (this.forwardPolicyIndex!=null &&
              this.forwardPolicyIndex.equals(other.getForwardPolicyIndex())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTimeEnd() != null) {
            _hashCode += getTimeEnd().hashCode();
        }
        if (getTimeStart() != null) {
            _hashCode += getTimeStart().hashCode();
        }
        if (getDayType() != null) {
            _hashCode += getDayType().hashCode();
        }
        if (getForwardPolicyIndex() != null) {
            _hashCode += getForwardPolicyIndex().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyHuntingGenericScreenStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyHuntingGenericScreenStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dayType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardPolicyIndex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardPolicyIndex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
