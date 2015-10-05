/**
 * SERVICEARRAY.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class SERVICEARRAY  implements java.io.Serializable {
    private cz.sysnet.ippc.ws.common.SERVICETYPE[] SERVICELIST;

    public SERVICEARRAY() {
    }

    public SERVICEARRAY(
           cz.sysnet.ippc.ws.common.SERVICETYPE[] SERVICELIST) {
           this.SERVICELIST = SERVICELIST;
    }


    /**
     * Gets the SERVICELIST value for this SERVICEARRAY.
     * 
     * @return SERVICELIST
     */
    public cz.sysnet.ippc.ws.common.SERVICETYPE[] getSERVICELIST() {
        return SERVICELIST;
    }


    /**
     * Sets the SERVICELIST value for this SERVICEARRAY.
     * 
     * @param SERVICELIST
     */
    public void setSERVICELIST(cz.sysnet.ippc.ws.common.SERVICETYPE[] SERVICELIST) {
        this.SERVICELIST = SERVICELIST;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SERVICEARRAY)) return false;
        SERVICEARRAY other = (SERVICEARRAY) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SERVICELIST==null && other.getSERVICELIST()==null) || 
             (this.SERVICELIST!=null &&
              java.util.Arrays.equals(this.SERVICELIST, other.getSERVICELIST())));
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
        if (getSERVICELIST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSERVICELIST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSERVICELIST(), i);
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
        new org.apache.axis.description.TypeDesc(SERVICEARRAY.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICEARRAY"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SERVICELIST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SERVICELIST"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICETYPE"));
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
