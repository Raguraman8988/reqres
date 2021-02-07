package com.api.com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PUT_Request_Test {
	
	@Test
	public void put_Update() {
		RestAssured.baseURI = "https://reqres.in";
		
		String putUpdate = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "").body("{\r\n" + 
				"    \"name\": \"morpheus\",\r\n" + 
				"    \"job\": \"zion resident\"\r\n" + 
				"}")
		.when().put("/api/users/2")
		.then().log().all().extract().asString();
		
		System.out.println("");
		System.out.println("PUT Update");
		System.out.println("----------");
		System.out.println(putUpdate);
	}

}
