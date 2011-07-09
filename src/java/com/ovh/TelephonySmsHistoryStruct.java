/**
 * TelephonySmsHistoryStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonySmsHistoryStruct  implements java.io.Serializable {
    private int smsId;

    private java.lang.String numberFrom;

    private java.lang.String numberTo;

    private java.lang.String status;

    private java.lang.String date;

    private java.lang.String message;

    private java.lang.String text;

    private java.lang.String user;

    private java.lang.String tag;

    public TelephonySmsHistoryStruct() {
    }

    public TelephonySmsHistoryStruct(
           int smsId,
           java.lang.String numberFrom,
           java.lang.String numberTo,
           java.lang.String status,
           java.lang.String date,
           java.lang.String message,
           java.lang.String text,
           java.lang.String user,
           java.lang.String tag) {
           this.smsId = smsId;
           this.numberFrom = numberFrom;
           this.numberTo = numberTo;
           this.status = status;
           this.date = date;
           this.message = message;
           this.text = text;
           this.user = user;
           this.tag = tag;
    }


    /**
     * Gets the smsId value for this TelephonySmsHistoryStruct.
     * 
     * @return smsId
     */
    public int getSmsId() {
        return smsId;
    }


    /**
     * Sets the smsId value for this TelephonySmsHistoryStruct.
     * 
     * @param smsId
     */
    public void setSmsId(int smsId) {
        this.smsId = smsId;
    }


    /**
     * Gets the numberFrom value for this TelephonySmsHistoryStruct.
     * 
     * @return numberFrom
     */
    public java.lang.String getNumberFrom() {
        return numberFrom;
    }


    /**
     * Sets the numberFrom value for this TelephonySmsHistoryStruct.
     * 
     * @param numberFrom
     */
    public void setNumberFrom(java.lang.String numberFrom) {
        this.numberFrom = numberFrom;
    }


    /**
     * Gets the numberTo value for this TelephonySmsHistoryStruct.
     * 
     * @return numberTo
     */
    public java.lang.String getNumberTo() {
        return numberTo;
    }


    /**
     * Sets the numberTo value for this TelephonySmsHistoryStruct.
     * 
     * @param numberTo
     */
    public void setNumberTo(java.lang.String numberTo) {
        this.numberTo = numberTo;
    }


    /**
     * Gets the status value for this TelephonySmsHistoryStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TelephonySmsHistoryStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the date value for this TelephonySmsHistoryStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this TelephonySmsHistoryStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the message value for this TelephonySmsHistoryStruct.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TelephonySmsHistoryStruct.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the text value for this TelephonySmsHistoryStruct.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this TelephonySmsHistoryStruct.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the user value for this TelephonySmsHistoryStruct.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this TelephonySmsHistoryStruct.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }


    /**
     * Gets the tag value for this TelephonySmsHistoryStruct.
     * 
     * @return tag
     */
    public java.lang.String getTag() {
        return tag;
    }


    /**
     * Sets the tag value for this TelephonySmsHistoryStruct.
     * 
     * @param tag
     */
    public void setTag(java.lang.String tag) {
        this.tag = tag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonySmsHistoryStruct)) return false;
        TelephonySmsHistoryStruct other = (TelephonySmsHistoryStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.smsId == other.getSmsId() &&
            ((this.numberFrom==null && other.getNumberFrom()==null) || 
             (this.numberFrom!=null &&
              this.numberFrom.equals(other.getNumberFrom()))) &&
            ((this.numberTo==null && other.getNumberTo()==null) || 
             (this.numberTo!=null &&
              this.numberTo.equals(other.getNumberTo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser()))) &&
            ((this.tag==null && other.getTag()==null) || 
             (this.tag!=null &&
              this.tag.equals(other.getTag())));
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
        _hashCode += getSmsId();
        if (getNumberFrom() != null) {
            _hashCode += getNumberFrom().hashCode();
        }
        if (getNumberTo() != null) {
            _hashCode += getNumberTo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        if (getTag() != null) {
            _hashCode += getTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonySmsHistoryStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonySmsHistoryStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smsId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smsId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tag"));
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
