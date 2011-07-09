/**
 * RtmSystemKernelStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmSystemKernelStruct  implements java.io.Serializable {
    private java.lang.String version;

    private java.lang.String current;

    private java.lang.String current_26;

    private java.lang.String current_ipv6;

    private java.lang.String release;

    public RtmSystemKernelStruct() {
    }

    public RtmSystemKernelStruct(
           java.lang.String version,
           java.lang.String current,
           java.lang.String current_26,
           java.lang.String current_ipv6,
           java.lang.String release) {
           this.version = version;
           this.current = current;
           this.current_26 = current_26;
           this.current_ipv6 = current_ipv6;
           this.release = release;
    }


    /**
     * Gets the version value for this RtmSystemKernelStruct.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this RtmSystemKernelStruct.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the current value for this RtmSystemKernelStruct.
     * 
     * @return current
     */
    public java.lang.String getCurrent() {
        return current;
    }


    /**
     * Sets the current value for this RtmSystemKernelStruct.
     * 
     * @param current
     */
    public void setCurrent(java.lang.String current) {
        this.current = current;
    }


    /**
     * Gets the current_26 value for this RtmSystemKernelStruct.
     * 
     * @return current_26
     */
    public java.lang.String getCurrent_26() {
        return current_26;
    }


    /**
     * Sets the current_26 value for this RtmSystemKernelStruct.
     * 
     * @param current_26
     */
    public void setCurrent_26(java.lang.String current_26) {
        this.current_26 = current_26;
    }


    /**
     * Gets the current_ipv6 value for this RtmSystemKernelStruct.
     * 
     * @return current_ipv6
     */
    public java.lang.String getCurrent_ipv6() {
        return current_ipv6;
    }


    /**
     * Sets the current_ipv6 value for this RtmSystemKernelStruct.
     * 
     * @param current_ipv6
     */
    public void setCurrent_ipv6(java.lang.String current_ipv6) {
        this.current_ipv6 = current_ipv6;
    }


    /**
     * Gets the release value for this RtmSystemKernelStruct.
     * 
     * @return release
     */
    public java.lang.String getRelease() {
        return release;
    }


    /**
     * Sets the release value for this RtmSystemKernelStruct.
     * 
     * @param release
     */
    public void setRelease(java.lang.String release) {
        this.release = release;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmSystemKernelStruct)) return false;
        RtmSystemKernelStruct other = (RtmSystemKernelStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.current==null && other.getCurrent()==null) || 
             (this.current!=null &&
              this.current.equals(other.getCurrent()))) &&
            ((this.current_26==null && other.getCurrent_26()==null) || 
             (this.current_26!=null &&
              this.current_26.equals(other.getCurrent_26()))) &&
            ((this.current_ipv6==null && other.getCurrent_ipv6()==null) || 
             (this.current_ipv6!=null &&
              this.current_ipv6.equals(other.getCurrent_ipv6()))) &&
            ((this.release==null && other.getRelease()==null) || 
             (this.release!=null &&
              this.release.equals(other.getRelease())));
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
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getCurrent() != null) {
            _hashCode += getCurrent().hashCode();
        }
        if (getCurrent_26() != null) {
            _hashCode += getCurrent_26().hashCode();
        }
        if (getCurrent_ipv6() != null) {
            _hashCode += getCurrent_ipv6().hashCode();
        }
        if (getRelease() != null) {
            _hashCode += getRelease().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RtmSystemKernelStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmSystemKernelStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_26");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_26"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current_ipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "current_ipv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("release");
        elemField.setXmlName(new javax.xml.namespace.QName("", "release"));
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
