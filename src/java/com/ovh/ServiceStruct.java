/**
 * ServiceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class ServiceStruct  implements java.io.Serializable {
    private java.lang.String domain;

    private java.lang.String component;

    private java.lang.String componentSubType;

    private java.lang.String creation;

    private java.lang.String modification;

    private java.lang.String expiry;

    private java.lang.String nicowner;

    private java.lang.String nicadmin;

    private java.lang.String nictech;

    private java.lang.String nicbilling;

    private java.lang.String nicreseller;

    private java.lang.String autorenew;

    private java.lang.String reverse;

    public ServiceStruct() {
    }

    public ServiceStruct(
           java.lang.String domain,
           java.lang.String component,
           java.lang.String componentSubType,
           java.lang.String creation,
           java.lang.String modification,
           java.lang.String expiry,
           java.lang.String nicowner,
           java.lang.String nicadmin,
           java.lang.String nictech,
           java.lang.String nicbilling,
           java.lang.String nicreseller,
           java.lang.String autorenew,
           java.lang.String reverse) {
           this.domain = domain;
           this.component = component;
           this.componentSubType = componentSubType;
           this.creation = creation;
           this.modification = modification;
           this.expiry = expiry;
           this.nicowner = nicowner;
           this.nicadmin = nicadmin;
           this.nictech = nictech;
           this.nicbilling = nicbilling;
           this.nicreseller = nicreseller;
           this.autorenew = autorenew;
           this.reverse = reverse;
    }


    /**
     * Gets the domain value for this ServiceStruct.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this ServiceStruct.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the component value for this ServiceStruct.
     * 
     * @return component
     */
    public java.lang.String getComponent() {
        return component;
    }


    /**
     * Sets the component value for this ServiceStruct.
     * 
     * @param component
     */
    public void setComponent(java.lang.String component) {
        this.component = component;
    }


    /**
     * Gets the componentSubType value for this ServiceStruct.
     * 
     * @return componentSubType
     */
    public java.lang.String getComponentSubType() {
        return componentSubType;
    }


    /**
     * Sets the componentSubType value for this ServiceStruct.
     * 
     * @param componentSubType
     */
    public void setComponentSubType(java.lang.String componentSubType) {
        this.componentSubType = componentSubType;
    }


    /**
     * Gets the creation value for this ServiceStruct.
     * 
     * @return creation
     */
    public java.lang.String getCreation() {
        return creation;
    }


    /**
     * Sets the creation value for this ServiceStruct.
     * 
     * @param creation
     */
    public void setCreation(java.lang.String creation) {
        this.creation = creation;
    }


    /**
     * Gets the modification value for this ServiceStruct.
     * 
     * @return modification
     */
    public java.lang.String getModification() {
        return modification;
    }


    /**
     * Sets the modification value for this ServiceStruct.
     * 
     * @param modification
     */
    public void setModification(java.lang.String modification) {
        this.modification = modification;
    }


    /**
     * Gets the expiry value for this ServiceStruct.
     * 
     * @return expiry
     */
    public java.lang.String getExpiry() {
        return expiry;
    }


    /**
     * Sets the expiry value for this ServiceStruct.
     * 
     * @param expiry
     */
    public void setExpiry(java.lang.String expiry) {
        this.expiry = expiry;
    }


    /**
     * Gets the nicowner value for this ServiceStruct.
     * 
     * @return nicowner
     */
    public java.lang.String getNicowner() {
        return nicowner;
    }


    /**
     * Sets the nicowner value for this ServiceStruct.
     * 
     * @param nicowner
     */
    public void setNicowner(java.lang.String nicowner) {
        this.nicowner = nicowner;
    }


    /**
     * Gets the nicadmin value for this ServiceStruct.
     * 
     * @return nicadmin
     */
    public java.lang.String getNicadmin() {
        return nicadmin;
    }


    /**
     * Sets the nicadmin value for this ServiceStruct.
     * 
     * @param nicadmin
     */
    public void setNicadmin(java.lang.String nicadmin) {
        this.nicadmin = nicadmin;
    }


    /**
     * Gets the nictech value for this ServiceStruct.
     * 
     * @return nictech
     */
    public java.lang.String getNictech() {
        return nictech;
    }


    /**
     * Sets the nictech value for this ServiceStruct.
     * 
     * @param nictech
     */
    public void setNictech(java.lang.String nictech) {
        this.nictech = nictech;
    }


    /**
     * Gets the nicbilling value for this ServiceStruct.
     * 
     * @return nicbilling
     */
    public java.lang.String getNicbilling() {
        return nicbilling;
    }


    /**
     * Sets the nicbilling value for this ServiceStruct.
     * 
     * @param nicbilling
     */
    public void setNicbilling(java.lang.String nicbilling) {
        this.nicbilling = nicbilling;
    }


    /**
     * Gets the nicreseller value for this ServiceStruct.
     * 
     * @return nicreseller
     */
    public java.lang.String getNicreseller() {
        return nicreseller;
    }


    /**
     * Sets the nicreseller value for this ServiceStruct.
     * 
     * @param nicreseller
     */
    public void setNicreseller(java.lang.String nicreseller) {
        this.nicreseller = nicreseller;
    }


    /**
     * Gets the autorenew value for this ServiceStruct.
     * 
     * @return autorenew
     */
    public java.lang.String getAutorenew() {
        return autorenew;
    }


    /**
     * Sets the autorenew value for this ServiceStruct.
     * 
     * @param autorenew
     */
    public void setAutorenew(java.lang.String autorenew) {
        this.autorenew = autorenew;
    }


    /**
     * Gets the reverse value for this ServiceStruct.
     * 
     * @return reverse
     */
    public java.lang.String getReverse() {
        return reverse;
    }


    /**
     * Sets the reverse value for this ServiceStruct.
     * 
     * @param reverse
     */
    public void setReverse(java.lang.String reverse) {
        this.reverse = reverse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceStruct)) return false;
        ServiceStruct other = (ServiceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              this.component.equals(other.getComponent()))) &&
            ((this.componentSubType==null && other.getComponentSubType()==null) || 
             (this.componentSubType!=null &&
              this.componentSubType.equals(other.getComponentSubType()))) &&
            ((this.creation==null && other.getCreation()==null) || 
             (this.creation!=null &&
              this.creation.equals(other.getCreation()))) &&
            ((this.modification==null && other.getModification()==null) || 
             (this.modification!=null &&
              this.modification.equals(other.getModification()))) &&
            ((this.expiry==null && other.getExpiry()==null) || 
             (this.expiry!=null &&
              this.expiry.equals(other.getExpiry()))) &&
            ((this.nicowner==null && other.getNicowner()==null) || 
             (this.nicowner!=null &&
              this.nicowner.equals(other.getNicowner()))) &&
            ((this.nicadmin==null && other.getNicadmin()==null) || 
             (this.nicadmin!=null &&
              this.nicadmin.equals(other.getNicadmin()))) &&
            ((this.nictech==null && other.getNictech()==null) || 
             (this.nictech!=null &&
              this.nictech.equals(other.getNictech()))) &&
            ((this.nicbilling==null && other.getNicbilling()==null) || 
             (this.nicbilling!=null &&
              this.nicbilling.equals(other.getNicbilling()))) &&
            ((this.nicreseller==null && other.getNicreseller()==null) || 
             (this.nicreseller!=null &&
              this.nicreseller.equals(other.getNicreseller()))) &&
            ((this.autorenew==null && other.getAutorenew()==null) || 
             (this.autorenew!=null &&
              this.autorenew.equals(other.getAutorenew()))) &&
            ((this.reverse==null && other.getReverse()==null) || 
             (this.reverse!=null &&
              this.reverse.equals(other.getReverse())));
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getComponent() != null) {
            _hashCode += getComponent().hashCode();
        }
        if (getComponentSubType() != null) {
            _hashCode += getComponentSubType().hashCode();
        }
        if (getCreation() != null) {
            _hashCode += getCreation().hashCode();
        }
        if (getModification() != null) {
            _hashCode += getModification().hashCode();
        }
        if (getExpiry() != null) {
            _hashCode += getExpiry().hashCode();
        }
        if (getNicowner() != null) {
            _hashCode += getNicowner().hashCode();
        }
        if (getNicadmin() != null) {
            _hashCode += getNicadmin().hashCode();
        }
        if (getNictech() != null) {
            _hashCode += getNictech().hashCode();
        }
        if (getNicbilling() != null) {
            _hashCode += getNicbilling().hashCode();
        }
        if (getNicreseller() != null) {
            _hashCode += getNicreseller().hashCode();
        }
        if (getAutorenew() != null) {
            _hashCode += getAutorenew().hashCode();
        }
        if (getReverse() != null) {
            _hashCode += getReverse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "serviceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("", "component"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentSubType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "componentSubType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "creation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modification");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicowner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicowner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicadmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicadmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nictech");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nictech"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicbilling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicbilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicreseller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicreseller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autorenew");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autorenew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverse"));
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
