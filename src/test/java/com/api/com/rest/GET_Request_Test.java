package com.api.com.rest;

import javax.annotation.meta.When;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GET_Request_Test {
	@Test(enabled = true)
	public void get_ListUsers() {
		RestAssured.baseURI="https://reqres.in/api";
		
		String getListUsers = RestAssured.given().queryParam("page", "2").header("Content-Type","text/plain").auth().preemptive().basic("", "")
		.when().get("/users?page=2")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("GET List Users");
		System.out.println("--------------");
		System.out.println(getListUsers);
	}
	
	@Test(enabled = true)
	public void get_SingleUser() {
		RestAssured.baseURI="https://reqres.in";
		
		String getSingleUser = RestAssured.given().queryParam("", "").header("Accept","application/json").auth().preemptive().basic("", "")
		.when().get("/api/users/2")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("GET Single User");
		System.out.println("---------------");
		System.out.println(getSingleUser);
	}
	
	@Test (enabled = true)
	public void get_UserNotFound() {
		RestAssured.baseURI="https://reqres.in";
		
		String getUserNotFound = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
		.when().get("/api/users?page=2")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("GET User Not Found");
		System.out.println("------------------");
		System.out.println(getUserNotFound);
	}
	
	
	@Test(enabled = true)
	public void get_ListResource() {
		RestAssured.baseURI=("https://reqres.in");
		
		String getListResource = RestAssured.given().header("","").queryParam("", "").auth().preemptive().basic("", "")
		.when().get("/api/unknown")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("GET List <Resource>");
		System.out.println("-------------------");
		System.out.println(getListResource);
	}
	
	@Test(enabled = true)
	public void get_SingleResource() {
		RestAssured.baseURI="https://reqres.in";
		
		String getSingleResource = RestAssured.given().header("","").queryParam("", "").auth().preemptive().basic("", "")
		.when().get("/api/unknown/2")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("GET List <Single>");
		System.out.println("-----------------");
		System.out.println(getSingleResource);
	}
	
	@Test(enabled = true)
	public void get_SingleResource_NotFound() {
		RestAssured.baseURI="https://reqres.in";
		
		String getSingleResourceNotFound = RestAssured.given().header("","").auth().preemptive().basic("", "").queryParam("", "")
		.when().get("/api/unknown/23")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("GET SingleResource NotFound");
		System.out.println("---------------------------");
		System.out.println(getSingleResourceNotFound);		
	}
	
	@Test(enabled = true)
	public void get_Delayed_Response() {
		RestAssured.baseURI="https://reqres.in";
		
		String getDelayedResponse = RestAssured.given().queryParam("", "").header("","").auth().preemptive().basic("", "")
		.when().get("/api/users?delay=3")
		.then().log().all().extract().asString();
		System.out.println("");
		System.out.println("GET Delayed Response");
		System.out.println("--------------------");
		System.out.println(getDelayedResponse);
	}
}
	
