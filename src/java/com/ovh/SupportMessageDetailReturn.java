/**
 * SupportMessageDetailReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class SupportMessageDetailReturn  implements java.io.Serializable {
    private int id;

    private int thread;

    private boolean unreadThread;

    private java.lang.String fromEmail;

    private java.lang.String dateSent;

    private java.lang.String subject;

    private java.lang.String body;

    private java.lang.String reportReason;

    public SupportMessageDetailReturn() {
    }

    public SupportMessageDetailReturn(
           int id,
           int thread,
           boolean unreadThread,
           java.lang.String fromEmail,
           java.lang.String dateSent,
           java.lang.String subject,
           java.lang.String body,
           java.lang.String reportReason) {
           this.id = id;
           this.thread = thread;
           this.unreadThread = unreadThread;
           this.fromEmail = fromEmail;
           this.dateSent = dateSent;
           this.subject = subject;
           this.body = body;
           this.reportReason = reportReason;
    }


    /**
     * Gets the id value for this SupportMessageDetailReturn.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this SupportMessageDetailReturn.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the thread value for this SupportMessageDetailReturn.
     * 
     * @return thread
     */
    public int getThread() {
        return thread;
    }


    /**
     * Sets the thread value for this SupportMessageDetailReturn.
     * 
     * @param thread
     */
    public void setThread(int thread) {
        this.thread = thread;
    }


    /**
     * Gets the unreadThread value for this SupportMessageDetailReturn.
     * 
     * @return unreadThread
     */
    public boolean isUnreadThread() {
        return unreadThread;
    }


    /**
     * Sets the unreadThread value for this SupportMessageDetailReturn.
     * 
     * @param unreadThread
     */
    public void setUnreadThread(boolean unreadThread) {
        this.unreadThread = unreadThread;
    }


    /**
     * Gets the fromEmail value for this SupportMessageDetailReturn.
     * 
     * @return fromEmail
     */
    public java.lang.String getFromEmail() {
        return fromEmail;
    }


    /**
     * Sets the fromEmail value for this SupportMessageDetailReturn.
     * 
     * @param fromEmail
     */
    public void setFromEmail(java.lang.String fromEmail) {
        this.fromEmail = fromEmail;
    }


    /**
     * Gets the dateSent value for this SupportMessageDetailReturn.
     * 
     * @return dateSent
     */
    public java.lang.String getDateSent() {
        return dateSent;
    }


    /**
     * Sets the dateSent value for this SupportMessageDetailReturn.
     * 
     * @param dateSent
     */
    public void setDateSent(java.lang.String dateSent) {
        this.dateSent = dateSent;
    }


    /**
     * Gets the subject value for this SupportMessageDetailReturn.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this SupportMessageDetailReturn.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the body value for this SupportMessageDetailReturn.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this SupportMessageDetailReturn.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the reportReason value for this SupportMessageDetailReturn.
     * 
     * @return reportReason
     */
    public java.lang.String getReportReason() {
        return reportReason;
    }


    /**
     * Sets the reportReason value for this SupportMessageDetailReturn.
     * 
     * @param reportReason
     */
    public void setReportReason(java.lang.String reportReason) {
        this.reportReason = reportReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportMessageDetailReturn)) return false;
        SupportMessageDetailReturn other = (SupportMessageDetailReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.thread == other.getThread() &&
            this.unreadThread == other.isUnreadThread() &&
            ((this.fromEmail==null && other.getFromEmail()==null) || 
             (this.fromEmail!=null &&
              this.fromEmail.equals(other.getFromEmail()))) &&
            ((this.dateSent==null && other.getDateSent()==null) || 
             (this.dateSent!=null &&
              this.dateSent.equals(other.getDateSent()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
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
        _hashCode += getThread();
        _hashCode += (isUnreadThread() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFromEmail() != null) {
            _hashCode += getFromEmail().hashCode();
        }
        if (getDateSent() != null) {
            _hashCode += getDateSent().hashCode();
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getReportReason() != null) {
            _hashCode += getReportReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SupportMessageDetailReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "supportMessageDetailReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thread");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unreadThread");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unreadThread"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fromEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("", "body"));
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
