/**
 * DedicatedIpLoadBalancingStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedIpLoadBalancingStruct  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ipLoadBalancing;

    private int active;

    private int inactive;

    private com.ovh.DedicatedIpLoadBalancingServerStruct[] serverList;

    public DedicatedIpLoadBalancingStruct() {
    }

    public DedicatedIpLoadBalancingStruct(
           java.lang.String name,
           java.lang.String ipLoadBalancing,
           int active,
           int inactive,
           com.ovh.DedicatedIpLoadBalancingServerStruct[] serverList) {
           this.name = name;
           this.ipLoadBalancing = ipLoadBalancing;
           this.active = active;
           this.inactive = inactive;
           this.serverList = serverList;
    }


    /**
     * Gets the name value for this DedicatedIpLoadBalancingStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DedicatedIpLoadBalancingStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ipLoadBalancing value for this DedicatedIpLoadBalancingStruct.
     * 
     * @return ipLoadBalancing
     */
    public java.lang.String getIpLoadBalancing() {
        return ipLoadBalancing;
    }


    /**
     * Sets the ipLoadBalancing value for this DedicatedIpLoadBalancingStruct.
     * 
     * @param ipLoadBalancing
     */
    public void setIpLoadBalancing(java.lang.String ipLoadBalancing) {
        this.ipLoadBalancing = ipLoadBalancing;
    }


    /**
     * Gets the active value for this DedicatedIpLoadBalancingStruct.
     * 
     * @return active
     */
    public int getActive() {
        return active;
    }


    /**
     * Sets the active value for this DedicatedIpLoadBalancingStruct.
     * 
     * @param active
     */
    public void setActive(int active) {
        this.active = active;
    }


    /**
     * Gets the inactive value for this DedicatedIpLoadBalancingStruct.
     * 
     * @return inactive
     */
    public int getInactive() {
        return inactive;
    }


    /**
     * Sets the inactive value for this DedicatedIpLoadBalancingStruct.
     * 
     * @param inactive
     */
    public void setInactive(int inactive) {
        this.inactive = inactive;
    }


    /**
     * Gets the serverList value for this DedicatedIpLoadBalancingStruct.
     * 
     * @return serverList
     */
    public com.ovh.DedicatedIpLoadBalancingServerStruct[] getServerList() {
        return serverList;
    }


    /**
     * Sets the serverList value for this DedicatedIpLoadBalancingStruct.
     * 
     * @param serverList
     */
    public void setServerList(com.ovh.DedicatedIpLoadBalancingServerStruct[] serverList) {
        this.serverList = serverList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedIpLoadBalancingStruct)) return false;
        DedicatedIpLoadBalancingStruct other = (DedicatedIpLoadBalancingStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ipLoadBalancing==null && other.getIpLoadBalancing()==null) || 
             (this.ipLoadBalancing!=null &&
              this.ipLoadBalancing.equals(other.getIpLoadBalancing()))) &&
            this.active == other.getActive() &&
            this.inactive == other.getInactive() &&
            ((this.serverList==null && other.getServerList()==null) || 
             (this.serverList!=null &&
              java.util.Arrays.equals(this.serverList, other.getServerList())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIpLoadBalancing() != null) {
            _hashCode += getIpLoadBalancing().hashCode();
        }
        _hashCode += getActive();
        _hashCode += getInactive();
        if (getServerList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServerList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServerList(), i);
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
        new org.apache.axis.description.TypeDesc(DedicatedIpLoadBalancingStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedIpLoadBalancingStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipLoadBalancing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipLoadBalancing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedIpLoadBalancingServerStruct"));
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
