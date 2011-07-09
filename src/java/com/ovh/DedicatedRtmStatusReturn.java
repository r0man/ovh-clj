/**
 * DedicatedRtmStatusReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedRtmStatusReturn  implements java.io.Serializable {
    private com.ovh.RtmCpuStruct cpu;

    private com.ovh.RtmHddStruct[] hardDrives;

    private com.ovh.RtmSystemStruct systemInfo;

    private com.ovh.RtmMemoryStruct memory;

    private com.ovh.RtmMotherboardStruct motherboard;

    private com.ovh.RtmLspciStruct[] lspci;

    private com.ovh.RtmPortsStruct portsUsed;

    private com.ovh.RtmRaidStruct raid;

    public DedicatedRtmStatusReturn() {
    }

    public DedicatedRtmStatusReturn(
           com.ovh.RtmCpuStruct cpu,
           com.ovh.RtmHddStruct[] hardDrives,
           com.ovh.RtmSystemStruct systemInfo,
           com.ovh.RtmMemoryStruct memory,
           com.ovh.RtmMotherboardStruct motherboard,
           com.ovh.RtmLspciStruct[] lspci,
           com.ovh.RtmPortsStruct portsUsed,
           com.ovh.RtmRaidStruct raid) {
           this.cpu = cpu;
           this.hardDrives = hardDrives;
           this.systemInfo = systemInfo;
           this.memory = memory;
           this.motherboard = motherboard;
           this.lspci = lspci;
           this.portsUsed = portsUsed;
           this.raid = raid;
    }


    /**
     * Gets the cpu value for this DedicatedRtmStatusReturn.
     * 
     * @return cpu
     */
    public com.ovh.RtmCpuStruct getCpu() {
        return cpu;
    }


    /**
     * Sets the cpu value for this DedicatedRtmStatusReturn.
     * 
     * @param cpu
     */
    public void setCpu(com.ovh.RtmCpuStruct cpu) {
        this.cpu = cpu;
    }


    /**
     * Gets the hardDrives value for this DedicatedRtmStatusReturn.
     * 
     * @return hardDrives
     */
    public com.ovh.RtmHddStruct[] getHardDrives() {
        return hardDrives;
    }


    /**
     * Sets the hardDrives value for this DedicatedRtmStatusReturn.
     * 
     * @param hardDrives
     */
    public void setHardDrives(com.ovh.RtmHddStruct[] hardDrives) {
        this.hardDrives = hardDrives;
    }


    /**
     * Gets the systemInfo value for this DedicatedRtmStatusReturn.
     * 
     * @return systemInfo
     */
    public com.ovh.RtmSystemStruct getSystemInfo() {
        return systemInfo;
    }


    /**
     * Sets the systemInfo value for this DedicatedRtmStatusReturn.
     * 
     * @param systemInfo
     */
    public void setSystemInfo(com.ovh.RtmSystemStruct systemInfo) {
        this.systemInfo = systemInfo;
    }


    /**
     * Gets the memory value for this DedicatedRtmStatusReturn.
     * 
     * @return memory
     */
    public com.ovh.RtmMemoryStruct getMemory() {
        return memory;
    }


    /**
     * Sets the memory value for this DedicatedRtmStatusReturn.
     * 
     * @param memory
     */
    public void setMemory(com.ovh.RtmMemoryStruct memory) {
        this.memory = memory;
    }


    /**
     * Gets the motherboard value for this DedicatedRtmStatusReturn.
     * 
     * @return motherboard
     */
    public com.ovh.RtmMotherboardStruct getMotherboard() {
        return motherboard;
    }


    /**
     * Sets the motherboard value for this DedicatedRtmStatusReturn.
     * 
     * @param motherboard
     */
    public void setMotherboard(com.ovh.RtmMotherboardStruct motherboard) {
        this.motherboard = motherboard;
    }


    /**
     * Gets the lspci value for this DedicatedRtmStatusReturn.
     * 
     * @return lspci
     */
    public com.ovh.RtmLspciStruct[] getLspci() {
        return lspci;
    }


    /**
     * Sets the lspci value for this DedicatedRtmStatusReturn.
     * 
     * @param lspci
     */
    public void setLspci(com.ovh.RtmLspciStruct[] lspci) {
        this.lspci = lspci;
    }


    /**
     * Gets the portsUsed value for this DedicatedRtmStatusReturn.
     * 
     * @return portsUsed
     */
    public com.ovh.RtmPortsStruct getPortsUsed() {
        return portsUsed;
    }


    /**
     * Sets the portsUsed value for this DedicatedRtmStatusReturn.
     * 
     * @param portsUsed
     */
    public void setPortsUsed(com.ovh.RtmPortsStruct portsUsed) {
        this.portsUsed = portsUsed;
    }


    /**
     * Gets the raid value for this DedicatedRtmStatusReturn.
     * 
     * @return raid
     */
    public com.ovh.RtmRaidStruct getRaid() {
        return raid;
    }


    /**
     * Sets the raid value for this DedicatedRtmStatusReturn.
     * 
     * @param raid
     */
    public void setRaid(com.ovh.RtmRaidStruct raid) {
        this.raid = raid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedRtmStatusReturn)) return false;
        DedicatedRtmStatusReturn other = (DedicatedRtmStatusReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cpu==null && other.getCpu()==null) || 
             (this.cpu!=null &&
              this.cpu.equals(other.getCpu()))) &&
            ((this.hardDrives==null && other.getHardDrives()==null) || 
             (this.hardDrives!=null &&
              java.util.Arrays.equals(this.hardDrives, other.getHardDrives()))) &&
            ((this.systemInfo==null && other.getSystemInfo()==null) || 
             (this.systemInfo!=null &&
              this.systemInfo.equals(other.getSystemInfo()))) &&
            ((this.memory==null && other.getMemory()==null) || 
             (this.memory!=null &&
              this.memory.equals(other.getMemory()))) &&
            ((this.motherboard==null && other.getMotherboard()==null) || 
             (this.motherboard!=null &&
              this.motherboard.equals(other.getMotherboard()))) &&
            ((this.lspci==null && other.getLspci()==null) || 
             (this.lspci!=null &&
              java.util.Arrays.equals(this.lspci, other.getLspci()))) &&
            ((this.portsUsed==null && other.getPortsUsed()==null) || 
             (this.portsUsed!=null &&
              this.portsUsed.equals(other.getPortsUsed()))) &&
            ((this.raid==null && other.getRaid()==null) || 
             (this.raid!=null &&
              this.raid.equals(other.getRaid())));
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
        if (getCpu() != null) {
            _hashCode += getCpu().hashCode();
        }
        if (getHardDrives() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHardDrives());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHardDrives(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSystemInfo() != null) {
            _hashCode += getSystemInfo().hashCode();
        }
        if (getMemory() != null) {
            _hashCode += getMemory().hashCode();
        }
        if (getMotherboard() != null) {
            _hashCode += getMotherboard().hashCode();
        }
        if (getLspci() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLspci());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLspci(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPortsUsed() != null) {
            _hashCode += getPortsUsed().hashCode();
        }
        if (getRaid() != null) {
            _hashCode += getRaid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedRtmStatusReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedRtmStatusReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmCpuStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hardDrives");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hardDrives"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmHddStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmSystemStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmMemoryStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("motherboard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "motherboard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmMotherboardStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lspci");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lspci"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmLspciStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portsUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portsUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmPortsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmRaidStruct"));
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
