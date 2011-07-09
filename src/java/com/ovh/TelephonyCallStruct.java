/**
 * TelephonyCallStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyCallStruct  implements java.io.Serializable {
    private java.lang.String idkey;

    private java.lang.String number;

    private java.lang.String date;

    private java.lang.String duration;

    private java.lang.String destination;

    private float priceWithoutVAT;

    private java.lang.String nature;

    private boolean overLimit;

    private java.lang.String type;

    private java.lang.String callingNumber;

    private java.lang.String presentation;

    private java.lang.String designation;

    public TelephonyCallStruct() {
    }

    public TelephonyCallStruct(
           java.lang.String idkey,
           java.lang.String number,
           java.lang.String date,
           java.lang.String duration,
           java.lang.String destination,
           float priceWithoutVAT,
           java.lang.String nature,
           boolean overLimit,
           java.lang.String type,
           java.lang.String callingNumber,
           java.lang.String presentation,
           java.lang.String designation) {
           this.idkey = idkey;
           this.number = number;
           this.date = date;
           this.duration = duration;
           this.destination = destination;
           this.priceWithoutVAT = priceWithoutVAT;
           this.nature = nature;
           this.overLimit = overLimit;
           this.type = type;
           this.callingNumber = callingNumber;
           this.presentation = presentation;
           this.designation = designation;
    }


    /**
     * Gets the idkey value for this TelephonyCallStruct.
     * 
     * @return idkey
     */
    public java.lang.String getIdkey() {
        return idkey;
    }


    /**
     * Sets the idkey value for this TelephonyCallStruct.
     * 
     * @param idkey
     */
    public void setIdkey(java.lang.String idkey) {
        this.idkey = idkey;
    }


    /**
     * Gets the number value for this TelephonyCallStruct.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TelephonyCallStruct.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the date value for this TelephonyCallStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this TelephonyCallStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the duration value for this TelephonyCallStruct.
     * 
     * @return duration
     */
    public java.lang.String getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TelephonyCallStruct.
     * 
     * @param duration
     */
    public void setDuration(java.lang.String duration) {
        this.duration = duration;
    }


    /**
     * Gets the destination value for this TelephonyCallStruct.
     * 
     * @return destination
     */
    public java.lang.String getDestination() {
        return destination;
    }


    /**
     * Sets the destination value for this TelephonyCallStruct.
     * 
     * @param destination
     */
    public void setDestination(java.lang.String destination) {
        this.destination = destination;
    }


    /**
     * Gets the priceWithoutVAT value for this TelephonyCallStruct.
     * 
     * @return priceWithoutVAT
     */
    public float getPriceWithoutVAT() {
        return priceWithoutVAT;
    }


    /**
     * Sets the priceWithoutVAT value for this TelephonyCallStruct.
     * 
     * @param priceWithoutVAT
     */
    public void setPriceWithoutVAT(float priceWithoutVAT) {
        this.priceWithoutVAT = priceWithoutVAT;
    }


    /**
     * Gets the nature value for this TelephonyCallStruct.
     * 
     * @return nature
     */
    public java.lang.String getNature() {
        return nature;
    }


    /**
     * Sets the nature value for this TelephonyCallStruct.
     * 
     * @param nature
     */
    public void setNature(java.lang.String nature) {
        this.nature = nature;
    }


    /**
     * Gets the overLimit value for this TelephonyCallStruct.
     * 
     * @return overLimit
     */
    public boolean isOverLimit() {
        return overLimit;
    }


    /**
     * Sets the overLimit value for this TelephonyCallStruct.
     * 
     * @param overLimit
     */
    public void setOverLimit(boolean overLimit) {
        this.overLimit = overLimit;
    }


    /**
     * Gets the type value for this TelephonyCallStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TelephonyCallStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the callingNumber value for this TelephonyCallStruct.
     * 
     * @return callingNumber
     */
    public java.lang.String getCallingNumber() {
        return callingNumber;
    }


    /**
     * Sets the callingNumber value for this TelephonyCallStruct.
     * 
     * @param callingNumber
     */
    public void setCallingNumber(java.lang.String callingNumber) {
        this.callingNumber = callingNumber;
    }


    /**
     * Gets the presentation value for this TelephonyCallStruct.
     * 
     * @return presentation
     */
    public java.lang.String getPresentation() {
        return presentation;
    }


    /**
     * Sets the presentation value for this TelephonyCallStruct.
     * 
     * @param presentation
     */
    public void setPresentation(java.lang.String presentation) {
        this.presentation = presentation;
    }


    /**
     * Gets the designation value for this TelephonyCallStruct.
     * 
     * @return designation
     */
    public java.lang.String getDesignation() {
        return designation;
    }


    /**
     * Sets the designation value for this TelephonyCallStruct.
     * 
     * @param designation
     */
    public void setDesignation(java.lang.String designation) {
        this.designation = designation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyCallStruct)) return false;
        TelephonyCallStruct other = (TelephonyCallStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idkey==null && other.getIdkey()==null) || 
             (this.idkey!=null &&
              this.idkey.equals(other.getIdkey()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.destination==null && other.getDestination()==null) || 
             (this.destination!=null &&
              this.destination.equals(other.getDestination()))) &&
            this.priceWithoutVAT == other.getPriceWithoutVAT() &&
            ((this.nature==null && other.getNature()==null) || 
             (this.nature!=null &&
              this.nature.equals(other.getNature()))) &&
            this.overLimit == other.isOverLimit() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.callingNumber==null && other.getCallingNumber()==null) || 
             (this.callingNumber!=null &&
              this.callingNumber.equals(other.getCallingNumber()))) &&
            ((this.presentation==null && other.getPresentation()==null) || 
             (this.presentation!=null &&
              this.presentation.equals(other.getPresentation()))) &&
            ((this.designation==null && other.getDesignation()==null) || 
             (this.designation!=null &&
              this.designation.equals(other.getDesignation())));
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
        if (getIdkey() != null) {
            _hashCode += getIdkey().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getDestination() != null) {
            _hashCode += getDestination().hashCode();
        }
        _hashCode += new Float(getPriceWithoutVAT()).hashCode();
        if (getNature() != null) {
            _hashCode += getNature().hashCode();
        }
        _hashCode += (isOverLimit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCallingNumber() != null) {
            _hashCode += getCallingNumber().hashCode();
        }
        if (getPresentation() != null) {
            _hashCode += getPresentation().hashCode();
        }
        if (getDesignation() != null) {
            _hashCode += getDesignation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelephonyCallStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyCallStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceWithoutVAT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priceWithoutVAT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "presentation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("designation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "designation"));
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
