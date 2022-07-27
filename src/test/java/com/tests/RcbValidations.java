package com.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.classes.ValidationHelper;

/**
 * 
 * @author Revanth Kumar
 * 
 * This class will have the test cases which
 * consumes the data from other classes and 
 * validate them acc to the test cases
 *
 */
public class RcbValidations {
	
	ValidationHelper validationHelper;
	
	
	public RcbValidations() {
		validationHelper = new ValidationHelper("./JsonFiles/RCB_Team.json");
	}
	
	@Test(description = "Validate the No. of foreign players are equal to 4")
	public void validateForeignPlayers() {
		int count = validationHelper.getForeignPlayersCount();
		Assert.assertEquals(count, 4, (count>4)?"Foreign Players are greater than 4 members":"Foreign Players are less than 4 members");
	}
	
	@Test(description = "Validate the team has at least one wicket keeper")
	public void validateWicketKeepers() {
		int count = validationHelper.getWicketKeeperCount();
		Assert.assertTrue(count>=1,"There are no wicket keepers in the team");
	}
	
	

}
