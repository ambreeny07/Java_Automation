package com.ascm.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ascm.util.SeleniumHelper;
import com.ascm.util.Utility;
import com.ibm.icu.impl.Assert;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class ProcurementPage extends SeleniumHelper {
	public ProcurementPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//a[contains(text(),'Add to Cart')]")
	WebElementFacade procurrementAddToCartButton;

	@FindBy(xpath = "//a[contains(@href,'courses' ) and contains(@href,'downloads')]")
	WebElementFacade courseAndDownload;
	
	@FindBy(xpath = "//a[text()='Access Course']")
	WebElementFacade accessCourse;
	
	
	
	@FindBy(linkText = "Go to My Account")
	WebElementFacade procurrementGoToMyAccountButton;

	@FindBy(linkText = "Courses & Downloads")
	WebElementFacade procurrementCourseAndDownloadButton;

	@FindBy(xpath = "//h4[text()='Supply Chain Procurement Certificate']//following-sibling::span")
	WebElementFacade procurrementCertificateStatus;

	@FindBy(xpath = "//h4[text()='Supply Chain Procurement Certificate']//..//div//a")
	WebElementFacade procurrementCertificationButton;

	@FindBy(linkText = "Go to Course")
	WebElementFacade procurrementGoToCourse;
///////// Lesson Test /////////////	
	@FindBy(xpath = "//span[text()='Lessons']")
	WebElementFacade procurrementExamLesson;
	@FindBy(xpath = "(//ul[@class='lessons-list list-table'])[1]//a")
	WebElementFacade lessonFundamentalsofPurchasingAndProcurement;
	@FindBy(xpath = "//button[@data-value='high']")
	WebElementFacade hightButton;
	@FindBy(xpath = "//button[@data-value='medium']")
	WebElementFacade mediumButton;
	@FindBy(xpath = "//button[@data-value='low']")
	WebElementFacade lowButton;
	@FindBy(xpath = "//button[contains(@class,' btn-large continue')]")
	WebElementFacade continueButton;

///////// Practice Test /////////////	
	@FindBy(xpath = "//span[text()='Practice']")
	WebElementFacade procurrementExamPractice;

	@FindBy(xpath = "(//div[contains(text(),'Fundamentals of Purchasing')])[last()]")
	WebElementFacade practiceFundamentalOfPurchase;
	@FindBy(xpath = "//a[contains(text(),'Practice Category')]")
	WebElementFacade practiceCategoryButton;
//	@FindBy(xpath = "//div[@class='btn-group btn-group-vertical']//div//a[2]")
//	List<WebElementFacade> SelectSingleChoice;
	@FindBy(xpath = "(//span[contains(text(),'ON')])[1]")
	WebElementFacade ReviewQuestionOFF;

	@FindBy(xpath = "(//a[@id='confirm-choice'])[last()]")
	WebElementFacade confirmButton;

	@FindBy(xpath = "//div[contains(text(),'Sourcing Strategies')]")
	WebElementFacade practiceSourcingStrategies;

	@FindBy(xpath = "//div[contains(text(),'Purchase Order Management')]")
	WebElementFacade practicePurchaseOrderManagement;

	@FindBy(xpath = "//div[contains(text(),'Contract Management')]")
	WebElementFacade practiceContractManagement;
///
	@FindBy(xpath = "//div[contains(text(),'Sustainability and Ethical Sourcing')]")
	WebElementFacade practiceSutainabilityAndEthicalSourcing;
	@FindBy(xpath = "//input[contains(@class,'choice-input')]")
	WebElementFacade enterInput;
//	@FindBy(xpath = "//div[@class='btn-group multiple btn-group-vertical']//select")
//	List<WebElementFacade> SelectMultipleChoice;
//
	@FindBy(xpath = "//div[contains(text(),'Procurement Evaluation Metrics')]")
	WebElementFacade practiceProcurementEvaluationMetrics;
	@FindBy(xpath = "//div[contains(@class,'instructions text-center')]")
	WebElementFacade practiceInstruction;
	
	@FindBy(xpath="//a//span[text()='Tests']")
	WebElementFacade testsMenu;
	
	@FindBy(xpath="(//div[contains(text(),'Supply Chain Procurement: Test')])[1]")
	WebElementFacade supplyChainProcurement;
	
	@FindBy(xpath="(//a[contains(text(),'Resume Test')]|//a[contains(text(),'Start Test')])[1]")
	WebElementFacade btnStartTest;
	
	@FindBy(xpath="(//div[@id='content-question-start']/p)[1]")
	WebElementFacade questionText;
	
	@FindBy(xpath="//input[@id='submit-confirm']")
	WebElementFacade inputSubmitConfirm;
	
	@FindBy(xpath="//a[text()='Submit Answers']")
	WebElementFacade btnSubmitConfirm;
	
	@FindBy(xpath="//a[text()='View Next Milestone']")
	WebElementFacade nextMileStone;
	
	

	public void commpleteTestOfPractice() throws InterruptedException {

		for (int i = 0; i < 6; i++) {
			jsClick(procurrementExamPractice);
			if (i == 0) {
				jsClick(practiceFundamentalOfPurchase);
			} else if (i == 1) {
				jsClick(practiceSourcingStrategies);
			} else if (i == 2) {
				jsClick(practicePurchaseOrderManagement);
			} else if (i == 3) {
				jsClick(practiceContractManagement);
			}
			 else if (i == 4) {
				jsClick(practiceSutainabilityAndEthicalSourcing);
			} else {
				jsClick(practiceProcurementEvaluationMetrics);
			}

			jsClick(practiceCategoryButton);
			jsClick(ReviewQuestionOFF);

			while (true) {
				List<WebElementFacade> SelectSingleChoice = findAll(
						"//div[@class='btn-group btn-group-vertical']//div//a[2]|//div[@class='btn-group multiple btn-group-vertical']//div//a[2]");
				List<WebElementFacade> SelectMultipleChoice = findAll(
						"//div[@class='btn-group multiple btn-group-vertical']//select");

				if (SelectSingleChoice.size() > 0) {
					Random r = new Random();
					int randomNumber = r.nextInt(SelectSingleChoice.size());
					Waits.wait1Second();
					jsClick(SelectSingleChoice.get(randomNumber));
				//	Waits.wait2Second();
					try {
						jsClick(confirmButton);

					} catch (Exception e) {
						jsClick(continueButton);
					}
					//Waits.wait2Second();
				}

				else if (SelectMultipleChoice.size() > 0) {
					for (int a = 0; a < SelectMultipleChoice.size(); a++) {
						
						//Waits.wait1Second();
						Select select = new Select(SelectMultipleChoice.get(a));
						if (a == 0) {
							select.selectByValue("A");
						} else if (a == 1) {
							select.selectByValue("B");
						} else if (a == 2) {
							select.selectByValue("C");
						} else {
							select.selectByValue("D");
						}
					//	Waits.wait2Second();
						try {
							jsClick(confirmButton);

						} catch (Exception e) {
							jsClick(continueButton);
						}
					}
				}

				else if (practiceInstruction.getText().contains("numeric answer")) {
					sendKeys(enterInput, "123");
					//Waits.wait2Second();
					try {
						jsClick(confirmButton);

					} catch (Exception e) {
						jsClick(continueButton);
					}
				} else {
					typeInto(enterInput, "Test");
					//Waits.wait2Second();
					try {
						jsClick(confirmButton);

					} catch (Exception e) {
						jsClick(continueButton);
					}
				}

				//Waits.wait2Second();
				String Url = getDriver().getCurrentUrl();
				if (Url.contains("#quiz/details/sessions")) {
					Waits.wait1Second();
				
					break;

				}

			}
		}
	}

	public void clickAddToCartButton() {
		jsClick(procurrementAddToCartButton);
	}
	public void clickOnDownloadAndCourses() {
		jsClick(courseAndDownload);
	}
	public void clickOnAccessCourse() {
		jsClick(accessCourse);
		ArrayList<String> tabs2 = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(tabs2.get(tabs2.size()-1));
	}
	public void verifyFoundationCourse(String text) throws InterruptedException {
		Waits.wait5Second();
		Waits.wait5Second();
		WebElement element =getDriver().findElement(By.xpath("(//*[text()='"+text+"'])[last()]"));
		moveTo(By.xpath("(//*[text()='"+text+"'])[last()]"));
		Assert.assrt(element.isDisplayed());
	}
	public void verifyFoundationCourseExpire(String text) throws InterruptedException {
		Waits.wait5Second();
		WebElement element =getDriver().findElement(By.xpath("//em[text()='"+text+"']"));
		moveTo(By.xpath("//em[text()='"+text+"']"));
		Assert.assrt(element.isDisplayed());
	}
	
	
	
	public void clickGoToMyAccountButton() {
		
		
		Waits.waitForElementToBeVisibile(procurrementGoToMyAccountButton, getDriver(), 100);
		jsClick(procurrementGoToMyAccountButton);
	}

	public void clickCourseAndDownloadButton() throws InterruptedException {
		Waits.wait7minuts();
		jsClick(procurrementCourseAndDownloadButton);
	}

	public void clickCertificationButton() {
		jsClick(procurrementCertificationButton);
	}

	public void clickGoToCourse() {
		try {
			jsClick(procurrementGoToCourse);
		}catch (Exception e) {
			jsClick(procurrementGoToCourse);
		}
		
	}

	public void clickExamLesson() {
		jsClick(procurrementExamLesson);
	}

	public void clicklessonFundamentalsofPurchasingAndProcurement() throws InterruptedException {
		Waits.wait5Second();
		jsClick(lessonFundamentalsofPurchasingAndProcurement);
	}
	
	

	public void commpleteTestOfLesson() throws InterruptedException {
		while (true) {
			//Waits.wait2Second();
			String[] arr = { "High", "Medium", "Low" };
			Random r = new Random();
			int randomNumber = r.nextInt(arr.length);
			//Waits.wait1Second();
			if (arr[randomNumber].equalsIgnoreCase("High")) {
				jsClick(hightButton);
			} else if (arr[randomNumber].equalsIgnoreCase("Medium")) {
				jsClick(mediumButton);
			} else {
				jsClick(lowButton);
			}
			//Waits.wait2Second();
			if (continueButton.getAttribute("class").contains("disable")) {
				click(lowButton);
			} else {
				jsClick(continueButton);
			}
			//Waits.wait1Second();
			String Url = getDriver().getCurrentUrl();
			if (Url.contains("/table-of-contents")) {
				if(nextMileStone.isVisible())
					jsClick(nextMileStone);
				break;
			}
		}
	}
	
	public void completeTest() throws InterruptedException {
		
		jsClick(testsMenu);
		
		jsClick(supplyChainProcurement);
		
		jsClick(btnStartTest);
		
		jsClick(btnStartTest);
		
		Utility util=new Utility();
		Object[][] dataArr=util.getData();
		
		while(true) {
		
			if(questionText.isVisible()) {
				List<WebElementFacade> SelectSingleChoice = findAll("(//div[@class='btn-group btn-group-vertical'])[2]//div[@class='choice-link-container']//a[2]");
				String qstn=getElementText(questionText);
				for(int i=0;i<dataArr.length;i++) {
					if(dataArr[i][1].toString().contains(qstn)) {
						if(dataArr[i][8].toString().contains(",")) {
							
							String[] multiples=dataArr[i][8].toString().split(",");
							List<WebElementFacade> selectMultipleChoice = findAll("//div[@class='btn-group multiple btn-group-vertical']//div[@class='choice-link-container']//a[2]");
							for(int k=0;k<multiples.length;k++) {
								if(multiples[k].equals("A")) {
									jsClick(selectMultipleChoice.get(0));
								}else if(multiples[k].equals("B")) {
									jsClick(selectMultipleChoice.get(1));
								}else if(multiples[k].equals("C")) {
									jsClick(selectMultipleChoice.get(2));
								}else {
									jsClick(selectMultipleChoice.get(3));
								}
							}
						}else {
							if(dataArr[i][8].toString().equals("A")) {
								jsClick(SelectSingleChoice.get(0));
							}else if(dataArr[i][8].toString().equals("B")) {
								jsClick(SelectSingleChoice.get(1));
							}else if(dataArr[i][8].toString().equals("C")) {
								jsClick(SelectSingleChoice.get(2));
							}else {
								jsClick(SelectSingleChoice.get(3));
							}
						}
						jsClick(confirmButton);
						break;
					}
				}
			}
				
		String Url = getDriver().getCurrentUrl();
		if (Url.contains("/overview")) {
			jsClick(inputSubmitConfirm);
			
			jsClick(btnSubmitConfirm);		
			
		}
		else if (Url.contains("#exams/details")) {
			
			if(nextMileStone.isVisible())
				jsClick(nextMileStone);
			Waits.wait10Second();
			break;
		}
	}
		
	}

}
