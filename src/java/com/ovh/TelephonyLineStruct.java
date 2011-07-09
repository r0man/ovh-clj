/**
 * TelephonyLineStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyLineStruct  implements java.io.Serializable {
    private java.lang.String number;

    private java.lang.String billingAccount;

    private java.lang.String offer;

    private java.lang.String type;

    private java.lang.String service;

    private java.lang.String expirationDate;

    private java.lang.String description;

    private boolean betaGamaOffer;

    private java.lang.String setOn;

    private com.ovh.TelephonyLineAliasPoolStruct aliasPool;

    private com.ovh.TelephonyPendingActionStruct pendingAction;

    public TelephonyLineStruct() {
    }

    public TelephonyLineStruct(
           java.lang.String number,
           java.lang.String billingAccount,
           java.lang.String offer,
           java.lang.String type,
           java.lang.String service,
           java.lang.String expirationDate,
           java.lang.String description,
           boolean betaGamaOffer,
           java.lang.String setOn,
           com.ovh.TelephonyLineAliasPoolStruct aliasPool,
           com.ovh.TelephonyPendingActionStruct pendingAction) {
           this.number = number;
           this.billingAccount = billingAccount;
           this.offer = offer;
           this.type = type;
           this.service = service;
           this.expirationDate = expirationDate;
           this.description = description;
           this.betaGamaOffer = betaGamaOffer;
           this.setOn = setOn;
           this.aliasPool = aliasPool;
           this.pendingAction = pendingAction;
    }


    /**
     * Gets the number value for this TelephonyLineStruct.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TelephonyLineStruct.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the billingAccount value for this TelephonyLineStruct.
     * 
     * @return billingAccount
     */
    public java.lang.String getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this TelephonyLineStruct.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(java.lang.String billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the offer value for this TelephonyLineStruct.
     * 
     * @return offer
     */
    public java.lang.String getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this TelephonyLineStruct.
     * 
     * @param offer
     */
    public void setOffer(java.lang.String offer) {
        this.offer = offer;
    }


    /**
     * Gets the type value for this TelephonyLineStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TelephonyLineStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the service value for this TelephonyLineStruct.
     * 
     * @return service
     */
    public java.lang.String getService() {
        return service;
    }


    /**
     * Sets the service value for this TelephonyLineStruct.
     * 
     * @param service
     */
    public void setService(java.lang.String service) {
        this.service = service;
    }


    /**
     * Gets the expirationDate value for this TelephonyLineStruct.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this TelephonyLineStruct.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the description value for this TelephonyLineStruct.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TelephonyLineStruct.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the betaGamaOffer value for this TelephonyLineStruct.
     * 
     * @return betaGamaOffer
     */
    public boolean isBetaGamaOffer() {
        return betaGamaOffer;
    }


    /**
     * Sets the betaGamaOffer value for this TelephonyLineStruct.
     * 
     * @param betaGamaOffer
     */
    public void setBetaGamaOffer(boolean betaGamaOffer) {
        this.betaGamaOffer = betaGamaOffer;
    }


    /**
     * Gets the setOn value for this TelephonyLineStruct.
     * 
     * @return setOn
     */
    public java.lang.String getSetOn() {
        return setOn;
    }


    /**
     * Sets the setOn value for this TelephonyLineStruct.
     * 
     * @param setOn
     */
    public void setSetOn(java.lang.String setOn) {
        this.setOn = setOn;
    }


    /**
     * Gets the aliasPool value for this TelephonyLineStruct.
     * 
     * @return aliasPool
     */
    public com.ovh.TelephonyLineAliasPoolStruct getAliasPool() {
        return aliasPool;
    }


    /**
     * Sets the aliasPool value for this TelephonyLineStruct.
     * 
     * @param aliasPool
     */
    public void setAliasPool(com.ovh.TelephonyLineAliasPoolStruct aliasPool) {
        this.aliasPool = aliasPool;
    }


    /**
     * Gets the pendingAction value for this TelephonyLineStruct.
     * 
     * @return pendingAction
     */
    public com.ovh.TelephonyPendingActionStruct getPendingAction() {
        return pendingAction;
    }


    /**
     * Sets the pendingAction value for this TelephonyLineStruct.
     * 
     * @param pendingAction
     */
    public void setPendingAction(com.ovh.TelephonyPendingActionStruct pendingAction) {
        this.pendingAction = pendingAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyLineStruct)) return false;
        TelephonyLineStruct other = (TelephonyLineStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.betaGamaOffer == other.isBetaGamaOffer() &&
            ((this.setOn==null && other.getSetOn()==null) || 
             (this.setOn!=null &&
              this.setOn.equals(other.getSetOn()))) &&
            ((this.aliasPool==null && other.getAliasPool()==null) || 
             (this.aliasPool!=null &&
              this.aliasPool.equals(other.getAliasPool()))) &&
            ((this.pendingAction==null && other.getPendingAction()==null) || 
             (this.pendingAction!=null &&
              this.pendingAction.equals(other.getPendingAction())));
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
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isBetaGamaOffer() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSetOn() != null) {
            _hashCode += getSetOn().hashCode();
        }
        if (getAliasPool() != null) {
            _hashCode += getAliasPool().hashCode();
        }
        if (getPendingAction() != null) {
            _hashCode += getPendingAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyLineStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyLineStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("betaGamaOffer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "betaGamaOffer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setOn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "setOn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliasPool");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aliasPool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyLineAliasPoolStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pendingAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyPendingActionStruct"));
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
