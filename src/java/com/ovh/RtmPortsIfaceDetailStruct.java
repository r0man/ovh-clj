/**
 * RtmPortsIfaceDetailStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmPortsIfaceDetailStruct  implements java.io.Serializable {
    private java.lang.String port;

    private java.lang.String procname;

    private java.lang.String uid;

    private int pid;

    private java.lang.String cmdline;

    private java.lang.String exe;

    private java.lang.String username;

    public RtmPortsIfaceDetailStruct() {
    }

    public RtmPortsIfaceDetailStruct(
           java.lang.String port,
           java.lang.String procname,
           java.lang.String uid,
           int pid,
           java.lang.String cmdline,
           java.lang.String exe,
           java.lang.String username) {
           this.port = port;
           this.procname = procname;
           this.uid = uid;
           this.pid = pid;
           this.cmdline = cmdline;
           this.exe = exe;
           this.username = username;
    }


    /**
     * Gets the port value for this RtmPortsIfaceDetailStruct.
     * 
     * @return port
     */
    public java.lang.String getPort() {
        return port;
    }


    /**
     * Sets the port value for this RtmPortsIfaceDetailStruct.
     * 
     * @param port
     */
    public void setPort(java.lang.String port) {
        this.port = port;
    }


    /**
     * Gets the procname value for this RtmPortsIfaceDetailStruct.
     * 
     * @return procname
     */
    public java.lang.String getProcname() {
        return procname;
    }


    /**
     * Sets the procname value for this RtmPortsIfaceDetailStruct.
     * 
     * @param procname
     */
    public void setProcname(java.lang.String procname) {
        this.procname = procname;
    }


    /**
     * Gets the uid value for this RtmPortsIfaceDetailStruct.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this RtmPortsIfaceDetailStruct.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }


    /**
     * Gets the pid value for this RtmPortsIfaceDetailStruct.
     * 
     * @return pid
     */
    public int getPid() {
        return pid;
    }


    /**
     * Sets the pid value for this RtmPortsIfaceDetailStruct.
     * 
     * @param pid
     */
    public void setPid(int pid) {
        this.pid = pid;
    }


    /**
     * Gets the cmdline value for this RtmPortsIfaceDetailStruct.
     * 
     * @return cmdline
     */
    public java.lang.String getCmdline() {
        return cmdline;
    }


    /**
     * Sets the cmdline value for this RtmPortsIfaceDetailStruct.
     * 
     * @param cmdline
     */
    public void setCmdline(java.lang.String cmdline) {
        this.cmdline = cmdline;
    }


    /**
     * Gets the exe value for this RtmPortsIfaceDetailStruct.
     * 
     * @return exe
     */
    public java.lang.String getExe() {
        return exe;
    }


    /**
     * Sets the exe value for this RtmPortsIfaceDetailStruct.
     * 
     * @param exe
     */
    public void setExe(java.lang.String exe) {
        this.exe = exe;
    }


    /**
     * Gets the username value for this RtmPortsIfaceDetailStruct.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this RtmPortsIfaceDetailStruct.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmPortsIfaceDetailStruct)) return false;
        RtmPortsIfaceDetailStruct other = (RtmPortsIfaceDetailStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.procname==null && other.getProcname()==null) || 
             (this.procname!=null &&
              this.procname.equals(other.getProcname()))) &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid()))) &&
            this.pid == other.getPid() &&
            ((this.cmdline==null && other.getCmdline()==null) || 
             (this.cmdline!=null &&
              this.cmdline.equals(other.getCmdline()))) &&
            ((this.exe==null && other.getExe()==null) || 
             (this.exe!=null &&
              this.exe.equals(other.getExe()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername())));
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
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getProcname() != null) {
            _hashCode += getProcname().hashCode();
        }
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        _hashCode += getPid();
        if (getCmdline() != null) {
            _hashCode += getCmdline().hashCode();
        }
        if (getExe() != null) {
            _hashCode += getExe().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RtmPortsIfaceDetailStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmPortsIfaceDetailStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "procname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmdline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
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
