package com.callaudit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DashboardPage extends GenericPage {

	@FindBy(css = ".graphs-container")
	private WebElement graphsContainer;

	@FindBy(id = "callSummaryTable")
	private WebElement callSummaryTable;

	@FindBy(id = "liveCDRTable")
	private WebElement liveCDRTable;

	@FindBy(id = "durationFilter")
	private WebElement durationFilter;

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	public boolean areGraphsDisplayed() {
		try {
			return graphsContainer.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isCallSummaryTableVisible() {
		try {
			return callSummaryTable.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isLiveCDRTableVisible() {
		try {
			return liveCDRTable.isDisplayed();
		} catch (Exception e) {
			return false;
		}
	}

	public void selectDuration(String duration) {
		new Select(durationFilter).selectByVisibleText(duration);
	}
}
