package com.structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {

	private String empName;  
    private RealInternetAccess  realAccess;
    
    public ProxyInternetAccess(String empName) {  
        this.empName = empName;  
    }

	@Override
	public void grantInternetAccess() {
		 if (getRole(empName) > 4)   
         {  
             realAccess = new RealInternetAccess(empName);  
             realAccess.grantInternetAccess();  
         }   
         else   
         {  
             System.out.println("No Internet access granted. Your job level is below 5");  
         }  
	}

	private int getRole(String empName2) {
		return 9;
	}
    
}
