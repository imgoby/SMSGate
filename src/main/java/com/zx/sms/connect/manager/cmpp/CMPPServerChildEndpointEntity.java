package com.zx.sms.connect.manager.cmpp;

import java.util.List;

import com.zx.sms.connect.manager.EndpointConnector;
import com.zx.sms.connect.manager.EndpointEntity;
import com.zx.sms.connect.manager.ServerEndpoint;


public class CMPPServerChildEndpointEntity extends CMPPEndpointEntity implements ServerEndpoint{

	@Override
	public CMPPServerChildEndpointConnector buildConnector() {
		
		return new CMPPServerChildEndpointConnector(this);
	}

	@Override
	public void addchild(EndpointEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removechild(EndpointEntity entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EndpointEntity getChild(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EndpointEntity> getAllChild() {
		// TODO Auto-generated method stub
		return null;
	}


}
