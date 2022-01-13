package com.structural.proxy;

public class ProxyPatternClient {

	public static void main(String[] args) {
		OfficeInternetAccess access = new ProxyInternetAccess("Ajay Ingle");  
        access.grantInternetAccess();  
	}
}
