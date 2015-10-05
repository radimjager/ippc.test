/**
 * IPPCV25.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class IPPCV25  implements java.io.Serializable {
    private java.util.Calendar CREATED_ON;

    private cz.sysnet.ippc.ws.common.ENUMERATION[] STATUS;

    private cz.sysnet.ippc.ws.common.ENUMERATION[] DOC_TYPE;

    private cz.sysnet.ippc.ws.common.REQUESTTYPE[] REQUEST;

    private cz.sysnet.ippc.ws.common.PLANTTYPE[] PLANT;

    private cz.sysnet.ippc.ws.common.OFFICETYPE[] OFFICE;

    private cz.sysnet.ippc.ws.common.EXPERTTYPE[] EXPERT;

    private cz.sysnet.ippc.ws.common.EXPERTCATEGORYTYPE[] EXPERTCATEGORY;

    private cz.sysnet.ippc.ws.common.COMPANYTYPE[] COMPANY;

    private cz.sysnet.ippc.ws.common.EQUIPMENTUNITTYPE[] EQUIPMENTUNIT;

    private cz.sysnet.ippc.ws.common.REQUESTCHANGETYPE[] RQRCHANGED;

    private cz.sysnet.ippc.ws.common.CATEGORYTYPE[] CATEGORY;

    private cz.sysnet.ippc.ws.common.STATEMENTTYPE[] STATEMENT;

    private cz.sysnet.ippc.ws.common.DOCUMENTTYPE[] DOCUMENT;

    public IPPCV25() {
    }

    public IPPCV25(
           java.util.Calendar CREATED_ON,
           cz.sysnet.ippc.ws.common.ENUMERATION[] STATUS,
           cz.sysnet.ippc.ws.common.ENUMERATION[] DOC_TYPE,
           cz.sysnet.ippc.ws.common.REQUESTTYPE[] REQUEST,
           cz.sysnet.ippc.ws.common.PLANTTYPE[] PLANT,
           cz.sysnet.ippc.ws.common.OFFICETYPE[] OFFICE,
           cz.sysnet.ippc.ws.common.EXPERTTYPE[] EXPERT,
           cz.sysnet.ippc.ws.common.EXPERTCATEGORYTYPE[] EXPERTCATEGORY,
           cz.sysnet.ippc.ws.common.COMPANYTYPE[] COMPANY,
           cz.sysnet.ippc.ws.common.EQUIPMENTUNITTYPE[] EQUIPMENTUNIT,
           cz.sysnet.ippc.ws.common.REQUESTCHANGETYPE[] RQRCHANGED,
           cz.sysnet.ippc.ws.common.CATEGORYTYPE[] CATEGORY,
           cz.sysnet.ippc.ws.common.STATEMENTTYPE[] STATEMENT,
           cz.sysnet.ippc.ws.common.DOCUMENTTYPE[] DOCUMENT) {
           this.CREATED_ON = CREATED_ON;
           this.STATUS = STATUS;
           this.DOC_TYPE = DOC_TYPE;
           this.REQUEST = REQUEST;
           this.PLANT = PLANT;
           this.OFFICE = OFFICE;
           this.EXPERT = EXPERT;
           this.EXPERTCATEGORY = EXPERTCATEGORY;
           this.COMPANY = COMPANY;
           this.EQUIPMENTUNIT = EQUIPMENTUNIT;
           this.RQRCHANGED = RQRCHANGED;
           this.CATEGORY = CATEGORY;
           this.STATEMENT = STATEMENT;
           this.DOCUMENT = DOCUMENT;
    }


    /**
     * Gets the CREATED_ON value for this IPPCV25.
     * 
     * @return CREATED_ON
     */
    public java.util.Calendar getCREATED_ON() {
        return CREATED_ON;
    }


    /**
     * Sets the CREATED_ON value for this IPPCV25.
     * 
     * @param CREATED_ON
     */
    public void setCREATED_ON(java.util.Calendar CREATED_ON) {
        this.CREATED_ON = CREATED_ON;
    }


    /**
     * Gets the STATUS value for this IPPCV25.
     * 
     * @return STATUS
     */
    public cz.sysnet.ippc.ws.common.ENUMERATION[] getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this IPPCV25.
     * 
     * @param STATUS
     */
    public void setSTATUS(cz.sysnet.ippc.ws.common.ENUMERATION[] STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the DOC_TYPE value for this IPPCV25.
     * 
     * @return DOC_TYPE
     */
    public cz.sysnet.ippc.ws.common.ENUMERATION[] getDOC_TYPE() {
        return DOC_TYPE;
    }


    /**
     * Sets the DOC_TYPE value for this IPPCV25.
     * 
     * @param DOC_TYPE
     */
    public void setDOC_TYPE(cz.sysnet.ippc.ws.common.ENUMERATION[] DOC_TYPE) {
        this.DOC_TYPE = DOC_TYPE;
    }


    /**
     * Gets the REQUEST value for this IPPCV25.
     * 
     * @return REQUEST
     */
    public cz.sysnet.ippc.ws.common.REQUESTTYPE[] getREQUEST() {
        return REQUEST;
    }


    /**
     * Sets the REQUEST value for this IPPCV25.
     * 
     * @param REQUEST
     */
    public void setREQUEST(cz.sysnet.ippc.ws.common.REQUESTTYPE[] REQUEST) {
        this.REQUEST = REQUEST;
    }


    /**
     * Gets the PLANT value for this IPPCV25.
     * 
     * @return PLANT
     */
    public cz.sysnet.ippc.ws.common.PLANTTYPE[] getPLANT() {
        return PLANT;
    }


    /**
     * Sets the PLANT value for this IPPCV25.
     * 
     * @param PLANT
     */
    public void setPLANT(cz.sysnet.ippc.ws.common.PLANTTYPE[] PLANT) {
        this.PLANT = PLANT;
    }


    /**
     * Gets the OFFICE value for this IPPCV25.
     * 
     * @return OFFICE
     */
    public cz.sysnet.ippc.ws.common.OFFICETYPE[] getOFFICE() {
        return OFFICE;
    }


    /**
     * Sets the OFFICE value for this IPPCV25.
     * 
     * @param OFFICE
     */
    public void setOFFICE(cz.sysnet.ippc.ws.common.OFFICETYPE[] OFFICE) {
        this.OFFICE = OFFICE;
    }


    /**
     * Gets the EXPERT value for this IPPCV25.
     * 
     * @return EXPERT
     */
    public cz.sysnet.ippc.ws.common.EXPERTTYPE[] getEXPERT() {
        return EXPERT;
    }


    /**
     * Sets the EXPERT value for this IPPCV25.
     * 
     * @param EXPERT
     */
    public void setEXPERT(cz.sysnet.ippc.ws.common.EXPERTTYPE[] EXPERT) {
        this.EXPERT = EXPERT;
    }


    /**
     * Gets the EXPERTCATEGORY value for this IPPCV25.
     * 
     * @return EXPERTCATEGORY
     */
    public cz.sysnet.ippc.ws.common.EXPERTCATEGORYTYPE[] getEXPERTCATEGORY() {
        return EXPERTCATEGORY;
    }


    /**
     * Sets the EXPERTCATEGORY value for this IPPCV25.
     * 
     * @param EXPERTCATEGORY
     */
    public void setEXPERTCATEGORY(cz.sysnet.ippc.ws.common.EXPERTCATEGORYTYPE[] EXPERTCATEGORY) {
        this.EXPERTCATEGORY = EXPERTCATEGORY;
    }


    /**
     * Gets the COMPANY value for this IPPCV25.
     * 
     * @return COMPANY
     */
    public cz.sysnet.ippc.ws.common.COMPANYTYPE[] getCOMPANY() {
        return COMPANY;
    }


    /**
     * Sets the COMPANY value for this IPPCV25.
     * 
     * @param COMPANY
     */
    public void setCOMPANY(cz.sysnet.ippc.ws.common.COMPANYTYPE[] COMPANY) {
        this.COMPANY = COMPANY;
    }


    /**
     * Gets the EQUIPMENTUNIT value for this IPPCV25.
     * 
     * @return EQUIPMENTUNIT
     */
    public cz.sysnet.ippc.ws.common.EQUIPMENTUNITTYPE[] getEQUIPMENTUNIT() {
        return EQUIPMENTUNIT;
    }


    /**
     * Sets the EQUIPMENTUNIT value for this IPPCV25.
     * 
     * @param EQUIPMENTUNIT
     */
    public void setEQUIPMENTUNIT(cz.sysnet.ippc.ws.common.EQUIPMENTUNITTYPE[] EQUIPMENTUNIT) {
        this.EQUIPMENTUNIT = EQUIPMENTUNIT;
    }


    /**
     * Gets the RQRCHANGED value for this IPPCV25.
     * 
     * @return RQRCHANGED
     */
    public cz.sysnet.ippc.ws.common.REQUESTCHANGETYPE[] getRQRCHANGED() {
        return RQRCHANGED;
    }


    /**
     * Sets the RQRCHANGED value for this IPPCV25.
     * 
     * @param RQRCHANGED
     */
    public void setRQRCHANGED(cz.sysnet.ippc.ws.common.REQUESTCHANGETYPE[] RQRCHANGED) {
        this.RQRCHANGED = RQRCHANGED;
    }


    /**
     * Gets the CATEGORY value for this IPPCV25.
     * 
     * @return CATEGORY
     */
    public cz.sysnet.ippc.ws.common.CATEGORYTYPE[] getCATEGORY() {
        return CATEGORY;
    }


    /**
     * Sets the CATEGORY value for this IPPCV25.
     * 
     * @param CATEGORY
     */
    public void setCATEGORY(cz.sysnet.ippc.ws.common.CATEGORYTYPE[] CATEGORY) {
        this.CATEGORY = CATEGORY;
    }


    /**
     * Gets the STATEMENT value for this IPPCV25.
     * 
     * @return STATEMENT
     */
    public cz.sysnet.ippc.ws.common.STATEMENTTYPE[] getSTATEMENT() {
        return STATEMENT;
    }


    /**
     * Sets the STATEMENT value for this IPPCV25.
     * 
     * @param STATEMENT
     */
    public void setSTATEMENT(cz.sysnet.ippc.ws.common.STATEMENTTYPE[] STATEMENT) {
        this.STATEMENT = STATEMENT;
    }


    /**
     * Gets the DOCUMENT value for this IPPCV25.
     * 
     * @return DOCUMENT
     */
    public cz.sysnet.ippc.ws.common.DOCUMENTTYPE[] getDOCUMENT() {
        return DOCUMENT;
    }


    /**
     * Sets the DOCUMENT value for this IPPCV25.
     * 
     * @param DOCUMENT
     */
    public void setDOCUMENT(cz.sysnet.ippc.ws.common.DOCUMENTTYPE[] DOCUMENT) {
        this.DOCUMENT = DOCUMENT;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IPPCV25)) return false;
        IPPCV25 other = (IPPCV25) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.CREATED_ON==null && other.getCREATED_ON()==null) || 
             (this.CREATED_ON!=null &&
              this.CREATED_ON.equals(other.getCREATED_ON()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              java.util.Arrays.equals(this.STATUS, other.getSTATUS()))) &&
            ((this.DOC_TYPE==null && other.getDOC_TYPE()==null) || 
             (this.DOC_TYPE!=null &&
              java.util.Arrays.equals(this.DOC_TYPE, other.getDOC_TYPE()))) &&
            ((this.REQUEST==null && other.getREQUEST()==null) || 
             (this.REQUEST!=null &&
              java.util.Arrays.equals(this.REQUEST, other.getREQUEST()))) &&
            ((this.PLANT==null && other.getPLANT()==null) || 
             (this.PLANT!=null &&
              java.util.Arrays.equals(this.PLANT, other.getPLANT()))) &&
            ((this.OFFICE==null && other.getOFFICE()==null) || 
             (this.OFFICE!=null &&
              java.util.Arrays.equals(this.OFFICE, other.getOFFICE()))) &&
            ((this.EXPERT==null && other.getEXPERT()==null) || 
             (this.EXPERT!=null &&
              java.util.Arrays.equals(this.EXPERT, other.getEXPERT()))) &&
            ((this.EXPERTCATEGORY==null && other.getEXPERTCATEGORY()==null) || 
             (this.EXPERTCATEGORY!=null &&
              java.util.Arrays.equals(this.EXPERTCATEGORY, other.getEXPERTCATEGORY()))) &&
            ((this.COMPANY==null && other.getCOMPANY()==null) || 
             (this.COMPANY!=null &&
              java.util.Arrays.equals(this.COMPANY, other.getCOMPANY()))) &&
            ((this.EQUIPMENTUNIT==null && other.getEQUIPMENTUNIT()==null) || 
             (this.EQUIPMENTUNIT!=null &&
              java.util.Arrays.equals(this.EQUIPMENTUNIT, other.getEQUIPMENTUNIT()))) &&
            ((this.RQRCHANGED==null && other.getRQRCHANGED()==null) || 
             (this.RQRCHANGED!=null &&
              java.util.Arrays.equals(this.RQRCHANGED, other.getRQRCHANGED()))) &&
            ((this.CATEGORY==null && other.getCATEGORY()==null) || 
             (this.CATEGORY!=null &&
              java.util.Arrays.equals(this.CATEGORY, other.getCATEGORY()))) &&
            ((this.STATEMENT==null && other.getSTATEMENT()==null) || 
             (this.STATEMENT!=null &&
              java.util.Arrays.equals(this.STATEMENT, other.getSTATEMENT()))) &&
            ((this.DOCUMENT==null && other.getDOCUMENT()==null) || 
             (this.DOCUMENT!=null &&
              java.util.Arrays.equals(this.DOCUMENT, other.getDOCUMENT())));
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
        if (getCREATED_ON() != null) {
            _hashCode += getCREATED_ON().hashCode();
        }
        if (getSTATUS() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTATUS());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTATUS(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDOC_TYPE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOC_TYPE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOC_TYPE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getREQUEST() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getREQUEST());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getREQUEST(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPLANT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPLANT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPLANT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOFFICE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOFFICE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOFFICE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEXPERT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEXPERT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEXPERT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEXPERTCATEGORY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEXPERTCATEGORY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEXPERTCATEGORY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCOMPANY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCOMPANY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCOMPANY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEQUIPMENTUNIT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEQUIPMENTUNIT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEQUIPMENTUNIT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRQRCHANGED() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRQRCHANGED());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRQRCHANGED(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCATEGORY() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCATEGORY());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCATEGORY(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSTATEMENT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSTATEMENT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSTATEMENT(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDOCUMENT() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDOCUMENT());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDOCUMENT(), i);
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
        new org.apache.axis.description.TypeDesc(IPPCV25.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "IPPCV25"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CREATED_ON");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CREATED_ON"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "ENUMERATION"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOC_TYPE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOC_TYPE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "ENUMERATION"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REQUEST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REQUEST"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PLANT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PLANT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "PLANTTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OFFICE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "OFFICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "OFFICETYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXPERT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EXPERT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EXPERTCATEGORY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EXPERTCATEGORY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTCATEGORYTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COMPANY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "COMPANY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "COMPANYTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENTUNIT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENTUNIT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "EQUIPMENTUNITTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RQRCHANGED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "RQRCHANGED"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTCHANGETYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CATEGORY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CATEGORY"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATEGORYTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATEMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STATEMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "STATEMENTTYPE"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DOCUMENT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DOCUMENT"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "DOCUMENTTYPE"));
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
