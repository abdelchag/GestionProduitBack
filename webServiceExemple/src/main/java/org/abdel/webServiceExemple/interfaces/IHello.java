package org.abdel.webServiceExemple.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface IHello  {

	@WebMethod
	String sayHello(@WebParam(name = "nom") String name);
	
	@WebMethod
	String sayBye(@WebParam(name = "nom") String name);
	
}
