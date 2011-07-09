/**
 * RtmRaidPartitionVolumeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmRaidPartitionVolumeStruct  implements java.io.Serializable {
    private java.lang.String volumeName;

    private java.lang.String flags;

    private java.lang.String status;

    private java.lang.String type;

    private java.lang.String capacity;

    private int phys;

    private com.ovh.RtmRaidPartitionVolumeMemberStruct[] members;

    public RtmRaidPartitionVolumeStruct() {
    }

    public RtmRaidPartitionVolumeStruct(
           java.lang.String volumeName,
           java.lang.String flags,
           java.lang.String status,
           java.lang.String type,
           java.lang.String capacity,
           int phys,
           com.ovh.RtmRaidPartitionVolumeMemberStruct[] members) {
           this.volumeName = volumeName;
           this.flags = flags;
           this.status = status;
           this.type = type;
           this.capacity = capacity;
           this.phys = phys;
           this.members = members;
    }


    /**
     * Gets the volumeName value for this RtmRaidPartitionVolumeStruct.
     * 
     * @return volumeName
     */
    public java.lang.String getVolumeName() {
        return volumeName;
    }


    /**
     * Sets the volumeName value for this RtmRaidPartitionVolumeStruct.
     * 
     * @param volumeName
     */
    public void setVolumeName(java.lang.String volumeName) {
        this.volumeName = volumeName;
    }


    /**
     * Gets the flags value for this RtmRaidPartitionVolumeStruct.
     * 
     * @return flags
     */
    public java.lang.String getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this RtmRaidPartitionVolumeStruct.
     * 
     * @param flags
     */
    public void setFlags(java.lang.String flags) {
        this.flags = flags;
    }


    /**
     * Gets the status value for this RtmRaidPartitionVolumeStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RtmRaidPartitionVolumeStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the type value for this RtmRaidPartitionVolumeStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RtmRaidPartitionVolumeStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the capacity value for this RtmRaidPartitionVolumeStruct.
     * 
     * @return capacity
     */
    public java.lang.String getCapacity() {
        return capacity;
    }


    /**
     * Sets the capacity value for this RtmRaidPartitionVolumeStruct.
     * 
     * @param capacity
     */
    public void setCapacity(java.lang.String capacity) {
        this.capacity = capacity;
    }


    /**
     * Gets the phys value for this RtmRaidPartitionVolumeStruct.
     * 
     * @return phys
     */
    public int getPhys() {
        return phys;
    }


    /**
     * Sets the phys value for this RtmRaidPartitionVolumeStruct.
     * 
     * @param phys
     */
    public void setPhys(int phys) {
        this.phys = phys;
    }


    /**
     * Gets the members value for this RtmRaidPartitionVolumeStruct.
     * 
     * @return members
     */
    public com.ovh.RtmRaidPartitionVolumeMemberStruct[] getMembers() {
        return members;
    }


    /**
     * Sets the members value for this RtmRaidPartitionVolumeStruct.
     * 
     * @param members
     */
    public void setMembers(com.ovh.RtmRaidPartitionVolumeMemberStruct[] members) {
        this.members = members;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmRaidPartitionVolumeStruct)) return false;
        RtmRaidPartitionVolumeStruct other = (RtmRaidPartitionVolumeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.volumeName==null && other.getVolumeName()==null) || 
             (this.volumeName!=null &&
              this.volumeName.equals(other.getVolumeName()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.capacity==null && other.getCapacity()==null) || 
             (this.capacity!=null &&
              this.capacity.equals(other.getCapacity()))) &&
            this.phys == other.getPhys() &&
            ((this.members==null && other.getMembers()==null) || 
             (this.members!=null &&
              java.util.Arrays.equals(this.members, other.getMembers())));
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
        if (getVolumeName() != null) {
            _hashCode += getVolumeName().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCapacity() != null) {
            _hashCode += getCapacity().hashCode();
        }
        _hashCode += getPhys();
        if (getMembers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMembers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMembers(), i);
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
        new org.apache.axis.description.TypeDesc(RtmRaidPartitionVolumeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmRaidPartitionVolumeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumeName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volumeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("capacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "capacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("members");
        elemField.setXmlName(new javax.xml.namespace.QName("", "members"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmRaidPartitionVolumeMemberStruct"));
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
