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

public class HelloAdresseHandler implements SOAPHandler<SOAPMessageContext> {

	public void close(MessageContext arg0) {
		System.out.println("Close handling Adresse !!");
	}

	public boolean handleFault(SOAPMessageContext arg0) {
		System.out.println("handleFault handling Adresse !!");
		return true;
	}

	public boolean handleMessage(SOAPMessageContext context) {
		System.out.println("Start handling Adresse !!");
		Boolean isRequest = (Boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);

		if (!isRequest) {

			try {
				SOAPMessage soapMsg = context.getMessage();
				SOAPEnvelope soapEnv = soapMsg.getSOAPPart().getEnvelope();
				SOAPHeader soapHeader = soapEnv.getHeader();

				// if no header, add one
				if (soapHeader == null) {
					soapHeader = soapEnv.addHeader();
					// throw exception
					generateSOAPErrMessage(soapMsg, "No SOAP header.");
				}

//				// Get client mac address from SOAP header
//				Iterator it = soapHeader.extractHeaderElements(SOAPConstants.URI_SOAP_ACTOR_NEXT);
//
//				// if no header block for next actor found? throw exception
//				if (it == null || !it.hasNext()) {
//					generateSOAPErrMessage(soapMsg, "No header block for next actor.");
//				}

//				// if no mac address found? throw exception
//				Node macNode = (Node) it.next();
//				String macValue = (macNode == null) ? null : macNode.getValue();
//
//				if (macValue == null) {
//					generateSOAPErrMessage(soapMsg, "No mac address in header block.");
//				}
//
//				// if mac address is not match, throw exception
//				if (!macValue.equals("90-4C-E5-44-B9-8F")) {
//					generateSOAPErrMessage(soapMsg, "Invalid mac address, access is denied.");
//				}

				// tracking
				soapMsg.writeTo(System.out);

			} catch (SOAPException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}

		}
		System.out.println("End handling Adresse !!");
		// continue other handler chain
		return true;
	}
	
	 private void generateSOAPErrMessage(SOAPMessage msg, String reason) {
	       try {
	          SOAPBody soapBody = msg.getSOAPPart().getEnvelope().getBody();
	          SOAPFault soapFault = soapBody.addFault();
	          soapFault.setFaultString(reason);
	          throw new SOAPFaultException(soapFault);
	       }
	       catch(SOAPException e) { }
	    }

	public Set<QName> getHeaders() {
		System.out.println("getHeaders handling Adresse !!");
		return null;
	}

}
