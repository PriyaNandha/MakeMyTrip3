package org.lang;

public class StateDetails {
	
	//extends LanguageInfo{

	public void southIndia() {

		System.out.println("SouthIndia");

	}
	public void northIndia() {

		System.out.println("NorthIndia");

	}
public static void main(String[] args) {
	LanguageInfo lang = new LanguageInfo();
	lang.tamilLanuage();
	lang.englishLanuage();
	lang.hindiLanuage();
	
	
	StateDetails state =new StateDetails();
	state.southIndia();
	state.northIndia();
	
	
}

}
