package com.gmail.tests.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.gmail.tests.steps.GmailHomePageSteps;
import com.gmail.tests.steps.GooglePageSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class WhenLoginToGmail {
    @Managed(driver="chrome")                              
WebDriver driver;
	@Steps
	GooglePageSteps googlePageSteps;
	GmailHomePageSteps gmailPageSteps;
	@Test
	public void shouldBeAbleToLogin(){
		//Given
		googlePageSteps.onGooglePage();
		
		//when
		
		googlePageSteps.clickGmail();
		
		//and
		gmailPageSteps.enterUserName("bhaveshpandey2");
		
		//and
		
		gmailPageSteps.enterPasswowd("Ssb@nov44");
		
		gmailPageSteps.enterGmailPage();
		
	}
}
