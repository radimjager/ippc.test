/**
 * PRIMARYRESOURCEOUT.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class PRIMARYRESOURCEOUT  implements java.io.Serializable {
    private cz.sysnet.ippc.ws.common.PRIMARYRESOURCE PRESOURCE;

    public PRIMARYRESOURCEOUT() {
    }

    public PRIMARYRESOURCEOUT(
           cz.sysnet.ippc.ws.common.PRIMARYRESOURCE PRESOURCE) {
           this.PRESOURCE = PRESOURCE;
    }


    /**
     * Gets the PRESOURCE value for this PRIMARYRESOURCEOUT.
     * 
     * @return PRESOURCE
     */
    public cz.sysnet.ippc.ws.common.PRIMARYRESOURCE getPRESOURCE() {
        return PRESOURCE;
    }


    /**
     * Sets the PRESOURCE value for this PRIMARYRESOURCEOUT.
     * 
     * @param PRESOURCE
     */
    public void setPRESOURCE(cz.sysnet.ippc.ws.common.PRIMARYRESOURCE PRESOURCE) {
        this.PRESOURCE = PRESOURCE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PRIMARYRESOURCEOUT)) return false;
        PRIMARYRESOURCEOUT other = (PRIMARYRESOURCEOUT) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.PRESOURCE==null && other.getPRESOURCE()==null) || 
             (this.PRESOURCE!=null &&
              this.PRESOURCE.equals(other.getPRESOURCE())));
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
        if (getPRESOURCE() != null) {
            _hashCode += getPRESOURCE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PRIMARYRESOURCEOUT.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "PRIMARYRESOURCEOUT"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PRESOURCE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PRESOURCE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "PRIMARYRESOURCE"));
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
