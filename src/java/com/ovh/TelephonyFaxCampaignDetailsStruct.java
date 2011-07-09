/**
 * TelephonyFaxCampaignDetailsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class TelephonyFaxCampaignDetailsStruct  implements java.io.Serializable {
    private java.lang.String campaignName;

    private java.lang.String campaignStatus;

    private java.lang.String dateStart;

    private java.lang.String dateEnd;

    private int total;

    private int todo;

    private int success;

    private int failed;

    private java.lang.String reference;

    private com.ovh.TelephonyRecipientStruct[] recipients;

    public TelephonyFaxCampaignDetailsStruct() {
    }

    public TelephonyFaxCampaignDetailsStruct(
           java.lang.String campaignName,
           java.lang.String campaignStatus,
           java.lang.String dateStart,
           java.lang.String dateEnd,
           int total,
           int todo,
           int success,
           int failed,
           java.lang.String reference,
           com.ovh.TelephonyRecipientStruct[] recipients) {
           this.campaignName = campaignName;
           this.campaignStatus = campaignStatus;
           this.dateStart = dateStart;
           this.dateEnd = dateEnd;
           this.total = total;
           this.todo = todo;
           this.success = success;
           this.failed = failed;
           this.reference = reference;
           this.recipients = recipients;
    }


    /**
     * Gets the campaignName value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return campaignName
     */
    public java.lang.String getCampaignName() {
        return campaignName;
    }


    /**
     * Sets the campaignName value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param campaignName
     */
    public void setCampaignName(java.lang.String campaignName) {
        this.campaignName = campaignName;
    }


    /**
     * Gets the campaignStatus value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return campaignStatus
     */
    public java.lang.String getCampaignStatus() {
        return campaignStatus;
    }


    /**
     * Sets the campaignStatus value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param campaignStatus
     */
    public void setCampaignStatus(java.lang.String campaignStatus) {
        this.campaignStatus = campaignStatus;
    }


    /**
     * Gets the dateStart value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return dateStart
     */
    public java.lang.String getDateStart() {
        return dateStart;
    }


    /**
     * Sets the dateStart value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param dateStart
     */
    public void setDateStart(java.lang.String dateStart) {
        this.dateStart = dateStart;
    }


    /**
     * Gets the dateEnd value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return dateEnd
     */
    public java.lang.String getDateEnd() {
        return dateEnd;
    }


    /**
     * Sets the dateEnd value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param dateEnd
     */
    public void setDateEnd(java.lang.String dateEnd) {
        this.dateEnd = dateEnd;
    }


    /**
     * Gets the total value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return total
     */
    public int getTotal() {
        return total;
    }


    /**
     * Sets the total value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param total
     */
    public void setTotal(int total) {
        this.total = total;
    }


    /**
     * Gets the todo value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return todo
     */
    public int getTodo() {
        return todo;
    }


    /**
     * Sets the todo value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param todo
     */
    public void setTodo(int todo) {
        this.todo = todo;
    }


    /**
     * Gets the success value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return success
     */
    public int getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param success
     */
    public void setSuccess(int success) {
        this.success = success;
    }


    /**
     * Gets the failed value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return failed
     */
    public int getFailed() {
        return failed;
    }


    /**
     * Sets the failed value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param failed
     */
    public void setFailed(int failed) {
        this.failed = failed;
    }


    /**
     * Gets the reference value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return reference
     */
    public java.lang.String getReference() {
        return reference;
    }


    /**
     * Sets the reference value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param reference
     */
    public void setReference(java.lang.String reference) {
        this.reference = reference;
    }


    /**
     * Gets the recipients value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @return recipients
     */
    public com.ovh.TelephonyRecipientStruct[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this TelephonyFaxCampaignDetailsStruct.
     * 
     * @param recipients
     */
    public void setRecipients(com.ovh.TelephonyRecipientStruct[] recipients) {
        this.recipients = recipients;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelephonyFaxCampaignDetailsStruct)) return false;
        TelephonyFaxCampaignDetailsStruct other = (TelephonyFaxCampaignDetailsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.campaignName==null && other.getCampaignName()==null) || 
             (this.campaignName!=null &&
              this.campaignName.equals(other.getCampaignName()))) &&
            ((this.campaignStatus==null && other.getCampaignStatus()==null) || 
             (this.campaignStatus!=null &&
              this.campaignStatus.equals(other.getCampaignStatus()))) &&
            ((this.dateStart==null && other.getDateStart()==null) || 
             (this.dateStart!=null &&
              this.dateStart.equals(other.getDateStart()))) &&
            ((this.dateEnd==null && other.getDateEnd()==null) || 
             (this.dateEnd!=null &&
              this.dateEnd.equals(other.getDateEnd()))) &&
            this.total == other.getTotal() &&
            this.todo == other.getTodo() &&
            this.success == other.getSuccess() &&
            this.failed == other.getFailed() &&
            ((this.reference==null && other.getReference()==null) || 
             (this.reference!=null &&
              this.reference.equals(other.getReference()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients())));
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
        if (getCampaignName() != null) {
            _hashCode += getCampaignName().hashCode();
        }
        if (getCampaignStatus() != null) {
            _hashCode += getCampaignStatus().hashCode();
        }
        if (getDateStart() != null) {
            _hashCode += getDateStart().hashCode();
        }
        if (getDateEnd() != null) {
            _hashCode += getDateEnd().hashCode();
        }
        _hashCode += getTotal();
        _hashCode += getTodo();
        _hashCode += getSuccess();
        _hashCode += getFailed();
        if (getReference() != null) {
            _hashCode += getReference().hashCode();
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
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
        new org.apache.axis.description.TypeDesc(TelephonyFaxCampaignDetailsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyFaxCampaignDetailsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "campaignStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("todo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "todo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "telephonyRecipientStruct"));
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
