/**
 * MailingListFullInfoReturn.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class MailingListFullInfoReturn  implements java.io.Serializable {
    private java.lang.String domain;

    private java.lang.String ml;

    private java.lang.String owner;

    private int nbSubscribers;

    private boolean message_moderation;

    private boolean users_post_only;

    private boolean subscription_moderation;

    private java.lang.String replyto;

    private java.lang.String lang;

    private java.lang.String[] moderators;

    private java.lang.String[] subscribers;

    public MailingListFullInfoReturn() {
    }

    public MailingListFullInfoReturn(
           java.lang.String domain,
           java.lang.String ml,
           java.lang.String owner,
           int nbSubscribers,
           boolean message_moderation,
           boolean users_post_only,
           boolean subscription_moderation,
           java.lang.String replyto,
           java.lang.String lang,
           java.lang.String[] moderators,
           java.lang.String[] subscribers) {
           this.domain = domain;
           this.ml = ml;
           this.owner = owner;
           this.nbSubscribers = nbSubscribers;
           this.message_moderation = message_moderation;
           this.users_post_only = users_post_only;
           this.subscription_moderation = subscription_moderation;
           this.replyto = replyto;
           this.lang = lang;
           this.moderators = moderators;
           this.subscribers = subscribers;
    }


    /**
     * Gets the domain value for this MailingListFullInfoReturn.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this MailingListFullInfoReturn.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the ml value for this MailingListFullInfoReturn.
     * 
     * @return ml
     */
    public java.lang.String getMl() {
        return ml;
    }


    /**
     * Sets the ml value for this MailingListFullInfoReturn.
     * 
     * @param ml
     */
    public void setMl(java.lang.String ml) {
        this.ml = ml;
    }


    /**
     * Gets the owner value for this MailingListFullInfoReturn.
     * 
     * @return owner
     */
    public java.lang.String getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this MailingListFullInfoReturn.
     * 
     * @param owner
     */
    public void setOwner(java.lang.String owner) {
        this.owner = owner;
    }


    /**
     * Gets the nbSubscribers value for this MailingListFullInfoReturn.
     * 
     * @return nbSubscribers
     */
    public int getNbSubscribers() {
        return nbSubscribers;
    }


    /**
     * Sets the nbSubscribers value for this MailingListFullInfoReturn.
     * 
     * @param nbSubscribers
     */
    public void setNbSubscribers(int nbSubscribers) {
        this.nbSubscribers = nbSubscribers;
    }


    /**
     * Gets the message_moderation value for this MailingListFullInfoReturn.
     * 
     * @return message_moderation
     */
    public boolean isMessage_moderation() {
        return message_moderation;
    }


    /**
     * Sets the message_moderation value for this MailingListFullInfoReturn.
     * 
     * @param message_moderation
     */
    public void setMessage_moderation(boolean message_moderation) {
        this.message_moderation = message_moderation;
    }


    /**
     * Gets the users_post_only value for this MailingListFullInfoReturn.
     * 
     * @return users_post_only
     */
    public boolean isUsers_post_only() {
        return users_post_only;
    }


    /**
     * Sets the users_post_only value for this MailingListFullInfoReturn.
     * 
     * @param users_post_only
     */
    public void setUsers_post_only(boolean users_post_only) {
        this.users_post_only = users_post_only;
    }


    /**
     * Gets the subscription_moderation value for this MailingListFullInfoReturn.
     * 
     * @return subscription_moderation
     */
    public boolean isSubscription_moderation() {
        return subscription_moderation;
    }


    /**
     * Sets the subscription_moderation value for this MailingListFullInfoReturn.
     * 
     * @param subscription_moderation
     */
    public void setSubscription_moderation(boolean subscription_moderation) {
        this.subscription_moderation = subscription_moderation;
    }


    /**
     * Gets the replyto value for this MailingListFullInfoReturn.
     * 
     * @return replyto
     */
    public java.lang.String getReplyto() {
        return replyto;
    }


    /**
     * Sets the replyto value for this MailingListFullInfoReturn.
     * 
     * @param replyto
     */
    public void setReplyto(java.lang.String replyto) {
        this.replyto = replyto;
    }


    /**
     * Gets the lang value for this MailingListFullInfoReturn.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this MailingListFullInfoReturn.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
    }


    /**
     * Gets the moderators value for this MailingListFullInfoReturn.
     * 
     * @return moderators
     */
    public java.lang.String[] getModerators() {
        return moderators;
    }


    /**
     * Sets the moderators value for this MailingListFullInfoReturn.
     * 
     * @param moderators
     */
    public void setModerators(java.lang.String[] moderators) {
        this.moderators = moderators;
    }


    /**
     * Gets the subscribers value for this MailingListFullInfoReturn.
     * 
     * @return subscribers
     */
    public java.lang.String[] getSubscribers() {
        return subscribers;
    }


    /**
     * Sets the subscribers value for this MailingListFullInfoReturn.
     * 
     * @param subscribers
     */
    public void setSubscribers(java.lang.String[] subscribers) {
        this.subscribers = subscribers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MailingListFullInfoReturn)) return false;
        MailingListFullInfoReturn other = (MailingListFullInfoReturn) obj;
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
            ((this.ml==null && other.getMl()==null) || 
             (this.ml!=null &&
              this.ml.equals(other.getMl()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            this.nbSubscribers == other.getNbSubscribers() &&
            this.message_moderation == other.isMessage_moderation() &&
            this.users_post_only == other.isUsers_post_only() &&
            this.subscription_moderation == other.isSubscription_moderation() &&
            ((this.replyto==null && other.getReplyto()==null) || 
             (this.replyto!=null &&
              this.replyto.equals(other.getReplyto()))) &&
            ((this.lang==null && other.getLang()==null) || 
             (this.lang!=null &&
              this.lang.equals(other.getLang()))) &&
            ((this.moderators==null && other.getModerators()==null) || 
             (this.moderators!=null &&
              java.util.Arrays.equals(this.moderators, other.getModerators()))) &&
            ((this.subscribers==null && other.getSubscribers()==null) || 
             (this.subscribers!=null &&
              java.util.Arrays.equals(this.subscribers, other.getSubscribers())));
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
        if (getMl() != null) {
            _hashCode += getMl().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        _hashCode += getNbSubscribers();
        _hashCode += (isMessage_moderation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUsers_post_only() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSubscription_moderation() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getReplyto() != null) {
            _hashCode += getReplyto().hashCode();
        }
        if (getLang() != null) {
            _hashCode += getLang().hashCode();
        }
        if (getModerators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModerators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModerators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscribers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscribers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscribers(), i);
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
        new org.apache.axis.description.TypeDesc(MailingListFullInfoReturn.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "mailingListFullInfoReturn"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ml");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nbSubscribers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nbSubscribers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message_moderation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message_moderation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("users_post_only");
        elemField.setXmlName(new javax.xml.namespace.QName("", "users_post_only"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription_moderation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscription_moderation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replyto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replyto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moderators");
        elemField.setXmlName(new javax.xml.namespace.QName("", "moderators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscribers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subscribers"));
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
