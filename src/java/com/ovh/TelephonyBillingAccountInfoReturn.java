/**
 * TelephonyBillingAccountInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyBillingAccountInfoReturn  implements java.io.Serializable {
    private java.lang.String offer;

    private java.lang.String consumtionTime;

    private java.lang.String outPlan;

    private java.lang.String facturationDate;

    private com.ovh.TelephonyBillingAccountInfoChildrenStruct[] children;

    public TelephonyBillingAccountInfoReturn() {
    }

    public TelephonyBillingAccountInfoReturn(
           java.lang.String offer,
           java.lang.String consumtionTime,
           java.lang.String outPlan,
           java.lang.String facturationDate,
           com.ovh.TelephonyBillingAccountInfoChildrenStruct[] children) {
           this.offer = offer;
           this.consumtionTime = consumtionTime;
           this.outPlan = outPlan;
           this.facturationDate = facturationDate;
           this.children = children;
    }


    /**
     * Gets the offer value for this TelephonyBillingAccountInfoReturn.
     * 
     * @return offer
     */
    public java.lang.String getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this TelephonyBillingAccountInfoReturn.
     * 
     * @param offer
     */
    public void setOffer(java.lang.String offer) {
        this.offer = offer;
    }


    /**
     * Gets the consumtionTime value for this TelephonyBillingAccountInfoReturn.
     * 
     * @return consumtionTime
     */
    public java.lang.String getConsumtionTime() {
        return consumtionTime;
    }


    /**
     * Sets the consumtionTime value for this TelephonyBillingAccountInfoReturn.
     * 
     * @param consumtionTime
     */
    public void setConsumtionTime(java.lang.String consumtionTime) {
        this.consumtionTime = consumtionTime;
    }


    /**
     * Gets the outPlan value for this TelephonyBillingAccountInfoReturn.
     * 
     * @return outPlan
     */
    public java.lang.String getOutPlan() {
        return outPlan;
    }


    /**
     * Sets the outPlan value for this TelephonyBillingAccountInfoReturn.
     * 
     * @param outPlan
     */
    public void setOutPlan(java.lang.String outPlan) {
        this.outPlan = outPlan;
    }


    /**
     * Gets the facturationDate value for this TelephonyBillingAccountInfoReturn.
     * 
     * @return facturationDate
     */
    public java.lang.String getFacturationDate() {
        return facturationDate;
    }


    /**
     * Sets the facturationDate value for this TelephonyBillingAccountInfoReturn.
     * 
     * @param facturationDate
     */
    public void setFacturationDate(java.lang.String facturationDate) {
        this.facturationDate = facturationDate;
    }


    /**
     * Gets the children value for this TelephonyBillingAccountInfoReturn.
     * 
     * @return children
     */
    public com.ovh.TelephonyBillingAccountInfoChildrenStruct[] getChildren() {
        return children;
    }


    /**
     * Sets the children value for this TelephonyBillingAccountInfoReturn.
     * 
     * @param children
     */
    public void setChildren(com.ovh.TelephonyBillingAccountInfoChildrenStruct[] children) {
        this.children = children;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyBillingAccountInfoReturn)) return false;
        TelephonyBillingAccountInfoReturn other = (TelephonyBillingAccountInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.consumtionTime==null && other.getConsumtionTime()==null) || 
             (this.consumtionTime!=null &&
              this.consumtionTime.equals(other.getConsumtionTime()))) &&
            ((this.outPlan==null && other.getOutPlan()==null) || 
             (this.outPlan!=null &&
              this.outPlan.equals(other.getOutPlan()))) &&
            ((this.facturationDate==null && other.getFacturationDate()==null) || 
             (this.facturationDate!=null &&
              this.facturationDate.equals(other.getFacturationDate()))) &&
            ((this.children==null && other.getChildren()==null) || 
             (this.children!=null &&
              java.util.Arrays.equals(this.children, other.getChildren())));
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
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getConsumtionTime() != null) {
            _hashCode += getConsumtionTime().hashCode();
        }
        if (getOutPlan() != null) {
            _hashCode += getOutPlan().hashCode();
        }
        if (getFacturationDate() != null) {
            _hashCode += getFacturationDate().hashCode();
        }
        if (getChildren() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChildren());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChildren(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyBillingAccountInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillingAccountInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consumtionTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consumtionTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facturationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facturationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("children");
        elemField.setXmlName(new javax.xml.namespace.QName("", "children"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyBillingAccountInfoChildrenStruct"));
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
