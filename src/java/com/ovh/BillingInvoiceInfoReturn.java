/**
 * BillingInvoiceInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class BillingInvoiceInfoReturn  implements java.io.Serializable {
    private java.lang.String billnum;

    private java.lang.String date;

    private java.lang.String nicbilling;

    private java.lang.String baseprice;

    private float finalprice;

    private java.lang.String password;

    private java.lang.String order;

    private java.lang.String nicorder;

    private java.lang.String country;

    private float taxrate;

    private float tax;

    private java.lang.String type;

    private com.ovh.BillingInvoiceInfoDetailStruct[] details;

    private com.ovh.BillingInvoiceInfoPayementStruct payment;

    public BillingInvoiceInfoReturn() {
    }

    public BillingInvoiceInfoReturn(
           java.lang.String billnum,
           java.lang.String date,
           java.lang.String nicbilling,
           java.lang.String baseprice,
           float finalprice,
           java.lang.String password,
           java.lang.String order,
           java.lang.String nicorder,
           java.lang.String country,
           float taxrate,
           float tax,
           java.lang.String type,
           com.ovh.BillingInvoiceInfoDetailStruct[] details,
           com.ovh.BillingInvoiceInfoPayementStruct payment) {
           this.billnum = billnum;
           this.date = date;
           this.nicbilling = nicbilling;
           this.baseprice = baseprice;
           this.finalprice = finalprice;
           this.password = password;
           this.order = order;
           this.nicorder = nicorder;
           this.country = country;
           this.taxrate = taxrate;
           this.tax = tax;
           this.type = type;
           this.details = details;
           this.payment = payment;
    }


    /**
     * Gets the billnum value for this BillingInvoiceInfoReturn.
     * 
     * @return billnum
     */
    public java.lang.String getBillnum() {
        return billnum;
    }


    /**
     * Sets the billnum value for this BillingInvoiceInfoReturn.
     * 
     * @param billnum
     */
    public void setBillnum(java.lang.String billnum) {
        this.billnum = billnum;
    }


    /**
     * Gets the date value for this BillingInvoiceInfoReturn.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this BillingInvoiceInfoReturn.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the nicbilling value for this BillingInvoiceInfoReturn.
     * 
     * @return nicbilling
     */
    public java.lang.String getNicbilling() {
        return nicbilling;
    }


    /**
     * Sets the nicbilling value for this BillingInvoiceInfoReturn.
     * 
     * @param nicbilling
     */
    public void setNicbilling(java.lang.String nicbilling) {
        this.nicbilling = nicbilling;
    }


    /**
     * Gets the baseprice value for this BillingInvoiceInfoReturn.
     * 
     * @return baseprice
     */
    public java.lang.String getBaseprice() {
        return baseprice;
    }


    /**
     * Sets the baseprice value for this BillingInvoiceInfoReturn.
     * 
     * @param baseprice
     */
    public void setBaseprice(java.lang.String baseprice) {
        this.baseprice = baseprice;
    }


    /**
     * Gets the finalprice value for this BillingInvoiceInfoReturn.
     * 
     * @return finalprice
     */
    public float getFinalprice() {
        return finalprice;
    }


    /**
     * Sets the finalprice value for this BillingInvoiceInfoReturn.
     * 
     * @param finalprice
     */
    public void setFinalprice(float finalprice) {
        this.finalprice = finalprice;
    }


    /**
     * Gets the password value for this BillingInvoiceInfoReturn.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this BillingInvoiceInfoReturn.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the order value for this BillingInvoiceInfoReturn.
     * 
     * @return order
     */
    public java.lang.String getOrder() {
        return order;
    }


    /**
     * Sets the order value for this BillingInvoiceInfoReturn.
     * 
     * @param order
     */
    public void setOrder(java.lang.String order) {
        this.order = order;
    }


    /**
     * Gets the nicorder value for this BillingInvoiceInfoReturn.
     * 
     * @return nicorder
     */
    public java.lang.String getNicorder() {
        return nicorder;
    }


    /**
     * Sets the nicorder value for this BillingInvoiceInfoReturn.
     * 
     * @param nicorder
     */
    public void setNicorder(java.lang.String nicorder) {
        this.nicorder = nicorder;
    }


    /**
     * Gets the country value for this BillingInvoiceInfoReturn.
     * 
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this BillingInvoiceInfoReturn.
     * 
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the taxrate value for this BillingInvoiceInfoReturn.
     * 
     * @return taxrate
     */
    public float getTaxrate() {
        return taxrate;
    }


    /**
     * Sets the taxrate value for this BillingInvoiceInfoReturn.
     * 
     * @param taxrate
     */
    public void setTaxrate(float taxrate) {
        this.taxrate = taxrate;
    }


    /**
     * Gets the tax value for this BillingInvoiceInfoReturn.
     * 
     * @return tax
     */
    public float getTax() {
        return tax;
    }


    /**
     * Sets the tax value for this BillingInvoiceInfoReturn.
     * 
     * @param tax
     */
    public void setTax(float tax) {
        this.tax = tax;
    }


    /**
     * Gets the type value for this BillingInvoiceInfoReturn.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this BillingInvoiceInfoReturn.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the details value for this BillingInvoiceInfoReturn.
     * 
     * @return details
     */
    public com.ovh.BillingInvoiceInfoDetailStruct[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this BillingInvoiceInfoReturn.
     * 
     * @param details
     */
    public void setDetails(com.ovh.BillingInvoiceInfoDetailStruct[] details) {
        this.details = details;
    }


    /**
     * Gets the payment value for this BillingInvoiceInfoReturn.
     * 
     * @return payment
     */
    public com.ovh.BillingInvoiceInfoPayementStruct getPayment() {
        return payment;
    }


    /**
     * Sets the payment value for this BillingInvoiceInfoReturn.
     * 
     * @param payment
     */
    public void setPayment(com.ovh.BillingInvoiceInfoPayementStruct payment) {
        this.payment = payment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillingInvoiceInfoReturn)) return false;
        BillingInvoiceInfoReturn other = (BillingInvoiceInfoReturn) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billnum==null && other.getBillnum()==null) || 
             (this.billnum!=null &&
              this.billnum.equals(other.getBillnum()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.nicbilling==null && other.getNicbilling()==null) || 
             (this.nicbilling!=null &&
              this.nicbilling.equals(other.getNicbilling()))) &&
            ((this.baseprice==null && other.getBaseprice()==null) || 
             (this.baseprice!=null &&
              this.baseprice.equals(other.getBaseprice()))) &&
            this.finalprice == other.getFinalprice() &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              this.order.equals(other.getOrder()))) &&
            ((this.nicorder==null && other.getNicorder()==null) || 
             (this.nicorder!=null &&
              this.nicorder.equals(other.getNicorder()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            this.taxrate == other.getTaxrate() &&
            this.tax == other.getTax() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
            ((this.payment==null && other.getPayment()==null) || 
             (this.payment!=null &&
              this.payment.equals(other.getPayment())));
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
        if (getBillnum() != null) {
            _hashCode += getBillnum().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getNicbilling() != null) {
            _hashCode += getNicbilling().hashCode();
        }
        if (getBaseprice() != null) {
            _hashCode += getBaseprice().hashCode();
        }
        _hashCode += new Float(getFinalprice()).hashCode();
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getOrder() != null) {
            _hashCode += getOrder().hashCode();
        }
        if (getNicorder() != null) {
            _hashCode += getNicorder().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += new Float(getTaxrate()).hashCode();
        _hashCode += new Float(getTax()).hashCode();
        if (getType() != null) {
            _hashCode += getType().hashCode();
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
        if (getPayment() != null) {
            _hashCode += getPayment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillingInvoiceInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "billingInvoiceInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "billnum"));
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
        elemField.setFieldName("nicbilling");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicbilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseprice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "baseprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalprice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalprice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nicorder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nicorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxrate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "billingInvoiceInfoDetailStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "payment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "billingInvoiceInfoPayementStruct"));
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
