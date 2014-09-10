package com.cars;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Affordability {

	public static void main(String[] args) {
	
		
		FirefoxDriver Afordability =new FirefoxDriver();
		
		Afordability.get("http://www.cars.com/go/advice/financing/calc/loanCalc.jsp?mode=full");
		
		
		
		
		Afordability.findElementByXPath(".//*[@id='tabLoan']/a").click();
		
		Afordability.findElementById("vpLoan").sendKeys("10000");
		
		Afordability.findElementById("dpLoan").sendKeys("5000");
		
		Afordability.findElementById("tvLoan").sendKeys("800");
		
		
		Afordability.findElementById("stPerLoan").sendKeys("4");
		
		
		
		Afordability.findElementByXPath(".//*[@id='tabAffordability']/a").click();
		
		
		Afordability.findElementByXPath(".//*[@id='tabIncentives']/a").click();
		Afordability.findElementByXPath(".//*[@id='tabLoanLease']/a").click();
		
		Afordability.findElementByXPath(".//*[@id='tabLoan']/a").click();
		
		
	}

}
