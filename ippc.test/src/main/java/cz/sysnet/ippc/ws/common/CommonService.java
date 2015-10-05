/**
 * CommonService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cz.sysnet.ippc.ws.common;

public interface CommonService extends java.rmi.Remote {
    public cz.sysnet.ippc.ws.common.SERVICEARRAY GETALLSERVICES() throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.SERVICEARRAY GETALLSERVICESBYCATEGORY(javax.xml.rpc.holders.StringHolder CATEGORY) throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.SERVICEARRAY GETSERVICEBYID(javax.xml.rpc.holders.StringHolder ID) throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.CATGOUT GETCATALOGUE() throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.CATGOUT GETCATALOGUECHANGES(java.util.Calendar STAMP) throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT GETSECONDARYRESOURCE(javax.xml.rpc.holders.StringHolder PID) throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT GETPRIMARYRESOURCE(javax.xml.rpc.holders.StringHolder STORAGE, javax.xml.rpc.holders.StringHolder ID) throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.IDENTIFIEROUT WHOAMI() throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.ENTITYNAMES GETALLENTITYNAMES() throws java.rmi.RemoteException;
    public cz.sysnet.ippc.ws.common.IPPCV25 GETCHANGEDENTITIES(java.util.Calendar DATE_FROM) throws java.rmi.RemoteException;
}
