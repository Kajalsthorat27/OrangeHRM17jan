package PageLayer;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass{

	public String homepage() {
		driver.getCurrentUrl();
	return driver.getTitle();
	}
	
}
