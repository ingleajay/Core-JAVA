package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DiffMapAndFlatMap {

	public static void main(String[] args) {
		
		List<String> p1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");  
		List<String> p2 = Arrays.asList("Scanner", "Projector", "Light Pen");  
		List<String> p3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");  
		List<String> p4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
		List<List<String>> allproducts = new ArrayList<List<String>>();  
		allproducts.add(p1);  
		allproducts.add(p2);  
		allproducts.add(p3);  
		allproducts.add(p4);  
		List<String> listOfAllProducts = new ArrayList<String>();  
		
		// without flatmap
		for(List<String> pro : allproducts)   
		{  
		  for(String product : pro)   
		    {  
		      listOfAllProducts.add(product);  
		    }  
		} 
		System.out.println("List Before Applying mapping and Flattening: \n" + listOfAllProducts); 
		
		// use flatmap
		
		List<String> flatMapList = allproducts.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());   
		System.out.println("List After Applying Mapping and Flattening Operation: \n");   
		System.out.println(flatMapList);   
	}

}
