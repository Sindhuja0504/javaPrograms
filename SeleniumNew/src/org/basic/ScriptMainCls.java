package org.basic;

import org.openqa.selenium.By;

public class ScriptMainCls extends Script {

	public static void main(String[] args) {
		ScriptMainCls cls = new ScriptMainCls();
		cls.driverinit();
		cls.getUrl("https://www.wikipedia.org/");
		cls.handlePromptAlert(By.cssSelector("select#searchLanguage[id=\"searchLanguage\"]"), "ast");
		

	}

}
