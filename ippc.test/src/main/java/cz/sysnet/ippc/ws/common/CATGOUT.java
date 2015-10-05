/**
 * CATGOUT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class CATGOUT  implements java.io.Serializable {
    private cz.sysnet.ippc.ws.common.CATALOGUE CATALOGUE;

    public CATGOUT() {
    }

    public CATGOUT(
           cz.sysnet.ippc.ws.common.CATALOGUE CATALOGUE) {
           this.CATALOGUE = CATALOGUE;
    }


    /**
     * Gets the CATALOGUE value for this CATGOUT.
     * 
     * @return CATALOGUE
     */
    public cz.sysnet.ippc.ws.common.CATALOGUE getCATALOGUE() {
        return CATALOGUE;
    }


    /**
     * Sets the CATALOGUE value for this CATGOUT.
     * 
     * @param CATALOGUE
     */
    public void setCATALOGUE(cz.sysnet.ippc.ws.common.CATALOGUE CATALOGUE) {
        this.CATALOGUE = CATALOGUE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CATGOUT)) return false;
        CATGOUT other = (CATGOUT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CATALOGUE==null && other.getCATALOGUE()==null) || 
             (this.CATALOGUE!=null &&
              this.CATALOGUE.equals(other.getCATALOGUE())));
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
        if (getCATALOGUE() != null) {
            _hashCode += getCATALOGUE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CATGOUT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGOUT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CATALOGUE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CATALOGUE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATALOGUE"));
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
