/**
 * AccountHistoryReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class AccountHistoryReturn  implements java.io.Serializable {
    private int month;

    private int year;

    private com.ovh.AccountMovementStruct[] movements;

    public AccountHistoryReturn() {
    }

    public AccountHistoryReturn(
           int month,
           int year,
           com.ovh.AccountMovementStruct[] movements) {
           this.month = month;
           this.year = year;
           this.movements = movements;
    }


    /**
     * Gets the month value for this AccountHistoryReturn.
     * 
     * @return month
     */
    public int getMonth() {
        return month;
    }


    /**
     * Sets the month value for this AccountHistoryReturn.
     * 
     * @param month
     */
    public void setMonth(int month) {
        this.month = month;
    }


    /**
     * Gets the year value for this AccountHistoryReturn.
     * 
     * @return year
     */
    public int getYear() {
        return year;
    }


    /**
     * Sets the year value for this AccountHistoryReturn.
     * 
     * @param year
     */
    public void setYear(int year) {
        this.year = year;
    }


    /**
     * Gets the movements value for this AccountHistoryReturn.
     * 
     * @return movements
     */
    public com.ovh.AccountMovementStruct[] getMovements() {
        return movements;
    }


    /**
     * Sets the movements value for this AccountHistoryReturn.
     * 
     * @param movements
     */
    public void setMovements(com.ovh.AccountMovementStruct[] movements) {
        this.movements = movements;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AccountHistoryReturn)) return false;
        AccountHistoryReturn other = (AccountHistoryReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.month == other.getMonth() &&
            this.year == other.getYear() &&
            ((this.movements==null && other.getMovements()==null) || 
             (this.movements!=null &&
              java.util.Arrays.equals(this.movements, other.getMovements())));
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
        _hashCode += getMonth();
        _hashCode += getYear();
        if (getMovements() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMovements());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMovements(), i);
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
        new org.apache.axis.description.TypeDesc(AccountHistoryReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "accountHistoryReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("month");
        elemField.setXmlName(new javax.xml.namespace.QName("", "month"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("", "year"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("movements");
        elemField.setXmlName(new javax.xml.namespace.QName("", "movements"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "accountMovementStruct"));
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
