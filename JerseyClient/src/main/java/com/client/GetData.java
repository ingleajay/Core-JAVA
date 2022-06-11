package com.client;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.ClientConfig;

public class GetData {

	public static void main(String[] args) {
		
		String uri1 = "http://localhost:8888/JerseyBackend/rest/json";
		String uri2 = "http://localhost:8888/JerseyBackend/rest/html";
		String uri3 = "http://localhost:8888/JerseyBackend/rest/string";

		
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config);
        WebTarget target1 = client.target(uri1);
        WebTarget target2 = client.target(uri2);
        WebTarget target3 = client.target(uri3);
        
        String response1 = target1.request().accept(MediaType.APPLICATION_JSON).get(String.class);
        String response2 = target2.request().accept(MediaType.TEXT_HTML).get(String.class);
        String response3 = target3.request().accept(MediaType.TEXT_PLAIN).get(String.class);

        System.out.println(response1);
        System.out.println(response2);
        System.out.println(response3);

	}
}
