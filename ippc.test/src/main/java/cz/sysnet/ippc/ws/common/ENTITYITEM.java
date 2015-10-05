/**
 * ENTITYITEM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class ENTITYITEM  implements java.io.Serializable {
    private java.lang.String ENTITY;

    private java.lang.String DESCRIPTION;

    public ENTITYITEM() {
    }

    public ENTITYITEM(
           java.lang.String ENTITY,
           java.lang.String DESCRIPTION) {
           this.ENTITY = ENTITY;
           this.DESCRIPTION = DESCRIPTION;
    }


    /**
     * Gets the ENTITY value for this ENTITYITEM.
     * 
     * @return ENTITY
     */
    public java.lang.String getENTITY() {
        return ENTITY;
    }


    /**
     * Sets the ENTITY value for this ENTITYITEM.
     * 
     * @param ENTITY
     */
    public void setENTITY(java.lang.String ENTITY) {
        this.ENTITY = ENTITY;
    }


    /**
     * Gets the DESCRIPTION value for this ENTITYITEM.
     * 
     * @return DESCRIPTION
     */
    public java.lang.String getDESCRIPTION() {
        return DESCRIPTION;
    }


    /**
     * Sets the DESCRIPTION value for this ENTITYITEM.
     * 
     * @param DESCRIPTION
     */
    public void setDESCRIPTION(java.lang.String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ENTITYITEM)) return false;
        ENTITYITEM other = (ENTITYITEM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ENTITY==null && other.getENTITY()==null) || 
             (this.ENTITY!=null &&
              this.ENTITY.equals(other.getENTITY()))) &&
            ((this.DESCRIPTION==null && other.getDESCRIPTION()==null) || 
             (this.DESCRIPTION!=null &&
              this.DESCRIPTION.equals(other.getDESCRIPTION())));
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
        if (getENTITY() != null) {
            _hashCode += getENTITY().hashCode();
        }
        if (getDESCRIPTION() != null) {
            _hashCode += getDESCRIPTION().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ENTITYITEM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "ENTITYITEM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENTITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DESCRIPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DESCRIPTION"));
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
