package stepDefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	@Before
	public void before_setup() {
		System.out.println("---->Entered before scenario step");
	}
	
	@After
	public void teardown_setup() {
		System.out.println("---->Entered teardown scenario step");
	}

}
