/**
 * HostingGetCapabilitiesReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class HostingGetCapabilitiesReturn  implements java.io.Serializable {
    private java.lang.String name;

    private int webspace;

    private java.lang.String traffic;

    private int databases;

    private int databaseSpace;

    private int multidomains;

    private int subdomains;

    private int streaming;

    private int multiftp;

    private int anonymousftp;

    private int freeDomPerYear;

    private int freeDomMax;

    private boolean sharedSSL;

    private boolean ssh;

    private boolean geoloc;

    private boolean cgi;

    private boolean crontab;

    private boolean sip;

    private boolean vpn;

    private boolean jabber;

    public HostingGetCapabilitiesReturn() {
    }

    public HostingGetCapabilitiesReturn(
           java.lang.String name,
           int webspace,
           java.lang.String traffic,
           int databases,
           int databaseSpace,
           int multidomains,
           int subdomains,
           int streaming,
           int multiftp,
           int anonymousftp,
           int freeDomPerYear,
           int freeDomMax,
           boolean sharedSSL,
           boolean ssh,
           boolean geoloc,
           boolean cgi,
           boolean crontab,
           boolean sip,
           boolean vpn,
           boolean jabber) {
           this.name = name;
           this.webspace = webspace;
           this.traffic = traffic;
           this.databases = databases;
           this.databaseSpace = databaseSpace;
           this.multidomains = multidomains;
           this.subdomains = subdomains;
           this.streaming = streaming;
           this.multiftp = multiftp;
           this.anonymousftp = anonymousftp;
           this.freeDomPerYear = freeDomPerYear;
           this.freeDomMax = freeDomMax;
           this.sharedSSL = sharedSSL;
           this.ssh = ssh;
           this.geoloc = geoloc;
           this.cgi = cgi;
           this.crontab = crontab;
           this.sip = sip;
           this.vpn = vpn;
           this.jabber = jabber;
    }


    /**
     * Gets the name value for this HostingGetCapabilitiesReturn.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this HostingGetCapabilitiesReturn.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the webspace value for this HostingGetCapabilitiesReturn.
     * 
     * @return webspace
     */
    public int getWebspace() {
        return webspace;
    }


    /**
     * Sets the webspace value for this HostingGetCapabilitiesReturn.
     * 
     * @param webspace
     */
    public void setWebspace(int webspace) {
        this.webspace = webspace;
    }


    /**
     * Gets the traffic value for this HostingGetCapabilitiesReturn.
     * 
     * @return traffic
     */
    public java.lang.String getTraffic() {
        return traffic;
    }


    /**
     * Sets the traffic value for this HostingGetCapabilitiesReturn.
     * 
     * @param traffic
     */
    public void setTraffic(java.lang.String traffic) {
        this.traffic = traffic;
    }


    /**
     * Gets the databases value for this HostingGetCapabilitiesReturn.
     * 
     * @return databases
     */
    public int getDatabases() {
        return databases;
    }


    /**
     * Sets the databases value for this HostingGetCapabilitiesReturn.
     * 
     * @param databases
     */
    public void setDatabases(int databases) {
        this.databases = databases;
    }


    /**
     * Gets the databaseSpace value for this HostingGetCapabilitiesReturn.
     * 
     * @return databaseSpace
     */
    public int getDatabaseSpace() {
        return databaseSpace;
    }


    /**
     * Sets the databaseSpace value for this HostingGetCapabilitiesReturn.
     * 
     * @param databaseSpace
     */
    public void setDatabaseSpace(int databaseSpace) {
        this.databaseSpace = databaseSpace;
    }


    /**
     * Gets the multidomains value for this HostingGetCapabilitiesReturn.
     * 
     * @return multidomains
     */
    public int getMultidomains() {
        return multidomains;
    }


    /**
     * Sets the multidomains value for this HostingGetCapabilitiesReturn.
     * 
     * @param multidomains
     */
    public void setMultidomains(int multidomains) {
        this.multidomains = multidomains;
    }


    /**
     * Gets the subdomains value for this HostingGetCapabilitiesReturn.
     * 
     * @return subdomains
     */
    public int getSubdomains() {
        return subdomains;
    }


    /**
     * Sets the subdomains value for this HostingGetCapabilitiesReturn.
     * 
     * @param subdomains
     */
    public void setSubdomains(int subdomains) {
        this.subdomains = subdomains;
    }


    /**
     * Gets the streaming value for this HostingGetCapabilitiesReturn.
     * 
     * @return streaming
     */
    public int getStreaming() {
        return streaming;
    }


    /**
     * Sets the streaming value for this HostingGetCapabilitiesReturn.
     * 
     * @param streaming
     */
    public void setStreaming(int streaming) {
        this.streaming = streaming;
    }


    /**
     * Gets the multiftp value for this HostingGetCapabilitiesReturn.
     * 
     * @return multiftp
     */
    public int getMultiftp() {
        return multiftp;
    }


    /**
     * Sets the multiftp value for this HostingGetCapabilitiesReturn.
     * 
     * @param multiftp
     */
    public void setMultiftp(int multiftp) {
        this.multiftp = multiftp;
    }


    /**
     * Gets the anonymousftp value for this HostingGetCapabilitiesReturn.
     * 
     * @return anonymousftp
     */
    public int getAnonymousftp() {
        return anonymousftp;
    }


    /**
     * Sets the anonymousftp value for this HostingGetCapabilitiesReturn.
     * 
     * @param anonymousftp
     */
    public void setAnonymousftp(int anonymousftp) {
        this.anonymousftp = anonymousftp;
    }


    /**
     * Gets the freeDomPerYear value for this HostingGetCapabilitiesReturn.
     * 
     * @return freeDomPerYear
     */
    public int getFreeDomPerYear() {
        return freeDomPerYear;
    }


    /**
     * Sets the freeDomPerYear value for this HostingGetCapabilitiesReturn.
     * 
     * @param freeDomPerYear
     */
    public void setFreeDomPerYear(int freeDomPerYear) {
        this.freeDomPerYear = freeDomPerYear;
    }


    /**
     * Gets the freeDomMax value for this HostingGetCapabilitiesReturn.
     * 
     * @return freeDomMax
     */
    public int getFreeDomMax() {
        return freeDomMax;
    }


    /**
     * Sets the freeDomMax value for this HostingGetCapabilitiesReturn.
     * 
     * @param freeDomMax
     */
    public void setFreeDomMax(int freeDomMax) {
        this.freeDomMax = freeDomMax;
    }


    /**
     * Gets the sharedSSL value for this HostingGetCapabilitiesReturn.
     * 
     * @return sharedSSL
     */
    public boolean isSharedSSL() {
        return sharedSSL;
    }


    /**
     * Sets the sharedSSL value for this HostingGetCapabilitiesReturn.
     * 
     * @param sharedSSL
     */
    public void setSharedSSL(boolean sharedSSL) {
        this.sharedSSL = sharedSSL;
    }


    /**
     * Gets the ssh value for this HostingGetCapabilitiesReturn.
     * 
     * @return ssh
     */
    public boolean isSsh() {
        return ssh;
    }


    /**
     * Sets the ssh value for this HostingGetCapabilitiesReturn.
     * 
     * @param ssh
     */
    public void setSsh(boolean ssh) {
        this.ssh = ssh;
    }


    /**
     * Gets the geoloc value for this HostingGetCapabilitiesReturn.
     * 
     * @return geoloc
     */
    public boolean isGeoloc() {
        return geoloc;
    }


    /**
     * Sets the geoloc value for this HostingGetCapabilitiesReturn.
     * 
     * @param geoloc
     */
    public void setGeoloc(boolean geoloc) {
        this.geoloc = geoloc;
    }


    /**
     * Gets the cgi value for this HostingGetCapabilitiesReturn.
     * 
     * @return cgi
     */
    public boolean isCgi() {
        return cgi;
    }


    /**
     * Sets the cgi value for this HostingGetCapabilitiesReturn.
     * 
     * @param cgi
     */
    public void setCgi(boolean cgi) {
        this.cgi = cgi;
    }


    /**
     * Gets the crontab value for this HostingGetCapabilitiesReturn.
     * 
     * @return crontab
     */
    public boolean isCrontab() {
        return crontab;
    }


    /**
     * Sets the crontab value for this HostingGetCapabilitiesReturn.
     * 
     * @param crontab
     */
    public void setCrontab(boolean crontab) {
        this.crontab = crontab;
    }


    /**
     * Gets the sip value for this HostingGetCapabilitiesReturn.
     * 
     * @return sip
     */
    public boolean isSip() {
        return sip;
    }


    /**
     * Sets the sip value for this HostingGetCapabilitiesReturn.
     * 
     * @param sip
     */
    public void setSip(boolean sip) {
        this.sip = sip;
    }


    /**
     * Gets the vpn value for this HostingGetCapabilitiesReturn.
     * 
     * @return vpn
     */
    public boolean isVpn() {
        return vpn;
    }


    /**
     * Sets the vpn value for this HostingGetCapabilitiesReturn.
     * 
     * @param vpn
     */
    public void setVpn(boolean vpn) {
        this.vpn = vpn;
    }


    /**
     * Gets the jabber value for this HostingGetCapabilitiesReturn.
     * 
     * @return jabber
     */
    public boolean isJabber() {
        return jabber;
    }


    /**
     * Sets the jabber value for this HostingGetCapabilitiesReturn.
     * 
     * @param jabber
     */
    public void setJabber(boolean jabber) {
        this.jabber = jabber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostingGetCapabilitiesReturn)) return false;
        HostingGetCapabilitiesReturn other = (HostingGetCapabilitiesReturn) obj;
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
            this.webspace == other.getWebspace() &&
            ((this.traffic==null && other.getTraffic()==null) || 
             (this.traffic!=null &&
              this.traffic.equals(other.getTraffic()))) &&
            this.databases == other.getDatabases() &&
            this.databaseSpace == other.getDatabaseSpace() &&
            this.multidomains == other.getMultidomains() &&
            this.subdomains == other.getSubdomains() &&
            this.streaming == other.getStreaming() &&
            this.multiftp == other.getMultiftp() &&
            this.anonymousftp == other.getAnonymousftp() &&
            this.freeDomPerYear == other.getFreeDomPerYear() &&
            this.freeDomMax == other.getFreeDomMax() &&
            this.sharedSSL == other.isSharedSSL() &&
            this.ssh == other.isSsh() &&
            this.geoloc == other.isGeoloc() &&
            this.cgi == other.isCgi() &&
            this.crontab == other.isCrontab() &&
            this.sip == other.isSip() &&
            this.vpn == other.isVpn() &&
            this.jabber == other.isJabber();
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
        _hashCode += getWebspace();
        if (getTraffic() != null) {
            _hashCode += getTraffic().hashCode();
        }
        _hashCode += getDatabases();
        _hashCode += getDatabaseSpace();
        _hashCode += getMultidomains();
        _hashCode += getSubdomains();
        _hashCode += getStreaming();
        _hashCode += getMultiftp();
        _hashCode += getAnonymousftp();
        _hashCode += getFreeDomPerYear();
        _hashCode += getFreeDomMax();
        _hashCode += (isSharedSSL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSsh() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGeoloc() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCgi() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCrontab() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSip() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isVpn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isJabber() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostingGetCapabilitiesReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "hostingGetCapabilitiesReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webspace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "databases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseSpace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "databaseSpace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multidomains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multidomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdomains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subdomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("streaming");
        elemField.setXmlName(new javax.xml.namespace.QName("", "streaming"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiftp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multiftp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymousftp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anonymousftp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeDomPerYear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeDomPerYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeDomMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeDomMax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharedSSL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sharedSSL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("geoloc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "geoloc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crontab");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crontab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vpn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jabber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jabber"));
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
