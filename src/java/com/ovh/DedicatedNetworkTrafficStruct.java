/**
 * DedicatedNetworkTrafficStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedNetworkTrafficStruct  implements java.io.Serializable {
    private java.lang.String lastUpdate;

    private com.ovh.DedicatedNetworkTrafficDetailsStruct currentQuota;

    private com.ovh.DedicatedNetworkTrafficDetailsStruct monthlyTraffic;

    private java.lang.String nextTrafficReset;

    private java.lang.String monthlyQuota;

    private java.lang.String nextQuotaReset;

    public DedicatedNetworkTrafficStruct() {
    }

    public DedicatedNetworkTrafficStruct(
           java.lang.String lastUpdate,
           com.ovh.DedicatedNetworkTrafficDetailsStruct currentQuota,
           com.ovh.DedicatedNetworkTrafficDetailsStruct monthlyTraffic,
           java.lang.String nextTrafficReset,
           java.lang.String monthlyQuota,
           java.lang.String nextQuotaReset) {
           this.lastUpdate = lastUpdate;
           this.currentQuota = currentQuota;
           this.monthlyTraffic = monthlyTraffic;
           this.nextTrafficReset = nextTrafficReset;
           this.monthlyQuota = monthlyQuota;
           this.nextQuotaReset = nextQuotaReset;
    }


    /**
     * Gets the lastUpdate value for this DedicatedNetworkTrafficStruct.
     * 
     * @return lastUpdate
     */
    public java.lang.String getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this DedicatedNetworkTrafficStruct.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(java.lang.String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the currentQuota value for this DedicatedNetworkTrafficStruct.
     * 
     * @return currentQuota
     */
    public com.ovh.DedicatedNetworkTrafficDetailsStruct getCurrentQuota() {
        return currentQuota;
    }


    /**
     * Sets the currentQuota value for this DedicatedNetworkTrafficStruct.
     * 
     * @param currentQuota
     */
    public void setCurrentQuota(com.ovh.DedicatedNetworkTrafficDetailsStruct currentQuota) {
        this.currentQuota = currentQuota;
    }


    /**
     * Gets the monthlyTraffic value for this DedicatedNetworkTrafficStruct.
     * 
     * @return monthlyTraffic
     */
    public com.ovh.DedicatedNetworkTrafficDetailsStruct getMonthlyTraffic() {
        return monthlyTraffic;
    }


    /**
     * Sets the monthlyTraffic value for this DedicatedNetworkTrafficStruct.
     * 
     * @param monthlyTraffic
     */
    public void setMonthlyTraffic(com.ovh.DedicatedNetworkTrafficDetailsStruct monthlyTraffic) {
        this.monthlyTraffic = monthlyTraffic;
    }


    /**
     * Gets the nextTrafficReset value for this DedicatedNetworkTrafficStruct.
     * 
     * @return nextTrafficReset
     */
    public java.lang.String getNextTrafficReset() {
        return nextTrafficReset;
    }


    /**
     * Sets the nextTrafficReset value for this DedicatedNetworkTrafficStruct.
     * 
     * @param nextTrafficReset
     */
    public void setNextTrafficReset(java.lang.String nextTrafficReset) {
        this.nextTrafficReset = nextTrafficReset;
    }


    /**
     * Gets the monthlyQuota value for this DedicatedNetworkTrafficStruct.
     * 
     * @return monthlyQuota
     */
    public java.lang.String getMonthlyQuota() {
        return monthlyQuota;
    }


    /**
     * Sets the monthlyQuota value for this DedicatedNetworkTrafficStruct.
     * 
     * @param monthlyQuota
     */
    public void setMonthlyQuota(java.lang.String monthlyQuota) {
        this.monthlyQuota = monthlyQuota;
    }


    /**
     * Gets the nextQuotaReset value for this DedicatedNetworkTrafficStruct.
     * 
     * @return nextQuotaReset
     */
    public java.lang.String getNextQuotaReset() {
        return nextQuotaReset;
    }


    /**
     * Sets the nextQuotaReset value for this DedicatedNetworkTrafficStruct.
     * 
     * @param nextQuotaReset
     */
    public void setNextQuotaReset(java.lang.String nextQuotaReset) {
        this.nextQuotaReset = nextQuotaReset;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedNetworkTrafficStruct)) return false;
        DedicatedNetworkTrafficStruct other = (DedicatedNetworkTrafficStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            ((this.currentQuota==null && other.getCurrentQuota()==null) || 
             (this.currentQuota!=null &&
              this.currentQuota.equals(other.getCurrentQuota()))) &&
            ((this.monthlyTraffic==null && other.getMonthlyTraffic()==null) || 
             (this.monthlyTraffic!=null &&
              this.monthlyTraffic.equals(other.getMonthlyTraffic()))) &&
            ((this.nextTrafficReset==null && other.getNextTrafficReset()==null) || 
             (this.nextTrafficReset!=null &&
              this.nextTrafficReset.equals(other.getNextTrafficReset()))) &&
            ((this.monthlyQuota==null && other.getMonthlyQuota()==null) || 
             (this.monthlyQuota!=null &&
              this.monthlyQuota.equals(other.getMonthlyQuota()))) &&
            ((this.nextQuotaReset==null && other.getNextQuotaReset()==null) || 
             (this.nextQuotaReset!=null &&
              this.nextQuotaReset.equals(other.getNextQuotaReset())));
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
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        if (getCurrentQuota() != null) {
            _hashCode += getCurrentQuota().hashCode();
        }
        if (getMonthlyTraffic() != null) {
            _hashCode += getMonthlyTraffic().hashCode();
        }
        if (getNextTrafficReset() != null) {
            _hashCode += getNextTrafficReset().hashCode();
        }
        if (getMonthlyQuota() != null) {
            _hashCode += getMonthlyQuota().hashCode();
        }
        if (getNextQuotaReset() != null) {
            _hashCode += getNextQuotaReset().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedNetworkTrafficStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkTrafficStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkTrafficDetailsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyTraffic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyTraffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkTrafficDetailsStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextTrafficReset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextTrafficReset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthlyQuota");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthlyQuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextQuotaReset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextQuotaReset"));
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
