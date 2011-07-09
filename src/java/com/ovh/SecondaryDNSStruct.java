/**
 * SecondaryDNSStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class SecondaryDNSStruct  implements java.io.Serializable {
    private java.lang.String zone;

    private java.lang.String type;

    private java.lang.String nameserver;

    private java.lang.String state;

    private java.lang.String creation;

    private java.lang.String deactivation;

    public SecondaryDNSStruct() {
    }

    public SecondaryDNSStruct(
           java.lang.String zone,
           java.lang.String type,
           java.lang.String nameserver,
           java.lang.String state,
           java.lang.String creation,
           java.lang.String deactivation) {
           this.zone = zone;
           this.type = type;
           this.nameserver = nameserver;
           this.state = state;
           this.creation = creation;
           this.deactivation = deactivation;
    }


    /**
     * Gets the zone value for this SecondaryDNSStruct.
     * 
     * @return zone
     */
    public java.lang.String getZone() {
        return zone;
    }


    /**
     * Sets the zone value for this SecondaryDNSStruct.
     * 
     * @param zone
     */
    public void setZone(java.lang.String zone) {
        this.zone = zone;
    }


    /**
     * Gets the type value for this SecondaryDNSStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this SecondaryDNSStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the nameserver value for this SecondaryDNSStruct.
     * 
     * @return nameserver
     */
    public java.lang.String getNameserver() {
        return nameserver;
    }


    /**
     * Sets the nameserver value for this SecondaryDNSStruct.
     * 
     * @param nameserver
     */
    public void setNameserver(java.lang.String nameserver) {
        this.nameserver = nameserver;
    }


    /**
     * Gets the state value for this SecondaryDNSStruct.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this SecondaryDNSStruct.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the creation value for this SecondaryDNSStruct.
     * 
     * @return creation
     */
    public java.lang.String getCreation() {
        return creation;
    }


    /**
     * Sets the creation value for this SecondaryDNSStruct.
     * 
     * @param creation
     */
    public void setCreation(java.lang.String creation) {
        this.creation = creation;
    }


    /**
     * Gets the deactivation value for this SecondaryDNSStruct.
     * 
     * @return deactivation
     */
    public java.lang.String getDeactivation() {
        return deactivation;
    }


    /**
     * Sets the deactivation value for this SecondaryDNSStruct.
     * 
     * @param deactivation
     */
    public void setDeactivation(java.lang.String deactivation) {
        this.deactivation = deactivation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SecondaryDNSStruct)) return false;
        SecondaryDNSStruct other = (SecondaryDNSStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zone==null && other.getZone()==null) || 
             (this.zone!=null &&
              this.zone.equals(other.getZone()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.nameserver==null && other.getNameserver()==null) || 
             (this.nameserver!=null &&
              this.nameserver.equals(other.getNameserver()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.creation==null && other.getCreation()==null) || 
             (this.creation!=null &&
              this.creation.equals(other.getCreation()))) &&
            ((this.deactivation==null && other.getDeactivation()==null) || 
             (this.deactivation!=null &&
              this.deactivation.equals(other.getDeactivation())));
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
        if (getZone() != null) {
            _hashCode += getZone().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getNameserver() != null) {
            _hashCode += getNameserver().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getCreation() != null) {
            _hashCode += getCreation().hashCode();
        }
        if (getDeactivation() != null) {
            _hashCode += getDeactivation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SecondaryDNSStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "secondaryDNSStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zone"));
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
        elemField.setFieldName("nameserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("deactivation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deactivation"));
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
