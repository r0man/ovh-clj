/**
 * RtmSystemStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmSystemStruct  implements java.io.Serializable {
    private java.lang.String last_update;

    private java.lang.String ip;

    private java.lang.String hostname;

    private int uptime;

    private java.lang.String freshest_file_date;

    private com.ovh.RtmSystemOsStruct os;

    private com.ovh.RtmSystemRtmStruct rtm;

    private com.ovh.RtmSystemKernelStruct kernel;

    public RtmSystemStruct() {
    }

    public RtmSystemStruct(
           java.lang.String last_update,
           java.lang.String ip,
           java.lang.String hostname,
           int uptime,
           java.lang.String freshest_file_date,
           com.ovh.RtmSystemOsStruct os,
           com.ovh.RtmSystemRtmStruct rtm,
           com.ovh.RtmSystemKernelStruct kernel) {
           this.last_update = last_update;
           this.ip = ip;
           this.hostname = hostname;
           this.uptime = uptime;
           this.freshest_file_date = freshest_file_date;
           this.os = os;
           this.rtm = rtm;
           this.kernel = kernel;
    }


    /**
     * Gets the last_update value for this RtmSystemStruct.
     * 
     * @return last_update
     */
    public java.lang.String getLast_update() {
        return last_update;
    }


    /**
     * Sets the last_update value for this RtmSystemStruct.
     * 
     * @param last_update
     */
    public void setLast_update(java.lang.String last_update) {
        this.last_update = last_update;
    }


    /**
     * Gets the ip value for this RtmSystemStruct.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this RtmSystemStruct.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the hostname value for this RtmSystemStruct.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this RtmSystemStruct.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the uptime value for this RtmSystemStruct.
     * 
     * @return uptime
     */
    public int getUptime() {
        return uptime;
    }


    /**
     * Sets the uptime value for this RtmSystemStruct.
     * 
     * @param uptime
     */
    public void setUptime(int uptime) {
        this.uptime = uptime;
    }


    /**
     * Gets the freshest_file_date value for this RtmSystemStruct.
     * 
     * @return freshest_file_date
     */
    public java.lang.String getFreshest_file_date() {
        return freshest_file_date;
    }


    /**
     * Sets the freshest_file_date value for this RtmSystemStruct.
     * 
     * @param freshest_file_date
     */
    public void setFreshest_file_date(java.lang.String freshest_file_date) {
        this.freshest_file_date = freshest_file_date;
    }


    /**
     * Gets the os value for this RtmSystemStruct.
     * 
     * @return os
     */
    public com.ovh.RtmSystemOsStruct getOs() {
        return os;
    }


    /**
     * Sets the os value for this RtmSystemStruct.
     * 
     * @param os
     */
    public void setOs(com.ovh.RtmSystemOsStruct os) {
        this.os = os;
    }


    /**
     * Gets the rtm value for this RtmSystemStruct.
     * 
     * @return rtm
     */
    public com.ovh.RtmSystemRtmStruct getRtm() {
        return rtm;
    }


    /**
     * Sets the rtm value for this RtmSystemStruct.
     * 
     * @param rtm
     */
    public void setRtm(com.ovh.RtmSystemRtmStruct rtm) {
        this.rtm = rtm;
    }


    /**
     * Gets the kernel value for this RtmSystemStruct.
     * 
     * @return kernel
     */
    public com.ovh.RtmSystemKernelStruct getKernel() {
        return kernel;
    }


    /**
     * Sets the kernel value for this RtmSystemStruct.
     * 
     * @param kernel
     */
    public void setKernel(com.ovh.RtmSystemKernelStruct kernel) {
        this.kernel = kernel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmSystemStruct)) return false;
        RtmSystemStruct other = (RtmSystemStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.last_update==null && other.getLast_update()==null) || 
             (this.last_update!=null &&
              this.last_update.equals(other.getLast_update()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            this.uptime == other.getUptime() &&
            ((this.freshest_file_date==null && other.getFreshest_file_date()==null) || 
             (this.freshest_file_date!=null &&
              this.freshest_file_date.equals(other.getFreshest_file_date()))) &&
            ((this.os==null && other.getOs()==null) || 
             (this.os!=null &&
              this.os.equals(other.getOs()))) &&
            ((this.rtm==null && other.getRtm()==null) || 
             (this.rtm!=null &&
              this.rtm.equals(other.getRtm()))) &&
            ((this.kernel==null && other.getKernel()==null) || 
             (this.kernel!=null &&
              this.kernel.equals(other.getKernel())));
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
        if (getLast_update() != null) {
            _hashCode += getLast_update().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        _hashCode += getUptime();
        if (getFreshest_file_date() != null) {
            _hashCode += getFreshest_file_date().hashCode();
        }
        if (getOs() != null) {
            _hashCode += getOs().hashCode();
        }
        if (getRtm() != null) {
            _hashCode += getRtm().hashCode();
        }
        if (getKernel() != null) {
            _hashCode += getKernel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RtmSystemStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmSystemStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last_update");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last_update"));
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
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uptime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uptime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freshest_file_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freshest_file_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("os");
        elemField.setXmlName(new javax.xml.namespace.QName("", "os"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmSystemOsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmSystemRtmStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kernel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kernel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmSystemKernelStruct"));
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
