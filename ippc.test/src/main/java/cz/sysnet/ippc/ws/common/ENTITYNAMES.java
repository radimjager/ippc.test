/**
 * ENTITYNAMES.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class ENTITYNAMES  implements java.io.Serializable {
    private int COUNT;

    private cz.sysnet.ippc.ws.common.ENTITYITEM[] ITEMS;

    public ENTITYNAMES() {
    }

    public ENTITYNAMES(
           int COUNT,
           cz.sysnet.ippc.ws.common.ENTITYITEM[] ITEMS) {
           this.COUNT = COUNT;
           this.ITEMS = ITEMS;
    }


    /**
     * Gets the COUNT value for this ENTITYNAMES.
     * 
     * @return COUNT
     */
    public int getCOUNT() {
        return COUNT;
    }


    /**
     * Sets the COUNT value for this ENTITYNAMES.
     * 
     * @param COUNT
     */
    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }


    /**
     * Gets the ITEMS value for this ENTITYNAMES.
     * 
     * @return ITEMS
     */
    public cz.sysnet.ippc.ws.common.ENTITYITEM[] getITEMS() {
        return ITEMS;
    }


    /**
     * Sets the ITEMS value for this ENTITYNAMES.
     * 
     * @param ITEMS
     */
    public void setITEMS(cz.sysnet.ippc.ws.common.ENTITYITEM[] ITEMS) {
        this.ITEMS = ITEMS;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ENTITYNAMES)) return false;
        ENTITYNAMES other = (ENTITYNAMES) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.COUNT == other.getCOUNT() &&
            ((this.ITEMS==null && other.getITEMS()==null) || 
             (this.ITEMS!=null &&
              java.util.Arrays.equals(this.ITEMS, other.getITEMS())));
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
        _hashCode += getCOUNT();
        if (getITEMS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getITEMS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getITEMS(), i);
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
        new org.apache.axis.description.TypeDesc(ENTITYNAMES.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "ENTITYNAMES"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "ENTITYITEM"));
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
