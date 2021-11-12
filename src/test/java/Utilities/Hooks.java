package Utilities;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void beforeScenario() {
		System.out.println("This will run before the Scenario");
	}

	
	@After
	public void afterScenario() {
		System.out.println("This will run after the Scenario");
	}
	
	public static void main(String[] args) {
		System.out.println("New added line");
		
		
		
		
		System.out.println("Second push");
	}
	
	
}
