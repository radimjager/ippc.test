package cz.sysnet.ippc.ws.common;

public class CommonServiceProxy implements cz.sysnet.ippc.ws.common.CommonService {
  private String _endpoint = null;
  private cz.sysnet.ippc.ws.common.CommonService commonService = null;
  
  public CommonServiceProxy() {
    _initCommonServiceProxy();
  }
  
  public CommonServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initCommonServiceProxy();
  }
  
  private void _initCommonServiceProxy() {
    try {
      commonService = (new cz.sysnet.ippc.ws.common.CommonServiceElementLocator()).getJISZP();
      if (commonService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)commonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)commonService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (commonService != null)
      ((javax.xml.rpc.Stub)commonService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cz.sysnet.ippc.ws.common.CommonService getCommonService() {
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService;
  }
  
  public cz.sysnet.ippc.ws.common.SERVICEARRAY GETALLSERVICES() throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETALLSERVICES();
  }
  
  public cz.sysnet.ippc.ws.common.SERVICEARRAY GETALLSERVICESBYCATEGORY(javax.xml.rpc.holders.StringHolder CATEGORY) throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETALLSERVICESBYCATEGORY(CATEGORY);
  }
  
  public cz.sysnet.ippc.ws.common.SERVICEARRAY GETSERVICEBYID(javax.xml.rpc.holders.StringHolder ID) throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETSERVICEBYID(ID);
  }
  
  public cz.sysnet.ippc.ws.common.CATGOUT GETCATALOGUE() throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETCATALOGUE();
  }
  
  public cz.sysnet.ippc.ws.common.CATGOUT GETCATALOGUECHANGES(java.util.Calendar STAMP) throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETCATALOGUECHANGES(STAMP);
  }
  
  public cz.sysnet.ippc.ws.common.SECONDARYRESOURCEOUT GETSECONDARYRESOURCE(javax.xml.rpc.holders.StringHolder PID) throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETSECONDARYRESOURCE(PID);
  }
  
  public cz.sysnet.ippc.ws.common.PRIMARYRESOURCEOUT GETPRIMARYRESOURCE(javax.xml.rpc.holders.StringHolder STORAGE, javax.xml.rpc.holders.StringHolder ID) throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETPRIMARYRESOURCE(STORAGE, ID);
  }
  
  public cz.sysnet.ippc.ws.common.IDENTIFIEROUT WHOAMI() throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.WHOAMI();
  }
  
  public cz.sysnet.ippc.ws.common.ENTITYNAMES GETALLENTITYNAMES() throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETALLENTITYNAMES();
  }
  
  public cz.sysnet.ippc.ws.common.IPPCV25 GETCHANGEDENTITIES(java.util.Calendar DATE_FROM) throws java.rmi.RemoteException{
    if (commonService == null)
      _initCommonServiceProxy();
    return commonService.GETCHANGEDENTITIES(DATE_FROM);
  }
  
  
}