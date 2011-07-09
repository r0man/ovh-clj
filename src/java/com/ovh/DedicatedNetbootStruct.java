/**
 * DedicatedNetbootStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedNetbootStruct  implements java.io.Serializable {
    private java.lang.String kernel;

    private java.lang.String cpufamily;

    private java.lang.String root;

    private boolean smp;

    private boolean ipv6;

    private boolean grsec;

    private java.lang.String hz;

    private int id;

    private java.lang.String state;

    public DedicatedNetbootStruct() {
    }

    public DedicatedNetbootStruct(
           java.lang.String kernel,
           java.lang.String cpufamily,
           java.lang.String root,
           boolean smp,
           boolean ipv6,
           boolean grsec,
           java.lang.String hz,
           int id,
           java.lang.String state) {
           this.kernel = kernel;
           this.cpufamily = cpufamily;
           this.root = root;
           this.smp = smp;
           this.ipv6 = ipv6;
           this.grsec = grsec;
           this.hz = hz;
           this.id = id;
           this.state = state;
    }


    /**
     * Gets the kernel value for this DedicatedNetbootStruct.
     * 
     * @return kernel
     */
    public java.lang.String getKernel() {
        return kernel;
    }


    /**
     * Sets the kernel value for this DedicatedNetbootStruct.
     * 
     * @param kernel
     */
    public void setKernel(java.lang.String kernel) {
        this.kernel = kernel;
    }


    /**
     * Gets the cpufamily value for this DedicatedNetbootStruct.
     * 
     * @return cpufamily
     */
    public java.lang.String getCpufamily() {
        return cpufamily;
    }


    /**
     * Sets the cpufamily value for this DedicatedNetbootStruct.
     * 
     * @param cpufamily
     */
    public void setCpufamily(java.lang.String cpufamily) {
        this.cpufamily = cpufamily;
    }


    /**
     * Gets the root value for this DedicatedNetbootStruct.
     * 
     * @return root
     */
    public java.lang.String getRoot() {
        return root;
    }


    /**
     * Sets the root value for this DedicatedNetbootStruct.
     * 
     * @param root
     */
    public void setRoot(java.lang.String root) {
        this.root = root;
    }


    /**
     * Gets the smp value for this DedicatedNetbootStruct.
     * 
     * @return smp
     */
    public boolean isSmp() {
        return smp;
    }


    /**
     * Sets the smp value for this DedicatedNetbootStruct.
     * 
     * @param smp
     */
    public void setSmp(boolean smp) {
        this.smp = smp;
    }


    /**
     * Gets the ipv6 value for this DedicatedNetbootStruct.
     * 
     * @return ipv6
     */
    public boolean isIpv6() {
        return ipv6;
    }


    /**
     * Sets the ipv6 value for this DedicatedNetbootStruct.
     * 
     * @param ipv6
     */
    public void setIpv6(boolean ipv6) {
        this.ipv6 = ipv6;
    }


    /**
     * Gets the grsec value for this DedicatedNetbootStruct.
     * 
     * @return grsec
     */
    public boolean isGrsec() {
        return grsec;
    }


    /**
     * Sets the grsec value for this DedicatedNetbootStruct.
     * 
     * @param grsec
     */
    public void setGrsec(boolean grsec) {
        this.grsec = grsec;
    }


    /**
     * Gets the hz value for this DedicatedNetbootStruct.
     * 
     * @return hz
     */
    public java.lang.String getHz() {
        return hz;
    }


    /**
     * Sets the hz value for this DedicatedNetbootStruct.
     * 
     * @param hz
     */
    public void setHz(java.lang.String hz) {
        this.hz = hz;
    }


    /**
     * Gets the id value for this DedicatedNetbootStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this DedicatedNetbootStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the state value for this DedicatedNetbootStruct.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this DedicatedNetbootStruct.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedNetbootStruct)) return false;
        DedicatedNetbootStruct other = (DedicatedNetbootStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kernel==null && other.getKernel()==null) || 
             (this.kernel!=null &&
              this.kernel.equals(other.getKernel()))) &&
            ((this.cpufamily==null && other.getCpufamily()==null) || 
             (this.cpufamily!=null &&
              this.cpufamily.equals(other.getCpufamily()))) &&
            ((this.root==null && other.getRoot()==null) || 
             (this.root!=null &&
              this.root.equals(other.getRoot()))) &&
            this.smp == other.isSmp() &&
            this.ipv6 == other.isIpv6() &&
            this.grsec == other.isGrsec() &&
            ((this.hz==null && other.getHz()==null) || 
             (this.hz!=null &&
              this.hz.equals(other.getHz()))) &&
            this.id == other.getId() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getKernel() != null) {
            _hashCode += getKernel().hashCode();
        }
        if (getCpufamily() != null) {
            _hashCode += getCpufamily().hashCode();
        }
        if (getRoot() != null) {
            _hashCode += getRoot().hashCode();
        }
        _hashCode += (isSmp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIpv6() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGrsec() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHz() != null) {
            _hashCode += getHz().hashCode();
        }
        _hashCode += getId();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedNetbootStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetbootStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kernel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kernel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpufamily");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpufamily"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("root");
        elemField.setXmlName(new javax.xml.namespace.QName("", "root"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("smp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "smp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grsec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grsec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hz");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hz"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
