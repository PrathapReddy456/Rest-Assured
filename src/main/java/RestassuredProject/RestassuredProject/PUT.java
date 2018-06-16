package RestassuredProject.RestassuredProject;

import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.junit.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PUT {

	@BeforeClass
	public static void init() {
		RestAssured.baseURI ="http://localhost:8080";
		RestAssured.port = 8080;
	}


	@Test

	public  void post1(){

		ArrayList<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("C++");
		
		RequestSpecification Res =RestAssured.given();

		Res.header("Content-Type", "application/json");

		JSONObject json = new JSONObject();
		json.put("id", "101");
		json.put("firstName", "Jeevan");
		json.put("lastName", "Reddy");
		json.put("email", "prathap456@gmail.com");
		json.put("programme", "Computer Science");
		json.put("courses", courses);
		


		Res.body(json.toJSONString());

		// Response response = Res.post("http://localhost:8080/student");

		Response response = Res.post("/student");
		
		int code = response.getStatusCode();
		
		System.out.println(code+"\n"+response.getHeaders()+"\n"+response.getBody().asString());
		
		Assert.assertEquals(code, 201);
	}
}
