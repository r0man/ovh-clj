/**
 * RpsMigrationStatusReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class RpsMigrationStatusReturn  implements java.io.Serializable {
    private int id;

    private int progressStatus;

    private java.lang.String status;

    private java.lang.String logicalRpsName;

    private java.lang.String physicalRpsTo;

    private java.lang.String todoDate;

    private java.lang.String doingDate;

    private java.lang.String doneDate;

    private java.lang.String errorMessage;

    public RpsMigrationStatusReturn() {
    }

    public RpsMigrationStatusReturn(
           int id,
           int progressStatus,
           java.lang.String status,
           java.lang.String logicalRpsName,
           java.lang.String physicalRpsTo,
           java.lang.String todoDate,
           java.lang.String doingDate,
           java.lang.String doneDate,
           java.lang.String errorMessage) {
           this.id = id;
           this.progressStatus = progressStatus;
           this.status = status;
           this.logicalRpsName = logicalRpsName;
           this.physicalRpsTo = physicalRpsTo;
           this.todoDate = todoDate;
           this.doingDate = doingDate;
           this.doneDate = doneDate;
           this.errorMessage = errorMessage;
    }


    /**
     * Gets the id value for this RpsMigrationStatusReturn.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this RpsMigrationStatusReturn.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the progressStatus value for this RpsMigrationStatusReturn.
     * 
     * @return progressStatus
     */
    public int getProgressStatus() {
        return progressStatus;
    }


    /**
     * Sets the progressStatus value for this RpsMigrationStatusReturn.
     * 
     * @param progressStatus
     */
    public void setProgressStatus(int progressStatus) {
        this.progressStatus = progressStatus;
    }


    /**
     * Gets the status value for this RpsMigrationStatusReturn.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RpsMigrationStatusReturn.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the logicalRpsName value for this RpsMigrationStatusReturn.
     * 
     * @return logicalRpsName
     */
    public java.lang.String getLogicalRpsName() {
        return logicalRpsName;
    }


    /**
     * Sets the logicalRpsName value for this RpsMigrationStatusReturn.
     * 
     * @param logicalRpsName
     */
    public void setLogicalRpsName(java.lang.String logicalRpsName) {
        this.logicalRpsName = logicalRpsName;
    }


    /**
     * Gets the physicalRpsTo value for this RpsMigrationStatusReturn.
     * 
     * @return physicalRpsTo
     */
    public java.lang.String getPhysicalRpsTo() {
        return physicalRpsTo;
    }


    /**
     * Sets the physicalRpsTo value for this RpsMigrationStatusReturn.
     * 
     * @param physicalRpsTo
     */
    public void setPhysicalRpsTo(java.lang.String physicalRpsTo) {
        this.physicalRpsTo = physicalRpsTo;
    }


    /**
     * Gets the todoDate value for this RpsMigrationStatusReturn.
     * 
     * @return todoDate
     */
    public java.lang.String getTodoDate() {
        return todoDate;
    }


    /**
     * Sets the todoDate value for this RpsMigrationStatusReturn.
     * 
     * @param todoDate
     */
    public void setTodoDate(java.lang.String todoDate) {
        this.todoDate = todoDate;
    }


    /**
     * Gets the doingDate value for this RpsMigrationStatusReturn.
     * 
     * @return doingDate
     */
    public java.lang.String getDoingDate() {
        return doingDate;
    }


    /**
     * Sets the doingDate value for this RpsMigrationStatusReturn.
     * 
     * @param doingDate
     */
    public void setDoingDate(java.lang.String doingDate) {
        this.doingDate = doingDate;
    }


    /**
     * Gets the doneDate value for this RpsMigrationStatusReturn.
     * 
     * @return doneDate
     */
    public java.lang.String getDoneDate() {
        return doneDate;
    }


    /**
     * Sets the doneDate value for this RpsMigrationStatusReturn.
     * 
     * @param doneDate
     */
    public void setDoneDate(java.lang.String doneDate) {
        this.doneDate = doneDate;
    }


    /**
     * Gets the errorMessage value for this RpsMigrationStatusReturn.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this RpsMigrationStatusReturn.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RpsMigrationStatusReturn)) return false;
        RpsMigrationStatusReturn other = (RpsMigrationStatusReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            this.progressStatus == other.getProgressStatus() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.logicalRpsName==null && other.getLogicalRpsName()==null) || 
             (this.logicalRpsName!=null &&
              this.logicalRpsName.equals(other.getLogicalRpsName()))) &&
            ((this.physicalRpsTo==null && other.getPhysicalRpsTo()==null) || 
             (this.physicalRpsTo!=null &&
              this.physicalRpsTo.equals(other.getPhysicalRpsTo()))) &&
            ((this.todoDate==null && other.getTodoDate()==null) || 
             (this.todoDate!=null &&
              this.todoDate.equals(other.getTodoDate()))) &&
            ((this.doingDate==null && other.getDoingDate()==null) || 
             (this.doingDate!=null &&
              this.doingDate.equals(other.getDoingDate()))) &&
            ((this.doneDate==null && other.getDoneDate()==null) || 
             (this.doneDate!=null &&
              this.doneDate.equals(other.getDoneDate()))) &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage())));
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
        _hashCode += getProgressStatus();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getLogicalRpsName() != null) {
            _hashCode += getLogicalRpsName().hashCode();
        }
        if (getPhysicalRpsTo() != null) {
            _hashCode += getPhysicalRpsTo().hashCode();
        }
        if (getTodoDate() != null) {
            _hashCode += getTodoDate().hashCode();
        }
        if (getDoingDate() != null) {
            _hashCode += getDoingDate().hashCode();
        }
        if (getDoneDate() != null) {
            _hashCode += getDoneDate().hashCode();
        }
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RpsMigrationStatusReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "rpsMigrationStatusReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("progressStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "progressStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logicalRpsName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logicalRpsName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("physicalRpsTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "physicalRpsTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "todoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doneDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doneDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMessage"));
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
