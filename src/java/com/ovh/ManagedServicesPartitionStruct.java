/**
 * ManagedServicesPartitionStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class ManagedServicesPartitionStruct  implements java.io.Serializable {
    private java.lang.String idZfs;

    private java.lang.String name;

    private java.lang.String size;

    private java.lang.String used;

    private java.lang.String state;

    private com.ovh.ManagedServicesAclStruct[] accessList;

    public ManagedServicesPartitionStruct() {
    }

    public ManagedServicesPartitionStruct(
           java.lang.String idZfs,
           java.lang.String name,
           java.lang.String size,
           java.lang.String used,
           java.lang.String state,
           com.ovh.ManagedServicesAclStruct[] accessList) {
           this.idZfs = idZfs;
           this.name = name;
           this.size = size;
           this.used = used;
           this.state = state;
           this.accessList = accessList;
    }


    /**
     * Gets the idZfs value for this ManagedServicesPartitionStruct.
     * 
     * @return idZfs
     */
    public java.lang.String getIdZfs() {
        return idZfs;
    }


    /**
     * Sets the idZfs value for this ManagedServicesPartitionStruct.
     * 
     * @param idZfs
     */
    public void setIdZfs(java.lang.String idZfs) {
        this.idZfs = idZfs;
    }


    /**
     * Gets the name value for this ManagedServicesPartitionStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ManagedServicesPartitionStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the size value for this ManagedServicesPartitionStruct.
     * 
     * @return size
     */
    public java.lang.String getSize() {
        return size;
    }


    /**
     * Sets the size value for this ManagedServicesPartitionStruct.
     * 
     * @param size
     */
    public void setSize(java.lang.String size) {
        this.size = size;
    }


    /**
     * Gets the used value for this ManagedServicesPartitionStruct.
     * 
     * @return used
     */
    public java.lang.String getUsed() {
        return used;
    }


    /**
     * Sets the used value for this ManagedServicesPartitionStruct.
     * 
     * @param used
     */
    public void setUsed(java.lang.String used) {
        this.used = used;
    }


    /**
     * Gets the state value for this ManagedServicesPartitionStruct.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this ManagedServicesPartitionStruct.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the accessList value for this ManagedServicesPartitionStruct.
     * 
     * @return accessList
     */
    public com.ovh.ManagedServicesAclStruct[] getAccessList() {
        return accessList;
    }


    /**
     * Sets the accessList value for this ManagedServicesPartitionStruct.
     * 
     * @param accessList
     */
    public void setAccessList(com.ovh.ManagedServicesAclStruct[] accessList) {
        this.accessList = accessList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ManagedServicesPartitionStruct)) return false;
        ManagedServicesPartitionStruct other = (ManagedServicesPartitionStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idZfs==null && other.getIdZfs()==null) || 
             (this.idZfs!=null &&
              this.idZfs.equals(other.getIdZfs()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.used==null && other.getUsed()==null) || 
             (this.used!=null &&
              this.used.equals(other.getUsed()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.accessList==null && other.getAccessList()==null) || 
             (this.accessList!=null &&
              java.util.Arrays.equals(this.accessList, other.getAccessList())));
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
        if (getIdZfs() != null) {
            _hashCode += getIdZfs().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getUsed() != null) {
            _hashCode += getUsed().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getAccessList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessList(), i);
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
        new org.apache.axis.description.TypeDesc(ManagedServicesPartitionStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "managedServicesPartitionStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idZfs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idZfs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new javax.xml.namespace.QName("", "used"));
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
        elemField.setFieldName("accessList");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "managedServicesAclStruct"));
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
