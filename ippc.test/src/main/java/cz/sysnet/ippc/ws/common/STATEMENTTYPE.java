/**
 * STATEMENTTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class STATEMENTTYPE  implements java.io.Serializable {
    private java.lang.String PID;

    private java.lang.String PID_REQUEST;

    private java.lang.String PID_OFFICE;

    private java.lang.String PID_EXPERT;

    private java.lang.String URL;

    private java.util.Calendar DATE_CREATED;

    private java.util.Calendar DATE_MODIFIED;

    public STATEMENTTYPE() {
    }

    public STATEMENTTYPE(
           java.lang.String PID,
           java.lang.String PID_REQUEST,
           java.lang.String PID_OFFICE,
           java.lang.String PID_EXPERT,
           java.lang.String URL,
           java.util.Calendar DATE_CREATED,
           java.util.Calendar DATE_MODIFIED) {
           this.PID = PID;
           this.PID_REQUEST = PID_REQUEST;
           this.PID_OFFICE = PID_OFFICE;
           this.PID_EXPERT = PID_EXPERT;
           this.URL = URL;
           this.DATE_CREATED = DATE_CREATED;
           this.DATE_MODIFIED = DATE_MODIFIED;
    }


    /**
     * Gets the PID value for this STATEMENTTYPE.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this STATEMENTTYPE.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the PID_REQUEST value for this STATEMENTTYPE.
     * 
     * @return PID_REQUEST
     */
    public java.lang.String getPID_REQUEST() {
        return PID_REQUEST;
    }


    /**
     * Sets the PID_REQUEST value for this STATEMENTTYPE.
     * 
     * @param PID_REQUEST
     */
    public void setPID_REQUEST(java.lang.String PID_REQUEST) {
        this.PID_REQUEST = PID_REQUEST;
    }


    /**
     * Gets the PID_OFFICE value for this STATEMENTTYPE.
     * 
     * @return PID_OFFICE
     */
    public java.lang.String getPID_OFFICE() {
        return PID_OFFICE;
    }


    /**
     * Sets the PID_OFFICE value for this STATEMENTTYPE.
     * 
     * @param PID_OFFICE
     */
    public void setPID_OFFICE(java.lang.String PID_OFFICE) {
        this.PID_OFFICE = PID_OFFICE;
    }


    /**
     * Gets the PID_EXPERT value for this STATEMENTTYPE.
     * 
     * @return PID_EXPERT
     */
    public java.lang.String getPID_EXPERT() {
        return PID_EXPERT;
    }


    /**
     * Sets the PID_EXPERT value for this STATEMENTTYPE.
     * 
     * @param PID_EXPERT
     */
    public void setPID_EXPERT(java.lang.String PID_EXPERT) {
        this.PID_EXPERT = PID_EXPERT;
    }


    /**
     * Gets the URL value for this STATEMENTTYPE.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this STATEMENTTYPE.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the DATE_CREATED value for this STATEMENTTYPE.
     * 
     * @return DATE_CREATED
     */
    public java.util.Calendar getDATE_CREATED() {
        return DATE_CREATED;
    }


    /**
     * Sets the DATE_CREATED value for this STATEMENTTYPE.
     * 
     * @param DATE_CREATED
     */
    public void setDATE_CREATED(java.util.Calendar DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }


    /**
     * Gets the DATE_MODIFIED value for this STATEMENTTYPE.
     * 
     * @return DATE_MODIFIED
     */
    public java.util.Calendar getDATE_MODIFIED() {
        return DATE_MODIFIED;
    }


    /**
     * Sets the DATE_MODIFIED value for this STATEMENTTYPE.
     * 
     * @param DATE_MODIFIED
     */
    public void setDATE_MODIFIED(java.util.Calendar DATE_MODIFIED) {
        this.DATE_MODIFIED = DATE_MODIFIED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof STATEMENTTYPE)) return false;
        STATEMENTTYPE other = (STATEMENTTYPE) obj;
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
            ((this.PID_REQUEST==null && other.getPID_REQUEST()==null) || 
             (this.PID_REQUEST!=null &&
              this.PID_REQUEST.equals(other.getPID_REQUEST()))) &&
            ((this.PID_OFFICE==null && other.getPID_OFFICE()==null) || 
             (this.PID_OFFICE!=null &&
              this.PID_OFFICE.equals(other.getPID_OFFICE()))) &&
            ((this.PID_EXPERT==null && other.getPID_EXPERT()==null) || 
             (this.PID_EXPERT!=null &&
              this.PID_EXPERT.equals(other.getPID_EXPERT()))) &&
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
        if (getPID_REQUEST() != null) {
            _hashCode += getPID_REQUEST().hashCode();
        }
        if (getPID_OFFICE() != null) {
            _hashCode += getPID_OFFICE().hashCode();
        }
        if (getPID_EXPERT() != null) {
            _hashCode += getPID_EXPERT().hashCode();
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
        new org.apache.axis.description.TypeDesc(STATEMENTTYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "STATEMENTTYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_REQUEST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_REQUEST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_OFFICE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_OFFICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_EXPERT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_EXPERT"));
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
