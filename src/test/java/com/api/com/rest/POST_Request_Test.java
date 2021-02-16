package com.api.com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class POST_Request_Test {
	/*
	 * Demo Push Test
	 */
	@Test(enabled = true)
	public void post_POSTRequest_Create() {
		RestAssured.baseURI = "https://reqres.in";
		
		String getPOSTRequestTest = RestAssured.given().header("Accept","application/json").queryParam("", "").auth().preemptive().basic("", "")
		.body("{\r\n" + 
				"    \"name\": \"Ragu\",\r\n" + 
				"    \"job\": \"leader\"\r\n" + 
				"}")
		.when().post("/api/users")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("POST Request Test");
		System.out.println("-----------------");
		System.out.println(getPOSTRequestTest);
		// First Method
	}
	
	@Test(enabled = true)
	public void post_Register_Successful() {
		RestAssured.baseURI="https://reqres.in";
		
		String getRegisterSuccessful = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
		.body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"pistol\"\r\n" + 
				"}")
		.when().post("/api/register")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("POST Register Successful");
		System.out.println("------------------------");
		System.out.println(getRegisterSuccessful);
	}
	
	@Test(enabled = true)
	public void post_Register_Unsuccessful() {
		RestAssured.baseURI = "https://reqres.in";
		
		String getRegisterUnsuccessful = RestAssured.given().queryParam("", "").header("Content-Type","text/plain").auth().preemptive().basic("", "")
		.body("{\r\n" + 
				"    \"email\": \"sydney@fife\"\r\n" + 
				"}")
		.when().post("/api/register")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("POST Register Unsuccessful");
		System.out.println("--------------------------");
		System.out.println(getRegisterUnsuccessful);
	}
	
	@Test(enabled = true)
	public void post_Login_Successful() {
		RestAssured.baseURI="https://reqres.in";
		
		String getLoginuccessful = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
		.body("{\r\n" + 
				"    \"email\": \"eve.holt@reqres.in\",\r\n" + 
				"    \"password\": \"cityslicka\"\r\n" + 
				"}")
		.when().post("/api/login")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("POST Login Successful");
		System.out.println("---------------------");
		System.out.println(getLoginuccessful);
	}
	
	@Test(enabled = true)
	public void post_Login_Unsuccessful() {
		RestAssured.baseURI = "https://reqres.in";
		
		String getLoginUnsuccessful = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
		.body("{\r\n" + 
				"    \"email\": \"peter@klaven\"\r\n" + 
				"}")
		.when().post("{\r\n" + 
				"    \"email\": \"peter@klaven\"\r\n" + 
				"}")
		.then().log().all().extract().asString();
		
		System.out.println("");
		System.out.println("POST Login Unsuccessful");
		System.out.println("-----------------------");
		System.out.println(getLoginUnsuccessful);
	}
}
