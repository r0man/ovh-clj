/**
 * InfrastructureIpStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class InfrastructureIpStruct  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String netname;

    private java.lang.String routedTo;

    private java.lang.String status;

    private int addressesNumber;

    private java.lang.String networkIp;

    private java.lang.String[] ipAddressFromBlock;

    public InfrastructureIpStruct() {
    }

    public InfrastructureIpStruct(
           java.lang.String country,
           java.lang.String netname,
           java.lang.String routedTo,
           java.lang.String status,
           int addressesNumber,
           java.lang.String networkIp,
           java.lang.String[] ipAddressFromBlock) {
           this.country = country;
           this.netname = netname;
           this.routedTo = routedTo;
           this.status = status;
           this.addressesNumber = addressesNumber;
           this.networkIp = networkIp;
           this.ipAddressFromBlock = ipAddressFromBlock;
    }


    /**
     * Gets the country value for this InfrastructureIpStruct.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this InfrastructureIpStruct.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the netname value for this InfrastructureIpStruct.
     * 
     * @return netname
     */
    public java.lang.String getNetname() {
        return netname;
    }


    /**
     * Sets the netname value for this InfrastructureIpStruct.
     * 
     * @param netname
     */
    public void setNetname(java.lang.String netname) {
        this.netname = netname;
    }


    /**
     * Gets the routedTo value for this InfrastructureIpStruct.
     * 
     * @return routedTo
     */
    public java.lang.String getRoutedTo() {
        return routedTo;
    }


    /**
     * Sets the routedTo value for this InfrastructureIpStruct.
     * 
     * @param routedTo
     */
    public void setRoutedTo(java.lang.String routedTo) {
        this.routedTo = routedTo;
    }


    /**
     * Gets the status value for this InfrastructureIpStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InfrastructureIpStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the addressesNumber value for this InfrastructureIpStruct.
     * 
     * @return addressesNumber
     */
    public int getAddressesNumber() {
        return addressesNumber;
    }


    /**
     * Sets the addressesNumber value for this InfrastructureIpStruct.
     * 
     * @param addressesNumber
     */
    public void setAddressesNumber(int addressesNumber) {
        this.addressesNumber = addressesNumber;
    }


    /**
     * Gets the networkIp value for this InfrastructureIpStruct.
     * 
     * @return networkIp
     */
    public java.lang.String getNetworkIp() {
        return networkIp;
    }


    /**
     * Sets the networkIp value for this InfrastructureIpStruct.
     * 
     * @param networkIp
     */
    public void setNetworkIp(java.lang.String networkIp) {
        this.networkIp = networkIp;
    }


    /**
     * Gets the ipAddressFromBlock value for this InfrastructureIpStruct.
     * 
     * @return ipAddressFromBlock
     */
    public java.lang.String[] getIpAddressFromBlock() {
        return ipAddressFromBlock;
    }


    /**
     * Sets the ipAddressFromBlock value for this InfrastructureIpStruct.
     * 
     * @param ipAddressFromBlock
     */
    public void setIpAddressFromBlock(java.lang.String[] ipAddressFromBlock) {
        this.ipAddressFromBlock = ipAddressFromBlock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InfrastructureIpStruct)) return false;
        InfrastructureIpStruct other = (InfrastructureIpStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.netname==null && other.getNetname()==null) || 
             (this.netname!=null &&
              this.netname.equals(other.getNetname()))) &&
            ((this.routedTo==null && other.getRoutedTo()==null) || 
             (this.routedTo!=null &&
              this.routedTo.equals(other.getRoutedTo()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.addressesNumber == other.getAddressesNumber() &&
            ((this.networkIp==null && other.getNetworkIp()==null) || 
             (this.networkIp!=null &&
              this.networkIp.equals(other.getNetworkIp()))) &&
            ((this.ipAddressFromBlock==null && other.getIpAddressFromBlock()==null) || 
             (this.ipAddressFromBlock!=null &&
              java.util.Arrays.equals(this.ipAddressFromBlock, other.getIpAddressFromBlock())));
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getNetname() != null) {
            _hashCode += getNetname().hashCode();
        }
        if (getRoutedTo() != null) {
            _hashCode += getRoutedTo().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getAddressesNumber();
        if (getNetworkIp() != null) {
            _hashCode += getNetworkIp().hashCode();
        }
        if (getIpAddressFromBlock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpAddressFromBlock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpAddressFromBlock(), i);
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
        new org.apache.axis.description.TypeDesc(InfrastructureIpStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "InfrastructureIpStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routedTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routedTo"));
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
        elemField.setFieldName("addressesNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addressesNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("networkIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "networkIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipAddressFromBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipAddressFromBlock"));
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
