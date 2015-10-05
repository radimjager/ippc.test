/**
 * JISZPSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class JISZPSoapBindingStub extends org.apache.axis.client.Stub implements cz.sysnet.ippc.ws.common.CommonService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[10];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETALLSERVICES");
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICEARRAY"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.SERVICEARRAY.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETALLSERVICESReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETALLSERVICESBYCATEGORY");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CATEGORY"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICEARRAY"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.SERVICEARRAY.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETALLSERVICESBYCATEGORYReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETSERVICEBYID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ID"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICEARRAY"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.SERVICEARRAY.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETSERVICEBYIDReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETCATALOGUE");
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGOUT"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.CATGOUT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETCATALOGUEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETCATALOGUECHANGES");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "STAMP"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGOUT"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.CATGOUT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETCATALOGUECHANGESReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETSECONDARYRESOURCE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PID"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "SECONDARYRESOURCEOUT"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETSECONDARYRESOURCEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETPRIMARYRESOURCE");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "STORAGE"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ID"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "PRIMARYRESOURCEOUT"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETPRIMARYRESOURCEReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WHOAMI");
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "IDENTIFIEROUT"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.IDENTIFIEROUT.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "WHOAMIReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETALLENTITYNAMES");
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "ENTITYNAMES"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.ENTITYNAMES.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETALLENTITYNAMESReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GETCHANGEDENTITIES");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DATE_FROM"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("urn:DefaultNamespace", "IPPCV25"));
        oper.setReturnClass(cz.sysnet.ippc.ws.common.IPPCV25.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "GETCHANGEDENTITIESReturn"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    public JISZPSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public JISZPSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public JISZPSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfCATEGORYTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATEGORYTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATEGORYTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfCATGITEM");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATGITEM[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGITEM");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfCOMPANYTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.COMPANYTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "COMPANYTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfDOCUMENTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.DOCUMENTTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "DOCUMENTTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfENTITYITEM");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.ENTITYITEM[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ENTITYITEM");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfENUMERATION");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.ENUMERATION[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ENUMERATION");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfEQUIPMENTUNITTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.EQUIPMENTUNITTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "EQUIPMENTUNITTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfEXPERTCATEGORYTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.EXPERTCATEGORYTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTCATEGORYTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfEXPERTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.EXPERTTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfIDENTIFIER");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.IDENTIFIER[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "IDENTIFIER");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfOFFICETYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.OFFICETYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "OFFICETYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfPLANTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.PLANTTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "PLANTTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfREQUESTCHANGETYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.REQUESTCHANGETYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTCHANGETYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfREQUESTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.REQUESTTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfSERVICETYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.SERVICETYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICETYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ArrayOfSTATEMENTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.STATEMENTTYPE[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "STATEMENTTYPE");
            qName2 = null;
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATALOGUE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATALOGUE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATEGORYTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATEGORYTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGITEM");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATGITEM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGITEMDATE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATGITEMDATE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGOUT");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATGOUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "CATGTIMESTAMP");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.CATGTIMESTAMP.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "COMPANYTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.COMPANYTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "DOCUMENTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.DOCUMENTTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ENTITYITEM");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.ENTITYITEM.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ENTITYNAMES");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.ENTITYNAMES.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "ENUMERATION");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.ENUMERATION.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "EQUIPMENTUNITTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.EQUIPMENTUNITTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTCATEGORYTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.EXPERTCATEGORYTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "EXPERTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.EXPERTTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "IDENTIFIER");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.IDENTIFIER.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "IDENTIFIEROUT");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.IDENTIFIEROUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "IPPCV25");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.IPPCV25.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "OFFICETYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.OFFICETYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "PLANTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.PLANTTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "PRIMARYRESOURCE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.PRIMARYRESOURCE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "PRIMARYRESOURCEOUT");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTCHANGETYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.REQUESTCHANGETYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "REQUESTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.REQUESTTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "SECONDARYRESOURCE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.SECONDARYRESOURCE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "SECONDARYRESOURCEOUT");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICEARRAY");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.SERVICEARRAY.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "SERVICETYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.SERVICETYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("urn:DefaultNamespace", "STATEMENTTYPE");
            cachedSerQNames.add(qName);
            cls = cz.sysnet.ippc.ws.common.STATEMENTTYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public cz.sysnet.ippc.ws.common.SERVICEARRAY GETALLSERVICES() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETALLSERVICES");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETALLSERVICES"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cz.sysnet.ippc.ws.common.SERVICEARRAY) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.SERVICEARRAY) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.SERVICEARRAY.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.SERVICEARRAY GETALLSERVICESBYCATEGORY(javax.xml.rpc.holders.StringHolder CATEGORY) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETALLSERVICESBYCATEGORY");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETALLSERVICESBYCATEGORY"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {CATEGORY.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                CATEGORY.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "CATEGORY"));
            } catch (java.lang.Exception _exception) {
                CATEGORY.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CATEGORY")), java.lang.String.class);
            }
            try {
                return (cz.sysnet.ippc.ws.common.SERVICEARRAY) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.SERVICEARRAY) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.SERVICEARRAY.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.SERVICEARRAY GETSERVICEBYID(javax.xml.rpc.holders.StringHolder ID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETSERVICEBYID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETSERVICEBYID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {ID.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                ID.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ID"));
            } catch (java.lang.Exception _exception) {
                ID.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ID")), java.lang.String.class);
            }
            try {
                return (cz.sysnet.ippc.ws.common.SERVICEARRAY) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.SERVICEARRAY) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.SERVICEARRAY.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.CATGOUT GETCATALOGUE() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETCATALOGUE");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETCATALOGUE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cz.sysnet.ippc.ws.common.CATGOUT) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.CATGOUT) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.CATGOUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.CATGOUT GETCATALOGUECHANGES(java.util.Calendar STAMP) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETCATALOGUECHANGES");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETCATALOGUECHANGES"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {STAMP});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cz.sysnet.ippc.ws.common.CATGOUT) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.CATGOUT) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.CATGOUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT GETSECONDARYRESOURCE(javax.xml.rpc.holders.StringHolder PID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETSECONDARYRESOURCE");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETSECONDARYRESOURCE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {PID.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                PID.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "PID"));
            } catch (java.lang.Exception _exception) {
                PID.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PID")), java.lang.String.class);
            }
            try {
                return (cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT GETPRIMARYRESOURCE(javax.xml.rpc.holders.StringHolder STORAGE, javax.xml.rpc.holders.StringHolder ID) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETPRIMARYRESOURCE");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETPRIMARYRESOURCE"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {STORAGE.value, ID.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                STORAGE.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "STORAGE"));
            } catch (java.lang.Exception _exception) {
                STORAGE.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "STORAGE")), java.lang.String.class);
            }
            try {
                ID.value = (java.lang.String) _output.get(new javax.xml.namespace.QName("", "ID"));
            } catch (java.lang.Exception _exception) {
                ID.value = (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ID")), java.lang.String.class);
            }
            try {
                return (cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.IDENTIFIEROUT WHOAMI() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("WHOAMI");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "WHOAMI"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cz.sysnet.ippc.ws.common.IDENTIFIEROUT) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.IDENTIFIEROUT) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.IDENTIFIEROUT.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.ENTITYNAMES GETALLENTITYNAMES() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETALLENTITYNAMES");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETALLENTITYNAMES"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cz.sysnet.ippc.ws.common.ENTITYNAMES) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.ENTITYNAMES) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.ENTITYNAMES.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public cz.sysnet.ippc.ws.common.IPPCV25 GETCHANGEDENTITIES(java.util.Calendar DATE_FROM) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("GETCHANGEDENTITIES");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:DefaultNamespace", "GETCHANGEDENTITIES"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {DATE_FROM});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (cz.sysnet.ippc.ws.common.IPPCV25) _resp;
            } catch (java.lang.Exception _exception) {
                return (cz.sysnet.ippc.ws.common.IPPCV25) org.apache.axis.utils.JavaUtils.convert(_resp, cz.sysnet.ippc.ws.common.IPPCV25.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
