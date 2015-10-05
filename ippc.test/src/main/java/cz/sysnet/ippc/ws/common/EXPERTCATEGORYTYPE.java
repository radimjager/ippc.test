/**
 * EXPERTCATEGORYTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class EXPERTCATEGORYTYPE  implements java.io.Serializable {
    private java.lang.String PID_EXPERT;

    private java.lang.String EQUIPMENT_CATEGORY;

    public EXPERTCATEGORYTYPE() {
    }

    public EXPERTCATEGORYTYPE(
           java.lang.String PID_EXPERT,
           java.lang.String EQUIPMENT_CATEGORY) {
           this.PID_EXPERT = PID_EXPERT;
           this.EQUIPMENT_CATEGORY = EQUIPMENT_CATEGORY;
    }


    /**
     * Gets the PID_EXPERT value for this EXPERTCATEGORYTYPE.
     * 
     * @return PID_EXPERT
     */
    public java.lang.String getPID_EXPERT() {
        return PID_EXPERT;
    }


    /**
     * Sets the PID_EXPERT value for this EXPERTCATEGORYTYPE.
     * 
     * @param PID_EXPERT
     */
    public void setPID_EXPERT(java.lang.String PID_EXPERT) {
        this.PID_EXPERT = PID_EXPERT;
    }


    /**
     * Gets the EQUIPMENT_CATEGORY value for this EXPERTCATEGORYTYPE.
     * 
     * @return EQUIPMENT_CATEGORY
     */
    public java.lang.String getEQUIPMENT_CATEGORY() {
        return EQUIPMENT_CATEGORY;
    }


    /**
     * Sets the EQUIPMENT_CATEGORY value for this EXPERTCATEGORYTYPE.
     * 
     * @param EQUIPMENT_CATEGORY
     */
    public void setEQUIPMENT_CATEGORY(java.lang.String EQUIPMENT_CATEGORY) {
        this.EQUIPMENT_CATEGORY = EQUIPMENT_CATEGORY;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EXPERTCATEGORYTYPE)) return false;
        EXPERTCATEGORYTYPE other = (EXPERTCATEGORYTYPE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PID_EXPERT==null && other.getPID_EXPERT()==null) || 
             (this.PID_EXPERT!=null &&
              this.PID_EXPERT.equals(other.getPID_EXPERT()))) &&
            ((this.EQUIPMENT_CATEGORY==null && other.getEQUIPMENT_CATEGORY()==null) || 
             (this.EQUIPMENT_CATEGORY!=null &&
              this.EQUIPMENT_CATEGORY.equals(other.getEQUIPMENT_CATEGORY())));
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
        if (getPID_EXPERT() != null) {
            _hashCode += getPID_EXPERT().hashCode();
        }
        if (getEQUIPMENT_CATEGORY() != null) {
            _hashCode += getEQUIPMENT_CATEGORY().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EXPERTCATEGORYTYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTCATEGORYTYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_EXPERT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_EXPERT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_CATEGORY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENT_CATEGORY"));
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
