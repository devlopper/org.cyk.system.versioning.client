package org.cyk.system.versioning.client.controller.entities;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.client.controller.AbstractApplicationScopeLifeCycleListenerEntities;
import org.cyk.utility.system.node.SystemNodeClient;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListenerEntities implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		super.__initialize__(object);
		__inject__(SystemNodeClient.class).setName("versioning client");
	}
	
	@Override
	public void __destroy__(Object object) {}
	
	/**/
	
}
