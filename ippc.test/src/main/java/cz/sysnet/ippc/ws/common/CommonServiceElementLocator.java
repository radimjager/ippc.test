/**
 * CommonServiceElementLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public class CommonServiceElementLocator extends org.apache.axis.client.Service implements cz.sysnet.ippc.ws.common.CommonServiceElement {

    public CommonServiceElementLocator() {
    }


    public CommonServiceElementLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommonServiceElementLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for JISZP
    private java.lang.String JISZP_address = "http://www.sysnet.cz:80/clients/env/ippc/ippcws.nsf/wsCommon?OpenWebService";

    public java.lang.String getJISZPAddress() {
        return JISZP_address;
    }
    

    // The WSDD service name defaults to the port name.
    private java.lang.String JISZPWSDDServiceName = "JISZP";

    public java.lang.String getJISZPWSDDServiceName() {
        return JISZPWSDDServiceName;
    }

    public void setJISZPWSDDServiceName(java.lang.String name) {
        JISZPWSDDServiceName = name;
    }

    public cz.sysnet.ippc.ws.common.CommonService getJISZP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(JISZP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getJISZP(endpoint);
    }

    public cz.sysnet.ippc.ws.common.CommonService getJISZP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cz.sysnet.ippc.ws.common.JISZPSoapBindingStub _stub = new cz.sysnet.ippc.ws.common.JISZPSoapBindingStub(portAddress, this);
            _stub.setPortName(getJISZPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setJISZPEndpointAddress(java.lang.String address) {
        JISZP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cz.sysnet.ippc.ws.common.CommonService.class.isAssignableFrom(serviceEndpointInterface)) {
                cz.sysnet.ippc.ws.common.JISZPSoapBindingStub _stub = new cz.sysnet.ippc.ws.common.JISZPSoapBindingStub(new java.net.URL(JISZP_address), this);
                _stub.setPortName(getJISZPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("JISZP".equals(inputPortName)) {
            return getJISZP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:DefaultNamespace", "commonServiceElement");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:DefaultNamespace", "JISZP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("JISZP".equals(portName)) {
            setJISZPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
