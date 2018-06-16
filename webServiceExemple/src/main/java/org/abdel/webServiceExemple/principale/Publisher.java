package org.abdel.webServiceExemple.principale;

import javax.xml.ws.Endpoint;

import org.abdel.webServiceExemple.impl.HelloImpl;

public class Publisher {

	private static final String HELLO_URL = "http://localhost:8081/hello";
	
	public static void main(String[] args) {
		Endpoint.publish(HELLO_URL, new HelloImpl());
		System.out.println("Service demarré : " + HELLO_URL);

	}

}
