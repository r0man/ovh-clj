/**
 * EmailGetCapabilitiesReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class EmailGetCapabilitiesReturn  implements java.io.Serializable {
    private java.lang.String name;

    private int nbpops;

    private int nbforwards;

    private int nbaliases;

    private int nbresponders;

    private int nbmls;

    public EmailGetCapabilitiesReturn() {
    }

    public EmailGetCapabilitiesReturn(
           java.lang.String name,
           int nbpops,
           int nbforwards,
           int nbaliases,
           int nbresponders,
           int nbmls) {
           this.name = name;
           this.nbpops = nbpops;
           this.nbforwards = nbforwards;
           this.nbaliases = nbaliases;
           this.nbresponders = nbresponders;
           this.nbmls = nbmls;
    }


    /**
     * Gets the name value for this EmailGetCapabilitiesReturn.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this EmailGetCapabilitiesReturn.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nbpops value for this EmailGetCapabilitiesReturn.
     * 
     * @return nbpops
     */
    public int getNbpops() {
        return nbpops;
    }


    /**
     * Sets the nbpops value for this EmailGetCapabilitiesReturn.
     * 
     * @param nbpops
     */
    public void setNbpops(int nbpops) {
        this.nbpops = nbpops;
    }


    /**
     * Gets the nbforwards value for this EmailGetCapabilitiesReturn.
     * 
     * @return nbforwards
     */
    public int getNbforwards() {
        return nbforwards;
    }


    /**
     * Sets the nbforwards value for this EmailGetCapabilitiesReturn.
     * 
     * @param nbforwards
     */
    public void setNbforwards(int nbforwards) {
        this.nbforwards = nbforwards;
    }


    /**
     * Gets the nbaliases value for this EmailGetCapabilitiesReturn.
     * 
     * @return nbaliases
     */
    public int getNbaliases() {
        return nbaliases;
    }


    /**
     * Sets the nbaliases value for this EmailGetCapabilitiesReturn.
     * 
     * @param nbaliases
     */
    public void setNbaliases(int nbaliases) {
        this.nbaliases = nbaliases;
    }


    /**
     * Gets the nbresponders value for this EmailGetCapabilitiesReturn.
     * 
     * @return nbresponders
     */
    public int getNbresponders() {
        return nbresponders;
    }


    /**
     * Sets the nbresponders value for this EmailGetCapabilitiesReturn.
     * 
     * @param nbresponders
     */
    public void setNbresponders(int nbresponders) {
        this.nbresponders = nbresponders;
    }


    /**
     * Gets the nbmls value for this EmailGetCapabilitiesReturn.
     * 
     * @return nbmls
     */
    public int getNbmls() {
        return nbmls;
    }


    /**
     * Sets the nbmls value for this EmailGetCapabilitiesReturn.
     * 
     * @param nbmls
     */
    public void setNbmls(int nbmls) {
        this.nbmls = nbmls;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmailGetCapabilitiesReturn)) return false;
        EmailGetCapabilitiesReturn other = (EmailGetCapabilitiesReturn) obj;
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
            this.nbpops == other.getNbpops() &&
            this.nbforwards == other.getNbforwards() &&
            this.nbaliases == other.getNbaliases() &&
            this.nbresponders == other.getNbresponders() &&
            this.nbmls == other.getNbmls();
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
        _hashCode += getNbpops();
        _hashCode += getNbforwards();
        _hashCode += getNbaliases();
        _hashCode += getNbresponders();
        _hashCode += getNbmls();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmailGetCapabilitiesReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "emailGetCapabilitiesReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbpops");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbpops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbforwards");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbforwards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbaliases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbaliases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbresponders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbresponders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbmls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbmls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
