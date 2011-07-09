/**
 * OrderFollowingUpStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class OrderFollowingUpStruct  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String urlId;

    private java.lang.String procedure;

    private java.lang.String install;

    private java.lang.String shipping;

    private java.lang.String cloture;

    private java.lang.String avancement;

    public OrderFollowingUpStruct() {
    }

    public OrderFollowingUpStruct(
           java.lang.String id,
           java.lang.String urlId,
           java.lang.String procedure,
           java.lang.String install,
           java.lang.String shipping,
           java.lang.String cloture,
           java.lang.String avancement) {
           this.id = id;
           this.urlId = urlId;
           this.procedure = procedure;
           this.install = install;
           this.shipping = shipping;
           this.cloture = cloture;
           this.avancement = avancement;
    }


    /**
     * Gets the id value for this OrderFollowingUpStruct.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this OrderFollowingUpStruct.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the urlId value for this OrderFollowingUpStruct.
     * 
     * @return urlId
     */
    public java.lang.String getUrlId() {
        return urlId;
    }


    /**
     * Sets the urlId value for this OrderFollowingUpStruct.
     * 
     * @param urlId
     */
    public void setUrlId(java.lang.String urlId) {
        this.urlId = urlId;
    }


    /**
     * Gets the procedure value for this OrderFollowingUpStruct.
     * 
     * @return procedure
     */
    public java.lang.String getProcedure() {
        return procedure;
    }


    /**
     * Sets the procedure value for this OrderFollowingUpStruct.
     * 
     * @param procedure
     */
    public void setProcedure(java.lang.String procedure) {
        this.procedure = procedure;
    }


    /**
     * Gets the install value for this OrderFollowingUpStruct.
     * 
     * @return install
     */
    public java.lang.String getInstall() {
        return install;
    }


    /**
     * Sets the install value for this OrderFollowingUpStruct.
     * 
     * @param install
     */
    public void setInstall(java.lang.String install) {
        this.install = install;
    }


    /**
     * Gets the shipping value for this OrderFollowingUpStruct.
     * 
     * @return shipping
     */
    public java.lang.String getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this OrderFollowingUpStruct.
     * 
     * @param shipping
     */
    public void setShipping(java.lang.String shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the cloture value for this OrderFollowingUpStruct.
     * 
     * @return cloture
     */
    public java.lang.String getCloture() {
        return cloture;
    }


    /**
     * Sets the cloture value for this OrderFollowingUpStruct.
     * 
     * @param cloture
     */
    public void setCloture(java.lang.String cloture) {
        this.cloture = cloture;
    }


    /**
     * Gets the avancement value for this OrderFollowingUpStruct.
     * 
     * @return avancement
     */
    public java.lang.String getAvancement() {
        return avancement;
    }


    /**
     * Sets the avancement value for this OrderFollowingUpStruct.
     * 
     * @param avancement
     */
    public void setAvancement(java.lang.String avancement) {
        this.avancement = avancement;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OrderFollowingUpStruct)) return false;
        OrderFollowingUpStruct other = (OrderFollowingUpStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.urlId==null && other.getUrlId()==null) || 
             (this.urlId!=null &&
              this.urlId.equals(other.getUrlId()))) &&
            ((this.procedure==null && other.getProcedure()==null) || 
             (this.procedure!=null &&
              this.procedure.equals(other.getProcedure()))) &&
            ((this.install==null && other.getInstall()==null) || 
             (this.install!=null &&
              this.install.equals(other.getInstall()))) &&
            ((this.shipping==null && other.getShipping()==null) || 
             (this.shipping!=null &&
              this.shipping.equals(other.getShipping()))) &&
            ((this.cloture==null && other.getCloture()==null) || 
             (this.cloture!=null &&
              this.cloture.equals(other.getCloture()))) &&
            ((this.avancement==null && other.getAvancement()==null) || 
             (this.avancement!=null &&
              this.avancement.equals(other.getAvancement())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getUrlId() != null) {
            _hashCode += getUrlId().hashCode();
        }
        if (getProcedure() != null) {
            _hashCode += getProcedure().hashCode();
        }
        if (getInstall() != null) {
            _hashCode += getInstall().hashCode();
        }
        if (getShipping() != null) {
            _hashCode += getShipping().hashCode();
        }
        if (getCloture() != null) {
            _hashCode += getCloture().hashCode();
        }
        if (getAvancement() != null) {
            _hashCode += getAvancement().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OrderFollowingUpStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "orderFollowingUpStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("procedure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "procedure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("install");
        elemField.setXmlName(new javax.xml.namespace.QName("", "install"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cloture");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cloture"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avancement");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avancement"));
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
