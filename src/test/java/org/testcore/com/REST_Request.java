package org.testcore.com;

import io.restassured.RestAssured;

public class REST_Request {

	public static String getRequest(String baserURI, String parameterName, int parameterValues, String headerName,
			String headerValue, String username, String password, String url) {
		RestAssured.baseURI = baserURI;

		String getResponse = RestAssured.given().queryParam(parameterName, parameterValues)
				.header(headerName, headerValue).auth().preemptive().basic(username, password).when().get(url).then()
				.log().all().extract().asString();

		System.out.println("");
		System.out.println("Response --> " + getResponse);
		
		return getResponse;
	}

	public static String postRequest(String baseURI, String parameterName, int parameterValues, String headerName,
			String headerValue, String username, String password, String postRequestBody, String url) {
		RestAssured.baseURI = baseURI;

		String postResponse = RestAssured.given().queryParam(parameterName, parameterValues)
				.header(headerName, headerValue).auth().preemptive().basic(username, password).body(postRequestBody)
				.when().post(url).then().log().all().extract().asString();

		System.out.println("");
		System.out.println("Response --> " + postResponse);
		
		return postResponse;
	}

	public static String putRequest(String baseURI, String parameterName, int parameterValues, String headerName,
			String headerValue, String username, String password, String putRequestBody, String url) {
		RestAssured.baseURI = baseURI;

		String putResponse = RestAssured.given().queryParam(parameterName, parameterValues)
				.header(headerName, headerValue).auth().preemptive().basic(username, password).body(putRequestBody)
				.when().put(url).then().log().all().extract().asString();

		System.out.println("");
		System.out.println("Response --> " + putResponse);
		
		return putResponse;
	}

	public static String deleteRequest(String baseURI, String parameterName, int parameterValues, String headerName,
			String headerValue, String username, String password, String url) {
		RestAssured.baseURI = baseURI;

		String deleteResponse = RestAssured.given().queryParam(parameterName, parameterValues)
				.header(headerName, headerValue).auth().preemptive().basic(username, password).delete(url).then().log()
				.all().extract().asString();

		System.out.println("");
		System.out.println("Response --> " + deleteResponse);
		
		return deleteResponse;
	}
}
