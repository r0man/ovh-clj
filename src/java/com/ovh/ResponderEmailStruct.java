/**
 * ResponderEmailStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class ResponderEmailStruct  implements java.io.Serializable {
    private java.lang.String domain;

    private java.lang.String responder;

    private java.lang.String content;

    private boolean hasPop;

    private boolean hasAlias;

    public ResponderEmailStruct() {
    }

    public ResponderEmailStruct(
           java.lang.String domain,
           java.lang.String responder,
           java.lang.String content,
           boolean hasPop,
           boolean hasAlias) {
           this.domain = domain;
           this.responder = responder;
           this.content = content;
           this.hasPop = hasPop;
           this.hasAlias = hasAlias;
    }


    /**
     * Gets the domain value for this ResponderEmailStruct.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this ResponderEmailStruct.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the responder value for this ResponderEmailStruct.
     * 
     * @return responder
     */
    public java.lang.String getResponder() {
        return responder;
    }


    /**
     * Sets the responder value for this ResponderEmailStruct.
     * 
     * @param responder
     */
    public void setResponder(java.lang.String responder) {
        this.responder = responder;
    }


    /**
     * Gets the content value for this ResponderEmailStruct.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this ResponderEmailStruct.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the hasPop value for this ResponderEmailStruct.
     * 
     * @return hasPop
     */
    public boolean isHasPop() {
        return hasPop;
    }


    /**
     * Sets the hasPop value for this ResponderEmailStruct.
     * 
     * @param hasPop
     */
    public void setHasPop(boolean hasPop) {
        this.hasPop = hasPop;
    }


    /**
     * Gets the hasAlias value for this ResponderEmailStruct.
     * 
     * @return hasAlias
     */
    public boolean isHasAlias() {
        return hasAlias;
    }


    /**
     * Sets the hasAlias value for this ResponderEmailStruct.
     * 
     * @param hasAlias
     */
    public void setHasAlias(boolean hasAlias) {
        this.hasAlias = hasAlias;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponderEmailStruct)) return false;
        ResponderEmailStruct other = (ResponderEmailStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.responder==null && other.getResponder()==null) || 
             (this.responder!=null &&
              this.responder.equals(other.getResponder()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            this.hasPop == other.isHasPop() &&
            this.hasAlias == other.isHasAlias();
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getResponder() != null) {
            _hashCode += getResponder().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        _hashCode += (isHasPop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasAlias() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponderEmailStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "responderEmailStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("", "content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasPop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasPop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasAlias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasAlias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
