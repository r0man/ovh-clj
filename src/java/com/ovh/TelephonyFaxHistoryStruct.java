/**
 * TelephonyFaxHistoryStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyFaxHistoryStruct  implements java.io.Serializable {
    private int id;

    private java.lang.String relatedNumber;

    private int jobid;

    private java.lang.String jobtag;

    private java.lang.String sender;

    private int pages;

    private java.lang.String quality;

    private java.lang.String callTime;

    private java.lang.String date;

    private java.lang.String state;

    public TelephonyFaxHistoryStruct() {
    }

    public TelephonyFaxHistoryStruct(
           int id,
           java.lang.String relatedNumber,
           int jobid,
           java.lang.String jobtag,
           java.lang.String sender,
           int pages,
           java.lang.String quality,
           java.lang.String callTime,
           java.lang.String date,
           java.lang.String state) {
           this.id = id;
           this.relatedNumber = relatedNumber;
           this.jobid = jobid;
           this.jobtag = jobtag;
           this.sender = sender;
           this.pages = pages;
           this.quality = quality;
           this.callTime = callTime;
           this.date = date;
           this.state = state;
    }


    /**
     * Gets the id value for this TelephonyFaxHistoryStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this TelephonyFaxHistoryStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the relatedNumber value for this TelephonyFaxHistoryStruct.
     * 
     * @return relatedNumber
     */
    public java.lang.String getRelatedNumber() {
        return relatedNumber;
    }


    /**
     * Sets the relatedNumber value for this TelephonyFaxHistoryStruct.
     * 
     * @param relatedNumber
     */
    public void setRelatedNumber(java.lang.String relatedNumber) {
        this.relatedNumber = relatedNumber;
    }


    /**
     * Gets the jobid value for this TelephonyFaxHistoryStruct.
     * 
     * @return jobid
     */
    public int getJobid() {
        return jobid;
    }


    /**
     * Sets the jobid value for this TelephonyFaxHistoryStruct.
     * 
     * @param jobid
     */
    public void setJobid(int jobid) {
        this.jobid = jobid;
    }


    /**
     * Gets the jobtag value for this TelephonyFaxHistoryStruct.
     * 
     * @return jobtag
     */
    public java.lang.String getJobtag() {
        return jobtag;
    }


    /**
     * Sets the jobtag value for this TelephonyFaxHistoryStruct.
     * 
     * @param jobtag
     */
    public void setJobtag(java.lang.String jobtag) {
        this.jobtag = jobtag;
    }


    /**
     * Gets the sender value for this TelephonyFaxHistoryStruct.
     * 
     * @return sender
     */
    public java.lang.String getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this TelephonyFaxHistoryStruct.
     * 
     * @param sender
     */
    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }


    /**
     * Gets the pages value for this TelephonyFaxHistoryStruct.
     * 
     * @return pages
     */
    public int getPages() {
        return pages;
    }


    /**
     * Sets the pages value for this TelephonyFaxHistoryStruct.
     * 
     * @param pages
     */
    public void setPages(int pages) {
        this.pages = pages;
    }


    /**
     * Gets the quality value for this TelephonyFaxHistoryStruct.
     * 
     * @return quality
     */
    public java.lang.String getQuality() {
        return quality;
    }


    /**
     * Sets the quality value for this TelephonyFaxHistoryStruct.
     * 
     * @param quality
     */
    public void setQuality(java.lang.String quality) {
        this.quality = quality;
    }


    /**
     * Gets the callTime value for this TelephonyFaxHistoryStruct.
     * 
     * @return callTime
     */
    public java.lang.String getCallTime() {
        return callTime;
    }


    /**
     * Sets the callTime value for this TelephonyFaxHistoryStruct.
     * 
     * @param callTime
     */
    public void setCallTime(java.lang.String callTime) {
        this.callTime = callTime;
    }


    /**
     * Gets the date value for this TelephonyFaxHistoryStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this TelephonyFaxHistoryStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the state value for this TelephonyFaxHistoryStruct.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this TelephonyFaxHistoryStruct.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyFaxHistoryStruct)) return false;
        TelephonyFaxHistoryStruct other = (TelephonyFaxHistoryStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.relatedNumber==null && other.getRelatedNumber()==null) || 
             (this.relatedNumber!=null &&
              this.relatedNumber.equals(other.getRelatedNumber()))) &&
            this.jobid == other.getJobid() &&
            ((this.jobtag==null && other.getJobtag()==null) || 
             (this.jobtag!=null &&
              this.jobtag.equals(other.getJobtag()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            this.pages == other.getPages() &&
            ((this.quality==null && other.getQuality()==null) || 
             (this.quality!=null &&
              this.quality.equals(other.getQuality()))) &&
            ((this.callTime==null && other.getCallTime()==null) || 
             (this.callTime!=null &&
              this.callTime.equals(other.getCallTime()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getRelatedNumber() != null) {
            _hashCode += getRelatedNumber().hashCode();
        }
        _hashCode += getJobid();
        if (getJobtag() != null) {
            _hashCode += getJobtag().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        _hashCode += getPages();
        if (getQuality() != null) {
            _hashCode += getQuality().hashCode();
        }
        if (getCallTime() != null) {
            _hashCode += getCallTime().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyFaxHistoryStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxHistoryStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relatedNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobtag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jobtag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quality");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callTime"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
