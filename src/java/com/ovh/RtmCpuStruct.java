/**
 * RtmCpuStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RtmCpuStruct  implements java.io.Serializable {
    private java.lang.String frequency;

    private int core;

    private java.lang.String name;

    private java.lang.String cache;

    private int percentLoad;

    private com.ovh.RtmCpuLoadAvgStruct loadAvg;

    public RtmCpuStruct() {
    }

    public RtmCpuStruct(
           java.lang.String frequency,
           int core,
           java.lang.String name,
           java.lang.String cache,
           int percentLoad,
           com.ovh.RtmCpuLoadAvgStruct loadAvg) {
           this.frequency = frequency;
           this.core = core;
           this.name = name;
           this.cache = cache;
           this.percentLoad = percentLoad;
           this.loadAvg = loadAvg;
    }


    /**
     * Gets the frequency value for this RtmCpuStruct.
     * 
     * @return frequency
     */
    public java.lang.String getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this RtmCpuStruct.
     * 
     * @param frequency
     */
    public void setFrequency(java.lang.String frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the core value for this RtmCpuStruct.
     * 
     * @return core
     */
    public int getCore() {
        return core;
    }


    /**
     * Sets the core value for this RtmCpuStruct.
     * 
     * @param core
     */
    public void setCore(int core) {
        this.core = core;
    }


    /**
     * Gets the name value for this RtmCpuStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this RtmCpuStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the cache value for this RtmCpuStruct.
     * 
     * @return cache
     */
    public java.lang.String getCache() {
        return cache;
    }


    /**
     * Sets the cache value for this RtmCpuStruct.
     * 
     * @param cache
     */
    public void setCache(java.lang.String cache) {
        this.cache = cache;
    }


    /**
     * Gets the percentLoad value for this RtmCpuStruct.
     * 
     * @return percentLoad
     */
    public int getPercentLoad() {
        return percentLoad;
    }


    /**
     * Sets the percentLoad value for this RtmCpuStruct.
     * 
     * @param percentLoad
     */
    public void setPercentLoad(int percentLoad) {
        this.percentLoad = percentLoad;
    }


    /**
     * Gets the loadAvg value for this RtmCpuStruct.
     * 
     * @return loadAvg
     */
    public com.ovh.RtmCpuLoadAvgStruct getLoadAvg() {
        return loadAvg;
    }


    /**
     * Sets the loadAvg value for this RtmCpuStruct.
     * 
     * @param loadAvg
     */
    public void setLoadAvg(com.ovh.RtmCpuLoadAvgStruct loadAvg) {
        this.loadAvg = loadAvg;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RtmCpuStruct)) return false;
        RtmCpuStruct other = (RtmCpuStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            this.core == other.getCore() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.cache==null && other.getCache()==null) || 
             (this.cache!=null &&
              this.cache.equals(other.getCache()))) &&
            this.percentLoad == other.getPercentLoad() &&
            ((this.loadAvg==null && other.getLoadAvg()==null) || 
             (this.loadAvg!=null &&
              this.loadAvg.equals(other.getLoadAvg())));
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
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        _hashCode += getCore();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCache() != null) {
            _hashCode += getCache().hashCode();
        }
        _hashCode += getPercentLoad();
        if (getLoadAvg() != null) {
            _hashCode += getLoadAvg().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RtmCpuStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmCpuStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("core");
        elemField.setXmlName(new javax.xml.namespace.QName("", "core"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentLoad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentLoad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadAvg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadAvg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rtmCpuLoadAvgStruct"));
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
