/**
 * ServiceLightStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class ServiceLightStruct  implements java.io.Serializable {
    private java.lang.String domain;

    private java.lang.String expiry;

    private java.lang.String nicadmin;

    private java.lang.String nictech;

    private java.lang.String nicbilling;

    private java.lang.String autorenew;

    private java.lang.String reverse;

    public ServiceLightStruct() {
    }

    public ServiceLightStruct(
           java.lang.String domain,
           java.lang.String expiry,
           java.lang.String nicadmin,
           java.lang.String nictech,
           java.lang.String nicbilling,
           java.lang.String autorenew,
           java.lang.String reverse) {
           this.domain = domain;
           this.expiry = expiry;
           this.nicadmin = nicadmin;
           this.nictech = nictech;
           this.nicbilling = nicbilling;
           this.autorenew = autorenew;
           this.reverse = reverse;
    }


    /**
     * Gets the domain value for this ServiceLightStruct.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this ServiceLightStruct.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the expiry value for this ServiceLightStruct.
     * 
     * @return expiry
     */
    public java.lang.String getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this ServiceLightStruct.
     * 
     * @param expiry
     */
    public void setExpiry(java.lang.String expiry) {
        this.expiry = expiry;
    }


    /**
     * Gets the nicadmin value for this ServiceLightStruct.
     * 
     * @return nicadmin
     */
    public java.lang.String getNicadmin() {
        return nicadmin;
    }


    /**
     * Sets the nicadmin value for this ServiceLightStruct.
     * 
     * @param nicadmin
     */
    public void setNicadmin(java.lang.String nicadmin) {
        this.nicadmin = nicadmin;
    }


    /**
     * Gets the nictech value for this ServiceLightStruct.
     * 
     * @return nictech
     */
    public java.lang.String getNictech() {
        return nictech;
    }


    /**
     * Sets the nictech value for this ServiceLightStruct.
     * 
     * @param nictech
     */
    public void setNictech(java.lang.String nictech) {
        this.nictech = nictech;
    }


    /**
     * Gets the nicbilling value for this ServiceLightStruct.
     * 
     * @return nicbilling
     */
    public java.lang.String getNicbilling() {
        return nicbilling;
    }


    /**
     * Sets the nicbilling value for this ServiceLightStruct.
     * 
     * @param nicbilling
     */
    public void setNicbilling(java.lang.String nicbilling) {
        this.nicbilling = nicbilling;
    }


    /**
     * Gets the autorenew value for this ServiceLightStruct.
     * 
     * @return autorenew
     */
    public java.lang.String getAutorenew() {
        return autorenew;
    }


    /**
     * Sets the autorenew value for this ServiceLightStruct.
     * 
     * @param autorenew
     */
    public void setAutorenew(java.lang.String autorenew) {
        this.autorenew = autorenew;
    }


    /**
     * Gets the reverse value for this ServiceLightStruct.
     * 
     * @return reverse
     */
    public java.lang.String getReverse() {
        return reverse;
    }


    /**
     * Sets the reverse value for this ServiceLightStruct.
     * 
     * @param reverse
     */
    public void setReverse(java.lang.String reverse) {
        this.reverse = reverse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceLightStruct)) return false;
        ServiceLightStruct other = (ServiceLightStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.expiry==null && other.getExpiry()==null) || 
             (this.expiry!=null &&
              this.expiry.equals(other.getExpiry()))) &&
            ((this.nicadmin==null && other.getNicadmin()==null) || 
             (this.nicadmin!=null &&
              this.nicadmin.equals(other.getNicadmin()))) &&
            ((this.nictech==null && other.getNictech()==null) || 
             (this.nictech!=null &&
              this.nictech.equals(other.getNictech()))) &&
            ((this.nicbilling==null && other.getNicbilling()==null) || 
             (this.nicbilling!=null &&
              this.nicbilling.equals(other.getNicbilling()))) &&
            ((this.autorenew==null && other.getAutorenew()==null) || 
             (this.autorenew!=null &&
              this.autorenew.equals(other.getAutorenew()))) &&
            ((this.reverse==null && other.getReverse()==null) || 
             (this.reverse!=null &&
              this.reverse.equals(other.getReverse())));
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getExpiry() != null) {
            _hashCode += getExpiry().hashCode();
        }
        if (getNicadmin() != null) {
            _hashCode += getNicadmin().hashCode();
        }
        if (getNictech() != null) {
            _hashCode += getNictech().hashCode();
        }
        if (getNicbilling() != null) {
            _hashCode += getNicbilling().hashCode();
        }
        if (getAutorenew() != null) {
            _hashCode += getAutorenew().hashCode();
        }
        if (getReverse() != null) {
            _hashCode += getReverse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceLightStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "serviceLightStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicadmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicadmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nictech");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nictech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicbilling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicbilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorenew");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autorenew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverse"));
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
