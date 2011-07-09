/**
 * TelephonyHuntingInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyHuntingInfoReturn  implements java.io.Serializable {
    private com.ovh.TelephonyHuntingInfoMemberStruct[] members;

    private java.lang.String strategy;

    private java.lang.String pattern;

    private int onHoldTimer;

    private int queueSize;

    private int numberOfCalls;

    private int noReplyTimer;

    private java.lang.String mainVoicemail;

    private boolean toneOnHold;

    private boolean toneRingback;

    private boolean toneOnClosure;

    private boolean anonymousCallRejection;

    public TelephonyHuntingInfoReturn() {
    }

    public TelephonyHuntingInfoReturn(
           com.ovh.TelephonyHuntingInfoMemberStruct[] members,
           java.lang.String strategy,
           java.lang.String pattern,
           int onHoldTimer,
           int queueSize,
           int numberOfCalls,
           int noReplyTimer,
           java.lang.String mainVoicemail,
           boolean toneOnHold,
           boolean toneRingback,
           boolean toneOnClosure,
           boolean anonymousCallRejection) {
           this.members = members;
           this.strategy = strategy;
           this.pattern = pattern;
           this.onHoldTimer = onHoldTimer;
           this.queueSize = queueSize;
           this.numberOfCalls = numberOfCalls;
           this.noReplyTimer = noReplyTimer;
           this.mainVoicemail = mainVoicemail;
           this.toneOnHold = toneOnHold;
           this.toneRingback = toneRingback;
           this.toneOnClosure = toneOnClosure;
           this.anonymousCallRejection = anonymousCallRejection;
    }


    /**
     * Gets the members value for this TelephonyHuntingInfoReturn.
     * 
     * @return members
     */
    public com.ovh.TelephonyHuntingInfoMemberStruct[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this TelephonyHuntingInfoReturn.
     * 
     * @param members
     */
    public void setMembers(com.ovh.TelephonyHuntingInfoMemberStruct[] members) {
        this.members = members;
    }


    /**
     * Gets the strategy value for this TelephonyHuntingInfoReturn.
     * 
     * @return strategy
     */
    public java.lang.String getStrategy() {
        return strategy;
    }


    /**
     * Sets the strategy value for this TelephonyHuntingInfoReturn.
     * 
     * @param strategy
     */
    public void setStrategy(java.lang.String strategy) {
        this.strategy = strategy;
    }


    /**
     * Gets the pattern value for this TelephonyHuntingInfoReturn.
     * 
     * @return pattern
     */
    public java.lang.String getPattern() {
        return pattern;
    }


    /**
     * Sets the pattern value for this TelephonyHuntingInfoReturn.
     * 
     * @param pattern
     */
    public void setPattern(java.lang.String pattern) {
        this.pattern = pattern;
    }


    /**
     * Gets the onHoldTimer value for this TelephonyHuntingInfoReturn.
     * 
     * @return onHoldTimer
     */
    public int getOnHoldTimer() {
        return onHoldTimer;
    }


    /**
     * Sets the onHoldTimer value for this TelephonyHuntingInfoReturn.
     * 
     * @param onHoldTimer
     */
    public void setOnHoldTimer(int onHoldTimer) {
        this.onHoldTimer = onHoldTimer;
    }


    /**
     * Gets the queueSize value for this TelephonyHuntingInfoReturn.
     * 
     * @return queueSize
     */
    public int getQueueSize() {
        return queueSize;
    }


    /**
     * Sets the queueSize value for this TelephonyHuntingInfoReturn.
     * 
     * @param queueSize
     */
    public void setQueueSize(int queueSize) {
        this.queueSize = queueSize;
    }


    /**
     * Gets the numberOfCalls value for this TelephonyHuntingInfoReturn.
     * 
     * @return numberOfCalls
     */
    public int getNumberOfCalls() {
        return numberOfCalls;
    }


    /**
     * Sets the numberOfCalls value for this TelephonyHuntingInfoReturn.
     * 
     * @param numberOfCalls
     */
    public void setNumberOfCalls(int numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }


    /**
     * Gets the noReplyTimer value for this TelephonyHuntingInfoReturn.
     * 
     * @return noReplyTimer
     */
    public int getNoReplyTimer() {
        return noReplyTimer;
    }


    /**
     * Sets the noReplyTimer value for this TelephonyHuntingInfoReturn.
     * 
     * @param noReplyTimer
     */
    public void setNoReplyTimer(int noReplyTimer) {
        this.noReplyTimer = noReplyTimer;
    }


    /**
     * Gets the mainVoicemail value for this TelephonyHuntingInfoReturn.
     * 
     * @return mainVoicemail
     */
    public java.lang.String getMainVoicemail() {
        return mainVoicemail;
    }


    /**
     * Sets the mainVoicemail value for this TelephonyHuntingInfoReturn.
     * 
     * @param mainVoicemail
     */
    public void setMainVoicemail(java.lang.String mainVoicemail) {
        this.mainVoicemail = mainVoicemail;
    }


    /**
     * Gets the toneOnHold value for this TelephonyHuntingInfoReturn.
     * 
     * @return toneOnHold
     */
    public boolean isToneOnHold() {
        return toneOnHold;
    }


    /**
     * Sets the toneOnHold value for this TelephonyHuntingInfoReturn.
     * 
     * @param toneOnHold
     */
    public void setToneOnHold(boolean toneOnHold) {
        this.toneOnHold = toneOnHold;
    }


    /**
     * Gets the toneRingback value for this TelephonyHuntingInfoReturn.
     * 
     * @return toneRingback
     */
    public boolean isToneRingback() {
        return toneRingback;
    }


    /**
     * Sets the toneRingback value for this TelephonyHuntingInfoReturn.
     * 
     * @param toneRingback
     */
    public void setToneRingback(boolean toneRingback) {
        this.toneRingback = toneRingback;
    }


    /**
     * Gets the toneOnClosure value for this TelephonyHuntingInfoReturn.
     * 
     * @return toneOnClosure
     */
    public boolean isToneOnClosure() {
        return toneOnClosure;
    }


    /**
     * Sets the toneOnClosure value for this TelephonyHuntingInfoReturn.
     * 
     * @param toneOnClosure
     */
    public void setToneOnClosure(boolean toneOnClosure) {
        this.toneOnClosure = toneOnClosure;
    }


    /**
     * Gets the anonymousCallRejection value for this TelephonyHuntingInfoReturn.
     * 
     * @return anonymousCallRejection
     */
    public boolean isAnonymousCallRejection() {
        return anonymousCallRejection;
    }


    /**
     * Sets the anonymousCallRejection value for this TelephonyHuntingInfoReturn.
     * 
     * @param anonymousCallRejection
     */
    public void setAnonymousCallRejection(boolean anonymousCallRejection) {
        this.anonymousCallRejection = anonymousCallRejection;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyHuntingInfoReturn)) return false;
        TelephonyHuntingInfoReturn other = (TelephonyHuntingInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.members==null && other.getMembers()==null) || 
             (this.members!=null &&
              java.util.Arrays.equals(this.members, other.getMembers()))) &&
            ((this.strategy==null && other.getStrategy()==null) || 
             (this.strategy!=null &&
              this.strategy.equals(other.getStrategy()))) &&
            ((this.pattern==null && other.getPattern()==null) || 
             (this.pattern!=null &&
              this.pattern.equals(other.getPattern()))) &&
            this.onHoldTimer == other.getOnHoldTimer() &&
            this.queueSize == other.getQueueSize() &&
            this.numberOfCalls == other.getNumberOfCalls() &&
            this.noReplyTimer == other.getNoReplyTimer() &&
            ((this.mainVoicemail==null && other.getMainVoicemail()==null) || 
             (this.mainVoicemail!=null &&
              this.mainVoicemail.equals(other.getMainVoicemail()))) &&
            this.toneOnHold == other.isToneOnHold() &&
            this.toneRingback == other.isToneRingback() &&
            this.toneOnClosure == other.isToneOnClosure() &&
            this.anonymousCallRejection == other.isAnonymousCallRejection();
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
        if (getMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStrategy() != null) {
            _hashCode += getStrategy().hashCode();
        }
        if (getPattern() != null) {
            _hashCode += getPattern().hashCode();
        }
        _hashCode += getOnHoldTimer();
        _hashCode += getQueueSize();
        _hashCode += getNumberOfCalls();
        _hashCode += getNoReplyTimer();
        if (getMainVoicemail() != null) {
            _hashCode += getMainVoicemail().hashCode();
        }
        _hashCode += (isToneOnHold() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToneRingback() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isToneOnClosure() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAnonymousCallRejection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyHuntingInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyHuntingInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("", "members"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyHuntingInfoMemberStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strategy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strategy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHoldTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onHoldTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queueSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "queueSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfCalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numberOfCalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noReplyTimer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noReplyTimer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainVoicemail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mainVoicemail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneOnHold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneOnHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneRingback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneRingback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toneOnClosure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toneOnClosure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymousCallRejection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anonymousCallRejection"));
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
