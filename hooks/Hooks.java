package hooks;

import base.ProjectSpecificMethods;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends ProjectSpecificMethods {
	
	
	@Before
	public void OpentheApplication()
	{
		InvokeDriver();
	}
	
	@After
	public void CloseTheApplication()
	{
		CloseBrowser();
	}
	

}
