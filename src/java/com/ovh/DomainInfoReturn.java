/**
 * DomainInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DomainInfoReturn  implements java.io.Serializable {
    private java.lang.String domain;

    private java.lang.String creation;

    private java.lang.String modification;

    private java.lang.String expiration;

    private java.lang.String nicowner;

    private java.lang.String nicadmin;

    private java.lang.String nictech;

    private java.lang.String nicbilling;

    private java.lang.String authinfo;

    private com.ovh.NsStruct[] dns;

    public DomainInfoReturn() {
    }

    public DomainInfoReturn(
           java.lang.String domain,
           java.lang.String creation,
           java.lang.String modification,
           java.lang.String expiration,
           java.lang.String nicowner,
           java.lang.String nicadmin,
           java.lang.String nictech,
           java.lang.String nicbilling,
           java.lang.String authinfo,
           com.ovh.NsStruct[] dns) {
           this.domain = domain;
           this.creation = creation;
           this.modification = modification;
           this.expiration = expiration;
           this.nicowner = nicowner;
           this.nicadmin = nicadmin;
           this.nictech = nictech;
           this.nicbilling = nicbilling;
           this.authinfo = authinfo;
           this.dns = dns;
    }


    /**
     * Gets the domain value for this DomainInfoReturn.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this DomainInfoReturn.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the creation value for this DomainInfoReturn.
     * 
     * @return creation
     */
    public java.lang.String getCreation() {
        return creation;
    }


    /**
     * Sets the creation value for this DomainInfoReturn.
     * 
     * @param creation
     */
    public void setCreation(java.lang.String creation) {
        this.creation = creation;
    }


    /**
     * Gets the modification value for this DomainInfoReturn.
     * 
     * @return modification
     */
    public java.lang.String getModification() {
        return modification;
    }


    /**
     * Sets the modification value for this DomainInfoReturn.
     * 
     * @param modification
     */
    public void setModification(java.lang.String modification) {
        this.modification = modification;
    }


    /**
     * Gets the expiration value for this DomainInfoReturn.
     * 
     * @return expiration
     */
    public java.lang.String getExpiration() {
        return expiration;
    }


    /**
     * Sets the expiration value for this DomainInfoReturn.
     * 
     * @param expiration
     */
    public void setExpiration(java.lang.String expiration) {
        this.expiration = expiration;
    }


    /**
     * Gets the nicowner value for this DomainInfoReturn.
     * 
     * @return nicowner
     */
    public java.lang.String getNicowner() {
        return nicowner;
    }


    /**
     * Sets the nicowner value for this DomainInfoReturn.
     * 
     * @param nicowner
     */
    public void setNicowner(java.lang.String nicowner) {
        this.nicowner = nicowner;
    }


    /**
     * Gets the nicadmin value for this DomainInfoReturn.
     * 
     * @return nicadmin
     */
    public java.lang.String getNicadmin() {
        return nicadmin;
    }


    /**
     * Sets the nicadmin value for this DomainInfoReturn.
     * 
     * @param nicadmin
     */
    public void setNicadmin(java.lang.String nicadmin) {
        this.nicadmin = nicadmin;
    }


    /**
     * Gets the nictech value for this DomainInfoReturn.
     * 
     * @return nictech
     */
    public java.lang.String getNictech() {
        return nictech;
    }


    /**
     * Sets the nictech value for this DomainInfoReturn.
     * 
     * @param nictech
     */
    public void setNictech(java.lang.String nictech) {
        this.nictech = nictech;
    }


    /**
     * Gets the nicbilling value for this DomainInfoReturn.
     * 
     * @return nicbilling
     */
    public java.lang.String getNicbilling() {
        return nicbilling;
    }


    /**
     * Sets the nicbilling value for this DomainInfoReturn.
     * 
     * @param nicbilling
     */
    public void setNicbilling(java.lang.String nicbilling) {
        this.nicbilling = nicbilling;
    }


    /**
     * Gets the authinfo value for this DomainInfoReturn.
     * 
     * @return authinfo
     */
    public java.lang.String getAuthinfo() {
        return authinfo;
    }


    /**
     * Sets the authinfo value for this DomainInfoReturn.
     * 
     * @param authinfo
     */
    public void setAuthinfo(java.lang.String authinfo) {
        this.authinfo = authinfo;
    }


    /**
     * Gets the dns value for this DomainInfoReturn.
     * 
     * @return dns
     */
    public com.ovh.NsStruct[] getDns() {
        return dns;
    }


    /**
     * Sets the dns value for this DomainInfoReturn.
     * 
     * @param dns
     */
    public void setDns(com.ovh.NsStruct[] dns) {
        this.dns = dns;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DomainInfoReturn)) return false;
        DomainInfoReturn other = (DomainInfoReturn) obj;
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
            ((this.creation==null && other.getCreation()==null) || 
             (this.creation!=null &&
              this.creation.equals(other.getCreation()))) &&
            ((this.modification==null && other.getModification()==null) || 
             (this.modification!=null &&
              this.modification.equals(other.getModification()))) &&
            ((this.expiration==null && other.getExpiration()==null) || 
             (this.expiration!=null &&
              this.expiration.equals(other.getExpiration()))) &&
            ((this.nicowner==null && other.getNicowner()==null) || 
             (this.nicowner!=null &&
              this.nicowner.equals(other.getNicowner()))) &&
            ((this.nicadmin==null && other.getNicadmin()==null) || 
             (this.nicadmin!=null &&
              this.nicadmin.equals(other.getNicadmin()))) &&
            ((this.nictech==null && other.getNictech()==null) || 
             (this.nictech!=null &&
              this.nictech.equals(other.getNictech()))) &&
            ((this.nicbilling==null && other.getNicbilling()==null) || 
             (this.nicbilling!=null &&
              this.nicbilling.equals(other.getNicbilling()))) &&
            ((this.authinfo==null && other.getAuthinfo()==null) || 
             (this.authinfo!=null &&
              this.authinfo.equals(other.getAuthinfo()))) &&
            ((this.dns==null && other.getDns()==null) || 
             (this.dns!=null &&
              java.util.Arrays.equals(this.dns, other.getDns())));
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
        if (getCreation() != null) {
            _hashCode += getCreation().hashCode();
        }
        if (getModification() != null) {
            _hashCode += getModification().hashCode();
        }
        if (getExpiration() != null) {
            _hashCode += getExpiration().hashCode();
        }
        if (getNicowner() != null) {
            _hashCode += getNicowner().hashCode();
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
        if (getAuthinfo() != null) {
            _hashCode += getAuthinfo().hashCode();
        }
        if (getDns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DomainInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "domainInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicowner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicowner"));
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
        elemField.setFieldName("authinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "nsStruct"));
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
