/**
 * CATEGORYTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class CATEGORYTYPE  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -1877029717924599744L;

	private java.lang.String EQUIPMENT_CLASS;

    private java.lang.String EQUIPMENT_CATEGORY;

    private java.lang.String EQUIPMENT_CATEGORY_TEXT;

    private java.lang.String URL;

    private java.util.Calendar DATE_CREATED;

    private java.util.Calendar DATE_MODIFIED;

    public CATEGORYTYPE() {
    }

    public CATEGORYTYPE(
           java.lang.String EQUIPMENT_CLASS,
           java.lang.String EQUIPMENT_CATEGORY,
           java.lang.String EQUIPMENT_CATEGORY_TEXT,
           java.lang.String URL,
           java.util.Calendar DATE_CREATED,
           java.util.Calendar DATE_MODIFIED) {
           this.EQUIPMENT_CLASS = EQUIPMENT_CLASS;
           this.EQUIPMENT_CATEGORY = EQUIPMENT_CATEGORY;
           this.EQUIPMENT_CATEGORY_TEXT = EQUIPMENT_CATEGORY_TEXT;
           this.URL = URL;
           this.DATE_CREATED = DATE_CREATED;
           this.DATE_MODIFIED = DATE_MODIFIED;
    }


    /**
     * Gets the EQUIPMENT_CLASS value for this CATEGORYTYPE.
     * 
     * @return EQUIPMENT_CLASS
     */
    public java.lang.String getEQUIPMENT_CLASS() {
        return EQUIPMENT_CLASS;
    }


    /**
     * Sets the EQUIPMENT_CLASS value for this CATEGORYTYPE.
     * 
     * @param EQUIPMENT_CLASS
     */
    public void setEQUIPMENT_CLASS(java.lang.String EQUIPMENT_CLASS) {
        this.EQUIPMENT_CLASS = EQUIPMENT_CLASS;
    }


    /**
     * Gets the EQUIPMENT_CATEGORY value for this CATEGORYTYPE.
     * 
     * @return EQUIPMENT_CATEGORY
     */
    public java.lang.String getEQUIPMENT_CATEGORY() {
        return EQUIPMENT_CATEGORY;
    }


    /**
     * Sets the EQUIPMENT_CATEGORY value for this CATEGORYTYPE.
     * 
     * @param EQUIPMENT_CATEGORY
     */
    public void setEQUIPMENT_CATEGORY(java.lang.String EQUIPMENT_CATEGORY) {
        this.EQUIPMENT_CATEGORY = EQUIPMENT_CATEGORY;
    }


    /**
     * Gets the EQUIPMENT_CATEGORY_TEXT value for this CATEGORYTYPE.
     * 
     * @return EQUIPMENT_CATEGORY_TEXT
     */
    public java.lang.String getEQUIPMENT_CATEGORY_TEXT() {
        return EQUIPMENT_CATEGORY_TEXT;
    }


    /**
     * Sets the EQUIPMENT_CATEGORY_TEXT value for this CATEGORYTYPE.
     * 
     * @param EQUIPMENT_CATEGORY_TEXT
     */
    public void setEQUIPMENT_CATEGORY_TEXT(java.lang.String EQUIPMENT_CATEGORY_TEXT) {
        this.EQUIPMENT_CATEGORY_TEXT = EQUIPMENT_CATEGORY_TEXT;
    }


    /**
     * Gets the URL value for this CATEGORYTYPE.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this CATEGORYTYPE.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the DATE_CREATED value for this CATEGORYTYPE.
     * 
     * @return DATE_CREATED
     */
    public java.util.Calendar getDATE_CREATED() {
        return DATE_CREATED;
    }


    /**
     * Sets the DATE_CREATED value for this CATEGORYTYPE.
     * 
     * @param DATE_CREATED
     */
    public void setDATE_CREATED(java.util.Calendar DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }


    /**
     * Gets the DATE_MODIFIED value for this CATEGORYTYPE.
     * 
     * @return DATE_MODIFIED
     */
    public java.util.Calendar getDATE_MODIFIED() {
        return DATE_MODIFIED;
    }


    /**
     * Sets the DATE_MODIFIED value for this CATEGORYTYPE.
     * 
     * @param DATE_MODIFIED
     */
    public void setDATE_MODIFIED(java.util.Calendar DATE_MODIFIED) {
        this.DATE_MODIFIED = DATE_MODIFIED;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CATEGORYTYPE)) return false;
        CATEGORYTYPE other = (CATEGORYTYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.EQUIPMENT_CLASS==null && other.getEQUIPMENT_CLASS()==null) || 
             (this.EQUIPMENT_CLASS!=null &&
              this.EQUIPMENT_CLASS.equals(other.getEQUIPMENT_CLASS()))) &&
            ((this.EQUIPMENT_CATEGORY==null && other.getEQUIPMENT_CATEGORY()==null) || 
             (this.EQUIPMENT_CATEGORY!=null &&
              this.EQUIPMENT_CATEGORY.equals(other.getEQUIPMENT_CATEGORY()))) &&
            ((this.EQUIPMENT_CATEGORY_TEXT==null && other.getEQUIPMENT_CATEGORY_TEXT()==null) || 
             (this.EQUIPMENT_CATEGORY_TEXT!=null &&
              this.EQUIPMENT_CATEGORY_TEXT.equals(other.getEQUIPMENT_CATEGORY_TEXT()))) &&
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
        if (getEQUIPMENT_CLASS() != null) {
            _hashCode += getEQUIPMENT_CLASS().hashCode();
        }
        if (getEQUIPMENT_CATEGORY() != null) {
            _hashCode += getEQUIPMENT_CATEGORY().hashCode();
        }
        if (getEQUIPMENT_CATEGORY_TEXT() != null) {
            _hashCode += getEQUIPMENT_CATEGORY_TEXT().hashCode();
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
        new org.apache.axis.description.TypeDesc(CATEGORYTYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATEGORYTYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_CLASS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENT_CLASS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_CATEGORY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENT_CATEGORY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_CATEGORY_TEXT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENT_CATEGORY_TEXT"));
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
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,  
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
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
