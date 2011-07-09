/**
 * GlobalAccessStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class GlobalAccessStruct  implements java.io.Serializable {
    private java.lang.String name;

    private boolean domain;

    private boolean hosting;

    private boolean email;

    private boolean pop;

    private boolean dedicated;

    private java.lang.String reverse;

    private boolean alldom;

    private boolean ssl;

    private boolean rps;

    private boolean rpsOrphan;

    private boolean vs;

    private boolean voip;

    private boolean housing;

    private boolean sqlpriv;

    public GlobalAccessStruct() {
    }

    public GlobalAccessStruct(
           java.lang.String name,
           boolean domain,
           boolean hosting,
           boolean email,
           boolean pop,
           boolean dedicated,
           java.lang.String reverse,
           boolean alldom,
           boolean ssl,
           boolean rps,
           boolean rpsOrphan,
           boolean vs,
           boolean voip,
           boolean housing,
           boolean sqlpriv) {
           this.name = name;
           this.domain = domain;
           this.hosting = hosting;
           this.email = email;
           this.pop = pop;
           this.dedicated = dedicated;
           this.reverse = reverse;
           this.alldom = alldom;
           this.ssl = ssl;
           this.rps = rps;
           this.rpsOrphan = rpsOrphan;
           this.vs = vs;
           this.voip = voip;
           this.housing = housing;
           this.sqlpriv = sqlpriv;
    }


    /**
     * Gets the name value for this GlobalAccessStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this GlobalAccessStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the domain value for this GlobalAccessStruct.
     * 
     * @return domain
     */
    public boolean isDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this GlobalAccessStruct.
     * 
     * @param domain
     */
    public void setDomain(boolean domain) {
        this.domain = domain;
    }


    /**
     * Gets the hosting value for this GlobalAccessStruct.
     * 
     * @return hosting
     */
    public boolean isHosting() {
        return hosting;
    }


    /**
     * Sets the hosting value for this GlobalAccessStruct.
     * 
     * @param hosting
     */
    public void setHosting(boolean hosting) {
        this.hosting = hosting;
    }


    /**
     * Gets the email value for this GlobalAccessStruct.
     * 
     * @return email
     */
    public boolean isEmail() {
        return email;
    }


    /**
     * Sets the email value for this GlobalAccessStruct.
     * 
     * @param email
     */
    public void setEmail(boolean email) {
        this.email = email;
    }


    /**
     * Gets the pop value for this GlobalAccessStruct.
     * 
     * @return pop
     */
    public boolean isPop() {
        return pop;
    }


    /**
     * Sets the pop value for this GlobalAccessStruct.
     * 
     * @param pop
     */
    public void setPop(boolean pop) {
        this.pop = pop;
    }


    /**
     * Gets the dedicated value for this GlobalAccessStruct.
     * 
     * @return dedicated
     */
    public boolean isDedicated() {
        return dedicated;
    }


    /**
     * Sets the dedicated value for this GlobalAccessStruct.
     * 
     * @param dedicated
     */
    public void setDedicated(boolean dedicated) {
        this.dedicated = dedicated;
    }


    /**
     * Gets the reverse value for this GlobalAccessStruct.
     * 
     * @return reverse
     */
    public java.lang.String getReverse() {
        return reverse;
    }


    /**
     * Sets the reverse value for this GlobalAccessStruct.
     * 
     * @param reverse
     */
    public void setReverse(java.lang.String reverse) {
        this.reverse = reverse;
    }


    /**
     * Gets the alldom value for this GlobalAccessStruct.
     * 
     * @return alldom
     */
    public boolean isAlldom() {
        return alldom;
    }


    /**
     * Sets the alldom value for this GlobalAccessStruct.
     * 
     * @param alldom
     */
    public void setAlldom(boolean alldom) {
        this.alldom = alldom;
    }


    /**
     * Gets the ssl value for this GlobalAccessStruct.
     * 
     * @return ssl
     */
    public boolean isSsl() {
        return ssl;
    }


    /**
     * Sets the ssl value for this GlobalAccessStruct.
     * 
     * @param ssl
     */
    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }


    /**
     * Gets the rps value for this GlobalAccessStruct.
     * 
     * @return rps
     */
    public boolean isRps() {
        return rps;
    }


    /**
     * Sets the rps value for this GlobalAccessStruct.
     * 
     * @param rps
     */
    public void setRps(boolean rps) {
        this.rps = rps;
    }


    /**
     * Gets the rpsOrphan value for this GlobalAccessStruct.
     * 
     * @return rpsOrphan
     */
    public boolean isRpsOrphan() {
        return rpsOrphan;
    }


    /**
     * Sets the rpsOrphan value for this GlobalAccessStruct.
     * 
     * @param rpsOrphan
     */
    public void setRpsOrphan(boolean rpsOrphan) {
        this.rpsOrphan = rpsOrphan;
    }


    /**
     * Gets the vs value for this GlobalAccessStruct.
     * 
     * @return vs
     */
    public boolean isVs() {
        return vs;
    }


    /**
     * Sets the vs value for this GlobalAccessStruct.
     * 
     * @param vs
     */
    public void setVs(boolean vs) {
        this.vs = vs;
    }


    /**
     * Gets the voip value for this GlobalAccessStruct.
     * 
     * @return voip
     */
    public boolean isVoip() {
        return voip;
    }


    /**
     * Sets the voip value for this GlobalAccessStruct.
     * 
     * @param voip
     */
    public void setVoip(boolean voip) {
        this.voip = voip;
    }


    /**
     * Gets the housing value for this GlobalAccessStruct.
     * 
     * @return housing
     */
    public boolean isHousing() {
        return housing;
    }


    /**
     * Sets the housing value for this GlobalAccessStruct.
     * 
     * @param housing
     */
    public void setHousing(boolean housing) {
        this.housing = housing;
    }


    /**
     * Gets the sqlpriv value for this GlobalAccessStruct.
     * 
     * @return sqlpriv
     */
    public boolean isSqlpriv() {
        return sqlpriv;
    }


    /**
     * Sets the sqlpriv value for this GlobalAccessStruct.
     * 
     * @param sqlpriv
     */
    public void setSqlpriv(boolean sqlpriv) {
        this.sqlpriv = sqlpriv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GlobalAccessStruct)) return false;
        GlobalAccessStruct other = (GlobalAccessStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.domain == other.isDomain() &&
            this.hosting == other.isHosting() &&
            this.email == other.isEmail() &&
            this.pop == other.isPop() &&
            this.dedicated == other.isDedicated() &&
            ((this.reverse==null && other.getReverse()==null) || 
             (this.reverse!=null &&
              this.reverse.equals(other.getReverse()))) &&
            this.alldom == other.isAlldom() &&
            this.ssl == other.isSsl() &&
            this.rps == other.isRps() &&
            this.rpsOrphan == other.isRpsOrphan() &&
            this.vs == other.isVs() &&
            this.voip == other.isVoip() &&
            this.housing == other.isHousing() &&
            this.sqlpriv == other.isSqlpriv();
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += (isDomain() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHosting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEmail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPop() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDedicated() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReverse() != null) {
            _hashCode += getReverse().hashCode();
        }
        _hashCode += (isAlldom() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSsl() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRps() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRpsOrphan() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVoip() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHousing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSqlpriv() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GlobalAccessStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "globalAccessStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hosting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dedicated");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dedicated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alldom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alldom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rpsOrphan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rpsOrphan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "voip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("housing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "housing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlpriv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlpriv"));
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
