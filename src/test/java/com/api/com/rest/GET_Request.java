package com.api.com.rest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GET_Request {
@Test
	public  void getRequest() {

RestAssured.baseURI="https://reqres.in";

String asString = RestAssured.given()
    .queryParam("","")
    .header("Accept", "application/json").auth().preemptive().basic("", "")
    .when().get("/api/users/2")
    .then().log().all().extract().response().asString();
System.out.println(asString);
	}
}
