package org.abdel.webServiceExemple.impl;

import javax.jws.HandlerChain;
import javax.jws.WebService;

import org.abdel.webServiceExemple.interfaces.IHello;

@WebService(endpointInterface="org.abdel.webServiceExemple.interfaces.IHello")
@HandlerChain(file="handler-chain.xml")
public class HelloImpl implements IHello {

	public String sayHello(String name) {
		return "Hello " + name;
	}

	public String sayBye(String name) {
		return "Bye " + name;
	}

}
