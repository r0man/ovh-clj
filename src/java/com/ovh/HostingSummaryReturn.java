/**
 * HostingSummaryReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class HostingSummaryReturn  implements java.io.Serializable {
    private java.lang.String country;

    private java.lang.String webspace;

    private java.lang.String maxWebspace;

    private java.lang.String subdomains;

    private java.lang.String multidomains;

    private java.lang.String multiftps;

    private java.lang.String anonymousftp;

    private java.lang.String databases;

    private java.lang.String freedom_remaining;

    private java.lang.String freedom_assigned;

    private java.lang.String freedom_total;

    private boolean highCapacity;

    private boolean highSecurity;

    private java.lang.String state;

    public HostingSummaryReturn() {
    }

    public HostingSummaryReturn(
           java.lang.String country,
           java.lang.String webspace,
           java.lang.String maxWebspace,
           java.lang.String subdomains,
           java.lang.String multidomains,
           java.lang.String multiftps,
           java.lang.String anonymousftp,
           java.lang.String databases,
           java.lang.String freedom_remaining,
           java.lang.String freedom_assigned,
           java.lang.String freedom_total,
           boolean highCapacity,
           boolean highSecurity,
           java.lang.String state) {
           this.country = country;
           this.webspace = webspace;
           this.maxWebspace = maxWebspace;
           this.subdomains = subdomains;
           this.multidomains = multidomains;
           this.multiftps = multiftps;
           this.anonymousftp = anonymousftp;
           this.databases = databases;
           this.freedom_remaining = freedom_remaining;
           this.freedom_assigned = freedom_assigned;
           this.freedom_total = freedom_total;
           this.highCapacity = highCapacity;
           this.highSecurity = highSecurity;
           this.state = state;
    }


    /**
     * Gets the country value for this HostingSummaryReturn.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this HostingSummaryReturn.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the webspace value for this HostingSummaryReturn.
     * 
     * @return webspace
     */
    public java.lang.String getWebspace() {
        return webspace;
    }


    /**
     * Sets the webspace value for this HostingSummaryReturn.
     * 
     * @param webspace
     */
    public void setWebspace(java.lang.String webspace) {
        this.webspace = webspace;
    }


    /**
     * Gets the maxWebspace value for this HostingSummaryReturn.
     * 
     * @return maxWebspace
     */
    public java.lang.String getMaxWebspace() {
        return maxWebspace;
    }


    /**
     * Sets the maxWebspace value for this HostingSummaryReturn.
     * 
     * @param maxWebspace
     */
    public void setMaxWebspace(java.lang.String maxWebspace) {
        this.maxWebspace = maxWebspace;
    }


    /**
     * Gets the subdomains value for this HostingSummaryReturn.
     * 
     * @return subdomains
     */
    public java.lang.String getSubdomains() {
        return subdomains;
    }


    /**
     * Sets the subdomains value for this HostingSummaryReturn.
     * 
     * @param subdomains
     */
    public void setSubdomains(java.lang.String subdomains) {
        this.subdomains = subdomains;
    }


    /**
     * Gets the multidomains value for this HostingSummaryReturn.
     * 
     * @return multidomains
     */
    public java.lang.String getMultidomains() {
        return multidomains;
    }


    /**
     * Sets the multidomains value for this HostingSummaryReturn.
     * 
     * @param multidomains
     */
    public void setMultidomains(java.lang.String multidomains) {
        this.multidomains = multidomains;
    }


    /**
     * Gets the multiftps value for this HostingSummaryReturn.
     * 
     * @return multiftps
     */
    public java.lang.String getMultiftps() {
        return multiftps;
    }


    /**
     * Sets the multiftps value for this HostingSummaryReturn.
     * 
     * @param multiftps
     */
    public void setMultiftps(java.lang.String multiftps) {
        this.multiftps = multiftps;
    }


    /**
     * Gets the anonymousftp value for this HostingSummaryReturn.
     * 
     * @return anonymousftp
     */
    public java.lang.String getAnonymousftp() {
        return anonymousftp;
    }


    /**
     * Sets the anonymousftp value for this HostingSummaryReturn.
     * 
     * @param anonymousftp
     */
    public void setAnonymousftp(java.lang.String anonymousftp) {
        this.anonymousftp = anonymousftp;
    }


    /**
     * Gets the databases value for this HostingSummaryReturn.
     * 
     * @return databases
     */
    public java.lang.String getDatabases() {
        return databases;
    }


    /**
     * Sets the databases value for this HostingSummaryReturn.
     * 
     * @param databases
     */
    public void setDatabases(java.lang.String databases) {
        this.databases = databases;
    }


    /**
     * Gets the freedom_remaining value for this HostingSummaryReturn.
     * 
     * @return freedom_remaining
     */
    public java.lang.String getFreedom_remaining() {
        return freedom_remaining;
    }


    /**
     * Sets the freedom_remaining value for this HostingSummaryReturn.
     * 
     * @param freedom_remaining
     */
    public void setFreedom_remaining(java.lang.String freedom_remaining) {
        this.freedom_remaining = freedom_remaining;
    }


    /**
     * Gets the freedom_assigned value for this HostingSummaryReturn.
     * 
     * @return freedom_assigned
     */
    public java.lang.String getFreedom_assigned() {
        return freedom_assigned;
    }


    /**
     * Sets the freedom_assigned value for this HostingSummaryReturn.
     * 
     * @param freedom_assigned
     */
    public void setFreedom_assigned(java.lang.String freedom_assigned) {
        this.freedom_assigned = freedom_assigned;
    }


    /**
     * Gets the freedom_total value for this HostingSummaryReturn.
     * 
     * @return freedom_total
     */
    public java.lang.String getFreedom_total() {
        return freedom_total;
    }


    /**
     * Sets the freedom_total value for this HostingSummaryReturn.
     * 
     * @param freedom_total
     */
    public void setFreedom_total(java.lang.String freedom_total) {
        this.freedom_total = freedom_total;
    }


    /**
     * Gets the highCapacity value for this HostingSummaryReturn.
     * 
     * @return highCapacity
     */
    public boolean isHighCapacity() {
        return highCapacity;
    }


    /**
     * Sets the highCapacity value for this HostingSummaryReturn.
     * 
     * @param highCapacity
     */
    public void setHighCapacity(boolean highCapacity) {
        this.highCapacity = highCapacity;
    }


    /**
     * Gets the highSecurity value for this HostingSummaryReturn.
     * 
     * @return highSecurity
     */
    public boolean isHighSecurity() {
        return highSecurity;
    }


    /**
     * Sets the highSecurity value for this HostingSummaryReturn.
     * 
     * @param highSecurity
     */
    public void setHighSecurity(boolean highSecurity) {
        this.highSecurity = highSecurity;
    }


    /**
     * Gets the state value for this HostingSummaryReturn.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this HostingSummaryReturn.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HostingSummaryReturn)) return false;
        HostingSummaryReturn other = (HostingSummaryReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.webspace==null && other.getWebspace()==null) || 
             (this.webspace!=null &&
              this.webspace.equals(other.getWebspace()))) &&
            ((this.maxWebspace==null && other.getMaxWebspace()==null) || 
             (this.maxWebspace!=null &&
              this.maxWebspace.equals(other.getMaxWebspace()))) &&
            ((this.subdomains==null && other.getSubdomains()==null) || 
             (this.subdomains!=null &&
              this.subdomains.equals(other.getSubdomains()))) &&
            ((this.multidomains==null && other.getMultidomains()==null) || 
             (this.multidomains!=null &&
              this.multidomains.equals(other.getMultidomains()))) &&
            ((this.multiftps==null && other.getMultiftps()==null) || 
             (this.multiftps!=null &&
              this.multiftps.equals(other.getMultiftps()))) &&
            ((this.anonymousftp==null && other.getAnonymousftp()==null) || 
             (this.anonymousftp!=null &&
              this.anonymousftp.equals(other.getAnonymousftp()))) &&
            ((this.databases==null && other.getDatabases()==null) || 
             (this.databases!=null &&
              this.databases.equals(other.getDatabases()))) &&
            ((this.freedom_remaining==null && other.getFreedom_remaining()==null) || 
             (this.freedom_remaining!=null &&
              this.freedom_remaining.equals(other.getFreedom_remaining()))) &&
            ((this.freedom_assigned==null && other.getFreedom_assigned()==null) || 
             (this.freedom_assigned!=null &&
              this.freedom_assigned.equals(other.getFreedom_assigned()))) &&
            ((this.freedom_total==null && other.getFreedom_total()==null) || 
             (this.freedom_total!=null &&
              this.freedom_total.equals(other.getFreedom_total()))) &&
            this.highCapacity == other.isHighCapacity() &&
            this.highSecurity == other.isHighSecurity() &&
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
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getWebspace() != null) {
            _hashCode += getWebspace().hashCode();
        }
        if (getMaxWebspace() != null) {
            _hashCode += getMaxWebspace().hashCode();
        }
        if (getSubdomains() != null) {
            _hashCode += getSubdomains().hashCode();
        }
        if (getMultidomains() != null) {
            _hashCode += getMultidomains().hashCode();
        }
        if (getMultiftps() != null) {
            _hashCode += getMultiftps().hashCode();
        }
        if (getAnonymousftp() != null) {
            _hashCode += getAnonymousftp().hashCode();
        }
        if (getDatabases() != null) {
            _hashCode += getDatabases().hashCode();
        }
        if (getFreedom_remaining() != null) {
            _hashCode += getFreedom_remaining().hashCode();
        }
        if (getFreedom_assigned() != null) {
            _hashCode += getFreedom_assigned().hashCode();
        }
        if (getFreedom_total() != null) {
            _hashCode += getFreedom_total().hashCode();
        }
        _hashCode += (isHighCapacity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHighSecurity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HostingSummaryReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "hostingSummaryReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webspace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "webspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxWebspace");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxWebspace"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subdomains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subdomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multidomains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multidomains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiftps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multiftps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonymousftp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anonymousftp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databases");
        elemField.setXmlName(new javax.xml.namespace.QName("", "databases"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freedom_remaining");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freedom_remaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freedom_assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freedom_assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freedom_total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freedom_total"));
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
