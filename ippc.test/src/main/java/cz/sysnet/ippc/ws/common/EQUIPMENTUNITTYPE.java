/**
 * EQUIPMENTUNITTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class EQUIPMENTUNITTYPE  implements java.io.Serializable {
    private java.lang.String PID;

    private java.lang.String PID_REQUEST;

    private java.lang.String PID_OFFICE;

    private java.lang.String PID_PLANT;

    private java.lang.String PID_COMPANY;

    private java.lang.String EQUIPMENT_CATEGORY;

    private java.lang.String EQUIPMENT_TITLE;

    private java.lang.String EQUIPMENT_AMOUNT;

    private java.util.Calendar DATE_CREATED;

    private java.util.Calendar DATE_MODIFIED;

    public EQUIPMENTUNITTYPE() {
    }

    public EQUIPMENTUNITTYPE(
           java.lang.String PID,
           java.lang.String PID_REQUEST,
           java.lang.String PID_OFFICE,
           java.lang.String PID_PLANT,
           java.lang.String PID_COMPANY,
           java.lang.String EQUIPMENT_CATEGORY,
           java.lang.String EQUIPMENT_TITLE,
           java.lang.String EQUIPMENT_AMOUNT,
           java.util.Calendar DATE_CREATED,
           java.util.Calendar DATE_MODIFIED) {
           this.PID = PID;
           this.PID_REQUEST = PID_REQUEST;
           this.PID_OFFICE = PID_OFFICE;
           this.PID_PLANT = PID_PLANT;
           this.PID_COMPANY = PID_COMPANY;
           this.EQUIPMENT_CATEGORY = EQUIPMENT_CATEGORY;
           this.EQUIPMENT_TITLE = EQUIPMENT_TITLE;
           this.EQUIPMENT_AMOUNT = EQUIPMENT_AMOUNT;
           this.DATE_CREATED = DATE_CREATED;
           this.DATE_MODIFIED = DATE_MODIFIED;
    }


    /**
     * Gets the PID value for this EQUIPMENTUNITTYPE.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this EQUIPMENTUNITTYPE.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the PID_REQUEST value for this EQUIPMENTUNITTYPE.
     * 
     * @return PID_REQUEST
     */
    public java.lang.String getPID_REQUEST() {
        return PID_REQUEST;
    }


    /**
     * Sets the PID_REQUEST value for this EQUIPMENTUNITTYPE.
     * 
     * @param PID_REQUEST
     */
    public void setPID_REQUEST(java.lang.String PID_REQUEST) {
        this.PID_REQUEST = PID_REQUEST;
    }


    /**
     * Gets the PID_OFFICE value for this EQUIPMENTUNITTYPE.
     * 
     * @return PID_OFFICE
     */
    public java.lang.String getPID_OFFICE() {
        return PID_OFFICE;
    }


    /**
     * Sets the PID_OFFICE value for this EQUIPMENTUNITTYPE.
     * 
     * @param PID_OFFICE
     */
    public void setPID_OFFICE(java.lang.String PID_OFFICE) {
        this.PID_OFFICE = PID_OFFICE;
    }


    /**
     * Gets the PID_PLANT value for this EQUIPMENTUNITTYPE.
     * 
     * @return PID_PLANT
     */
    public java.lang.String getPID_PLANT() {
        return PID_PLANT;
    }


    /**
     * Sets the PID_PLANT value for this EQUIPMENTUNITTYPE.
     * 
     * @param PID_PLANT
     */
    public void setPID_PLANT(java.lang.String PID_PLANT) {
        this.PID_PLANT = PID_PLANT;
    }


    /**
     * Gets the PID_COMPANY value for this EQUIPMENTUNITTYPE.
     * 
     * @return PID_COMPANY
     */
    public java.lang.String getPID_COMPANY() {
        return PID_COMPANY;
    }


    /**
     * Sets the PID_COMPANY value for this EQUIPMENTUNITTYPE.
     * 
     * @param PID_COMPANY
     */
    public void setPID_COMPANY(java.lang.String PID_COMPANY) {
        this.PID_COMPANY = PID_COMPANY;
    }


    /**
     * Gets the EQUIPMENT_CATEGORY value for this EQUIPMENTUNITTYPE.
     * 
     * @return EQUIPMENT_CATEGORY
     */
    public java.lang.String getEQUIPMENT_CATEGORY() {
        return EQUIPMENT_CATEGORY;
    }


    /**
     * Sets the EQUIPMENT_CATEGORY value for this EQUIPMENTUNITTYPE.
     * 
     * @param EQUIPMENT_CATEGORY
     */
    public void setEQUIPMENT_CATEGORY(java.lang.String EQUIPMENT_CATEGORY) {
        this.EQUIPMENT_CATEGORY = EQUIPMENT_CATEGORY;
    }


    /**
     * Gets the EQUIPMENT_TITLE value for this EQUIPMENTUNITTYPE.
     * 
     * @return EQUIPMENT_TITLE
     */
    public java.lang.String getEQUIPMENT_TITLE() {
        return EQUIPMENT_TITLE;
    }


    /**
     * Sets the EQUIPMENT_TITLE value for this EQUIPMENTUNITTYPE.
     * 
     * @param EQUIPMENT_TITLE
     */
    public void setEQUIPMENT_TITLE(java.lang.String EQUIPMENT_TITLE) {
        this.EQUIPMENT_TITLE = EQUIPMENT_TITLE;
    }


    /**
     * Gets the EQUIPMENT_AMOUNT value for this EQUIPMENTUNITTYPE.
     * 
     * @return EQUIPMENT_AMOUNT
     */
    public java.lang.String getEQUIPMENT_AMOUNT() {
        return EQUIPMENT_AMOUNT;
    }


    /**
     * Sets the EQUIPMENT_AMOUNT value for this EQUIPMENTUNITTYPE.
     * 
     * @param EQUIPMENT_AMOUNT
     */
    public void setEQUIPMENT_AMOUNT(java.lang.String EQUIPMENT_AMOUNT) {
        this.EQUIPMENT_AMOUNT = EQUIPMENT_AMOUNT;
    }


    /**
     * Gets the DATE_CREATED value for this EQUIPMENTUNITTYPE.
     * 
     * @return DATE_CREATED
     */
    public java.util.Calendar getDATE_CREATED() {
        return DATE_CREATED;
    }


    /**
     * Sets the DATE_CREATED value for this EQUIPMENTUNITTYPE.
     * 
     * @param DATE_CREATED
     */
    public void setDATE_CREATED(java.util.Calendar DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }


    /**
     * Gets the DATE_MODIFIED value for this EQUIPMENTUNITTYPE.
     * 
     * @return DATE_MODIFIED
     */
    public java.util.Calendar getDATE_MODIFIED() {
        return DATE_MODIFIED;
    }


    /**
     * Sets the DATE_MODIFIED value for this EQUIPMENTUNITTYPE.
     * 
     * @param DATE_MODIFIED
     */
    public void setDATE_MODIFIED(java.util.Calendar DATE_MODIFIED) {
        this.DATE_MODIFIED = DATE_MODIFIED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EQUIPMENTUNITTYPE)) return false;
        EQUIPMENTUNITTYPE other = (EQUIPMENTUNITTYPE) obj;
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
            ((this.PID_REQUEST==null && other.getPID_REQUEST()==null) || 
             (this.PID_REQUEST!=null &&
              this.PID_REQUEST.equals(other.getPID_REQUEST()))) &&
            ((this.PID_OFFICE==null && other.getPID_OFFICE()==null) || 
             (this.PID_OFFICE!=null &&
              this.PID_OFFICE.equals(other.getPID_OFFICE()))) &&
            ((this.PID_PLANT==null && other.getPID_PLANT()==null) || 
             (this.PID_PLANT!=null &&
              this.PID_PLANT.equals(other.getPID_PLANT()))) &&
            ((this.PID_COMPANY==null && other.getPID_COMPANY()==null) || 
             (this.PID_COMPANY!=null &&
              this.PID_COMPANY.equals(other.getPID_COMPANY()))) &&
            ((this.EQUIPMENT_CATEGORY==null && other.getEQUIPMENT_CATEGORY()==null) || 
             (this.EQUIPMENT_CATEGORY!=null &&
              this.EQUIPMENT_CATEGORY.equals(other.getEQUIPMENT_CATEGORY()))) &&
            ((this.EQUIPMENT_TITLE==null && other.getEQUIPMENT_TITLE()==null) || 
             (this.EQUIPMENT_TITLE!=null &&
              this.EQUIPMENT_TITLE.equals(other.getEQUIPMENT_TITLE()))) &&
            ((this.EQUIPMENT_AMOUNT==null && other.getEQUIPMENT_AMOUNT()==null) || 
             (this.EQUIPMENT_AMOUNT!=null &&
              this.EQUIPMENT_AMOUNT.equals(other.getEQUIPMENT_AMOUNT()))) &&
            ((this.DATE_CREATED==null && other.getDATE_CREATED()==null) || 
             (this.DATE_CREATED!=null &&
              this.DATE_CREATED.equals(other.getDATE_CREATED()))) &&
            ((this.DATE_MODIFIED==null && other.getDATE_MODIFIED()==null) || 
             (this.DATE_MODIFIED!=null &&
              this.DATE_MODIFIED.equals(other.getDATE_MODIFIED())));
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
        if (getPID_REQUEST() != null) {
            _hashCode += getPID_REQUEST().hashCode();
        }
        if (getPID_OFFICE() != null) {
            _hashCode += getPID_OFFICE().hashCode();
        }
        if (getPID_PLANT() != null) {
            _hashCode += getPID_PLANT().hashCode();
        }
        if (getPID_COMPANY() != null) {
            _hashCode += getPID_COMPANY().hashCode();
        }
        if (getEQUIPMENT_CATEGORY() != null) {
            _hashCode += getEQUIPMENT_CATEGORY().hashCode();
        }
        if (getEQUIPMENT_TITLE() != null) {
            _hashCode += getEQUIPMENT_TITLE().hashCode();
        }
        if (getEQUIPMENT_AMOUNT() != null) {
            _hashCode += getEQUIPMENT_AMOUNT().hashCode();
        }
        if (getDATE_CREATED() != null) {
            _hashCode += getDATE_CREATED().hashCode();
        }
        if (getDATE_MODIFIED() != null) {
            _hashCode += getDATE_MODIFIED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EQUIPMENTUNITTYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "EQUIPMENTUNITTYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_REQUEST");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_REQUEST"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_OFFICE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_OFFICE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_PLANT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_PLANT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID_COMPANY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_COMPANY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_CATEGORY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENT_CATEGORY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_TITLE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENT_TITLE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EQUIPMENT_AMOUNT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EQUIPMENT_AMOUNT"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_CREATED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_CREATED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_MODIFIED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_MODIFIED"));
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
