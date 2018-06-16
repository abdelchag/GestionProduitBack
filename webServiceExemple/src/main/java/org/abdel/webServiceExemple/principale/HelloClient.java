package org.abdel.webServiceExemple.principale;


import org.abdel.webServiceExemple.client.HelloImplService;
import org.abdel.webServiceExemple.client.IHello;

public class HelloClient {
		
	public static void main(String[] args) {
		System.out.println(sayHello("HAmid"));
		System.out.println(sayBye("HAmid"));
	}
	
	public static String sayHello(String name){
		HelloImplService service = new HelloImplService();
		IHello port = service.getHelloImplPort();
		
		return port.sayHello(name);
	}
	
	public static String sayBye(String name){
		HelloImplService service = new HelloImplService();
		IHello port = service.getHelloImplPort();
		
		return port.sayBye(name);
	}

}
