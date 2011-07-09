/**
 * DedicatedNetworkInterfaceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedNetworkInterfaceStruct  implements java.io.Serializable {
    private java.lang.String reverse;

    private java.lang.String ip;

    private java.lang.String ipv6;

    private java.lang.String mac;

    private java.lang.String _switch;

    private boolean icmp_drop;

    private boolean failover;

    private java.lang.String routedTo;

    private boolean ssl;

    private java.lang.String country;

    public DedicatedNetworkInterfaceStruct() {
    }

    public DedicatedNetworkInterfaceStruct(
           java.lang.String reverse,
           java.lang.String ip,
           java.lang.String ipv6,
           java.lang.String mac,
           java.lang.String _switch,
           boolean icmp_drop,
           boolean failover,
           java.lang.String routedTo,
           boolean ssl,
           java.lang.String country) {
           this.reverse = reverse;
           this.ip = ip;
           this.ipv6 = ipv6;
           this.mac = mac;
           this._switch = _switch;
           this.icmp_drop = icmp_drop;
           this.failover = failover;
           this.routedTo = routedTo;
           this.ssl = ssl;
           this.country = country;
    }


    /**
     * Gets the reverse value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return reverse
     */
    public java.lang.String getReverse() {
        return reverse;
    }


    /**
     * Sets the reverse value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param reverse
     */
    public void setReverse(java.lang.String reverse) {
        this.reverse = reverse;
    }


    /**
     * Gets the ip value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the ipv6 value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return ipv6
     */
    public java.lang.String getIpv6() {
        return ipv6;
    }


    /**
     * Sets the ipv6 value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param ipv6
     */
    public void setIpv6(java.lang.String ipv6) {
        this.ipv6 = ipv6;
    }


    /**
     * Gets the mac value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the _switch value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return _switch
     */
    public java.lang.String get_switch() {
        return _switch;
    }


    /**
     * Sets the _switch value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param _switch
     */
    public void set_switch(java.lang.String _switch) {
        this._switch = _switch;
    }


    /**
     * Gets the icmp_drop value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return icmp_drop
     */
    public boolean isIcmp_drop() {
        return icmp_drop;
    }


    /**
     * Sets the icmp_drop value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param icmp_drop
     */
    public void setIcmp_drop(boolean icmp_drop) {
        this.icmp_drop = icmp_drop;
    }


    /**
     * Gets the failover value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return failover
     */
    public boolean isFailover() {
        return failover;
    }


    /**
     * Sets the failover value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param failover
     */
    public void setFailover(boolean failover) {
        this.failover = failover;
    }


    /**
     * Gets the routedTo value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return routedTo
     */
    public java.lang.String getRoutedTo() {
        return routedTo;
    }


    /**
     * Sets the routedTo value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param routedTo
     */
    public void setRoutedTo(java.lang.String routedTo) {
        this.routedTo = routedTo;
    }


    /**
     * Gets the ssl value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return ssl
     */
    public boolean isSsl() {
        return ssl;
    }


    /**
     * Sets the ssl value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param ssl
     */
    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }


    /**
     * Gets the country value for this DedicatedNetworkInterfaceStruct.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this DedicatedNetworkInterfaceStruct.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedNetworkInterfaceStruct)) return false;
        DedicatedNetworkInterfaceStruct other = (DedicatedNetworkInterfaceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.reverse==null && other.getReverse()==null) || 
             (this.reverse!=null &&
              this.reverse.equals(other.getReverse()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.ipv6==null && other.getIpv6()==null) || 
             (this.ipv6!=null &&
              this.ipv6.equals(other.getIpv6()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this._switch==null && other.get_switch()==null) || 
             (this._switch!=null &&
              this._switch.equals(other.get_switch()))) &&
            this.icmp_drop == other.isIcmp_drop() &&
            this.failover == other.isFailover() &&
            ((this.routedTo==null && other.getRoutedTo()==null) || 
             (this.routedTo!=null &&
              this.routedTo.equals(other.getRoutedTo()))) &&
            this.ssl == other.isSsl() &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry())));
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
        if (getReverse() != null) {
            _hashCode += getReverse().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getIpv6() != null) {
            _hashCode += getIpv6().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (get_switch() != null) {
            _hashCode += get_switch().hashCode();
        }
        _hashCode += (isIcmp_drop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFailover() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRoutedTo() != null) {
            _hashCode += getRoutedTo().hashCode();
        }
        _hashCode += (isSsl() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedNetworkInterfaceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkInterfaceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_switch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "switch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmp_drop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmp_drop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routedTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
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
