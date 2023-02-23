package com.sanil.ApiAssignment;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class FindProduct {
	
	String storyId;
	
	@BeforeMethod
	public void setup()
	{
		
		baseURI= "http://localhost:3030";
	}

	@Test(priority = 0)
	public void verifyProductIdFromResponse()
	{
		given()
		.when().get("/products")
		.then().assertThat().statusCode(200).log().all()
		.and().body("data[0].name", equalTo("Duracell - AAA Batteries (4-Pack)"));
		
		Response response = given()
				.when().get("/products");
		storyId = response.getBody().jsonPath().getString("data[0].id"); 
		System.out.println(storyId);
	}
	
	@Test(priority = 1)
	public void verifyDetailsOfProduct()
	{
		given().pathParam("id", storyId)
		.when().get("/products/{id}")
		.then().assertThat().statusCode(200).log().all()
		.and().body("id", equalTo(storyId));

	}
	@Ignore
	@Test(priority = 2)
	public void verifyIfProductIsDeleted()
	{
		given().pathParam("id", storyId)
		.when().delete("/products/{id}")
		.then().assertThat().statusCode(200).log().all()
		.and().log().all();
	}
}
