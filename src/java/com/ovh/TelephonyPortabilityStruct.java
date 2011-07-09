/**
 * TelephonyPortabilityStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyPortabilityStruct  implements java.io.Serializable {
    private int id;

    private java.lang.String number;

    private java.lang.String name;

    private java.lang.String planDate;

    private java.lang.String billingAccount;

    private java.lang.String type;

    private java.lang.String operator;

    private java.lang.String status;

    private java.lang.String reason;

    private java.lang.String[] askingCustomer;

    private java.lang.String[] extraNumbers;

    public TelephonyPortabilityStruct() {
    }

    public TelephonyPortabilityStruct(
           int id,
           java.lang.String number,
           java.lang.String name,
           java.lang.String planDate,
           java.lang.String billingAccount,
           java.lang.String type,
           java.lang.String operator,
           java.lang.String status,
           java.lang.String reason,
           java.lang.String[] askingCustomer,
           java.lang.String[] extraNumbers) {
           this.id = id;
           this.number = number;
           this.name = name;
           this.planDate = planDate;
           this.billingAccount = billingAccount;
           this.type = type;
           this.operator = operator;
           this.status = status;
           this.reason = reason;
           this.askingCustomer = askingCustomer;
           this.extraNumbers = extraNumbers;
    }


    /**
     * Gets the id value for this TelephonyPortabilityStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this TelephonyPortabilityStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the number value for this TelephonyPortabilityStruct.
     * 
     * @return number
     */
    public java.lang.String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TelephonyPortabilityStruct.
     * 
     * @param number
     */
    public void setNumber(java.lang.String number) {
        this.number = number;
    }


    /**
     * Gets the name value for this TelephonyPortabilityStruct.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this TelephonyPortabilityStruct.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the planDate value for this TelephonyPortabilityStruct.
     * 
     * @return planDate
     */
    public java.lang.String getPlanDate() {
        return planDate;
    }


    /**
     * Sets the planDate value for this TelephonyPortabilityStruct.
     * 
     * @param planDate
     */
    public void setPlanDate(java.lang.String planDate) {
        this.planDate = planDate;
    }


    /**
     * Gets the billingAccount value for this TelephonyPortabilityStruct.
     * 
     * @return billingAccount
     */
    public java.lang.String getBillingAccount() {
        return billingAccount;
    }


    /**
     * Sets the billingAccount value for this TelephonyPortabilityStruct.
     * 
     * @param billingAccount
     */
    public void setBillingAccount(java.lang.String billingAccount) {
        this.billingAccount = billingAccount;
    }


    /**
     * Gets the type value for this TelephonyPortabilityStruct.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this TelephonyPortabilityStruct.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the operator value for this TelephonyPortabilityStruct.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this TelephonyPortabilityStruct.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the status value for this TelephonyPortabilityStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TelephonyPortabilityStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the reason value for this TelephonyPortabilityStruct.
     * 
     * @return reason
     */
    public java.lang.String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this TelephonyPortabilityStruct.
     * 
     * @param reason
     */
    public void setReason(java.lang.String reason) {
        this.reason = reason;
    }


    /**
     * Gets the askingCustomer value for this TelephonyPortabilityStruct.
     * 
     * @return askingCustomer
     */
    public java.lang.String[] getAskingCustomer() {
        return askingCustomer;
    }


    /**
     * Sets the askingCustomer value for this TelephonyPortabilityStruct.
     * 
     * @param askingCustomer
     */
    public void setAskingCustomer(java.lang.String[] askingCustomer) {
        this.askingCustomer = askingCustomer;
    }


    /**
     * Gets the extraNumbers value for this TelephonyPortabilityStruct.
     * 
     * @return extraNumbers
     */
    public java.lang.String[] getExtraNumbers() {
        return extraNumbers;
    }


    /**
     * Sets the extraNumbers value for this TelephonyPortabilityStruct.
     * 
     * @param extraNumbers
     */
    public void setExtraNumbers(java.lang.String[] extraNumbers) {
        this.extraNumbers = extraNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyPortabilityStruct)) return false;
        TelephonyPortabilityStruct other = (TelephonyPortabilityStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.planDate==null && other.getPlanDate()==null) || 
             (this.planDate!=null &&
              this.planDate.equals(other.getPlanDate()))) &&
            ((this.billingAccount==null && other.getBillingAccount()==null) || 
             (this.billingAccount!=null &&
              this.billingAccount.equals(other.getBillingAccount()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.askingCustomer==null && other.getAskingCustomer()==null) || 
             (this.askingCustomer!=null &&
              java.util.Arrays.equals(this.askingCustomer, other.getAskingCustomer()))) &&
            ((this.extraNumbers==null && other.getExtraNumbers()==null) || 
             (this.extraNumbers!=null &&
              java.util.Arrays.equals(this.extraNumbers, other.getExtraNumbers())));
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
        _hashCode += getId();
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPlanDate() != null) {
            _hashCode += getPlanDate().hashCode();
        }
        if (getBillingAccount() != null) {
            _hashCode += getBillingAccount().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getAskingCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAskingCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAskingCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExtraNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExtraNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExtraNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonyPortabilityStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyPortabilityStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("askingCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "askingCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extraNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extraNumbers"));
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
