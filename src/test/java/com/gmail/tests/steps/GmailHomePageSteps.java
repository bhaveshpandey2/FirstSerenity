package com.gmail.tests.steps;

import com.gmail.tests.ui.GmailHomePage;

import net.thucydides.core.annotations.Step;

public class GmailHomePageSteps {
GmailHomePage gmailHomePage;
@Step
	public void enterGmailPage() {
		// TODO Auto-generated method stub
		gmailHomePage.verifyTitle("Inbox (19,470) - bhaveshpandey2@gmail.com - Gmail");
	}
@Step
public void enterUserName(String username) {
	gmailHomePage.sendUserId(username);
	
	// TODO Auto-generated method stub
	
}
@Step
public void enterPasswowd(String string) {
	// TODO Auto-generated method stub
	gmailHomePage.sendPassword(string);
}
	
}
