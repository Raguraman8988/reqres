package org.request.com;

import org.testcore.com.REST_Request;
import org.testng.annotations.Test;

public class RequestTest extends REST_Request{
	
	@Test(enabled = true)
	public void getRequestTest() {
		getRequest("https://reqres.in", "page", 2, "Accept", "application/json", "", "", "/api/users?page=2");
	}
	
	@Test(enabled = true)
	public void postRequestTest() {
		String postRequestBody = "{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}";
		postRequest("https://reqres.in", "", 0, "Connection", "keep-alive", "", "", postRequestBody, "/api/users");
	}
	
	@Test(enabled = true)
	public void putRequestTest() {
		String putRequestBody="{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}";
		putRequest("https://reqres.in", "", 0, "", "", "", "", putRequestBody, "/api/users/2");
	}
	
	@Test(enabled = true)
	public void deleteRequestTest() {
		
		deleteRequest("https://reqres.in", "", 0, "Content-Type", "text/plain", "", "", "/api/users/2");
	}
}
