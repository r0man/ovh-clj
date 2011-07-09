/**
 * TelephonyBillingAccountStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyBillingAccountStruct  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String mobile;

    private java.lang.String mobileDestination;

    private java.lang.String expirationDate;

    private java.lang.String version;

    private boolean trusted;

    private com.ovh.TelephonyPendingActionStruct pendingAction;

    private java.lang.String descriptionUser;

    public TelephonyBillingAccountStruct() {
    }

    public TelephonyBillingAccountStruct(
           java.lang.String description,
           java.lang.String mobile,
           java.lang.String mobileDestination,
           java.lang.String expirationDate,
           java.lang.String version,
           boolean trusted,
           com.ovh.TelephonyPendingActionStruct pendingAction,
           java.lang.String descriptionUser) {
           this.description = description;
           this.mobile = mobile;
           this.mobileDestination = mobileDestination;
           this.expirationDate = expirationDate;
           this.version = version;
           this.trusted = trusted;
           this.pendingAction = pendingAction;
           this.descriptionUser = descriptionUser;
    }


    /**
     * Gets the description value for this TelephonyBillingAccountStruct.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this TelephonyBillingAccountStruct.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the mobile value for this TelephonyBillingAccountStruct.
     * 
     * @return mobile
     */
    public java.lang.String getMobile() {
        return mobile;
    }


    /**
     * Sets the mobile value for this TelephonyBillingAccountStruct.
     * 
     * @param mobile
     */
    public void setMobile(java.lang.String mobile) {
        this.mobile = mobile;
    }


    /**
     * Gets the mobileDestination value for this TelephonyBillingAccountStruct.
     * 
     * @return mobileDestination
     */
    public java.lang.String getMobileDestination() {
        return mobileDestination;
    }


    /**
     * Sets the mobileDestination value for this TelephonyBillingAccountStruct.
     * 
     * @param mobileDestination
     */
    public void setMobileDestination(java.lang.String mobileDestination) {
        this.mobileDestination = mobileDestination;
    }


    /**
     * Gets the expirationDate value for this TelephonyBillingAccountStruct.
     * 
     * @return expirationDate
     */
    public java.lang.String getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this TelephonyBillingAccountStruct.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.lang.String expirationDate) {
        this.expirationDate = expirationDate;
    }


    /**
     * Gets the version value for this TelephonyBillingAccountStruct.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this TelephonyBillingAccountStruct.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the trusted value for this TelephonyBillingAccountStruct.
     * 
     * @return trusted
     */
    public boolean isTrusted() {
        return trusted;
    }


    /**
     * Sets the trusted value for this TelephonyBillingAccountStruct.
     * 
     * @param trusted
     */
    public void setTrusted(boolean trusted) {
        this.trusted = trusted;
    }


    /**
     * Gets the pendingAction value for this TelephonyBillingAccountStruct.
     * 
     * @return pendingAction
     */
    public com.ovh.TelephonyPendingActionStruct getPendingAction() {
        return pendingAction;
    }


    /**
     * Sets the pendingAction value for this TelephonyBillingAccountStruct.
     * 
     * @param pendingAction
     */
    public void setPendingAction(com.ovh.TelephonyPendingActionStruct pendingAction) {
        this.pendingAction = pendingAction;
    }


    /**
     * Gets the descriptionUser value for this TelephonyBillingAccountStruct.
     * 
     * @return descriptionUser
     */
    public java.lang.String getDescriptionUser() {
        return descriptionUser;
    }


    /**
     * Sets the descriptionUser value for this TelephonyBillingAccountStruct.
     * 
     * @param descriptionUser
     */
    public void setDescriptionUser(java.lang.String descriptionUser) {
        this.descriptionUser = descriptionUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyBillingAccountStruct)) return false;
        TelephonyBillingAccountStruct other = (TelephonyBillingAccountStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.mobile==null && other.getMobile()==null) || 
             (this.mobile!=null &&
              this.mobile.equals(other.getMobile()))) &&
            ((this.mobileDestination==null && other.getMobileDestination()==null) || 
             (this.mobileDestination!=null &&
              this.mobileDestination.equals(other.getMobileDestination()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            this.trusted == other.isTrusted() &&
            ((this.pendingAction==null && other.getPendingAction()==null) || 
             (this.pendingAction!=null &&
              this.pendingAction.equals(other.getPendingAction()))) &&
            ((this.descriptionUser==null && other.getDescriptionUser()==null) || 
             (this.descriptionUser!=null &&
              this.descriptionUser.equals(other.getDescriptionUser())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getMobile() != null) {
            _hashCode += getMobile().hashCode();
        }
        if (getMobileDestination() != null) {
            _hashCode += getMobileDestination().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        _hashCode += (isTrusted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPendingAction() != null) {
            _hashCode += getPendingAction().hashCode();
        }
        if (getDescriptionUser() != null) {
            _hashCode += getDescriptionUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyBillingAccountStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillingAccountStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileDestination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mobileDestination"));
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
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trusted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trusted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pendingAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pendingAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyPendingActionStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descriptionUser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descriptionUser"));
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
