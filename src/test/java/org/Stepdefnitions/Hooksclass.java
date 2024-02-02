package org.Stepdefnitions;

import java.io.IOException;

import org.Uttility.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooksclass extends Baseclass {
	@After
	public static void Afterscenario(Scenario sc) throws IOException {
		//BrowersQuit();
		Screenshot(sc.getName());
		
		

	}
	@Before
	public static void Beforescenario() {
		
		Browerlauch("firefox");
		
	}

}
