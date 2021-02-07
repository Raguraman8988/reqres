package com.api.com.rest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class JSON_Path {
	
	public Object object;
	
	@Test (enabled = true)
	public void tc01_JSON_Path_Validation() {
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/api/users/2");
		String response_Data = response.toString();
		JsonPath jPath = new JsonPath(response_Data);
		
		object = jPath.get("data.id");
		Assert.assertNotNull(object);
		System.out.println("Data --> "+object);
	}
	
	@Test(enabled = true)
	public void tc02_JSON_Path_Validation() {
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("/api/users/2");
		String response_Data = response.toString();
		JsonPath jPath = new JsonPath(response_Data);
		
		object = jPath.get("data.first_name");
		Assert.assertEquals(object, "Janet");
		System.out.println("First Name --> "+object);
	}
	
	@Test(enabled = true)
	public void tc03_JSON_Path_Validation() throws FileNotFoundException{
		/*
		 * RestAssured.baseURI = "https://reqres.in/";
		 * 
		 * RequestSpecification request = RestAssured.given();
		 * 
		 * Response response = request.get("/api/users/2"); String response_Data =
		 * response.toString();
		 */
		
		File file = new File(".\\src\\test\\java\\com\\api\\responsedata\\SingleUser.json");
		FileReader reader = new FileReader(file);
		
		JsonPath jPath = new JsonPath(reader);
		object = jPath.get("data.first_name");
		System.out.println("First Name --> "+object);
		
	}
}
