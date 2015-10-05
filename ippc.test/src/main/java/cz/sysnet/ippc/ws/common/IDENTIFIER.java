/**
 * IDENTIFIER.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class IDENTIFIER  implements java.io.Serializable {
    private java.lang.String VALUE;

    private java.lang.String SCHEME;

    private java.lang.String TYPE;

    private java.lang.String TITLE;

    private java.util.Calendar DATE_GENERATED;

    public IDENTIFIER() {
    }

    public IDENTIFIER(
           java.lang.String VALUE,
           java.lang.String SCHEME,
           java.lang.String TYPE,
           java.lang.String TITLE,
           java.util.Calendar DATE_GENERATED) {
           this.VALUE = VALUE;
           this.SCHEME = SCHEME;
           this.TYPE = TYPE;
           this.TITLE = TITLE;
           this.DATE_GENERATED = DATE_GENERATED;
    }


    /**
     * Gets the VALUE value for this IDENTIFIER.
     * 
     * @return VALUE
     */
    public java.lang.String getVALUE() {
        return VALUE;
    }


    /**
     * Sets the VALUE value for this IDENTIFIER.
     * 
     * @param VALUE
     */
    public void setVALUE(java.lang.String VALUE) {
        this.VALUE = VALUE;
    }


    /**
     * Gets the SCHEME value for this IDENTIFIER.
     * 
     * @return SCHEME
     */
    public java.lang.String getSCHEME() {
        return SCHEME;
    }


    /**
     * Sets the SCHEME value for this IDENTIFIER.
     * 
     * @param SCHEME
     */
    public void setSCHEME(java.lang.String SCHEME) {
        this.SCHEME = SCHEME;
    }


    /**
     * Gets the TYPE value for this IDENTIFIER.
     * 
     * @return TYPE
     */
    public java.lang.String getTYPE() {
        return TYPE;
    }


    /**
     * Sets the TYPE value for this IDENTIFIER.
     * 
     * @param TYPE
     */
    public void setTYPE(java.lang.String TYPE) {
        this.TYPE = TYPE;
    }


    /**
     * Gets the TITLE value for this IDENTIFIER.
     * 
     * @return TITLE
     */
    public java.lang.String getTITLE() {
        return TITLE;
    }


    /**
     * Sets the TITLE value for this IDENTIFIER.
     * 
     * @param TITLE
     */
    public void setTITLE(java.lang.String TITLE) {
        this.TITLE = TITLE;
    }


    /**
     * Gets the DATE_GENERATED value for this IDENTIFIER.
     * 
     * @return DATE_GENERATED
     */
    public java.util.Calendar getDATE_GENERATED() {
        return DATE_GENERATED;
    }


    /**
     * Sets the DATE_GENERATED value for this IDENTIFIER.
     * 
     * @param DATE_GENERATED
     */
    public void setDATE_GENERATED(java.util.Calendar DATE_GENERATED) {
        this.DATE_GENERATED = DATE_GENERATED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IDENTIFIER)) return false;
        IDENTIFIER other = (IDENTIFIER) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.VALUE==null && other.getVALUE()==null) || 
             (this.VALUE!=null &&
              this.VALUE.equals(other.getVALUE()))) &&
            ((this.SCHEME==null && other.getSCHEME()==null) || 
             (this.SCHEME!=null &&
              this.SCHEME.equals(other.getSCHEME()))) &&
            ((this.TYPE==null && other.getTYPE()==null) || 
             (this.TYPE!=null &&
              this.TYPE.equals(other.getTYPE()))) &&
            ((this.TITLE==null && other.getTITLE()==null) || 
             (this.TITLE!=null &&
              this.TITLE.equals(other.getTITLE()))) &&
            ((this.DATE_GENERATED==null && other.getDATE_GENERATED()==null) || 
             (this.DATE_GENERATED!=null &&
              this.DATE_GENERATED.equals(other.getDATE_GENERATED())));
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
        if (getVALUE() != null) {
            _hashCode += getVALUE().hashCode();
        }
        if (getSCHEME() != null) {
            _hashCode += getSCHEME().hashCode();
        }
        if (getTYPE() != null) {
            _hashCode += getTYPE().hashCode();
        }
        if (getTITLE() != null) {
            _hashCode += getTITLE().hashCode();
        }
        if (getDATE_GENERATED() != null) {
            _hashCode += getDATE_GENERATED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IDENTIFIER.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "IDENTIFIER"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("VALUE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "VALUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SCHEME");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SCHEME"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TITLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_GENERATED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_GENERATED"));
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
