/**
 * DedicatedBackupListStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ovh;

public class DedicatedBackupListStruct  implements java.io.Serializable {
    private int backupId;

    private java.lang.String backupFeature;

    private int enable;

    private java.lang.String language;

    private java.lang.String backupSize;

    private int sshPort;

    private java.lang.String percentUsed;

    private java.lang.String hostname;

    private java.lang.String backupName;

    private java.lang.String email;

    private int snapshotNumber;

    private java.lang.String superBackupName;

    private java.lang.String backupType;

    private java.lang.String[] src;

    private java.lang.String[] include;

    private java.lang.String[] exclude;

    private java.lang.String[] excludeHard;

    public DedicatedBackupListStruct() {
    }

    public DedicatedBackupListStruct(
           int backupId,
           java.lang.String backupFeature,
           int enable,
           java.lang.String language,
           java.lang.String backupSize,
           int sshPort,
           java.lang.String percentUsed,
           java.lang.String hostname,
           java.lang.String backupName,
           java.lang.String email,
           int snapshotNumber,
           java.lang.String superBackupName,
           java.lang.String backupType,
           java.lang.String[] src,
           java.lang.String[] include,
           java.lang.String[] exclude,
           java.lang.String[] excludeHard) {
           this.backupId = backupId;
           this.backupFeature = backupFeature;
           this.enable = enable;
           this.language = language;
           this.backupSize = backupSize;
           this.sshPort = sshPort;
           this.percentUsed = percentUsed;
           this.hostname = hostname;
           this.backupName = backupName;
           this.email = email;
           this.snapshotNumber = snapshotNumber;
           this.superBackupName = superBackupName;
           this.backupType = backupType;
           this.src = src;
           this.include = include;
           this.exclude = exclude;
           this.excludeHard = excludeHard;
    }


    /**
     * Gets the backupId value for this DedicatedBackupListStruct.
     * 
     * @return backupId
     */
    public int getBackupId() {
        return backupId;
    }


    /**
     * Sets the backupId value for this DedicatedBackupListStruct.
     * 
     * @param backupId
     */
    public void setBackupId(int backupId) {
        this.backupId = backupId;
    }


    /**
     * Gets the backupFeature value for this DedicatedBackupListStruct.
     * 
     * @return backupFeature
     */
    public java.lang.String getBackupFeature() {
        return backupFeature;
    }


    /**
     * Sets the backupFeature value for this DedicatedBackupListStruct.
     * 
     * @param backupFeature
     */
    public void setBackupFeature(java.lang.String backupFeature) {
        this.backupFeature = backupFeature;
    }


    /**
     * Gets the enable value for this DedicatedBackupListStruct.
     * 
     * @return enable
     */
    public int getEnable() {
        return enable;
    }


    /**
     * Sets the enable value for this DedicatedBackupListStruct.
     * 
     * @param enable
     */
    public void setEnable(int enable) {
        this.enable = enable;
    }


    /**
     * Gets the language value for this DedicatedBackupListStruct.
     * 
     * @return language
     */
    public java.lang.String getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this DedicatedBackupListStruct.
     * 
     * @param language
     */
    public void setLanguage(java.lang.String language) {
        this.language = language;
    }


    /**
     * Gets the backupSize value for this DedicatedBackupListStruct.
     * 
     * @return backupSize
     */
    public java.lang.String getBackupSize() {
        return backupSize;
    }


    /**
     * Sets the backupSize value for this DedicatedBackupListStruct.
     * 
     * @param backupSize
     */
    public void setBackupSize(java.lang.String backupSize) {
        this.backupSize = backupSize;
    }


    /**
     * Gets the sshPort value for this DedicatedBackupListStruct.
     * 
     * @return sshPort
     */
    public int getSshPort() {
        return sshPort;
    }


    /**
     * Sets the sshPort value for this DedicatedBackupListStruct.
     * 
     * @param sshPort
     */
    public void setSshPort(int sshPort) {
        this.sshPort = sshPort;
    }


    /**
     * Gets the percentUsed value for this DedicatedBackupListStruct.
     * 
     * @return percentUsed
     */
    public java.lang.String getPercentUsed() {
        return percentUsed;
    }


    /**
     * Sets the percentUsed value for this DedicatedBackupListStruct.
     * 
     * @param percentUsed
     */
    public void setPercentUsed(java.lang.String percentUsed) {
        this.percentUsed = percentUsed;
    }


    /**
     * Gets the hostname value for this DedicatedBackupListStruct.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this DedicatedBackupListStruct.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the backupName value for this DedicatedBackupListStruct.
     * 
     * @return backupName
     */
    public java.lang.String getBackupName() {
        return backupName;
    }


    /**
     * Sets the backupName value for this DedicatedBackupListStruct.
     * 
     * @param backupName
     */
    public void setBackupName(java.lang.String backupName) {
        this.backupName = backupName;
    }


    /**
     * Gets the email value for this DedicatedBackupListStruct.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this DedicatedBackupListStruct.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the snapshotNumber value for this DedicatedBackupListStruct.
     * 
     * @return snapshotNumber
     */
    public int getSnapshotNumber() {
        return snapshotNumber;
    }


    /**
     * Sets the snapshotNumber value for this DedicatedBackupListStruct.
     * 
     * @param snapshotNumber
     */
    public void setSnapshotNumber(int snapshotNumber) {
        this.snapshotNumber = snapshotNumber;
    }


    /**
     * Gets the superBackupName value for this DedicatedBackupListStruct.
     * 
     * @return superBackupName
     */
    public java.lang.String getSuperBackupName() {
        return superBackupName;
    }


    /**
     * Sets the superBackupName value for this DedicatedBackupListStruct.
     * 
     * @param superBackupName
     */
    public void setSuperBackupName(java.lang.String superBackupName) {
        this.superBackupName = superBackupName;
    }


    /**
     * Gets the backupType value for this DedicatedBackupListStruct.
     * 
     * @return backupType
     */
    public java.lang.String getBackupType() {
        return backupType;
    }


    /**
     * Sets the backupType value for this DedicatedBackupListStruct.
     * 
     * @param backupType
     */
    public void setBackupType(java.lang.String backupType) {
        this.backupType = backupType;
    }


    /**
     * Gets the src value for this DedicatedBackupListStruct.
     * 
     * @return src
     */
    public java.lang.String[] getSrc() {
        return src;
    }


    /**
     * Sets the src value for this DedicatedBackupListStruct.
     * 
     * @param src
     */
    public void setSrc(java.lang.String[] src) {
        this.src = src;
    }


    /**
     * Gets the include value for this DedicatedBackupListStruct.
     * 
     * @return include
     */
    public java.lang.String[] getInclude() {
        return include;
    }


    /**
     * Sets the include value for this DedicatedBackupListStruct.
     * 
     * @param include
     */
    public void setInclude(java.lang.String[] include) {
        this.include = include;
    }


    /**
     * Gets the exclude value for this DedicatedBackupListStruct.
     * 
     * @return exclude
     */
    public java.lang.String[] getExclude() {
        return exclude;
    }


    /**
     * Sets the exclude value for this DedicatedBackupListStruct.
     * 
     * @param exclude
     */
    public void setExclude(java.lang.String[] exclude) {
        this.exclude = exclude;
    }


    /**
     * Gets the excludeHard value for this DedicatedBackupListStruct.
     * 
     * @return excludeHard
     */
    public java.lang.String[] getExcludeHard() {
        return excludeHard;
    }


    /**
     * Sets the excludeHard value for this DedicatedBackupListStruct.
     * 
     * @param excludeHard
     */
    public void setExcludeHard(java.lang.String[] excludeHard) {
        this.excludeHard = excludeHard;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DedicatedBackupListStruct)) return false;
        DedicatedBackupListStruct other = (DedicatedBackupListStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.backupId == other.getBackupId() &&
            ((this.backupFeature==null && other.getBackupFeature()==null) || 
             (this.backupFeature!=null &&
              this.backupFeature.equals(other.getBackupFeature()))) &&
            this.enable == other.getEnable() &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.backupSize==null && other.getBackupSize()==null) || 
             (this.backupSize!=null &&
              this.backupSize.equals(other.getBackupSize()))) &&
            this.sshPort == other.getSshPort() &&
            ((this.percentUsed==null && other.getPercentUsed()==null) || 
             (this.percentUsed!=null &&
              this.percentUsed.equals(other.getPercentUsed()))) &&
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.backupName==null && other.getBackupName()==null) || 
             (this.backupName!=null &&
              this.backupName.equals(other.getBackupName()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            this.snapshotNumber == other.getSnapshotNumber() &&
            ((this.superBackupName==null && other.getSuperBackupName()==null) || 
             (this.superBackupName!=null &&
              this.superBackupName.equals(other.getSuperBackupName()))) &&
            ((this.backupType==null && other.getBackupType()==null) || 
             (this.backupType!=null &&
              this.backupType.equals(other.getBackupType()))) &&
            ((this.src==null && other.getSrc()==null) || 
             (this.src!=null &&
              java.util.Arrays.equals(this.src, other.getSrc()))) &&
            ((this.include==null && other.getInclude()==null) || 
             (this.include!=null &&
              java.util.Arrays.equals(this.include, other.getInclude()))) &&
            ((this.exclude==null && other.getExclude()==null) || 
             (this.exclude!=null &&
              java.util.Arrays.equals(this.exclude, other.getExclude()))) &&
            ((this.excludeHard==null && other.getExcludeHard()==null) || 
             (this.excludeHard!=null &&
              java.util.Arrays.equals(this.excludeHard, other.getExcludeHard())));
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
        _hashCode += getBackupId();
        if (getBackupFeature() != null) {
            _hashCode += getBackupFeature().hashCode();
        }
        _hashCode += getEnable();
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getBackupSize() != null) {
            _hashCode += getBackupSize().hashCode();
        }
        _hashCode += getSshPort();
        if (getPercentUsed() != null) {
            _hashCode += getPercentUsed().hashCode();
        }
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getBackupName() != null) {
            _hashCode += getBackupName().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        _hashCode += getSnapshotNumber();
        if (getSuperBackupName() != null) {
            _hashCode += getSuperBackupName().hashCode();
        }
        if (getBackupType() != null) {
            _hashCode += getBackupType().hashCode();
        }
        if (getSrc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSrc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSrc(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInclude() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInclude());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInclude(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExclude() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExclude());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExclude(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeHard() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeHard());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeHard(), i);
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
        new org.apache.axis.description.TypeDesc(DedicatedBackupListStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soapi.ovh.com/manager", "dedicatedBackupListStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupFeature");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupFeature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupSize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sshPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sshPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "percentUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snapshotNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snapshotNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("superBackupName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "superBackupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("src");
        elemField.setXmlName(new javax.xml.namespace.QName("", "src"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("include");
        elemField.setXmlName(new javax.xml.namespace.QName("", "include"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeHard");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excludeHard"));
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
