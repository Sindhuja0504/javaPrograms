package org.lang;

public class LanguageInfo extends StateDetails {
	
	private void tamilLanguage() {
		System.out.println("tamil lang");
	}
	  protected void englishLanguage() {
		  System.out.println("english lang");
	  }
	  
	 public void hindiLanguage() {
		 System.out.println("hindi lang");
	 }
	 public static void main(String[] args) {
		
	
	 LanguageInfo langinfo = new LanguageInfo();
	 langinfo.tamilLanguage();
	 langinfo.englishLanguage();
	 langinfo.hindiLanguage();
	 langinfo.southIndia();
	 langinfo.southIndia();
	 }
}
