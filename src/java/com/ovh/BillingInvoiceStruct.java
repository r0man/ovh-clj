/**
 * BillingInvoiceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class BillingInvoiceStruct  implements java.io.Serializable {
    private java.lang.String vat;

    private java.lang.String totalPrice;

    private java.lang.String totalPriceWithVat;

    private java.lang.String date;

    private java.lang.String nic;

    private java.lang.String billnum;

    private com.ovh.BillingInvoiceDetailStruct[] details;

    private java.lang.String[] domains;

    private java.lang.String billingCountry;

    private java.lang.String ordernum;

    public BillingInvoiceStruct() {
    }

    public BillingInvoiceStruct(
           java.lang.String vat,
           java.lang.String totalPrice,
           java.lang.String totalPriceWithVat,
           java.lang.String date,
           java.lang.String nic,
           java.lang.String billnum,
           com.ovh.BillingInvoiceDetailStruct[] details,
           java.lang.String[] domains,
           java.lang.String billingCountry,
           java.lang.String ordernum) {
           this.vat = vat;
           this.totalPrice = totalPrice;
           this.totalPriceWithVat = totalPriceWithVat;
           this.date = date;
           this.nic = nic;
           this.billnum = billnum;
           this.details = details;
           this.domains = domains;
           this.billingCountry = billingCountry;
           this.ordernum = ordernum;
    }


    /**
     * Gets the vat value for this BillingInvoiceStruct.
     * 
     * @return vat
     */
    public java.lang.String getVat() {
        return vat;
    }


    /**
     * Sets the vat value for this BillingInvoiceStruct.
     * 
     * @param vat
     */
    public void setVat(java.lang.String vat) {
        this.vat = vat;
    }


    /**
     * Gets the totalPrice value for this BillingInvoiceStruct.
     * 
     * @return totalPrice
     */
    public java.lang.String getTotalPrice() {
        return totalPrice;
    }


    /**
     * Sets the totalPrice value for this BillingInvoiceStruct.
     * 
     * @param totalPrice
     */
    public void setTotalPrice(java.lang.String totalPrice) {
        this.totalPrice = totalPrice;
    }


    /**
     * Gets the totalPriceWithVat value for this BillingInvoiceStruct.
     * 
     * @return totalPriceWithVat
     */
    public java.lang.String getTotalPriceWithVat() {
        return totalPriceWithVat;
    }


    /**
     * Sets the totalPriceWithVat value for this BillingInvoiceStruct.
     * 
     * @param totalPriceWithVat
     */
    public void setTotalPriceWithVat(java.lang.String totalPriceWithVat) {
        this.totalPriceWithVat = totalPriceWithVat;
    }


    /**
     * Gets the date value for this BillingInvoiceStruct.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this BillingInvoiceStruct.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the nic value for this BillingInvoiceStruct.
     * 
     * @return nic
     */
    public java.lang.String getNic() {
        return nic;
    }


    /**
     * Sets the nic value for this BillingInvoiceStruct.
     * 
     * @param nic
     */
    public void setNic(java.lang.String nic) {
        this.nic = nic;
    }


    /**
     * Gets the billnum value for this BillingInvoiceStruct.
     * 
     * @return billnum
     */
    public java.lang.String getBillnum() {
        return billnum;
    }


    /**
     * Sets the billnum value for this BillingInvoiceStruct.
     * 
     * @param billnum
     */
    public void setBillnum(java.lang.String billnum) {
        this.billnum = billnum;
    }


    /**
     * Gets the details value for this BillingInvoiceStruct.
     * 
     * @return details
     */
    public com.ovh.BillingInvoiceDetailStruct[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this BillingInvoiceStruct.
     * 
     * @param details
     */
    public void setDetails(com.ovh.BillingInvoiceDetailStruct[] details) {
        this.details = details;
    }


    /**
     * Gets the domains value for this BillingInvoiceStruct.
     * 
     * @return domains
     */
    public java.lang.String[] getDomains() {
        return domains;
    }


    /**
     * Sets the domains value for this BillingInvoiceStruct.
     * 
     * @param domains
     */
    public void setDomains(java.lang.String[] domains) {
        this.domains = domains;
    }


    /**
     * Gets the billingCountry value for this BillingInvoiceStruct.
     * 
     * @return billingCountry
     */
    public java.lang.String getBillingCountry() {
        return billingCountry;
    }


    /**
     * Sets the billingCountry value for this BillingInvoiceStruct.
     * 
     * @param billingCountry
     */
    public void setBillingCountry(java.lang.String billingCountry) {
        this.billingCountry = billingCountry;
    }


    /**
     * Gets the ordernum value for this BillingInvoiceStruct.
     * 
     * @return ordernum
     */
    public java.lang.String getOrdernum() {
        return ordernum;
    }


    /**
     * Sets the ordernum value for this BillingInvoiceStruct.
     * 
     * @param ordernum
     */
    public void setOrdernum(java.lang.String ordernum) {
        this.ordernum = ordernum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingInvoiceStruct)) return false;
        BillingInvoiceStruct other = (BillingInvoiceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vat==null && other.getVat()==null) || 
             (this.vat!=null &&
              this.vat.equals(other.getVat()))) &&
            ((this.totalPrice==null && other.getTotalPrice()==null) || 
             (this.totalPrice!=null &&
              this.totalPrice.equals(other.getTotalPrice()))) &&
            ((this.totalPriceWithVat==null && other.getTotalPriceWithVat()==null) || 
             (this.totalPriceWithVat!=null &&
              this.totalPriceWithVat.equals(other.getTotalPriceWithVat()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.nic==null && other.getNic()==null) || 
             (this.nic!=null &&
              this.nic.equals(other.getNic()))) &&
            ((this.billnum==null && other.getBillnum()==null) || 
             (this.billnum!=null &&
              this.billnum.equals(other.getBillnum()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
            ((this.domains==null && other.getDomains()==null) || 
             (this.domains!=null &&
              java.util.Arrays.equals(this.domains, other.getDomains()))) &&
            ((this.billingCountry==null && other.getBillingCountry()==null) || 
             (this.billingCountry!=null &&
              this.billingCountry.equals(other.getBillingCountry()))) &&
            ((this.ordernum==null && other.getOrdernum()==null) || 
             (this.ordernum!=null &&
              this.ordernum.equals(other.getOrdernum())));
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
        if (getVat() != null) {
            _hashCode += getVat().hashCode();
        }
        if (getTotalPrice() != null) {
            _hashCode += getTotalPrice().hashCode();
        }
        if (getTotalPriceWithVat() != null) {
            _hashCode += getTotalPriceWithVat().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getNic() != null) {
            _hashCode += getNic().hashCode();
        }
        if (getBillnum() != null) {
            _hashCode += getBillnum().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomains() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomains());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomains(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingCountry() != null) {
            _hashCode += getBillingCountry().hashCode();
        }
        if (getOrdernum() != null) {
            _hashCode += getOrdernum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingInvoiceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "billingInvoiceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPriceWithVat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalPriceWithVat"));
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
        elemField.setFieldName("nic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "billingInvoiceDetailStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domains");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domains"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordernum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordernum"));
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
