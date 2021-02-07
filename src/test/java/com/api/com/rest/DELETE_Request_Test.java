package com.api.com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DELETE_Request_Test {
	
	@Test
	private void delete_Record() {
		RestAssured.baseURI = "https://reqres.in";
		
		String deleteRequest = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
		.delete("/api/users/2")
		.then().log().all().extract().asString();
		
		System.out.println("");
		System.out.println("Delete Request");
		System.out.println("--------------");
		System.out.println(deleteRequest);
	}

}
