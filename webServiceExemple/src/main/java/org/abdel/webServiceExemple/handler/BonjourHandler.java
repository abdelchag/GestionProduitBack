package org.abdel.webServiceExemple.handler;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

public class BonjourHandler implements SOAPHandler<SOAPMessageContext> {

	public void close(MessageContext arg0) {
		System.out.println("Close handling Bonjour !!");
	}

	public boolean handleFault(SOAPMessageContext arg0) {
		System.out.println("handleFault handling Bonjour !!");
		return true;
	}

	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("Start handling Bonjour !!");
		
		System.out.println("End handling Bonjour !!");
		// continue other handler chain
		return true;
	}
	

	public Set<QName> getHeaders() {
		System.out.println("getHeaders handling Bonjour !!");
		return null;
	}

}
