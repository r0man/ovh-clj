/**
 * DedicatedRtmListBackdoorStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedRtmListBackdoorStruct  implements java.io.Serializable {
    private java.lang.String date_email;

    private java.lang.String date_start;

    private java.lang.String date_end;

    private java.lang.String date_today;

    private int id;

    private java.lang.String uid;

    private int pid;

    private boolean do_not_mail;

    private boolean active;

    private int status;

    private java.lang.String ip;

    private java.lang.String type;

    private java.lang.String cmdline;

    private int port;

    private java.lang.String ports;

    private java.lang.String procname;

    private java.lang.String exe;

    public DedicatedRtmListBackdoorStruct() {
    }

    public DedicatedRtmListBackdoorStruct(
           java.lang.String date_email,
           java.lang.String date_start,
           java.lang.String date_end,
           java.lang.String date_today,
           int id,
           java.lang.String uid,
           int pid,
           boolean do_not_mail,
           boolean active,
           int status,
           java.lang.String ip,
           java.lang.String type,
           java.lang.String cmdline,
           int port,
           java.lang.String ports,
           java.lang.String procname,
           java.lang.String exe) {
           this.date_email = date_email;
           this.date_start = date_start;
           this.date_end = date_end;
           this.date_today = date_today;
           this.id = id;
           this.uid = uid;
           this.pid = pid;
           this.do_not_mail = do_not_mail;
           this.active = active;
           this.status = status;
           this.ip = ip;
           this.type = type;
           this.cmdline = cmdline;
           this.port = port;
           this.ports = ports;
           this.procname = procname;
           this.exe = exe;
    }


    /**
     * Gets the date_email value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return date_email
     */
    public java.lang.String getDate_email() {
        return date_email;
    }


    /**
     * Sets the date_email value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param date_email
     */
    public void setDate_email(java.lang.String date_email) {
        this.date_email = date_email;
    }


    /**
     * Gets the date_start value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return date_start
     */
    public java.lang.String getDate_start() {
        return date_start;
    }


    /**
     * Sets the date_start value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param date_start
     */
    public void setDate_start(java.lang.String date_start) {
        this.date_start = date_start;
    }


    /**
     * Gets the date_end value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return date_end
     */
    public java.lang.String getDate_end() {
        return date_end;
    }


    /**
     * Sets the date_end value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param date_end
     */
    public void setDate_end(java.lang.String date_end) {
        this.date_end = date_end;
    }


    /**
     * Gets the date_today value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return date_today
     */
    public java.lang.String getDate_today() {
        return date_today;
    }


    /**
     * Sets the date_today value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param date_today
     */
    public void setDate_today(java.lang.String date_today) {
        this.date_today = date_today;
    }


    /**
     * Gets the id value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the uid value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return uid
     */
    public java.lang.String getUid() {
        return uid;
    }


    /**
     * Sets the uid value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param uid
     */
    public void setUid(java.lang.String uid) {
        this.uid = uid;
    }


    /**
     * Gets the pid value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return pid
     */
    public int getPid() {
        return pid;
    }


    /**
     * Sets the pid value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param pid
     */
    public void setPid(int pid) {
        this.pid = pid;
    }


    /**
     * Gets the do_not_mail value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return do_not_mail
     */
    public boolean isDo_not_mail() {
        return do_not_mail;
    }


    /**
     * Sets the do_not_mail value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param do_not_mail
     */
    public void setDo_not_mail(boolean do_not_mail) {
        this.do_not_mail = do_not_mail;
    }


    /**
     * Gets the active value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the status value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the ip value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the type value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the cmdline value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return cmdline
     */
    public java.lang.String getCmdline() {
        return cmdline;
    }


    /**
     * Sets the cmdline value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param cmdline
     */
    public void setCmdline(java.lang.String cmdline) {
        this.cmdline = cmdline;
    }


    /**
     * Gets the port value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return port
     */
    public int getPort() {
        return port;
    }


    /**
     * Sets the port value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param port
     */
    public void setPort(int port) {
        this.port = port;
    }


    /**
     * Gets the ports value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return ports
     */
    public java.lang.String getPorts() {
        return ports;
    }


    /**
     * Sets the ports value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param ports
     */
    public void setPorts(java.lang.String ports) {
        this.ports = ports;
    }


    /**
     * Gets the procname value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return procname
     */
    public java.lang.String getProcname() {
        return procname;
    }


    /**
     * Sets the procname value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param procname
     */
    public void setProcname(java.lang.String procname) {
        this.procname = procname;
    }


    /**
     * Gets the exe value for this DedicatedRtmListBackdoorStruct.
     * 
     * @return exe
     */
    public java.lang.String getExe() {
        return exe;
    }


    /**
     * Sets the exe value for this DedicatedRtmListBackdoorStruct.
     * 
     * @param exe
     */
    public void setExe(java.lang.String exe) {
        this.exe = exe;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedRtmListBackdoorStruct)) return false;
        DedicatedRtmListBackdoorStruct other = (DedicatedRtmListBackdoorStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.date_email==null && other.getDate_email()==null) || 
             (this.date_email!=null &&
              this.date_email.equals(other.getDate_email()))) &&
            ((this.date_start==null && other.getDate_start()==null) || 
             (this.date_start!=null &&
              this.date_start.equals(other.getDate_start()))) &&
            ((this.date_end==null && other.getDate_end()==null) || 
             (this.date_end!=null &&
              this.date_end.equals(other.getDate_end()))) &&
            ((this.date_today==null && other.getDate_today()==null) || 
             (this.date_today!=null &&
              this.date_today.equals(other.getDate_today()))) &&
            this.id == other.getId() &&
            ((this.uid==null && other.getUid()==null) || 
             (this.uid!=null &&
              this.uid.equals(other.getUid()))) &&
            this.pid == other.getPid() &&
            this.do_not_mail == other.isDo_not_mail() &&
            this.active == other.isActive() &&
            this.status == other.getStatus() &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.cmdline==null && other.getCmdline()==null) || 
             (this.cmdline!=null &&
              this.cmdline.equals(other.getCmdline()))) &&
            this.port == other.getPort() &&
            ((this.ports==null && other.getPorts()==null) || 
             (this.ports!=null &&
              this.ports.equals(other.getPorts()))) &&
            ((this.procname==null && other.getProcname()==null) || 
             (this.procname!=null &&
              this.procname.equals(other.getProcname()))) &&
            ((this.exe==null && other.getExe()==null) || 
             (this.exe!=null &&
              this.exe.equals(other.getExe())));
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
        if (getDate_email() != null) {
            _hashCode += getDate_email().hashCode();
        }
        if (getDate_start() != null) {
            _hashCode += getDate_start().hashCode();
        }
        if (getDate_end() != null) {
            _hashCode += getDate_end().hashCode();
        }
        if (getDate_today() != null) {
            _hashCode += getDate_today().hashCode();
        }
        _hashCode += getId();
        if (getUid() != null) {
            _hashCode += getUid().hashCode();
        }
        _hashCode += getPid();
        _hashCode += (isDo_not_mail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getStatus();
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCmdline() != null) {
            _hashCode += getCmdline().hashCode();
        }
        _hashCode += getPort();
        if (getPorts() != null) {
            _hashCode += getPorts().hashCode();
        }
        if (getProcname() != null) {
            _hashCode += getProcname().hashCode();
        }
        if (getExe() != null) {
            _hashCode += getExe().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedRtmListBackdoorStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedRtmListBackdoorStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_start");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_end");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date_today");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date_today"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("do_not_mail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "do_not_mail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
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
        elemField.setFieldName("cmdline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmdline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ports"));
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
        elemField.setFieldName("exe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exe"));
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
