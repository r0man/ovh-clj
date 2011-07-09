/**
 * OperationStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class OperationStruct  implements java.io.Serializable {
    private int id;

    private java.lang.String domain;

    private java.lang.String function;

    private java.lang.String status;

    private java.lang.String internalStatus;

    private java.lang.String comment;

    private java.lang.String[] users;

    private int retry;

    private java.lang.String todoDate;

    private java.lang.String lastUpdate;

    private java.lang.String doneDate;

    private boolean canCancel;

    private boolean canCorrect;

    private boolean canRelaunch;

    private java.lang.String restartStep;

    public OperationStruct() {
    }

    public OperationStruct(
           int id,
           java.lang.String domain,
           java.lang.String function,
           java.lang.String status,
           java.lang.String internalStatus,
           java.lang.String comment,
           java.lang.String[] users,
           int retry,
           java.lang.String todoDate,
           java.lang.String lastUpdate,
           java.lang.String doneDate,
           boolean canCancel,
           boolean canCorrect,
           boolean canRelaunch,
           java.lang.String restartStep) {
           this.id = id;
           this.domain = domain;
           this.function = function;
           this.status = status;
           this.internalStatus = internalStatus;
           this.comment = comment;
           this.users = users;
           this.retry = retry;
           this.todoDate = todoDate;
           this.lastUpdate = lastUpdate;
           this.doneDate = doneDate;
           this.canCancel = canCancel;
           this.canCorrect = canCorrect;
           this.canRelaunch = canRelaunch;
           this.restartStep = restartStep;
    }


    /**
     * Gets the id value for this OperationStruct.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this OperationStruct.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the domain value for this OperationStruct.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this OperationStruct.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the function value for this OperationStruct.
     * 
     * @return function
     */
    public java.lang.String getFunction() {
        return function;
    }


    /**
     * Sets the function value for this OperationStruct.
     * 
     * @param function
     */
    public void setFunction(java.lang.String function) {
        this.function = function;
    }


    /**
     * Gets the status value for this OperationStruct.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OperationStruct.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the internalStatus value for this OperationStruct.
     * 
     * @return internalStatus
     */
    public java.lang.String getInternalStatus() {
        return internalStatus;
    }


    /**
     * Sets the internalStatus value for this OperationStruct.
     * 
     * @param internalStatus
     */
    public void setInternalStatus(java.lang.String internalStatus) {
        this.internalStatus = internalStatus;
    }


    /**
     * Gets the comment value for this OperationStruct.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this OperationStruct.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the users value for this OperationStruct.
     * 
     * @return users
     */
    public java.lang.String[] getUsers() {
        return users;
    }


    /**
     * Sets the users value for this OperationStruct.
     * 
     * @param users
     */
    public void setUsers(java.lang.String[] users) {
        this.users = users;
    }


    /**
     * Gets the retry value for this OperationStruct.
     * 
     * @return retry
     */
    public int getRetry() {
        return retry;
    }


    /**
     * Sets the retry value for this OperationStruct.
     * 
     * @param retry
     */
    public void setRetry(int retry) {
        this.retry = retry;
    }


    /**
     * Gets the todoDate value for this OperationStruct.
     * 
     * @return todoDate
     */
    public java.lang.String getTodoDate() {
        return todoDate;
    }


    /**
     * Sets the todoDate value for this OperationStruct.
     * 
     * @param todoDate
     */
    public void setTodoDate(java.lang.String todoDate) {
        this.todoDate = todoDate;
    }


    /**
     * Gets the lastUpdate value for this OperationStruct.
     * 
     * @return lastUpdate
     */
    public java.lang.String getLastUpdate() {
        return lastUpdate;
    }


    /**
     * Sets the lastUpdate value for this OperationStruct.
     * 
     * @param lastUpdate
     */
    public void setLastUpdate(java.lang.String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }


    /**
     * Gets the doneDate value for this OperationStruct.
     * 
     * @return doneDate
     */
    public java.lang.String getDoneDate() {
        return doneDate;
    }


    /**
     * Sets the doneDate value for this OperationStruct.
     * 
     * @param doneDate
     */
    public void setDoneDate(java.lang.String doneDate) {
        this.doneDate = doneDate;
    }


    /**
     * Gets the canCancel value for this OperationStruct.
     * 
     * @return canCancel
     */
    public boolean isCanCancel() {
        return canCancel;
    }


    /**
     * Sets the canCancel value for this OperationStruct.
     * 
     * @param canCancel
     */
    public void setCanCancel(boolean canCancel) {
        this.canCancel = canCancel;
    }


    /**
     * Gets the canCorrect value for this OperationStruct.
     * 
     * @return canCorrect
     */
    public boolean isCanCorrect() {
        return canCorrect;
    }


    /**
     * Sets the canCorrect value for this OperationStruct.
     * 
     * @param canCorrect
     */
    public void setCanCorrect(boolean canCorrect) {
        this.canCorrect = canCorrect;
    }


    /**
     * Gets the canRelaunch value for this OperationStruct.
     * 
     * @return canRelaunch
     */
    public boolean isCanRelaunch() {
        return canRelaunch;
    }


    /**
     * Sets the canRelaunch value for this OperationStruct.
     * 
     * @param canRelaunch
     */
    public void setCanRelaunch(boolean canRelaunch) {
        this.canRelaunch = canRelaunch;
    }


    /**
     * Gets the restartStep value for this OperationStruct.
     * 
     * @return restartStep
     */
    public java.lang.String getRestartStep() {
        return restartStep;
    }


    /**
     * Sets the restartStep value for this OperationStruct.
     * 
     * @param restartStep
     */
    public void setRestartStep(java.lang.String restartStep) {
        this.restartStep = restartStep;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationStruct)) return false;
        OperationStruct other = (OperationStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.id == other.getId() &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.function==null && other.getFunction()==null) || 
             (this.function!=null &&
              this.function.equals(other.getFunction()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.internalStatus==null && other.getInternalStatus()==null) || 
             (this.internalStatus!=null &&
              this.internalStatus.equals(other.getInternalStatus()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.users==null && other.getUsers()==null) || 
             (this.users!=null &&
              java.util.Arrays.equals(this.users, other.getUsers()))) &&
            this.retry == other.getRetry() &&
            ((this.todoDate==null && other.getTodoDate()==null) || 
             (this.todoDate!=null &&
              this.todoDate.equals(other.getTodoDate()))) &&
            ((this.lastUpdate==null && other.getLastUpdate()==null) || 
             (this.lastUpdate!=null &&
              this.lastUpdate.equals(other.getLastUpdate()))) &&
            ((this.doneDate==null && other.getDoneDate()==null) || 
             (this.doneDate!=null &&
              this.doneDate.equals(other.getDoneDate()))) &&
            this.canCancel == other.isCanCancel() &&
            this.canCorrect == other.isCanCorrect() &&
            this.canRelaunch == other.isCanRelaunch() &&
            ((this.restartStep==null && other.getRestartStep()==null) || 
             (this.restartStep!=null &&
              this.restartStep.equals(other.getRestartStep())));
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getFunction() != null) {
            _hashCode += getFunction().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getInternalStatus() != null) {
            _hashCode += getInternalStatus().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getUsers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getRetry();
        if (getTodoDate() != null) {
            _hashCode += getTodoDate().hashCode();
        }
        if (getLastUpdate() != null) {
            _hashCode += getLastUpdate().hashCode();
        }
        if (getDoneDate() != null) {
            _hashCode += getDoneDate().hashCode();
        }
        _hashCode += (isCanCancel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanCorrect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCanRelaunch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRestartStep() != null) {
            _hashCode += getRestartStep().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "operationStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("function");
        elemField.setXmlName(new javax.xml.namespace.QName("", "function"));
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
        elemField.setFieldName("internalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users");
        elemField.setXmlName(new javax.xml.namespace.QName("", "users"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todoDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "todoDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastUpdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastUpdate"));
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
        elemField.setFieldName("canCancel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canCancel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canCorrect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canCorrect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canRelaunch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canRelaunch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restartStep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restartStep"));
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
