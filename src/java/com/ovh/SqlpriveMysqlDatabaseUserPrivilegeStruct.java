/**
 * SqlpriveMysqlDatabaseUserPrivilegeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class SqlpriveMysqlDatabaseUserPrivilegeStruct  implements java.io.Serializable {
    private java.lang.String userName;

    private java.lang.String userPriv;

    public SqlpriveMysqlDatabaseUserPrivilegeStruct() {
    }

    public SqlpriveMysqlDatabaseUserPrivilegeStruct(
           java.lang.String userName,
           java.lang.String userPriv) {
           this.userName = userName;
           this.userPriv = userPriv;
    }


    /**
     * Gets the userName value for this SqlpriveMysqlDatabaseUserPrivilegeStruct.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this SqlpriveMysqlDatabaseUserPrivilegeStruct.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the userPriv value for this SqlpriveMysqlDatabaseUserPrivilegeStruct.
     * 
     * @return userPriv
     */
    public java.lang.String getUserPriv() {
        return userPriv;
    }


    /**
     * Sets the userPriv value for this SqlpriveMysqlDatabaseUserPrivilegeStruct.
     * 
     * @param userPriv
     */
    public void setUserPriv(java.lang.String userPriv) {
        this.userPriv = userPriv;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SqlpriveMysqlDatabaseUserPrivilegeStruct)) return false;
        SqlpriveMysqlDatabaseUserPrivilegeStruct other = (SqlpriveMysqlDatabaseUserPrivilegeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.userPriv==null && other.getUserPriv()==null) || 
             (this.userPriv!=null &&
              this.userPriv.equals(other.getUserPriv())));
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
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getUserPriv() != null) {
            _hashCode += getUserPriv().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SqlpriveMysqlDatabaseUserPrivilegeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "sqlpriveMysqlDatabaseUserPrivilegeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPriv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userPriv"));
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
