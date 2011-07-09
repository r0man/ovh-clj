/**
 * DedicatedCapabilityStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedCapabilityStruct  implements java.io.Serializable {
    private int backupFtp;

    private java.lang.String backupFtpServer;

    private int allocationBlockIp;

    private int additionalIp;

    private java.lang.String rootDevice;

    private int diskSize;

    private int tuning;

    public DedicatedCapabilityStruct() {
    }

    public DedicatedCapabilityStruct(
           int backupFtp,
           java.lang.String backupFtpServer,
           int allocationBlockIp,
           int additionalIp,
           java.lang.String rootDevice,
           int diskSize,
           int tuning) {
           this.backupFtp = backupFtp;
           this.backupFtpServer = backupFtpServer;
           this.allocationBlockIp = allocationBlockIp;
           this.additionalIp = additionalIp;
           this.rootDevice = rootDevice;
           this.diskSize = diskSize;
           this.tuning = tuning;
    }


    /**
     * Gets the backupFtp value for this DedicatedCapabilityStruct.
     * 
     * @return backupFtp
     */
    public int getBackupFtp() {
        return backupFtp;
    }


    /**
     * Sets the backupFtp value for this DedicatedCapabilityStruct.
     * 
     * @param backupFtp
     */
    public void setBackupFtp(int backupFtp) {
        this.backupFtp = backupFtp;
    }


    /**
     * Gets the backupFtpServer value for this DedicatedCapabilityStruct.
     * 
     * @return backupFtpServer
     */
    public java.lang.String getBackupFtpServer() {
        return backupFtpServer;
    }


    /**
     * Sets the backupFtpServer value for this DedicatedCapabilityStruct.
     * 
     * @param backupFtpServer
     */
    public void setBackupFtpServer(java.lang.String backupFtpServer) {
        this.backupFtpServer = backupFtpServer;
    }


    /**
     * Gets the allocationBlockIp value for this DedicatedCapabilityStruct.
     * 
     * @return allocationBlockIp
     */
    public int getAllocationBlockIp() {
        return allocationBlockIp;
    }


    /**
     * Sets the allocationBlockIp value for this DedicatedCapabilityStruct.
     * 
     * @param allocationBlockIp
     */
    public void setAllocationBlockIp(int allocationBlockIp) {
        this.allocationBlockIp = allocationBlockIp;
    }


    /**
     * Gets the additionalIp value for this DedicatedCapabilityStruct.
     * 
     * @return additionalIp
     */
    public int getAdditionalIp() {
        return additionalIp;
    }


    /**
     * Sets the additionalIp value for this DedicatedCapabilityStruct.
     * 
     * @param additionalIp
     */
    public void setAdditionalIp(int additionalIp) {
        this.additionalIp = additionalIp;
    }


    /**
     * Gets the rootDevice value for this DedicatedCapabilityStruct.
     * 
     * @return rootDevice
     */
    public java.lang.String getRootDevice() {
        return rootDevice;
    }


    /**
     * Sets the rootDevice value for this DedicatedCapabilityStruct.
     * 
     * @param rootDevice
     */
    public void setRootDevice(java.lang.String rootDevice) {
        this.rootDevice = rootDevice;
    }


    /**
     * Gets the diskSize value for this DedicatedCapabilityStruct.
     * 
     * @return diskSize
     */
    public int getDiskSize() {
        return diskSize;
    }


    /**
     * Sets the diskSize value for this DedicatedCapabilityStruct.
     * 
     * @param diskSize
     */
    public void setDiskSize(int diskSize) {
        this.diskSize = diskSize;
    }


    /**
     * Gets the tuning value for this DedicatedCapabilityStruct.
     * 
     * @return tuning
     */
    public int getTuning() {
        return tuning;
    }


    /**
     * Sets the tuning value for this DedicatedCapabilityStruct.
     * 
     * @param tuning
     */
    public void setTuning(int tuning) {
        this.tuning = tuning;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedCapabilityStruct)) return false;
        DedicatedCapabilityStruct other = (DedicatedCapabilityStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.backupFtp == other.getBackupFtp() &&
            ((this.backupFtpServer==null && other.getBackupFtpServer()==null) || 
             (this.backupFtpServer!=null &&
              this.backupFtpServer.equals(other.getBackupFtpServer()))) &&
            this.allocationBlockIp == other.getAllocationBlockIp() &&
            this.additionalIp == other.getAdditionalIp() &&
            ((this.rootDevice==null && other.getRootDevice()==null) || 
             (this.rootDevice!=null &&
              this.rootDevice.equals(other.getRootDevice()))) &&
            this.diskSize == other.getDiskSize() &&
            this.tuning == other.getTuning();
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
        _hashCode += getBackupFtp();
        if (getBackupFtpServer() != null) {
            _hashCode += getBackupFtpServer().hashCode();
        }
        _hashCode += getAllocationBlockIp();
        _hashCode += getAdditionalIp();
        if (getRootDevice() != null) {
            _hashCode += getRootDevice().hashCode();
        }
        _hashCode += getDiskSize();
        _hashCode += getTuning();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedCapabilityStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedCapabilityStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupFtp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupFtp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupFtpServer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupFtpServer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allocationBlockIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allocationBlockIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalIp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rootDevice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rootDevice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diskSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "diskSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tuning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tuning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
