/**
 * CATGITEMDATE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class CATGITEMDATE  implements java.io.Serializable {
    private java.util.Calendar CREATED;

    private java.util.Calendar MODIFIED;

    public CATGITEMDATE() {
    }

    public CATGITEMDATE(
           java.util.Calendar CREATED,
           java.util.Calendar MODIFIED) {
           this.CREATED = CREATED;
           this.MODIFIED = MODIFIED;
    }


    /**
     * Gets the CREATED value for this CATGITEMDATE.
     * 
     * @return CREATED
     */
    public java.util.Calendar getCREATED() {
        return CREATED;
    }


    /**
     * Sets the CREATED value for this CATGITEMDATE.
     * 
     * @param CREATED
     */
    public void setCREATED(java.util.Calendar CREATED) {
        this.CREATED = CREATED;
    }


    /**
     * Gets the MODIFIED value for this CATGITEMDATE.
     * 
     * @return MODIFIED
     */
    public java.util.Calendar getMODIFIED() {
        return MODIFIED;
    }


    /**
     * Sets the MODIFIED value for this CATGITEMDATE.
     * 
     * @param MODIFIED
     */
    public void setMODIFIED(java.util.Calendar MODIFIED) {
        this.MODIFIED = MODIFIED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CATGITEMDATE)) return false;
        CATGITEMDATE other = (CATGITEMDATE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CREATED==null && other.getCREATED()==null) || 
             (this.CREATED!=null &&
              this.CREATED.equals(other.getCREATED()))) &&
            ((this.MODIFIED==null && other.getMODIFIED()==null) || 
             (this.MODIFIED!=null &&
              this.MODIFIED.equals(other.getMODIFIED())));
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
        if (getCREATED() != null) {
            _hashCode += getCREATED().hashCode();
        }
        if (getMODIFIED() != null) {
            _hashCode += getMODIFIED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CATGITEMDATE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGITEMDATE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CREATED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MODIFIED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MODIFIED"));
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
