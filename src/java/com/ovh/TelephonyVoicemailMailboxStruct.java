/**
 * TelephonyVoicemailMailboxStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyVoicemailMailboxStruct  implements java.io.Serializable {
    private int id;

    private java.lang.String callerid;

    private java.lang.String origdate;

    private java.lang.String origtime;

    private java.lang.String origmailbox;

    private int duration;

    private java.lang.String folder;

    public TelephonyVoicemailMailboxStruct() {
    }

    public TelephonyVoicemailMailboxStruct(
           int id,
           java.lang.String callerid,
           java.lang.String origdate,
           java.lang.String origtime,
           java.lang.String origmailbox,
           int duration,
           java.lang.String folder) {
           this.id = id;
           this.callerid = callerid;
           this.origdate = origdate;
           this.origtime = origtime;
           this.origmailbox = origmailbox;
           this.duration = duration;
           this.folder = folder;
    }


    /**
     * Gets the id value for this TelephonyVoicemailMailboxStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this TelephonyVoicemailMailboxStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the callerid value for this TelephonyVoicemailMailboxStruct.
     * 
     * @return callerid
     */
    public java.lang.String getCallerid() {
        return callerid;
    }


    /**
     * Sets the callerid value for this TelephonyVoicemailMailboxStruct.
     * 
     * @param callerid
     */
    public void setCallerid(java.lang.String callerid) {
        this.callerid = callerid;
    }


    /**
     * Gets the origdate value for this TelephonyVoicemailMailboxStruct.
     * 
     * @return origdate
     */
    public java.lang.String getOrigdate() {
        return origdate;
    }


    /**
     * Sets the origdate value for this TelephonyVoicemailMailboxStruct.
     * 
     * @param origdate
     */
    public void setOrigdate(java.lang.String origdate) {
        this.origdate = origdate;
    }


    /**
     * Gets the origtime value for this TelephonyVoicemailMailboxStruct.
     * 
     * @return origtime
     */
    public java.lang.String getOrigtime() {
        return origtime;
    }


    /**
     * Sets the origtime value for this TelephonyVoicemailMailboxStruct.
     * 
     * @param origtime
     */
    public void setOrigtime(java.lang.String origtime) {
        this.origtime = origtime;
    }


    /**
     * Gets the origmailbox value for this TelephonyVoicemailMailboxStruct.
     * 
     * @return origmailbox
     */
    public java.lang.String getOrigmailbox() {
        return origmailbox;
    }


    /**
     * Sets the origmailbox value for this TelephonyVoicemailMailboxStruct.
     * 
     * @param origmailbox
     */
    public void setOrigmailbox(java.lang.String origmailbox) {
        this.origmailbox = origmailbox;
    }


    /**
     * Gets the duration value for this TelephonyVoicemailMailboxStruct.
     * 
     * @return duration
     */
    public int getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TelephonyVoicemailMailboxStruct.
     * 
     * @param duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
    }


    /**
     * Gets the folder value for this TelephonyVoicemailMailboxStruct.
     * 
     * @return folder
     */
    public java.lang.String getFolder() {
        return folder;
    }


    /**
     * Sets the folder value for this TelephonyVoicemailMailboxStruct.
     * 
     * @param folder
     */
    public void setFolder(java.lang.String folder) {
        this.folder = folder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyVoicemailMailboxStruct)) return false;
        TelephonyVoicemailMailboxStruct other = (TelephonyVoicemailMailboxStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.callerid==null && other.getCallerid()==null) || 
             (this.callerid!=null &&
              this.callerid.equals(other.getCallerid()))) &&
            ((this.origdate==null && other.getOrigdate()==null) || 
             (this.origdate!=null &&
              this.origdate.equals(other.getOrigdate()))) &&
            ((this.origtime==null && other.getOrigtime()==null) || 
             (this.origtime!=null &&
              this.origtime.equals(other.getOrigtime()))) &&
            ((this.origmailbox==null && other.getOrigmailbox()==null) || 
             (this.origmailbox!=null &&
              this.origmailbox.equals(other.getOrigmailbox()))) &&
            this.duration == other.getDuration() &&
            ((this.folder==null && other.getFolder()==null) || 
             (this.folder!=null &&
              this.folder.equals(other.getFolder())));
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
        if (getCallerid() != null) {
            _hashCode += getCallerid().hashCode();
        }
        if (getOrigdate() != null) {
            _hashCode += getOrigdate().hashCode();
        }
        if (getOrigtime() != null) {
            _hashCode += getOrigtime().hashCode();
        }
        if (getOrigmailbox() != null) {
            _hashCode += getOrigmailbox().hashCode();
        }
        _hashCode += getDuration();
        if (getFolder() != null) {
            _hashCode += getFolder().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyVoicemailMailboxStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyVoicemailMailboxStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callerid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callerid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origmailbox");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origmailbox"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "folder"));
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
