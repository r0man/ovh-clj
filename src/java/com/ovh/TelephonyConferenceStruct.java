/**
 * TelephonyConferenceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyConferenceStruct  implements java.io.Serializable {
    private java.lang.String room;

    private java.lang.String countryCode;

    private java.lang.String callNumber;

    private java.lang.String language;

    private boolean customAnnounce;

    private boolean recordAnnounce;

    private boolean mailReport;

    private java.lang.String customMailReportAddress;

    private boolean askName;

    private boolean tellMemberCount;

    private java.lang.String moderatorCountryCode;

    private java.lang.String moderatorCallNumber;

    private java.lang.String status;

    private boolean dtmfmenu;

    private boolean announce_rcv;

    private boolean announce_snd;

    private boolean recordConf;

    public TelephonyConferenceStruct() {
    }

    public TelephonyConferenceStruct(
           java.lang.String room,
           java.lang.String countryCode,
           java.lang.String callNumber,
           java.lang.String language,
           boolean customAnnounce,
           boolean recordAnnounce,
           boolean mailReport,
           java.lang.String customMailReportAddress,
           boolean askName,
           boolean tellMemberCount,
           java.lang.String moderatorCountryCode,
           java.lang.String moderatorCallNumber,
           java.lang.String status,
           boolean dtmfmenu,
           boolean announce_rcv,
           boolean announce_snd,
           boolean recordConf) {
           this.room = room;
           this.countryCode = countryCode;
           this.callNumber = callNumber;
           this.language = language;
           this.customAnnounce = customAnnounce;
           this.recordAnnounce = recordAnnounce;
           this.mailReport = mailReport;
           this.customMailReportAddress = customMailReportAddress;
           this.askName = askName;
           this.tellMemberCount = tellMemberCount;
           this.moderatorCountryCode = moderatorCountryCode;
           this.moderatorCallNumber = moderatorCallNumber;
           this.status = status;
           this.dtmfmenu = dtmfmenu;
           this.announce_rcv = announce_rcv;
           this.announce_snd = announce_snd;
           this.recordConf = recordConf;
    }


    /**
     * Gets the room value for this TelephonyConferenceStruct.
     * 
     * @return room
     */
    public java.lang.String getRoom() {
        return room;
    }


    /**
     * Sets the room value for this TelephonyConferenceStruct.
     * 
     * @param room
     */
    public void setRoom(java.lang.String room) {
        this.room = room;
    }


    /**
     * Gets the countryCode value for this TelephonyConferenceStruct.
     * 
     * @return countryCode
     */
    public java.lang.String getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this TelephonyConferenceStruct.
     * 
     * @param countryCode
     */
    public void setCountryCode(java.lang.String countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the callNumber value for this TelephonyConferenceStruct.
     * 
     * @return callNumber
     */
    public java.lang.String getCallNumber() {
        return callNumber;
    }


    /**
     * Sets the callNumber value for this TelephonyConferenceStruct.
     * 
     * @param callNumber
     */
    public void setCallNumber(java.lang.String callNumber) {
        this.callNumber = callNumber;
    }


    /**
     * Gets the language value for this TelephonyConferenceStruct.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this TelephonyConferenceStruct.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the customAnnounce value for this TelephonyConferenceStruct.
     * 
     * @return customAnnounce
     */
    public boolean isCustomAnnounce() {
        return customAnnounce;
    }


    /**
     * Sets the customAnnounce value for this TelephonyConferenceStruct.
     * 
     * @param customAnnounce
     */
    public void setCustomAnnounce(boolean customAnnounce) {
        this.customAnnounce = customAnnounce;
    }


    /**
     * Gets the recordAnnounce value for this TelephonyConferenceStruct.
     * 
     * @return recordAnnounce
     */
    public boolean isRecordAnnounce() {
        return recordAnnounce;
    }


    /**
     * Sets the recordAnnounce value for this TelephonyConferenceStruct.
     * 
     * @param recordAnnounce
     */
    public void setRecordAnnounce(boolean recordAnnounce) {
        this.recordAnnounce = recordAnnounce;
    }


    /**
     * Gets the mailReport value for this TelephonyConferenceStruct.
     * 
     * @return mailReport
     */
    public boolean isMailReport() {
        return mailReport;
    }


    /**
     * Sets the mailReport value for this TelephonyConferenceStruct.
     * 
     * @param mailReport
     */
    public void setMailReport(boolean mailReport) {
        this.mailReport = mailReport;
    }


    /**
     * Gets the customMailReportAddress value for this TelephonyConferenceStruct.
     * 
     * @return customMailReportAddress
     */
    public java.lang.String getCustomMailReportAddress() {
        return customMailReportAddress;
    }


    /**
     * Sets the customMailReportAddress value for this TelephonyConferenceStruct.
     * 
     * @param customMailReportAddress
     */
    public void setCustomMailReportAddress(java.lang.String customMailReportAddress) {
        this.customMailReportAddress = customMailReportAddress;
    }


    /**
     * Gets the askName value for this TelephonyConferenceStruct.
     * 
     * @return askName
     */
    public boolean isAskName() {
        return askName;
    }


    /**
     * Sets the askName value for this TelephonyConferenceStruct.
     * 
     * @param askName
     */
    public void setAskName(boolean askName) {
        this.askName = askName;
    }


    /**
     * Gets the tellMemberCount value for this TelephonyConferenceStruct.
     * 
     * @return tellMemberCount
     */
    public boolean isTellMemberCount() {
        return tellMemberCount;
    }


    /**
     * Sets the tellMemberCount value for this TelephonyConferenceStruct.
     * 
     * @param tellMemberCount
     */
    public void setTellMemberCount(boolean tellMemberCount) {
        this.tellMemberCount = tellMemberCount;
    }


    /**
     * Gets the moderatorCountryCode value for this TelephonyConferenceStruct.
     * 
     * @return moderatorCountryCode
     */
    public java.lang.String getModeratorCountryCode() {
        return moderatorCountryCode;
    }


    /**
     * Sets the moderatorCountryCode value for this TelephonyConferenceStruct.
     * 
     * @param moderatorCountryCode
     */
    public void setModeratorCountryCode(java.lang.String moderatorCountryCode) {
        this.moderatorCountryCode = moderatorCountryCode;
    }


    /**
     * Gets the moderatorCallNumber value for this TelephonyConferenceStruct.
     * 
     * @return moderatorCallNumber
     */
    public java.lang.String getModeratorCallNumber() {
        return moderatorCallNumber;
    }


    /**
     * Sets the moderatorCallNumber value for this TelephonyConferenceStruct.
     * 
     * @param moderatorCallNumber
     */
    public void setModeratorCallNumber(java.lang.String moderatorCallNumber) {
        this.moderatorCallNumber = moderatorCallNumber;
    }


    /**
     * Gets the status value for this TelephonyConferenceStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TelephonyConferenceStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the dtmfmenu value for this TelephonyConferenceStruct.
     * 
     * @return dtmfmenu
     */
    public boolean isDtmfmenu() {
        return dtmfmenu;
    }


    /**
     * Sets the dtmfmenu value for this TelephonyConferenceStruct.
     * 
     * @param dtmfmenu
     */
    public void setDtmfmenu(boolean dtmfmenu) {
        this.dtmfmenu = dtmfmenu;
    }


    /**
     * Gets the announce_rcv value for this TelephonyConferenceStruct.
     * 
     * @return announce_rcv
     */
    public boolean isAnnounce_rcv() {
        return announce_rcv;
    }


    /**
     * Sets the announce_rcv value for this TelephonyConferenceStruct.
     * 
     * @param announce_rcv
     */
    public void setAnnounce_rcv(boolean announce_rcv) {
        this.announce_rcv = announce_rcv;
    }


    /**
     * Gets the announce_snd value for this TelephonyConferenceStruct.
     * 
     * @return announce_snd
     */
    public boolean isAnnounce_snd() {
        return announce_snd;
    }


    /**
     * Sets the announce_snd value for this TelephonyConferenceStruct.
     * 
     * @param announce_snd
     */
    public void setAnnounce_snd(boolean announce_snd) {
        this.announce_snd = announce_snd;
    }


    /**
     * Gets the recordConf value for this TelephonyConferenceStruct.
     * 
     * @return recordConf
     */
    public boolean isRecordConf() {
        return recordConf;
    }


    /**
     * Sets the recordConf value for this TelephonyConferenceStruct.
     * 
     * @param recordConf
     */
    public void setRecordConf(boolean recordConf) {
        this.recordConf = recordConf;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyConferenceStruct)) return false;
        TelephonyConferenceStruct other = (TelephonyConferenceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.room==null && other.getRoom()==null) || 
             (this.room!=null &&
              this.room.equals(other.getRoom()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              this.countryCode.equals(other.getCountryCode()))) &&
            ((this.callNumber==null && other.getCallNumber()==null) || 
             (this.callNumber!=null &&
              this.callNumber.equals(other.getCallNumber()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            this.customAnnounce == other.isCustomAnnounce() &&
            this.recordAnnounce == other.isRecordAnnounce() &&
            this.mailReport == other.isMailReport() &&
            ((this.customMailReportAddress==null && other.getCustomMailReportAddress()==null) || 
             (this.customMailReportAddress!=null &&
              this.customMailReportAddress.equals(other.getCustomMailReportAddress()))) &&
            this.askName == other.isAskName() &&
            this.tellMemberCount == other.isTellMemberCount() &&
            ((this.moderatorCountryCode==null && other.getModeratorCountryCode()==null) || 
             (this.moderatorCountryCode!=null &&
              this.moderatorCountryCode.equals(other.getModeratorCountryCode()))) &&
            ((this.moderatorCallNumber==null && other.getModeratorCallNumber()==null) || 
             (this.moderatorCallNumber!=null &&
              this.moderatorCallNumber.equals(other.getModeratorCallNumber()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.dtmfmenu == other.isDtmfmenu() &&
            this.announce_rcv == other.isAnnounce_rcv() &&
            this.announce_snd == other.isAnnounce_snd() &&
            this.recordConf == other.isRecordConf();
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
        if (getRoom() != null) {
            _hashCode += getRoom().hashCode();
        }
        if (getCountryCode() != null) {
            _hashCode += getCountryCode().hashCode();
        }
        if (getCallNumber() != null) {
            _hashCode += getCallNumber().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        _hashCode += (isCustomAnnounce() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRecordAnnounce() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMailReport() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCustomMailReportAddress() != null) {
            _hashCode += getCustomMailReportAddress().hashCode();
        }
        _hashCode += (isAskName() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTellMemberCount() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getModeratorCountryCode() != null) {
            _hashCode += getModeratorCountryCode().hashCode();
        }
        if (getModeratorCallNumber() != null) {
            _hashCode += getModeratorCallNumber().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += (isDtmfmenu() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAnnounce_rcv() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAnnounce_snd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRecordConf() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyConferenceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyConferenceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("room");
        elemField.setXmlName(new javax.xml.namespace.QName("", "room"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customAnnounce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customAnnounce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordAnnounce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordAnnounce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailReport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mailReport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customMailReportAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customMailReportAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("askName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "askName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tellMemberCount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tellMemberCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moderatorCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moderatorCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moderatorCallNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moderatorCallNumber"));
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
        elemField.setFieldName("dtmfmenu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtmfmenu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announce_rcv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "announce_rcv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("announce_snd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "announce_snd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recordConf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordConf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
