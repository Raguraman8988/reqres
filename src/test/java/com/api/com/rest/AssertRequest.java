package com.api.com.rest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ValidatableResponse;

public class AssertRequest {

	@Test
	public void get_AssertRequest1() {
		RestAssured.baseURI="https://reqres.in";
		
		String getAssertRequest1 = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
		.when().get("/api/unknown/2")
		.then().log().all().extract().asString();
		
		
		  ValidatableResponse statusCode = RestAssured.given()
		  .when().get("/api/unknown/2") .then().assertThat().statusCode(200);
		
		/*
		 * RestAssured.given().queryParam("",
		 * "").header("","").auth().preemptive().basic("", "")
		 * .when().get("/api/unknown/2") .then().log().all().extract().
		 */
				
		
//		Assert.assertEquals(getAssertRequest1, "200");
	}
	
	@Test
	public void getAssertRequest2() {
		String getAssertRequest2 = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
				.when().get("/api/unknown/2")
				.then().log().all().extract().asString();
		
		JsonPath jp = new JsonPath(getAssertRequest2);
		Object obj = jp.get("x.data.pantone_value");
		Assert.assertEquals(obj, "17-2031");
	}
	
	@Test
	public void getAssertRequest3() {
		String getAssertRequest3 = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
				.when().get("/api/unknown/2")
				.then().log().all().extract().asString();
		
	//	JsonPath jp = new JsonPath(getAssertRequest2);
	}
}
