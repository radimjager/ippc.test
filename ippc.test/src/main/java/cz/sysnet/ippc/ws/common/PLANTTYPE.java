/**
 * PLANTTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class PLANTTYPE  implements java.io.Serializable {
    private java.lang.String PID;

    private java.lang.String PID_COMPANY;

    private java.lang.String PID_REQUEST;

    private java.lang.String PID_OFFICE;

    private java.lang.String STREETADDRESS;

    private java.lang.String CITY;

    private java.lang.String ZIP;

    private java.lang.String REGION;

    private java.util.Calendar DATE_CREATED;

    private java.util.Calendar DATE_MODIFIED;

    public PLANTTYPE() {
    }

    public PLANTTYPE(
           java.lang.String PID,
           java.lang.String PID_COMPANY,
           java.lang.String PID_REQUEST,
           java.lang.String PID_OFFICE,
           java.lang.String STREETADDRESS,
           java.lang.String CITY,
           java.lang.String ZIP,
           java.lang.String REGION,
           java.util.Calendar DATE_CREATED,
           java.util.Calendar DATE_MODIFIED) {
           this.PID = PID;
           this.PID_COMPANY = PID_COMPANY;
           this.PID_REQUEST = PID_REQUEST;
           this.PID_OFFICE = PID_OFFICE;
           this.STREETADDRESS = STREETADDRESS;
           this.CITY = CITY;
           this.ZIP = ZIP;
           this.REGION = REGION;
           this.DATE_CREATED = DATE_CREATED;
           this.DATE_MODIFIED = DATE_MODIFIED;
    }


    /**
     * Gets the PID value for this PLANTTYPE.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this PLANTTYPE.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the PID_COMPANY value for this PLANTTYPE.
     * 
     * @return PID_COMPANY
     */
    public java.lang.String getPID_COMPANY() {
        return PID_COMPANY;
    }


    /**
     * Sets the PID_COMPANY value for this PLANTTYPE.
     * 
     * @param PID_COMPANY
     */
    public void setPID_COMPANY(java.lang.String PID_COMPANY) {
        this.PID_COMPANY = PID_COMPANY;
    }


    /**
     * Gets the PID_REQUEST value for this PLANTTYPE.
     * 
     * @return PID_REQUEST
     */
    public java.lang.String getPID_REQUEST() {
        return PID_REQUEST;
    }


    /**
     * Sets the PID_REQUEST value for this PLANTTYPE.
     * 
     * @param PID_REQUEST
     */
    public void setPID_REQUEST(java.lang.String PID_REQUEST) {
        this.PID_REQUEST = PID_REQUEST;
    }


    /**
     * Gets the PID_OFFICE value for this PLANTTYPE.
     * 
     * @return PID_OFFICE
     */
    public java.lang.String getPID_OFFICE() {
        return PID_OFFICE;
    }


    /**
     * Sets the PID_OFFICE value for this PLANTTYPE.
     * 
     * @param PID_OFFICE
     */
    public void setPID_OFFICE(java.lang.String PID_OFFICE) {
        this.PID_OFFICE = PID_OFFICE;
    }


    /**
     * Gets the STREETADDRESS value for this PLANTTYPE.
     * 
     * @return STREETADDRESS
     */
    public java.lang.String getSTREETADDRESS() {
        return STREETADDRESS;
    }


    /**
     * Sets the STREETADDRESS value for this PLANTTYPE.
     * 
     * @param STREETADDRESS
     */
    public void setSTREETADDRESS(java.lang.String STREETADDRESS) {
        this.STREETADDRESS = STREETADDRESS;
    }


    /**
     * Gets the CITY value for this PLANTTYPE.
     * 
     * @return CITY
     */
    public java.lang.String getCITY() {
        return CITY;
    }


    /**
     * Sets the CITY value for this PLANTTYPE.
     * 
     * @param CITY
     */
    public void setCITY(java.lang.String CITY) {
        this.CITY = CITY;
    }


    /**
     * Gets the ZIP value for this PLANTTYPE.
     * 
     * @return ZIP
     */
    public java.lang.String getZIP() {
        return ZIP;
    }


    /**
     * Sets the ZIP value for this PLANTTYPE.
     * 
     * @param ZIP
     */
    public void setZIP(java.lang.String ZIP) {
        this.ZIP = ZIP;
    }


    /**
     * Gets the REGION value for this PLANTTYPE.
     * 
     * @return REGION
     */
    public java.lang.String getREGION() {
        return REGION;
    }


    /**
     * Sets the REGION value for this PLANTTYPE.
     * 
     * @param REGION
     */
    public void setREGION(java.lang.String REGION) {
        this.REGION = REGION;
    }


    /**
     * Gets the DATE_CREATED value for this PLANTTYPE.
     * 
     * @return DATE_CREATED
     */
    public java.util.Calendar getDATE_CREATED() {
        return DATE_CREATED;
    }


    /**
     * Sets the DATE_CREATED value for this PLANTTYPE.
     * 
     * @param DATE_CREATED
     */
    public void setDATE_CREATED(java.util.Calendar DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }


    /**
     * Gets the DATE_MODIFIED value for this PLANTTYPE.
     * 
     * @return DATE_MODIFIED
     */
    public java.util.Calendar getDATE_MODIFIED() {
        return DATE_MODIFIED;
    }


    /**
     * Sets the DATE_MODIFIED value for this PLANTTYPE.
     * 
     * @param DATE_MODIFIED
     */
    public void setDATE_MODIFIED(java.util.Calendar DATE_MODIFIED) {
        this.DATE_MODIFIED = DATE_MODIFIED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PLANTTYPE)) return false;
        PLANTTYPE other = (PLANTTYPE) obj;
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
            ((this.PID_COMPANY==null && other.getPID_COMPANY()==null) || 
             (this.PID_COMPANY!=null &&
              this.PID_COMPANY.equals(other.getPID_COMPANY()))) &&
            ((this.PID_REQUEST==null && other.getPID_REQUEST()==null) || 
             (this.PID_REQUEST!=null &&
              this.PID_REQUEST.equals(other.getPID_REQUEST()))) &&
            ((this.PID_OFFICE==null && other.getPID_OFFICE()==null) || 
             (this.PID_OFFICE!=null &&
              this.PID_OFFICE.equals(other.getPID_OFFICE()))) &&
            ((this.STREETADDRESS==null && other.getSTREETADDRESS()==null) || 
             (this.STREETADDRESS!=null &&
              this.STREETADDRESS.equals(other.getSTREETADDRESS()))) &&
            ((this.CITY==null && other.getCITY()==null) || 
             (this.CITY!=null &&
              this.CITY.equals(other.getCITY()))) &&
            ((this.ZIP==null && other.getZIP()==null) || 
             (this.ZIP!=null &&
              this.ZIP.equals(other.getZIP()))) &&
            ((this.REGION==null && other.getREGION()==null) || 
             (this.REGION!=null &&
              this.REGION.equals(other.getREGION()))) &&
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
        if (getPID_COMPANY() != null) {
            _hashCode += getPID_COMPANY().hashCode();
        }
        if (getPID_REQUEST() != null) {
            _hashCode += getPID_REQUEST().hashCode();
        }
        if (getPID_OFFICE() != null) {
            _hashCode += getPID_OFFICE().hashCode();
        }
        if (getSTREETADDRESS() != null) {
            _hashCode += getSTREETADDRESS().hashCode();
        }
        if (getCITY() != null) {
            _hashCode += getCITY().hashCode();
        }
        if (getZIP() != null) {
            _hashCode += getZIP().hashCode();
        }
        if (getREGION() != null) {
            _hashCode += getREGION().hashCode();
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
        new org.apache.axis.description.TypeDesc(PLANTTYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "PLANTTYPE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID"));
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
        elemField.setFieldName("STREETADDRESS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STREETADDRESS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CITY");
        elemField.setXmlName(new javax.xml.namespace.QName("", "CITY"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZIP");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ZIP"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("REGION");
        elemField.setXmlName(new javax.xml.namespace.QName("", "REGION"));
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
