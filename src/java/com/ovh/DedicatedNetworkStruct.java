/**
 * DedicatedNetworkStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedNetworkStruct  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String priority;

    private java.lang.String connexion;

    private int bandwidth;

    private int bandwidthOvhToOvh;

    private int bandwidthOvhToInternet;

    private int bandwidthInternetToOvh;

    private boolean over;

    private com.ovh.DedicatedNetworkInterfaceStruct[] interfaces;

    private com.ovh.DedicatedNetworkTrafficStruct traffic;

    public DedicatedNetworkStruct() {
    }

    public DedicatedNetworkStruct(
           java.lang.String type,
           java.lang.String priority,
           java.lang.String connexion,
           int bandwidth,
           int bandwidthOvhToOvh,
           int bandwidthOvhToInternet,
           int bandwidthInternetToOvh,
           boolean over,
           com.ovh.DedicatedNetworkInterfaceStruct[] interfaces,
           com.ovh.DedicatedNetworkTrafficStruct traffic) {
           this.type = type;
           this.priority = priority;
           this.connexion = connexion;
           this.bandwidth = bandwidth;
           this.bandwidthOvhToOvh = bandwidthOvhToOvh;
           this.bandwidthOvhToInternet = bandwidthOvhToInternet;
           this.bandwidthInternetToOvh = bandwidthInternetToOvh;
           this.over = over;
           this.interfaces = interfaces;
           this.traffic = traffic;
    }


    /**
     * Gets the type value for this DedicatedNetworkStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DedicatedNetworkStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the priority value for this DedicatedNetworkStruct.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this DedicatedNetworkStruct.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the connexion value for this DedicatedNetworkStruct.
     * 
     * @return connexion
     */
    public java.lang.String getConnexion() {
        return connexion;
    }


    /**
     * Sets the connexion value for this DedicatedNetworkStruct.
     * 
     * @param connexion
     */
    public void setConnexion(java.lang.String connexion) {
        this.connexion = connexion;
    }


    /**
     * Gets the bandwidth value for this DedicatedNetworkStruct.
     * 
     * @return bandwidth
     */
    public int getBandwidth() {
        return bandwidth;
    }


    /**
     * Sets the bandwidth value for this DedicatedNetworkStruct.
     * 
     * @param bandwidth
     */
    public void setBandwidth(int bandwidth) {
        this.bandwidth = bandwidth;
    }


    /**
     * Gets the bandwidthOvhToOvh value for this DedicatedNetworkStruct.
     * 
     * @return bandwidthOvhToOvh
     */
    public int getBandwidthOvhToOvh() {
        return bandwidthOvhToOvh;
    }


    /**
     * Sets the bandwidthOvhToOvh value for this DedicatedNetworkStruct.
     * 
     * @param bandwidthOvhToOvh
     */
    public void setBandwidthOvhToOvh(int bandwidthOvhToOvh) {
        this.bandwidthOvhToOvh = bandwidthOvhToOvh;
    }


    /**
     * Gets the bandwidthOvhToInternet value for this DedicatedNetworkStruct.
     * 
     * @return bandwidthOvhToInternet
     */
    public int getBandwidthOvhToInternet() {
        return bandwidthOvhToInternet;
    }


    /**
     * Sets the bandwidthOvhToInternet value for this DedicatedNetworkStruct.
     * 
     * @param bandwidthOvhToInternet
     */
    public void setBandwidthOvhToInternet(int bandwidthOvhToInternet) {
        this.bandwidthOvhToInternet = bandwidthOvhToInternet;
    }


    /**
     * Gets the bandwidthInternetToOvh value for this DedicatedNetworkStruct.
     * 
     * @return bandwidthInternetToOvh
     */
    public int getBandwidthInternetToOvh() {
        return bandwidthInternetToOvh;
    }


    /**
     * Sets the bandwidthInternetToOvh value for this DedicatedNetworkStruct.
     * 
     * @param bandwidthInternetToOvh
     */
    public void setBandwidthInternetToOvh(int bandwidthInternetToOvh) {
        this.bandwidthInternetToOvh = bandwidthInternetToOvh;
    }


    /**
     * Gets the over value for this DedicatedNetworkStruct.
     * 
     * @return over
     */
    public boolean isOver() {
        return over;
    }


    /**
     * Sets the over value for this DedicatedNetworkStruct.
     * 
     * @param over
     */
    public void setOver(boolean over) {
        this.over = over;
    }


    /**
     * Gets the interfaces value for this DedicatedNetworkStruct.
     * 
     * @return interfaces
     */
    public com.ovh.DedicatedNetworkInterfaceStruct[] getInterfaces() {
        return interfaces;
    }


    /**
     * Sets the interfaces value for this DedicatedNetworkStruct.
     * 
     * @param interfaces
     */
    public void setInterfaces(com.ovh.DedicatedNetworkInterfaceStruct[] interfaces) {
        this.interfaces = interfaces;
    }


    /**
     * Gets the traffic value for this DedicatedNetworkStruct.
     * 
     * @return traffic
     */
    public com.ovh.DedicatedNetworkTrafficStruct getTraffic() {
        return traffic;
    }


    /**
     * Sets the traffic value for this DedicatedNetworkStruct.
     * 
     * @param traffic
     */
    public void setTraffic(com.ovh.DedicatedNetworkTrafficStruct traffic) {
        this.traffic = traffic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedNetworkStruct)) return false;
        DedicatedNetworkStruct other = (DedicatedNetworkStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.connexion==null && other.getConnexion()==null) || 
             (this.connexion!=null &&
              this.connexion.equals(other.getConnexion()))) &&
            this.bandwidth == other.getBandwidth() &&
            this.bandwidthOvhToOvh == other.getBandwidthOvhToOvh() &&
            this.bandwidthOvhToInternet == other.getBandwidthOvhToInternet() &&
            this.bandwidthInternetToOvh == other.getBandwidthInternetToOvh() &&
            this.over == other.isOver() &&
            ((this.interfaces==null && other.getInterfaces()==null) || 
             (this.interfaces!=null &&
              java.util.Arrays.equals(this.interfaces, other.getInterfaces()))) &&
            ((this.traffic==null && other.getTraffic()==null) || 
             (this.traffic!=null &&
              this.traffic.equals(other.getTraffic())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getConnexion() != null) {
            _hashCode += getConnexion().hashCode();
        }
        _hashCode += getBandwidth();
        _hashCode += getBandwidthOvhToOvh();
        _hashCode += getBandwidthOvhToInternet();
        _hashCode += getBandwidthInternetToOvh();
        _hashCode += (isOver() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInterfaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterfaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterfaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTraffic() != null) {
            _hashCode += getTraffic().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DedicatedNetworkStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connexion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connexion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthOvhToOvh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidthOvhToOvh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthOvhToInternet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidthOvhToInternet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthInternetToOvh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidthInternetToOvh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("over");
        elemField.setXmlName(new javax.xml.namespace.QName("", "over"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkInterfaceStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("traffic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "traffic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedNetworkTrafficStruct"));
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
