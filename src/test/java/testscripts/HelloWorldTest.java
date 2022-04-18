package testscripts;

import org.testng.annotations.Test;

import classes.HelloWorld;

public class HelloWorldTest {
	
	@Test
	public void test() {
		HelloWorld helloworld = new HelloWorld();
		String message  = helloworld.displayMessage();
		System.out.println("the message is --->"+message);
	}

}
