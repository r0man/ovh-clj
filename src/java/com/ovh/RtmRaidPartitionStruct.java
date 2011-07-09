/**
 * RtmRaidPartitionStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmRaidPartitionStruct  implements java.io.Serializable {
    private java.lang.String partition;

    private com.ovh.RtmRaidPartitionVolumeStruct[] volumes;

    public RtmRaidPartitionStruct() {
    }

    public RtmRaidPartitionStruct(
           java.lang.String partition,
           com.ovh.RtmRaidPartitionVolumeStruct[] volumes) {
           this.partition = partition;
           this.volumes = volumes;
    }


    /**
     * Gets the partition value for this RtmRaidPartitionStruct.
     * 
     * @return partition
     */
    public java.lang.String getPartition() {
        return partition;
    }


    /**
     * Sets the partition value for this RtmRaidPartitionStruct.
     * 
     * @param partition
     */
    public void setPartition(java.lang.String partition) {
        this.partition = partition;
    }


    /**
     * Gets the volumes value for this RtmRaidPartitionStruct.
     * 
     * @return volumes
     */
    public com.ovh.RtmRaidPartitionVolumeStruct[] getVolumes() {
        return volumes;
    }


    /**
     * Sets the volumes value for this RtmRaidPartitionStruct.
     * 
     * @param volumes
     */
    public void setVolumes(com.ovh.RtmRaidPartitionVolumeStruct[] volumes) {
        this.volumes = volumes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmRaidPartitionStruct)) return false;
        RtmRaidPartitionStruct other = (RtmRaidPartitionStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.partition==null && other.getPartition()==null) || 
             (this.partition!=null &&
              this.partition.equals(other.getPartition()))) &&
            ((this.volumes==null && other.getVolumes()==null) || 
             (this.volumes!=null &&
              java.util.Arrays.equals(this.volumes, other.getVolumes())));
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
        if (getPartition() != null) {
            _hashCode += getPartition().hashCode();
        }
        if (getVolumes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVolumes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVolumes(), i);
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
        new org.apache.axis.description.TypeDesc(RtmRaidPartitionStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmRaidPartitionStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("volumes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "volumes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmRaidPartitionVolumeStruct"));
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
