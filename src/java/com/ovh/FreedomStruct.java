/**
 * FreedomStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class FreedomStruct  implements java.io.Serializable {
    private java.lang.String referenceReferer;

    private java.lang.String creationDate;

    private java.lang.String status;

    private java.lang.String freeDom;

    private java.lang.String useDate;

    private java.lang.String domainReferer;

    public FreedomStruct() {
    }

    public FreedomStruct(
           java.lang.String referenceReferer,
           java.lang.String creationDate,
           java.lang.String status,
           java.lang.String freeDom,
           java.lang.String useDate,
           java.lang.String domainReferer) {
           this.referenceReferer = referenceReferer;
           this.creationDate = creationDate;
           this.status = status;
           this.freeDom = freeDom;
           this.useDate = useDate;
           this.domainReferer = domainReferer;
    }


    /**
     * Gets the referenceReferer value for this FreedomStruct.
     * 
     * @return referenceReferer
     */
    public java.lang.String getReferenceReferer() {
        return referenceReferer;
    }


    /**
     * Sets the referenceReferer value for this FreedomStruct.
     * 
     * @param referenceReferer
     */
    public void setReferenceReferer(java.lang.String referenceReferer) {
        this.referenceReferer = referenceReferer;
    }


    /**
     * Gets the creationDate value for this FreedomStruct.
     * 
     * @return creationDate
     */
    public java.lang.String getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this FreedomStruct.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.lang.String creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the status value for this FreedomStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FreedomStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the freeDom value for this FreedomStruct.
     * 
     * @return freeDom
     */
    public java.lang.String getFreeDom() {
        return freeDom;
    }


    /**
     * Sets the freeDom value for this FreedomStruct.
     * 
     * @param freeDom
     */
    public void setFreeDom(java.lang.String freeDom) {
        this.freeDom = freeDom;
    }


    /**
     * Gets the useDate value for this FreedomStruct.
     * 
     * @return useDate
     */
    public java.lang.String getUseDate() {
        return useDate;
    }


    /**
     * Sets the useDate value for this FreedomStruct.
     * 
     * @param useDate
     */
    public void setUseDate(java.lang.String useDate) {
        this.useDate = useDate;
    }


    /**
     * Gets the domainReferer value for this FreedomStruct.
     * 
     * @return domainReferer
     */
    public java.lang.String getDomainReferer() {
        return domainReferer;
    }


    /**
     * Sets the domainReferer value for this FreedomStruct.
     * 
     * @param domainReferer
     */
    public void setDomainReferer(java.lang.String domainReferer) {
        this.domainReferer = domainReferer;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FreedomStruct)) return false;
        FreedomStruct other = (FreedomStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceReferer==null && other.getReferenceReferer()==null) || 
             (this.referenceReferer!=null &&
              this.referenceReferer.equals(other.getReferenceReferer()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.freeDom==null && other.getFreeDom()==null) || 
             (this.freeDom!=null &&
              this.freeDom.equals(other.getFreeDom()))) &&
            ((this.useDate==null && other.getUseDate()==null) || 
             (this.useDate!=null &&
              this.useDate.equals(other.getUseDate()))) &&
            ((this.domainReferer==null && other.getDomainReferer()==null) || 
             (this.domainReferer!=null &&
              this.domainReferer.equals(other.getDomainReferer())));
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
        if (getReferenceReferer() != null) {
            _hashCode += getReferenceReferer().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFreeDom() != null) {
            _hashCode += getFreeDom().hashCode();
        }
        if (getUseDate() != null) {
            _hashCode += getUseDate().hashCode();
        }
        if (getDomainReferer() != null) {
            _hashCode += getDomainReferer().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FreedomStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "freedomStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceReferer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referenceReferer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeDom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeDom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainReferer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainReferer"));
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
