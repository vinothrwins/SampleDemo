package crossbrowsertesting;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterDemo extends HandlingBrowser{
			
			
			// Parameterized all Input Values
			// The inpput values are updated by Vinoth R
			
			String regForm = "Registration Form";
			String regFormDemo = "Register For Demo";
			String firstNameValue = "Brown";
			String lastNameValue = "Jacob";
			String streetAddressInput = "Jessica Ave";
			String apartmentInput = "1020";
			String cityNameValue = "Bella Hill";
			String stateNameValue = "VA";
			String postalCodeValue= "21453";
			String countryDrpDnValue = "United States of America";
			String emailInput= "Var_102@gmail.com";
			String dateOfDemoValue = "09/30/2020";
			String hourInput = "05";
			String minuteInput = "25";
			String ampmInput = "PM";
			String mobileNumberValue = "9198762134";
			String enterYourQueryValue = "When is Selenium Frame work ends?";
			String twoDigitValue = "33";
			String twoDigitNewValue = "50";
			String successfulMessageText = "Your query successfully submitted. Please check your mail box. Click on Home page to know more about latest updates.";

			// Parameterized all The WebElement Path
			String qaAutomationXpath = "//span[@class='text-wrap'][contains(text(),'QA Automation')]";
			String practiceAutomationXpath = "//span[@class='text-wrap'][contains(text(),'Practice Automation')]";
			String regTitleTextXpath = "//h3[contains(text(),'Register For Demo')]";
			String firstNameIdPath = "vfb-5";
			String lastNameIdPath = "vfb-7";
			String maleRdoBtnIdPath = "vfb-8-1";
			String stAddressNamePath = "vfb-13[address]";
			String apartmentIdPath = "vfb-13-address-2";
			String cityIdPath = "vfb-13-city";
			String stateIdPath = "vfb-13-state";
			String postalCodeIdPath = "vfb-13-zip";
			String countryDrpDnIdPath = "vfb-13-country";
			String emailCssSelectorPath = "#vfb-14";
			String dateOfDemoCssSelectorPath = "#vfb-18";
			String hourIdPath= "vfb-16-hour";
			String minuteIdPath = "vfb-16-min";
			String amPmIdPath = "vfb-16-ampm";
			String mobileNoXpath = "//input[@id='vfb-19']";
			String functionalTestingIdPath = "vfb-20-4";
			String seleniumWebDriverIdPath = "vfb-20-0";
			String enterYourQueryIdPath = "vfb-23";
			String enterTwoDigitsIdPath = "vfb-3";
			String submitBtnIdPath = "vfb-4";
			String successfulMsgTextXpath = "//div[contains(text(),'Your query successfully submitted. Please check yo')]";
	

			 
	  
	  @Test(priority=1)
	  public void navigateToRegisterDemo() {
		  	// Click on Selenium Online Training
			WebElement qaAutomation = driver.findElement(By.xpath(qaAutomationXpath));

			// Create an Instance in Action Class by Passing WebDriver Instance
			Actions actBuilder = new Actions(driver);

			// Move the Mouse above the QA Automation
			actBuilder.moveToElement(qaAutomation).build().perform();

			// Click on Registration Form
			WebElement practiceAutomation = driver.findElement(By.xpath(practiceAutomationXpath));

			// Move the Mouse above the Practice Automation
			actBuilder.moveToElement(practiceAutomation).build().perform();

			// Click on Demo Site-Registration Form
			driver.findElement(By.partialLinkText(regForm)).click();
		    System.out.println("Navigated to Register Demo Page");
	  }

	  
	  @Test(priority=2)
	  public void registerDemo() {
		// Positive Scenario
			WebElement regTitleText = driver.findElement(By.xpath(regTitleTextXpath));
			// Verify Register Title is Displayed or not
			if (regTitleText.isDisplayed()) {
				System.out.println("Register Title is Displayed");
			} else {
				System.out.println("Register Title is not Displayed");
			}

			// Verify Register Title page is Enabled or not
			if (regTitleText.isEnabled()) {
				System.out.println("Register Title is Enabled");
			} else {
				System.out.println("Register Title is not Enabled");
			}

			// Validating Text
			String actRegTitleText = regTitleText.getText();
			String expRegTitleText = regFormDemo;
	   
			if (actRegTitleText.equals(expRegTitleText)) {
				System.out.println("The Register Title Text is: " + actRegTitleText);
			} else {
				System.out.println("Actual and expected Register Title Text are not same ");
				System.out.println("Actual Text is " + actRegTitleText);
				System.out.println("Expected Text is " + expRegTitleText);
			}

			// Step:5 Fill the Registration form by entering the all fields.

			// First name
			WebElement firstName = driver.findElement(By.id(firstNameIdPath));
			// Verify the First Name is displayed or not
			if (firstName.isDisplayed()) {
				System.out.println("First Name is Displayed");
			} else {
				System.out.println("First Name is not Displayed");
			}

			// Verify the First Name is Enabled or not
			if (firstName.isEnabled()) {
				System.out.println("First Name is Enabled" );
				// Enter First Name
				firstName.sendKeys(firstNameValue);
				System.out.println("The Present First Name Value is: " + firstNameValue);
			} else {
				System.out.println("First Name is not Enabled" );
			}

			// Last name
			WebElement lastName = driver.findElement(By.id(lastNameIdPath));
			// Verify the Last Name is displayed or not
			if (lastName.isDisplayed()) {
				System.out.println("Last Name is Displayed");
			} else {
				System.out.println("Last Name is not Displayed");
			}

			// Verify the Last Name is enabled or not
			if (lastName.isEnabled()) {
				System.out.println("Last Name is Enabled");
				// Enter Last Name
				lastName.sendKeys(lastNameValue);
				System.out.println("The Present Last Name Value is: " + lastNameValue);
			} else {
				System.out.println("Last Name is not Enabled");
			}

			// Gender
			// Male Radio Button
			WebElement maleRdoBtn = driver.findElement(By.id(maleRdoBtnIdPath));
			// Verify Male Radio Button is Displayed or not
			if (maleRdoBtn.isDisplayed()) {
				System.out.println("Male Radio Button is Displayed");
			} else {
				System.out.println("Male Radio Button is not Displayed");
			}

			// Verify male Radio Button is Enabled or not
			if (maleRdoBtn.isEnabled()) {
				System.out.println("Male Radio Button is Enabled");
			} else {
				System.out.println("Male Radio Button is not Enabled");
			}
			
			// Verify Male Radio Button is Selected
			if (maleRdoBtn.isSelected()) {
				System.out.println("Male Radio Button is Selected");
			} else {
				System.out.println("Male Radio Button is not Selected");
				// Click on Male Radio Button
				maleRdoBtn.click();
				System.out.println("Male Radio Button is Selected");
			}

			// Verify Male Radio Button is Selected
			if (maleRdoBtn.isSelected()) {
				System.out.println("Verified Male Radio Button  is Selected");
			} else {
				System.out.println("Verified Male Radio Button is not Selected");
			}
			
			// Address
			// Street Address
			WebElement stAddress = driver.findElement(By.name(stAddressNamePath));
			// Verify the Street Address is displayed or not
			if (stAddress.isDisplayed()) {
				System.out.println("Street Address is Displayed");
			} else {
				System.out.println("Street Address is not Displayed");
			}

			// Verify the  Street Address is enabled or not
			if (stAddress.isEnabled()) {
				System.out.println("Street Address is Enabled");
				// Enter Street Address
				stAddress.sendKeys(streetAddressInput);
				System.out.println("Present Street Address Value is: " + streetAddressInput);
			} else {
				System.out.println("Street Address is not Enabled");
			}
			
			// Apartment Number
			WebElement apartmentNo = driver.findElement(By.id(apartmentIdPath));
			// Verify the Apartment Number is displayed or not
			if (apartmentNo.isDisplayed()) {
				System.out.println("Apartment Number is Displayed");
			} else {
				System.out.println("Apartment Number is not Displayed");
			}

			// Verify the Apartment Number is enabled or not
			if (apartmentNo.isEnabled()) {
				System.out.println("Apartment Number is Enabled");
				// Enter Apartment Number
				apartmentNo.sendKeys(apartmentInput);
				System.out.println("Present Apartment Number Value is: " + apartmentInput);	
			} else {
				System.out.println("Apartment Number is not Enabled");
			}

			// City
			WebElement cityName = driver.findElement(By.id(cityIdPath));
			// Verify the City Name is displayed or not
			if (cityName.isDisplayed()) {
				System.out.println("City Name is Displayed");
				
			} else {
				System.out.println("City Name is not Displayed");
			}

			// Verify the City Name is enabled or not
			if (cityName.isEnabled()) {
				System.out.println("City Name is Enabled");
				// Enter City Name
				cityName.sendKeys(cityNameValue);
				System.out.println("Present City Name Value is : " + cityNameValue);
			} else {
				System.out.println("City Name is not Enabled");
			}

			// State
			WebElement stateName = driver.findElement(By.id(stateIdPath));
			// Verify the State is displayed or not
			if (stateName.isDisplayed()) {
				System.out.println("State is Displayed");
			} else {
				System.out.println("State is not Displayed");
			}

			// Verify the State is enabled or not
			if (stateName.isEnabled()) {
				System.out.println("State is Enabled");
				// Enter State Name
				stateName.sendKeys(stateNameValue);
				System.out.println("Present State Value is : " + stateNameValue);
			} else {
				System.out.println("State is not Enabled");
			}

			// Postal/Zip code
			WebElement postalCode = driver.findElement(By.id(postalCodeIdPath));
			// Verify the Postal Code is displayed or not
			if (postalCode.isDisplayed()) {
				System.out.println("Postal Code is Displayed");
			} else {
				System.out.println("Postal Code is not Displayed");
			}
			
			// Verify the Postal Code is enabled or not
			if (postalCode.isEnabled()) {
				System.out.println("Postal Code is Enabled");
				// Enter Postal Code
				postalCode.sendKeys(postalCodeValue);
				System.out.println("Present Postal Code Value is : " + postalCodeValue);
			} else {
				System.out.println("Postal Code is not Enabled");
			}
			
			// Country Drop Down
			WebElement countryDropDown = driver.findElement(By.id(countryDrpDnIdPath));
			// Verify Country Drop Down is displayed or not
			if (countryDropDown.isDisplayed()) {
				System.out.println("Verified Country Drop Down is Displayed");
			} else {
				System.out.println("Verified Country Drop Down is not Displayed");
			}
			
			// Verify Country Drop Down is enabled or not
			if (countryDropDown.isEnabled()) {
				System.out.println("Verified Country Drop Down is enabled");
			} else {
				System.out.println("Verified Country Drop Down is not enabled");
			}
			
			// To Select the Item from country DropDown, Create the Select Object
			Select countryDrpDn = new Select(countryDropDown);
			// Select Using Visible Text
			countryDrpDn.selectByVisibleText(countryDrpDnValue);
			System.out.println("Present Country Drop Down Value is: " + countryDrpDnValue);

			// Email
			WebElement email = driver.findElement(By.cssSelector(emailCssSelectorPath));
			// Verify the Email is Displayed or not
			if (email.isDisplayed()) {
				System.out.println("Email is Displayed");
			} else {
				System.out.println("Email is not Displayed");
			}
			
			// Verify the Email is enabled or not
			if (email.isEnabled()) {
				System.out.println("Email is Enabled");
				// Enter Email Id
				email.sendKeys(emailInput);
				System.out.println("Present Email Id is: " + emailInput);
			} else {
				System.out.println("Email is not Enabled");
			}
			
			// Date of Demo
			WebElement dateOfDemo = driver.findElement(By.cssSelector(dateOfDemoCssSelectorPath));
			// Verify the Mobile Number is Displayed or not
			if (dateOfDemo.isDisplayed()) {
				System.out.println("Date of Demo is Displayed");
			} else {
				System.out.println("Date of Demo is not Displayed");
			}
			
			// Verify the Date of Demo is enabled or not
			if (dateOfDemo.isEnabled()) {
				System.out.println("Date of Demo is Enabled");
				// Enter Date of Demo Value
				dateOfDemo.sendKeys(dateOfDemoValue);
				System.out.println("Present Date of Demo Value is: " + dateOfDemoValue);
			} else {
				System.out.println("Date of Demo is not Enabled");
			}
			
			// Convenient Time
	        // Hour Drop Down
			WebElement convenientTimeHrDrpDn = driver.findElement(By.id(hourIdPath));
			// Verify Convenient Time Hour Drop Down is Displayed or not
			if (convenientTimeHrDrpDn.isDisplayed()) {
				System.out.println("Verified Hour DropDown is Displayed ");
			} else {
				System.out.println("Verified Hour DropDown is not Displayed ");
			}

			// Verify Convenient Time Hour Drop Down is Enabled or not
			if (convenientTimeHrDrpDn.isEnabled()) {
				System.out.println("Verified Hour DropDown is Enabled ");
			} else {
				System.out.println("Verified Hour DropDown is not Enabled ");
			}

			// To Select the Item from Convenient Time Hour DropDown, Create the Select Object
			Select hourDropDown = new Select(convenientTimeHrDrpDn);
			// Select Using Visible Text
			hourDropDown.selectByVisibleText(hourInput);
			System.out.println("Present Hour Drop Down Value is: " + hourInput);
			
			// Minute Drop Down
			WebElement convenientTimeMinDrpDn = driver.findElement(By.id(minuteIdPath));
			// Verify MM Drop Down is Displayed or not
			if (convenientTimeMinDrpDn.isDisplayed()) {
				System.out.println("Verified Minute DropDown is Displayed");
			} else {
				System.out.println("Verified Minute DropDown is not Displayed");
			}

			// Verify Minute Drop Down is Enabled or not
			if (convenientTimeMinDrpDn.isEnabled()) {
				System.out.println("Verified Minute DropDown is Enabled");
			} else {
				System.out.println("Verified Minute DropDown is not Enabled");
			}

			// To Select the Item from Minute DropDown, Create the Select Object
			Select minuteDropDown = new Select(convenientTimeMinDrpDn);
			// Select Using Visible Text
			minuteDropDown.selectByVisibleText(minuteInput);
			System.out.println("Present Minute Drop Down Value is: " + minuteInput);
			
	        // Convenient Time AM/PM Drop Down
			WebElement convenientTimeAmpmDrpDn = driver.findElement(By.id(amPmIdPath));
			// Verify Convenient Time AM/PM Drop Down is Displayed or not
			if (convenientTimeAmpmDrpDn.isDisplayed()) {
				System.out.println("Verified AMPM DropDown is Displayed");
			} else {
				System.out.println("Verified AMPM DropDown is not Displayed");
			}

			// Verify Convenient Time AM/PM Drop Down is Enabled or not
			if (convenientTimeAmpmDrpDn.isEnabled()) {
				System.out.println("Verified AMPM DropDown is Enabled");
			} else {
				System.out.println("Verified AMPM DropDown is not Enabled");
			}
			
			// To Select the Item from AM/PM DropDown, Create the Select Object
			Select ampmDrpDown = new Select(convenientTimeAmpmDrpDn);
			// Select Using Visible Text
			ampmDrpDown.selectByVisibleText(ampmInput);
			System.out.println("Present AMPM Drop Down Value is: " + ampmInput );
			
			// Mobile Number
			WebElement mobileNumber = driver.findElement(By.xpath(mobileNoXpath));
			// Verify the Mobile Number is Displayed or not
			if (mobileNumber.isDisplayed()) {
				System.out.println("Mobile Number is Displayed");
			} else {
				System.out.println("Mobile Number is not Displayed");
			}

			// Verify the Mobile Number is enabled or not
			if (mobileNumber.isEnabled()) {
				System.out.println("Mobile Number is Enabled");
				// Enter Mobile Number
				mobileNumber.sendKeys(mobileNumberValue);
				System.out.println("Present Mobile Number Value is: " + mobileNumberValue);
			} else {
				System.out.println("Mobile Number is not Enabled");
			}
			
			// Course Interested
			// Functional Testing Check Box
			WebElement functionalTestingChk = driver.findElement(By.id(functionalTestingIdPath));
			// Verify The Functional Testing Check Box is displayed or Not
			if (functionalTestingChk.isDisplayed()) {
				System.out.println("Verified Functional Testing Check Box is Displayed ");
			} else {
				System.out.println("Verified Functional Testing Check Box is Not Displayed ");
			}
			
			// Verify Functional Testing Check Box Enabled or Not
			if (functionalTestingChk.isEnabled()) {
				System.out.println("Verified Functional Testing Check Box is Enabled");
			} else {
				System.out.println("Verified Functional Testing Check Box is Not Enabled");
			}
			
			// Verify Functional Testing Check Box Selected or Not-Initial State(not Selected)
			if (functionalTestingChk.isSelected()) {
				System.out.println("Verified Functional Testing Check Box is Selected");
			} else {
				System.out.println("Verified Functional Testing Check Box is Not Selected");
			    // Click on Functional Testing check Box
							functionalTestingChk.click();
				System.out.println("Functional Testing Check Box is checked");
			}
			
	        // Verify Functional Testing Check Box Selected or Not
			if (functionalTestingChk.isSelected()) {
				System.out.println("Verified Functional Testing Check Box is Selected");
			} else {
				System.out.println("Verified Functional Testing Check Box is Not Selected");
			}
			
			// Selenium WebDriver Check Box
			WebElement seleniumWebDriverChk= driver.findElement(By.id(seleniumWebDriverIdPath));
			// Verify The Selenium WebDriver Check Box is displayed or Not
			if (seleniumWebDriverChk.isDisplayed()) {
				System.out.println("Verified Selenium WebDriver Check Box is Displayed ");
			} else {
				System.out.println("Verified Selenium WebDriver Check Box is Not Displayed ");
			}

			// Verify Selenium WebDriver Check Box Enabled or Not
			if (seleniumWebDriverChk.isEnabled()) {
				System.out.println("Verified Selenium WebDriver Check Box is Enabled");
			} else {
				System.out.println("Verified Selenium WebDriver Check Box is Not Enabled");
			}

			// Verify Selenium WebDriver Check Box Selected or Not
			if (seleniumWebDriverChk.isSelected()) {
				System.out.println("Verified Selenium WebDriver Check Box is Selected");
			} else {
				System.out.println("Verified Selenium WebDriver Check Box is Not Selected");
				// Click on Selenium WebDriver check Box
			    seleniumWebDriverChk.click();
				System.out.println("Selenium WebDriver Check Box is Checked ");
			}
			
			// Verify Selenium WebDriver Check Box Selected or Not
			if (seleniumWebDriverChk.isSelected()) {
				System.out.println("Verified Selenium WebDriver Check Box is Selected");
			} else {
				System.out.println("Verified Selenium WebDriver Check Box is Not Selected");
				// Click on Selenium WebDriver check Box
				System.out.println("Selenium WebDriver Check Box is Checked ");
			}
			
			// Enter Your Query
			WebElement enterYourQuery = driver.findElement(By.id(enterYourQueryIdPath));
			// Verify the Enter Your Query is Displayed or not
			if (enterYourQuery.isDisplayed()) {
				System.out.println("Enter Your Query is Displayed");
				
			} else {
				System.out.println("Enter Your Query is not Displayed");
			}
			// Verify the Enter Your Query is enabled or not
			if (enterYourQuery.isEnabled()) {
				System.out.println("Enter Your Query is Enabled");
				// Enter Your Query Value
				enterYourQuery.sendKeys(enterYourQueryValue);
				System.out.println("Present Enter Your Query is: " + enterYourQueryValue);
			} else {
				System.out.println("Enter Your Query is not Enabled");
			}

			// Enter Any Two Digits
			WebElement enterTwoDigits = driver.findElement(By.id(enterTwoDigitsIdPath));
			// Verify the Enter Any Two Digits is Displayed or not
			if (enterTwoDigits.isDisplayed()) {
				System.out.println("Enter Any Two Digits is Displayed");
			} else {
				System.out.println("Enter Any Two Digits is not Displayed");
			}

			// Verify the Enter Any Two Digits is enabled or not
			if (enterTwoDigits.isEnabled()) {
				System.out.println("Enter Any Two Digits is Enabled");
				// Enter Two Digit Value
				enterTwoDigits.sendKeys(twoDigitValue);
				System.out.println("Enter Any Two Digits is: " + twoDigitValue);
			} else {
				System.out.println("Enter Any Two Digits is not Enabled");
			}

			// Step:6 Retrieve the Verification Number during run time and enter value.

			// Get the Attribute Value-value is retrieved
			// String enterTwoDigitsText = enterTwoDigits.getAttribute("value");
			String enterTwoDigitsText = enterTwoDigits.getAttribute("value").replace(twoDigitValue, twoDigitNewValue);
			System.out.println("The Present value dinamically from web page in seleniumText is: " + enterTwoDigitsText);

			enterTwoDigits.clear();
			enterTwoDigits.sendKeys(enterTwoDigitsText);
			
			// Submit button
			WebElement submitBtn = driver.findElement(By.id(submitBtnIdPath));
			// Verify The Submit Button is displayed or Not
			if (submitBtn.isDisplayed()) {
				System.out.println("Verified Submit Button is Displayed ");
			} else {
				System.out.println("Verified Submit Button is Not Displayed ");
			}

			// Verify The Submit Button is Enabled or Not
			if (submitBtn.isEnabled()) {
				System.out.println("Verified Submit Button is Enabled");
				// Click on Submit Button
				  // submitBtn.click();
				
				
				// Explicit Wait
				WebDriverWait wait = new WebDriverWait(driver,30);
				wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();				
				
				
				System.out.println("Submit Button is Clicked");
			}
		  System.out.println("User is Registered");
	  }
	  
	  @Test(priority=3)
	  public void validateSuccessfulMsg() {
		  WebElement successfulMsgText = driver.findElement(By.xpath(successfulMsgTextXpath));
		  
		  // Fluent Wait
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				  				.withTimeout(30,TimeUnit.SECONDS)
				  				.pollingEvery(5,TimeUnit.SECONDS)
				  				.ignoring(NoSuchElementException.class)
				  				.withMessage("User defined exception Message");
				  						  
		  
			// Verify Successful message Text displayed or not
			if (successfulMsgText.isDisplayed()) {
				System.out.println("Successful Message Text is Displayed");			
			} else {
				System.out.println("Successful Message Text is not Displayed");
			}

			// Validating Successful Message Text
			    String actSuccessfulMsgText = successfulMsgText.getText();
			    String expSuccessfulMsgText = successfulMessageText;

			if (actSuccessfulMsgText.equals(expSuccessfulMsgText)) {
				System.out.println("The Successful Message Text is:  " + actSuccessfulMsgText);
			} else {
				System.out.println("Actual and expected Successful Msg Text are not same");
				System.out.println("Actual Text is: " + actSuccessfulMsgText);
				System.out.println("Expected Text is: " + expSuccessfulMsgText);
			}
	  }
	  
	
}
