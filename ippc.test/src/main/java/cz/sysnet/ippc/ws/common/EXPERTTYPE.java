/**
 * EXPERTTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class EXPERTTYPE  implements java.io.Serializable {
    private java.lang.String PID;

    private java.lang.String COMPANYNAME;

    private java.lang.String ICO;

    private java.lang.String URL;

    private java.util.Calendar DATE_CREATED;

    private java.util.Calendar DATE_MODIFIED;

    public EXPERTTYPE() {
    }

    public EXPERTTYPE(
           java.lang.String PID,
           java.lang.String COMPANYNAME,
           java.lang.String ICO,
           java.lang.String URL,
           java.util.Calendar DATE_CREATED,
           java.util.Calendar DATE_MODIFIED) {
           this.PID = PID;
           this.COMPANYNAME = COMPANYNAME;
           this.ICO = ICO;
           this.URL = URL;
           this.DATE_CREATED = DATE_CREATED;
           this.DATE_MODIFIED = DATE_MODIFIED;
    }


    /**
     * Gets the PID value for this EXPERTTYPE.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this EXPERTTYPE.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the COMPANYNAME value for this EXPERTTYPE.
     * 
     * @return COMPANYNAME
     */
    public java.lang.String getCOMPANYNAME() {
        return COMPANYNAME;
    }


    /**
     * Sets the COMPANYNAME value for this EXPERTTYPE.
     * 
     * @param COMPANYNAME
     */
    public void setCOMPANYNAME(java.lang.String COMPANYNAME) {
        this.COMPANYNAME = COMPANYNAME;
    }


    /**
     * Gets the ICO value for this EXPERTTYPE.
     * 
     * @return ICO
     */
    public java.lang.String getICO() {
        return ICO;
    }


    /**
     * Sets the ICO value for this EXPERTTYPE.
     * 
     * @param ICO
     */
    public void setICO(java.lang.String ICO) {
        this.ICO = ICO;
    }


    /**
     * Gets the URL value for this EXPERTTYPE.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this EXPERTTYPE.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the DATE_CREATED value for this EXPERTTYPE.
     * 
     * @return DATE_CREATED
     */
    public java.util.Calendar getDATE_CREATED() {
        return DATE_CREATED;
    }


    /**
     * Sets the DATE_CREATED value for this EXPERTTYPE.
     * 
     * @param DATE_CREATED
     */
    public void setDATE_CREATED(java.util.Calendar DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }


    /**
     * Gets the DATE_MODIFIED value for this EXPERTTYPE.
     * 
     * @return DATE_MODIFIED
     */
    public java.util.Calendar getDATE_MODIFIED() {
        return DATE_MODIFIED;
    }


    /**
     * Sets the DATE_MODIFIED value for this EXPERTTYPE.
     * 
     * @param DATE_MODIFIED
     */
    public void setDATE_MODIFIED(java.util.Calendar DATE_MODIFIED) {
        this.DATE_MODIFIED = DATE_MODIFIED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EXPERTTYPE)) return false;
        EXPERTTYPE other = (EXPERTTYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PID==null && other.getPID()==null) || 
             (this.PID!=null &&
              this.PID.equals(other.getPID()))) &&
            ((this.COMPANYNAME==null && other.getCOMPANYNAME()==null) || 
             (this.COMPANYNAME!=null &&
              this.COMPANYNAME.equals(other.getCOMPANYNAME()))) &&
            ((this.ICO==null && other.getICO()==null) || 
             (this.ICO!=null &&
              this.ICO.equals(other.getICO()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.DATE_CREATED==null && other.getDATE_CREATED()==null) || 
             (this.DATE_CREATED!=null &&
              this.DATE_CREATED.equals(other.getDATE_CREATED()))) &&
            ((this.DATE_MODIFIED==null && other.getDATE_MODIFIED()==null) || 
             (this.DATE_MODIFIED!=null &&
              this.DATE_MODIFIED.equals(other.getDATE_MODIFIED())));
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
        if (getPID() != null) {
            _hashCode += getPID().hashCode();
        }
        if (getCOMPANYNAME() != null) {
            _hashCode += getCOMPANYNAME().hashCode();
        }
        if (getICO() != null) {
            _hashCode += getICO().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getDATE_CREATED() != null) {
            _hashCode += getDATE_CREATED().hashCode();
        }
        if (getDATE_MODIFIED() != null) {
            _hashCode += getDATE_MODIFIED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EXPERTTYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTTYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPANYNAME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMPANYNAME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ICO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ICO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_CREATED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_CREATED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_MODIFIED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_MODIFIED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
