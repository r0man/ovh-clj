/**
 * SqlpriveMysqlDatabasePrivilegeStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class SqlpriveMysqlDatabasePrivilegeStruct  implements java.io.Serializable {
    private java.lang.String databaseName;

    private com.ovh.SqlpriveMysqlDatabaseUserPrivilegeStruct[] databaseUsers;

    public SqlpriveMysqlDatabasePrivilegeStruct() {
    }

    public SqlpriveMysqlDatabasePrivilegeStruct(
           java.lang.String databaseName,
           com.ovh.SqlpriveMysqlDatabaseUserPrivilegeStruct[] databaseUsers) {
           this.databaseName = databaseName;
           this.databaseUsers = databaseUsers;
    }


    /**
     * Gets the databaseName value for this SqlpriveMysqlDatabasePrivilegeStruct.
     * 
     * @return databaseName
     */
    public java.lang.String getDatabaseName() {
        return databaseName;
    }


    /**
     * Sets the databaseName value for this SqlpriveMysqlDatabasePrivilegeStruct.
     * 
     * @param databaseName
     */
    public void setDatabaseName(java.lang.String databaseName) {
        this.databaseName = databaseName;
    }


    /**
     * Gets the databaseUsers value for this SqlpriveMysqlDatabasePrivilegeStruct.
     * 
     * @return databaseUsers
     */
    public com.ovh.SqlpriveMysqlDatabaseUserPrivilegeStruct[] getDatabaseUsers() {
        return databaseUsers;
    }


    /**
     * Sets the databaseUsers value for this SqlpriveMysqlDatabasePrivilegeStruct.
     * 
     * @param databaseUsers
     */
    public void setDatabaseUsers(com.ovh.SqlpriveMysqlDatabaseUserPrivilegeStruct[] databaseUsers) {
        this.databaseUsers = databaseUsers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SqlpriveMysqlDatabasePrivilegeStruct)) return false;
        SqlpriveMysqlDatabasePrivilegeStruct other = (SqlpriveMysqlDatabasePrivilegeStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.databaseName==null && other.getDatabaseName()==null) || 
             (this.databaseName!=null &&
              this.databaseName.equals(other.getDatabaseName()))) &&
            ((this.databaseUsers==null && other.getDatabaseUsers()==null) || 
             (this.databaseUsers!=null &&
              java.util.Arrays.equals(this.databaseUsers, other.getDatabaseUsers())));
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
        if (getDatabaseName() != null) {
            _hashCode += getDatabaseName().hashCode();
        }
        if (getDatabaseUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatabaseUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatabaseUsers(), i);
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
        new org.apache.axis.description.TypeDesc(SqlpriveMysqlDatabasePrivilegeStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "sqlpriveMysqlDatabasePrivilegeStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "databaseName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("databaseUsers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "databaseUsers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "sqlpriveMysqlDatabaseUserPrivilegeStruct"));
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
