/**
 * REQUESTTYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class REQUESTTYPE  implements java.io.Serializable {
    private java.lang.String PID;

    private java.lang.String PID_COMPANY;

    private java.lang.String PID_PLANT;

    private java.lang.String PID_OFFICE;

    private java.lang.String PID_CHANGED;

    private java.lang.String STATUS;

    private java.lang.String URL;

    private java.util.Calendar DATE_INITIATED;

    private java.util.Calendar DATE_CREATED;

    private java.util.Calendar DATE_MODIFIED;

    private java.util.Calendar DATE_DECIDED;

    private java.util.Calendar DATE_LEGALIZED;

    public REQUESTTYPE() {
    }

    public REQUESTTYPE(
           java.lang.String PID,
           java.lang.String PID_COMPANY,
           java.lang.String PID_PLANT,
           java.lang.String PID_OFFICE,
           java.lang.String PID_CHANGED,
           java.lang.String STATUS,
           java.lang.String URL,
           java.util.Calendar DATE_INITIATED,
           java.util.Calendar DATE_CREATED,
           java.util.Calendar DATE_MODIFIED,
           java.util.Calendar DATE_DECIDED,
           java.util.Calendar DATE_LEGALIZED) {
           this.PID = PID;
           this.PID_COMPANY = PID_COMPANY;
           this.PID_PLANT = PID_PLANT;
           this.PID_OFFICE = PID_OFFICE;
           this.PID_CHANGED = PID_CHANGED;
           this.STATUS = STATUS;
           this.URL = URL;
           this.DATE_INITIATED = DATE_INITIATED;
           this.DATE_CREATED = DATE_CREATED;
           this.DATE_MODIFIED = DATE_MODIFIED;
           this.DATE_DECIDED = DATE_DECIDED;
           this.DATE_LEGALIZED = DATE_LEGALIZED;
    }


    /**
     * Gets the PID value for this REQUESTTYPE.
     * 
     * @return PID
     */
    public java.lang.String getPID() {
        return PID;
    }


    /**
     * Sets the PID value for this REQUESTTYPE.
     * 
     * @param PID
     */
    public void setPID(java.lang.String PID) {
        this.PID = PID;
    }


    /**
     * Gets the PID_COMPANY value for this REQUESTTYPE.
     * 
     * @return PID_COMPANY
     */
    public java.lang.String getPID_COMPANY() {
        return PID_COMPANY;
    }


    /**
     * Sets the PID_COMPANY value for this REQUESTTYPE.
     * 
     * @param PID_COMPANY
     */
    public void setPID_COMPANY(java.lang.String PID_COMPANY) {
        this.PID_COMPANY = PID_COMPANY;
    }


    /**
     * Gets the PID_PLANT value for this REQUESTTYPE.
     * 
     * @return PID_PLANT
     */
    public java.lang.String getPID_PLANT() {
        return PID_PLANT;
    }


    /**
     * Sets the PID_PLANT value for this REQUESTTYPE.
     * 
     * @param PID_PLANT
     */
    public void setPID_PLANT(java.lang.String PID_PLANT) {
        this.PID_PLANT = PID_PLANT;
    }


    /**
     * Gets the PID_OFFICE value for this REQUESTTYPE.
     * 
     * @return PID_OFFICE
     */
    public java.lang.String getPID_OFFICE() {
        return PID_OFFICE;
    }


    /**
     * Sets the PID_OFFICE value for this REQUESTTYPE.
     * 
     * @param PID_OFFICE
     */
    public void setPID_OFFICE(java.lang.String PID_OFFICE) {
        this.PID_OFFICE = PID_OFFICE;
    }


    /**
     * Gets the PID_CHANGED value for this REQUESTTYPE.
     * 
     * @return PID_CHANGED
     */
    public java.lang.String getPID_CHANGED() {
        return PID_CHANGED;
    }


    /**
     * Sets the PID_CHANGED value for this REQUESTTYPE.
     * 
     * @param PID_CHANGED
     */
    public void setPID_CHANGED(java.lang.String PID_CHANGED) {
        this.PID_CHANGED = PID_CHANGED;
    }


    /**
     * Gets the STATUS value for this REQUESTTYPE.
     * 
     * @return STATUS
     */
    public java.lang.String getSTATUS() {
        return STATUS;
    }


    /**
     * Sets the STATUS value for this REQUESTTYPE.
     * 
     * @param STATUS
     */
    public void setSTATUS(java.lang.String STATUS) {
        this.STATUS = STATUS;
    }


    /**
     * Gets the URL value for this REQUESTTYPE.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this REQUESTTYPE.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }


    /**
     * Gets the DATE_INITIATED value for this REQUESTTYPE.
     * 
     * @return DATE_INITIATED
     */
    public java.util.Calendar getDATE_INITIATED() {
        return DATE_INITIATED;
    }


    /**
     * Sets the DATE_INITIATED value for this REQUESTTYPE.
     * 
     * @param DATE_INITIATED
     */
    public void setDATE_INITIATED(java.util.Calendar DATE_INITIATED) {
        this.DATE_INITIATED = DATE_INITIATED;
    }


    /**
     * Gets the DATE_CREATED value for this REQUESTTYPE.
     * 
     * @return DATE_CREATED
     */
    public java.util.Calendar getDATE_CREATED() {
        return DATE_CREATED;
    }


    /**
     * Sets the DATE_CREATED value for this REQUESTTYPE.
     * 
     * @param DATE_CREATED
     */
    public void setDATE_CREATED(java.util.Calendar DATE_CREATED) {
        this.DATE_CREATED = DATE_CREATED;
    }


    /**
     * Gets the DATE_MODIFIED value for this REQUESTTYPE.
     * 
     * @return DATE_MODIFIED
     */
    public java.util.Calendar getDATE_MODIFIED() {
        return DATE_MODIFIED;
    }


    /**
     * Sets the DATE_MODIFIED value for this REQUESTTYPE.
     * 
     * @param DATE_MODIFIED
     */
    public void setDATE_MODIFIED(java.util.Calendar DATE_MODIFIED) {
        this.DATE_MODIFIED = DATE_MODIFIED;
    }


    /**
     * Gets the DATE_DECIDED value for this REQUESTTYPE.
     * 
     * @return DATE_DECIDED
     */
    public java.util.Calendar getDATE_DECIDED() {
        return DATE_DECIDED;
    }


    /**
     * Sets the DATE_DECIDED value for this REQUESTTYPE.
     * 
     * @param DATE_DECIDED
     */
    public void setDATE_DECIDED(java.util.Calendar DATE_DECIDED) {
        this.DATE_DECIDED = DATE_DECIDED;
    }


    /**
     * Gets the DATE_LEGALIZED value for this REQUESTTYPE.
     * 
     * @return DATE_LEGALIZED
     */
    public java.util.Calendar getDATE_LEGALIZED() {
        return DATE_LEGALIZED;
    }


    /**
     * Sets the DATE_LEGALIZED value for this REQUESTTYPE.
     * 
     * @param DATE_LEGALIZED
     */
    public void setDATE_LEGALIZED(java.util.Calendar DATE_LEGALIZED) {
        this.DATE_LEGALIZED = DATE_LEGALIZED;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof REQUESTTYPE)) return false;
        REQUESTTYPE other = (REQUESTTYPE) obj;
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
            ((this.PID_PLANT==null && other.getPID_PLANT()==null) || 
             (this.PID_PLANT!=null &&
              this.PID_PLANT.equals(other.getPID_PLANT()))) &&
            ((this.PID_OFFICE==null && other.getPID_OFFICE()==null) || 
             (this.PID_OFFICE!=null &&
              this.PID_OFFICE.equals(other.getPID_OFFICE()))) &&
            ((this.PID_CHANGED==null && other.getPID_CHANGED()==null) || 
             (this.PID_CHANGED!=null &&
              this.PID_CHANGED.equals(other.getPID_CHANGED()))) &&
            ((this.STATUS==null && other.getSTATUS()==null) || 
             (this.STATUS!=null &&
              this.STATUS.equals(other.getSTATUS()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
            ((this.DATE_INITIATED==null && other.getDATE_INITIATED()==null) || 
             (this.DATE_INITIATED!=null &&
              this.DATE_INITIATED.equals(other.getDATE_INITIATED()))) &&
            ((this.DATE_CREATED==null && other.getDATE_CREATED()==null) || 
             (this.DATE_CREATED!=null &&
              this.DATE_CREATED.equals(other.getDATE_CREATED()))) &&
            ((this.DATE_MODIFIED==null && other.getDATE_MODIFIED()==null) || 
             (this.DATE_MODIFIED!=null &&
              this.DATE_MODIFIED.equals(other.getDATE_MODIFIED()))) &&
            ((this.DATE_DECIDED==null && other.getDATE_DECIDED()==null) || 
             (this.DATE_DECIDED!=null &&
              this.DATE_DECIDED.equals(other.getDATE_DECIDED()))) &&
            ((this.DATE_LEGALIZED==null && other.getDATE_LEGALIZED()==null) || 
             (this.DATE_LEGALIZED!=null &&
              this.DATE_LEGALIZED.equals(other.getDATE_LEGALIZED())));
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
        if (getPID_PLANT() != null) {
            _hashCode += getPID_PLANT().hashCode();
        }
        if (getPID_OFFICE() != null) {
            _hashCode += getPID_OFFICE().hashCode();
        }
        if (getPID_CHANGED() != null) {
            _hashCode += getPID_CHANGED().hashCode();
        }
        if (getSTATUS() != null) {
            _hashCode += getSTATUS().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        if (getDATE_INITIATED() != null) {
            _hashCode += getDATE_INITIATED().hashCode();
        }
        if (getDATE_CREATED() != null) {
            _hashCode += getDATE_CREATED().hashCode();
        }
        if (getDATE_MODIFIED() != null) {
            _hashCode += getDATE_MODIFIED().hashCode();
        }
        if (getDATE_DECIDED() != null) {
            _hashCode += getDATE_DECIDED().hashCode();
        }
        if (getDATE_LEGALIZED() != null) {
            _hashCode += getDATE_LEGALIZED().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(REQUESTTYPE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTTYPE"));
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
        elemField.setFieldName("PID_PLANT");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_PLANT"));
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
        elemField.setFieldName("PID_CHANGED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PID_CHANGED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STATUS");
        elemField.setXmlName(new javax.xml.namespace.QName("", "STATUS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_INITIATED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_INITIATED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_DECIDED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_DECIDED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DATE_LEGALIZED");
        elemField.setXmlName(new javax.xml.namespace.QName("", "DATE_LEGALIZED"));
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
