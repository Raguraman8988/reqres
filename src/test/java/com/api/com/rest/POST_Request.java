package com.api.com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POST_Request {
	@Test
public void postRequest() {
RestAssured.baseURI="https://reqres.in/";

String asString = RestAssured.given()
.queryParam("", "").header("Accept", "application/json").auth().preemptive().basic("", "").body("{\r\n" + 
		"    \"name\": \"morpheus\",\r\n" + 
		"    \"job\": \"leader\"\r\n" + 
		"}")
.when().post("/api/users")
.then().log().all().extract().response().asString();

System.out.println(asString);
}
}
