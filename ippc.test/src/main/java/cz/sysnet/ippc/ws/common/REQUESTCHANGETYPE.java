/**
 * REQUESTCHANGETYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class REQUESTCHANGETYPE  implements java.io.Serializable {
    private java.lang.String PID;

    private java.lang.String PID_CHANGED;

    public REQUESTCHANGETYPE() {
    }

    public REQUESTCHANGETYPE(
           java.lang.String PID,
           java.lang.String PID_CHANGED) {
           this.PID = PID;
           this.PID_CHANGED = PID_CHANGED;
    }


    /**
     * Gets the PID value for this REQUESTCHANGETYPE.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this REQUESTCHANGETYPE.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the PID_CHANGED value for this REQUESTCHANGETYPE.
     * 
     * @return PID_CHANGED
     */
    public java.lang.String getPID_CHANGED() {
        return PID_CHANGED;
    }


    /**
     * Sets the PID_CHANGED value for this REQUESTCHANGETYPE.
     * 
     * @param PID_CHANGED
     */
    public void setPID_CHANGED(java.lang.String PID_CHANGED) {
        this.PID_CHANGED = PID_CHANGED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof REQUESTCHANGETYPE)) return false;
        REQUESTCHANGETYPE other = (REQUESTCHANGETYPE) obj;
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
            ((this.PID_CHANGED==null && other.getPID_CHANGED()==null) || 
             (this.PID_CHANGED!=null &&
              this.PID_CHANGED.equals(other.getPID_CHANGED())));
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
        if (getPID_CHANGED() != null) {
            _hashCode += getPID_CHANGED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(REQUESTCHANGETYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTCHANGETYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_CHANGED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_CHANGED"));
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
