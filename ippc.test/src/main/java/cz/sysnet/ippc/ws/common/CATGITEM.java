/**
 * CATGITEM.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class CATGITEM  implements java.io.Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5391697573582554073L;

	private java.lang.String IDENTIFIER;

    private java.lang.String ENTITY;

    private cz.sysnet.ippc.ws.common.CATGITEMDATE DATE;

    public CATGITEM() {
    }

    public CATGITEM(
           java.lang.String IDENTIFIER,
           java.lang.String ENTITY,
           cz.sysnet.ippc.ws.common.CATGITEMDATE DATE) {
           this.IDENTIFIER = IDENTIFIER;
           this.ENTITY = ENTITY;
           this.DATE = DATE;
    }


    /**
     * Gets the IDENTIFIER value for this CATGITEM.
     * 
     * @return IDENTIFIER
     */
    public java.lang.String getIDENTIFIER() {
        return IDENTIFIER;
    }


    /**
     * Sets the IDENTIFIER value for this CATGITEM.
     * 
     * @param IDENTIFIER
     */
    public void setIDENTIFIER(java.lang.String IDENTIFIER) {
        this.IDENTIFIER = IDENTIFIER;
    }


    /**
     * Gets the ENTITY value for this CATGITEM.
     * 
     * @return ENTITY
     */
    public java.lang.String getENTITY() {
        return ENTITY;
    }


    /**
     * Sets the ENTITY value for this CATGITEM.
     * 
     * @param ENTITY
     */
    public void setENTITY(java.lang.String ENTITY) {
        this.ENTITY = ENTITY;
    }


    /**
     * Gets the DATE value for this CATGITEM.
     * 
     * @return DATE
     */
    public cz.sysnet.ippc.ws.common.CATGITEMDATE getDATE() {
        return DATE;
    }


    /**
     * Sets the DATE value for this CATGITEM.
     * 
     * @param DATE
     */
    public void setDATE(cz.sysnet.ippc.ws.common.CATGITEMDATE DATE) {
        this.DATE = DATE;
    }

    private java.lang.Object __equalsCalc = null;
    @SuppressWarnings("unused")
	public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CATGITEM)) return false;
        CATGITEM other = (CATGITEM) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.IDENTIFIER==null && other.getIDENTIFIER()==null) || 
             (this.IDENTIFIER!=null &&
              this.IDENTIFIER.equals(other.getIDENTIFIER()))) &&
            ((this.ENTITY==null && other.getENTITY()==null) || 
             (this.ENTITY!=null &&
              this.ENTITY.equals(other.getENTITY()))) &&
            ((this.DATE==null && other.getDATE()==null) || 
             (this.DATE!=null &&
              this.DATE.equals(other.getDATE())));
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
        if (getIDENTIFIER() != null) {
            _hashCode += getIDENTIFIER().hashCode();
        }
        if (getENTITY() != null) {
            _hashCode += getENTITY().hashCode();
        }
        if (getDATE() != null) {
            _hashCode += getDATE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CATGITEM.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGITEM"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IDENTIFIER");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IDENTIFIER"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ENTITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ENTITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGITEMDATE"));
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
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           @SuppressWarnings("rawtypes") java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
