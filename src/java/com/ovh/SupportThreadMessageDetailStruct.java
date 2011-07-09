/**
 * SupportThreadMessageDetailStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class SupportThreadMessageDetailStruct  implements java.io.Serializable {
    private int id;

    private java.lang.String date;

    private int unread;

    private java.lang.String type;

    private java.lang.String reportReason;

    public SupportThreadMessageDetailStruct() {
    }

    public SupportThreadMessageDetailStruct(
           int id,
           java.lang.String date,
           int unread,
           java.lang.String type,
           java.lang.String reportReason) {
           this.id = id;
           this.date = date;
           this.unread = unread;
           this.type = type;
           this.reportReason = reportReason;
    }


    /**
     * Gets the id value for this SupportThreadMessageDetailStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SupportThreadMessageDetailStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the date value for this SupportThreadMessageDetailStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this SupportThreadMessageDetailStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the unread value for this SupportThreadMessageDetailStruct.
     * 
     * @return unread
     */
    public int getUnread() {
        return unread;
    }


    /**
     * Sets the unread value for this SupportThreadMessageDetailStruct.
     * 
     * @param unread
     */
    public void setUnread(int unread) {
        this.unread = unread;
    }


    /**
     * Gets the type value for this SupportThreadMessageDetailStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SupportThreadMessageDetailStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the reportReason value for this SupportThreadMessageDetailStruct.
     * 
     * @return reportReason
     */
    public java.lang.String getReportReason() {
        return reportReason;
    }


    /**
     * Sets the reportReason value for this SupportThreadMessageDetailStruct.
     * 
     * @param reportReason
     */
    public void setReportReason(java.lang.String reportReason) {
        this.reportReason = reportReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportThreadMessageDetailStruct)) return false;
        SupportThreadMessageDetailStruct other = (SupportThreadMessageDetailStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.unread == other.getUnread() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.reportReason==null && other.getReportReason()==null) || 
             (this.reportReason!=null &&
              this.reportReason.equals(other.getReportReason())));
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += getUnread();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getReportReason() != null) {
            _hashCode += getReportReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportThreadMessageDetailStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "supportThreadMessageDetailStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unread");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportReason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportReason"));
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
