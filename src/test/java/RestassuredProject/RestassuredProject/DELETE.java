package RestassuredProject.RestassuredProject;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DELETE {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI ="http://localhost:8080";
		RestAssured.port = 8080;
	}


	@Test

	public  void post1(){

		
		
		RequestSpecification Res =RestAssured.given();

		Res.header("Content-Type", "application/json");

		// Response response = Res.post("http://localhost:8080/student");

		Response response = Res.delete("/student/101");
		
		int code = response.getStatusCode();
		
		// System.out.println(code+"\n"+response.getHeaders()+"\n"+response.getBody().asString());
		
		Assert.assertEquals(code, 200);
	}
}
