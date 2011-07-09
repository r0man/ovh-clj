/**
 * DedicatedInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedInfoReturn  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.String datacenter;

    private java.lang.String os;

    private boolean isKimSufi;

    private boolean isRPS;

    private boolean isHG;

    private int num;

    private java.lang.String rack;

    private java.lang.String countryBilling;

    private com.ovh.DedicatedNetworkStruct network;

    private com.ovh.DedicatedCapabilityStruct capability;

    private com.ovh.DedicatedFreedomStruct freeDom;

    public DedicatedInfoReturn() {
    }

    public DedicatedInfoReturn(
           java.lang.String hostname,
           java.lang.String datacenter,
           java.lang.String os,
           boolean isKimSufi,
           boolean isRPS,
           boolean isHG,
           int num,
           java.lang.String rack,
           java.lang.String countryBilling,
           com.ovh.DedicatedNetworkStruct network,
           com.ovh.DedicatedCapabilityStruct capability,
           com.ovh.DedicatedFreedomStruct freeDom) {
           this.hostname = hostname;
           this.datacenter = datacenter;
           this.os = os;
           this.isKimSufi = isKimSufi;
           this.isRPS = isRPS;
           this.isHG = isHG;
           this.num = num;
           this.rack = rack;
           this.countryBilling = countryBilling;
           this.network = network;
           this.capability = capability;
           this.freeDom = freeDom;
    }


    /**
     * Gets the hostname value for this DedicatedInfoReturn.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this DedicatedInfoReturn.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the datacenter value for this DedicatedInfoReturn.
     * 
     * @return datacenter
     */
    public java.lang.String getDatacenter() {
        return datacenter;
    }


    /**
     * Sets the datacenter value for this DedicatedInfoReturn.
     * 
     * @param datacenter
     */
    public void setDatacenter(java.lang.String datacenter) {
        this.datacenter = datacenter;
    }


    /**
     * Gets the os value for this DedicatedInfoReturn.
     * 
     * @return os
     */
    public java.lang.String getOs() {
        return os;
    }


    /**
     * Sets the os value for this DedicatedInfoReturn.
     * 
     * @param os
     */
    public void setOs(java.lang.String os) {
        this.os = os;
    }


    /**
     * Gets the isKimSufi value for this DedicatedInfoReturn.
     * 
     * @return isKimSufi
     */
    public boolean isIsKimSufi() {
        return isKimSufi;
    }


    /**
     * Sets the isKimSufi value for this DedicatedInfoReturn.
     * 
     * @param isKimSufi
     */
    public void setIsKimSufi(boolean isKimSufi) {
        this.isKimSufi = isKimSufi;
    }


    /**
     * Gets the isRPS value for this DedicatedInfoReturn.
     * 
     * @return isRPS
     */
    public boolean isIsRPS() {
        return isRPS;
    }


    /**
     * Sets the isRPS value for this DedicatedInfoReturn.
     * 
     * @param isRPS
     */
    public void setIsRPS(boolean isRPS) {
        this.isRPS = isRPS;
    }


    /**
     * Gets the isHG value for this DedicatedInfoReturn.
     * 
     * @return isHG
     */
    public boolean isIsHG() {
        return isHG;
    }


    /**
     * Sets the isHG value for this DedicatedInfoReturn.
     * 
     * @param isHG
     */
    public void setIsHG(boolean isHG) {
        this.isHG = isHG;
    }


    /**
     * Gets the num value for this DedicatedInfoReturn.
     * 
     * @return num
     */
    public int getNum() {
        return num;
    }


    /**
     * Sets the num value for this DedicatedInfoReturn.
     * 
     * @param num
     */
    public void setNum(int num) {
        this.num = num;
    }


    /**
     * Gets the rack value for this DedicatedInfoReturn.
     * 
     * @return rack
     */
    public java.lang.String getRack() {
        return rack;
    }


    /**
     * Sets the rack value for this DedicatedInfoReturn.
     * 
     * @param rack
     */
    public void setRack(java.lang.String rack) {
        this.rack = rack;
    }


    /**
     * Gets the countryBilling value for this DedicatedInfoReturn.
     * 
     * @return countryBilling
     */
    public java.lang.String getCountryBilling() {
        return countryBilling;
    }


    /**
     * Sets the countryBilling value for this DedicatedInfoReturn.
     * 
     * @param countryBilling
     */
    public void setCountryBilling(java.lang.String countryBilling) {
        this.countryBilling = countryBilling;
    }


    /**
     * Gets the network value for this DedicatedInfoReturn.
     * 
     * @return network
     */
    public com.ovh.DedicatedNetworkStruct getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this DedicatedInfoReturn.
     * 
     * @param network
     */
    public void setNetwork(com.ovh.DedicatedNetworkStruct network) {
        this.network = network;
    }


    /**
     * Gets the capability value for this DedicatedInfoReturn.
     * 
     * @return capability
     */
    public com.ovh.DedicatedCapabilityStruct getCapability() {
        return capability;
    }


    /**
     * Sets the capability value for this DedicatedInfoReturn.
     * 
     * @param capability
     */
    public void setCapability(com.ovh.DedicatedCapabilityStruct capability) {
        this.capability = capability;
    }


    /**
     * Gets the freeDom value for this DedicatedInfoReturn.
     * 
     * @return freeDom
     */
    public com.ovh.DedicatedFreedomStruct getFreeDom() {
        return freeDom;
    }


    /**
     * Sets the freeDom value for this DedicatedInfoReturn.
     * 
     * @param freeDom
     */
    public void setFreeDom(com.ovh.DedicatedFreedomStruct freeDom) {
        this.freeDom = freeDom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedInfoReturn)) return false;
        DedicatedInfoReturn other = (DedicatedInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.datacenter==null && other.getDatacenter()==null) || 
             (this.datacenter!=null &&
              this.datacenter.equals(other.getDatacenter()))) &&
            ((this.os==null && other.getOs()==null) || 
             (this.os!=null &&
              this.os.equals(other.getOs()))) &&
            this.isKimSufi == other.isIsKimSufi() &&
            this.isRPS == other.isIsRPS() &&
            this.isHG == other.isIsHG() &&
            this.num == other.getNum() &&
            ((this.rack==null && other.getRack()==null) || 
             (this.rack!=null &&
              this.rack.equals(other.getRack()))) &&
            ((this.countryBilling==null && other.getCountryBilling()==null) || 
             (this.countryBilling!=null &&
              this.countryBilling.equals(other.getCountryBilling()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.capability==null && other.getCapability()==null) || 
             (this.capability!=null &&
              this.capability.equals(other.getCapability()))) &&
            ((this.freeDom==null && other.getFreeDom()==null) || 
             (this.freeDom!=null &&
              this.freeDom.equals(other.getFreeDom())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getDatacenter() != null) {
            _hashCode += getDatacenter().hashCode();
        }
        if (getOs() != null) {
            _hashCode += getOs().hashCode();
        }
        _hashCode += (isIsKimSufi() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsRPS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsHG() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNum();
        if (getRack() != null) {
            _hashCode += getRack().hashCode();
        }
        if (getCountryBilling() != null) {
            _hashCode += getCountryBilling().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getCapability() != null) {
            _hashCode += getCapability().hashCode();
        }
        if (getFreeDom() != null) {
            _hashCode += getFreeDom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datacenter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datacenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("os");
        elemField.setXmlName(new javax.xml.namespace.QName("", "os"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isKimSufi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isKimSufi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRPS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isRPS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isHG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isHG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num");
        elemField.setXmlName(new javax.xml.namespace.QName("", "num"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countryBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedCapabilityStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeDom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeDom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedFreedomStruct"));
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
