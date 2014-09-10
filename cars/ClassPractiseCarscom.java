package com.cars;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassPractiseCarscom {

	public static void main(String[] args) {
		FirefoxDriver tatapara =new 	FirefoxDriver();
		tatapara.get("http://www.cars.com/go/advice/financing/calc/loanCalc.jsp?mode=full");
		
		tatapara.findElementById("vpLoan").clear();
		tatapara.findElementById("vpLoan").sendKeys("5000");
		
		
		tatapara.findElementById("dpLoan").clear();
		tatapara.findElementById("dpLoan").sendKeys("200");
		
		
		tatapara.findElementById("tvLoan").clear();
		tatapara.findElementById("tvLoan").sendKeys("23");
	
		
		
		tatapara.findElementById("stPerLoan").clear();
		tatapara.findElementById("stPerLoan").sendKeys("3");
		
		
		tatapara.findElementById("termLoan").clear();
		tatapara.findElementById("termLoan").sendKeys("36");
		
		tatapara.findElementById("mpLoan").clear();
		tatapara.findElementById("mpLoan").sendKeys("100");
		
		
        //tatapara.findElementByXPath(".//*[@id='non_popup_container']/table/tbody/tr[4]/td/div[2]/div/span[1]/a").click();
		
		
       // tatapara.findElementByXPath(".//*[@id='tabAffordability']/a").click();
		
		
		tatapara.findElementById("Affordability_1").click();
		
		
		//tatapara.findElementByName("").click();
		

	}

}
