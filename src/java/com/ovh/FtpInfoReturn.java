/**
 * FtpInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class FtpInfoReturn  implements java.io.Serializable {
    private java.lang.String login;

    private int quota;

    private int maxQuota;

    private java.lang.String url;

    private java.lang.String isTodo;

    private boolean highCapacity;

    private boolean highSecurity;

    public FtpInfoReturn() {
    }

    public FtpInfoReturn(
           java.lang.String login,
           int quota,
           int maxQuota,
           java.lang.String url,
           java.lang.String isTodo,
           boolean highCapacity,
           boolean highSecurity) {
           this.login = login;
           this.quota = quota;
           this.maxQuota = maxQuota;
           this.url = url;
           this.isTodo = isTodo;
           this.highCapacity = highCapacity;
           this.highSecurity = highSecurity;
    }


    /**
     * Gets the login value for this FtpInfoReturn.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this FtpInfoReturn.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the quota value for this FtpInfoReturn.
     * 
     * @return quota
     */
    public int getQuota() {
        return quota;
    }


    /**
     * Sets the quota value for this FtpInfoReturn.
     * 
     * @param quota
     */
    public void setQuota(int quota) {
        this.quota = quota;
    }


    /**
     * Gets the maxQuota value for this FtpInfoReturn.
     * 
     * @return maxQuota
     */
    public int getMaxQuota() {
        return maxQuota;
    }


    /**
     * Sets the maxQuota value for this FtpInfoReturn.
     * 
     * @param maxQuota
     */
    public void setMaxQuota(int maxQuota) {
        this.maxQuota = maxQuota;
    }


    /**
     * Gets the url value for this FtpInfoReturn.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this FtpInfoReturn.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the isTodo value for this FtpInfoReturn.
     * 
     * @return isTodo
     */
    public java.lang.String getIsTodo() {
        return isTodo;
    }


    /**
     * Sets the isTodo value for this FtpInfoReturn.
     * 
     * @param isTodo
     */
    public void setIsTodo(java.lang.String isTodo) {
        this.isTodo = isTodo;
    }


    /**
     * Gets the highCapacity value for this FtpInfoReturn.
     * 
     * @return highCapacity
     */
    public boolean isHighCapacity() {
        return highCapacity;
    }


    /**
     * Sets the highCapacity value for this FtpInfoReturn.
     * 
     * @param highCapacity
     */
    public void setHighCapacity(boolean highCapacity) {
        this.highCapacity = highCapacity;
    }


    /**
     * Gets the highSecurity value for this FtpInfoReturn.
     * 
     * @return highSecurity
     */
    public boolean isHighSecurity() {
        return highSecurity;
    }


    /**
     * Sets the highSecurity value for this FtpInfoReturn.
     * 
     * @param highSecurity
     */
    public void setHighSecurity(boolean highSecurity) {
        this.highSecurity = highSecurity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FtpInfoReturn)) return false;
        FtpInfoReturn other = (FtpInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            this.quota == other.getQuota() &&
            this.maxQuota == other.getMaxQuota() &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.isTodo==null && other.getIsTodo()==null) || 
             (this.isTodo!=null &&
              this.isTodo.equals(other.getIsTodo()))) &&
            this.highCapacity == other.isHighCapacity() &&
            this.highSecurity == other.isHighSecurity();
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
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        _hashCode += getQuota();
        _hashCode += getMaxQuota();
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getIsTodo() != null) {
            _hashCode += getIsTodo().hashCode();
        }
        _hashCode += (isHighCapacity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHighSecurity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FtpInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "ftpInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isTodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highCapacity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highCapacity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("highSecurity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "highSecurity"));
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
