package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;


public class Getdata {

		
		@Test
		
		public void TestResponseCode() {
			
			Response rep=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
			
			int code = rep.getStatusCode();
			
			System.out.println("Status of Code " +code);
			
		
			
		Assert.assertEquals(code, 200);
		}
		
@Test
		
		public void Test() {
			
			Response resp=get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
			
			String data = resp.asString();
			
			System.out.println("Data is" +data);
			
		System.out.println("Responde time " +resp.getTime());
			
		
		}
	}


