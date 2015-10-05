package ippc.test;

import static org.junit.Assert.*;

import java.net.MalformedURLException;
import java.rmi.RemoteException;
import org.apache.axis.AxisFault;
import org.junit.Test;
import cz.sysnet.ippc.ws.common.CommonServiceElementLocator;
import cz.sysnet.ippc.ws.common.IDENTIFIEROUT;
import cz.sysnet.ippc.ws.common.JISZPSoapBindingStub;

public class whoAmI {

	@Test
	public void test() {
		//fail("Not yet implemented");
		JISZPSoapBindingStub stub;
		try {
			
			CommonServiceElementLocator loc = new CommonServiceElementLocator();
			
			stub = new JISZPSoapBindingStub(new java.net.URL(loc.getJISZPAddress()), loc);
			IDENTIFIEROUT out = stub.WHOAMI();
			System.out.println(out.getIDENTIFIER().getVALUE());
			String checkedValue = out.getIDENTIFIER().getVALUE();
			assertTrue(checkedValue.equals("PZPRJFRD3C5D"));
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
