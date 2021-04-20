package com.octonion.automation_lessons.realt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchPage extends BasePage {


    private WebDriver driver;

    public static final int RESULTS_PER_PAGE = 30;

    @FindBy(css = "form[name='tx_uedbflat_pi2']")
    private WebElement filterForm;

    @FindBy(css = ".select2-search__field")
    private WebElement cityInput;

    private WebElement cityDropdownValue;

    @FindBy(css = "a#search-list")
    private WebElement submitForm;

    @FindBy(css = ".location.color-graydark")
    private List<WebElement> location;

    @FindBy(css = ".paging-list .active + a")
    private WebElement nextPageBtn;

    @FindBy(css = ".fs-small  span.color-graydark")
    private WebElement qtOfAdsOnPage;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getFilterForm() {
        return filterForm;
    }


    public int getSearchResultCounter() {
        /*WebDriverWait wait = new WebDriverWait(driver,10); //Явное ожидание
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='mt-sm']/div/strong[1]")));*/
        String text = this.searchResultCounter.getText();
        return Integer.parseInt(text);
    }

    public SearchPage enterCityInput(String city) {
        cityInput.sendKeys(city);
        return this;
    }

    public SearchPage clickCityDropdownValue(String city) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        cityDropdownValue = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(String.format("//li[contains(@class,'select2-results__option')][text()='%s']", city))));
        cityDropdownValue.click();
        return this;
    }

    public SearchPage submitForm() {
        submitForm.click();
        return new SearchResultPage(driver);
    }

    public List<WebElement> getLocation() {
        return location;
    }

    public SearchPage clickNextPageBtn() {
        nextPageBtn.click();
        return this;
    }

    public List<Integer> getFromToAdsNumber() {
        Pattern pattern = Pattern.compile("показаны объявления с (\\d*) по (\\d*)");
        Matcher matcher = pattern.matcher(qtOfAdsOnPage.getText());
        System.out.println(" --- " + qtOfAdsOnPage.getText());

        String group1 = "0";
        Integer group2 = 0;
        if (matcher.find()) {
            group1 = matcher.group(1);
            group2 = Integer.parseInt(matcher.group(2));

        }
        return Arrays.asList(Integer.parseInt(group1), group2);
    }
}
