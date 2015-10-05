/**
 * CATALOGUE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class CATALOGUE  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 6809680217143717782L;
	private int COUNT;
    private cz.sysnet.ippc.ws.common.CATGTIMESTAMP TIMESTAMP;
    private cz.sysnet.ippc.ws.common.CATGITEM[] ITEMS;
    
    public CATALOGUE() {
    }

    public CATALOGUE(
           int COUNT,
           cz.sysnet.ippc.ws.common.CATGTIMESTAMP TIMESTAMP,
           cz.sysnet.ippc.ws.common.CATGITEM[] ITEMS) {
           this.COUNT = COUNT;
           this.TIMESTAMP = TIMESTAMP;
           this.ITEMS = ITEMS;
    }


    /**
     * Gets the COUNT value for this CATALOGUE.
     * 
     * @return COUNT
     */
    public int getCOUNT() {
        return COUNT;
    }


    /**
     * Sets the COUNT value for this CATALOGUE.
     * 
     * @param COUNT
     */
    public void setCOUNT(int COUNT) {
        this.COUNT = COUNT;
    }


    /**
     * Gets the TIMESTAMP value for this CATALOGUE.
     * 
     * @return TIMESTAMP
     */
    public cz.sysnet.ippc.ws.common.CATGTIMESTAMP getTIMESTAMP() {
        return TIMESTAMP;
    }


    /**
     * Sets the TIMESTAMP value for this CATALOGUE.
     * 
     * @param TIMESTAMP
     */
    public void setTIMESTAMP(cz.sysnet.ippc.ws.common.CATGTIMESTAMP TIMESTAMP) {
        this.TIMESTAMP = TIMESTAMP;
    }


    /**
     * Gets the ITEMS value for this CATALOGUE.
     * 
     * @return ITEMS
     */
    public cz.sysnet.ippc.ws.common.CATGITEM[] getITEMS() {
        return ITEMS;
    }


    /**
     * Sets the ITEMS value for this CATALOGUE.
     * 
     * @param ITEMS
     */
    public void setITEMS(cz.sysnet.ippc.ws.common.CATGITEM[] ITEMS) {
        this.ITEMS = ITEMS;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CATALOGUE)) return false;
        CATALOGUE other = (CATALOGUE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.COUNT == other.getCOUNT() &&
            ((this.TIMESTAMP==null && other.getTIMESTAMP()==null) || 
             (this.TIMESTAMP!=null &&
              this.TIMESTAMP.equals(other.getTIMESTAMP()))) &&
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
        if (getTIMESTAMP() != null) {
            _hashCode += getTIMESTAMP().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(CATALOGUE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATALOGUE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TIMESTAMP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "TIMESTAMP"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGTIMESTAMP"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ITEMS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ITEMS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGITEM"));
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
    @SuppressWarnings("rawtypes")
	public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
