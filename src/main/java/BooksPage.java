import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class BooksPage extends BasePage {
    public BooksPage (WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "products-pagesize")
    private WebElement quantityDropdown;
    @FindBy(css = "[value='https://demowebshop.tricentis.com/books?pagesize=4']")
    private WebElement quantity4;
    @FindBy(css = "[value='https://demowebshop.tricentis.com/books?pagesize=8']")
    private WebElement quantity8;
    @FindBy(css = "[value='https://demowebshop.tricentis.com/books?pagesize=12']")
    private WebElement quantity12;
    @FindBy(css = "[value='https://demowebshop.tricentis.com/books?pagesize=20']")
    private WebElement quantity20;
    @FindBy (className = "product-item")
    private List<WebElement> quantityOfBooks;
    @FindBy (id = "products-orderby")
    private WebElement sortByDropdown;
    @FindBy (xpath = "//option[text()='Position']")
    private WebElement sortOptionPosition;
    @FindBy (xpath = "//option[text()='Name: A to Z']")
    private WebElement sortOptionNameAtoZ;
    @FindBy (xpath = "//option[text()='Name: Z to A']")
    private WebElement sortOptionNameZtoA;
    @FindBy (xpath = "//option[text()='Price: Low to High']")
    private WebElement sortOptionLowToHigh;
    @FindBy (xpath = "//option[text()='Price: High to Low']")
    private WebElement sortOptionHighToLow;
    @FindBy (xpath = "//option[text()='Created on']")
    private WebElement sortOptionCreatedOn;

    public WebElement getQuantityDropdown() {
        return quantityDropdown;
    }
    public void choseSortByNameAtoZ (){
        quantityDropdown.click();
        sortOptionNameAtoZ.click();
    }
    public void choseSortByNameZtoA (){
        quantityDropdown.click();
        sortOptionNameZtoA.click();
    }
//    public void choseSortByLowToHigh (){
//        dropdown.click();
//        sortOptionLowToHigh.click();
//    }
    public void choseSortByHighToLow (){
        quantityDropdown.click();
        sortOptionHighToLow.click();
    }
    public void choseSortByLowToHigh (){
        quantityDropdown.click();
        sortOptionCreatedOn.click();
    }
    public boolean isOptionSelected(String optionValue) {
        By optionSelector = By.cssSelector("option[value='" + optionValue + "'][selected='selected']");
        WebElement selectedOption = driver.findElement(optionSelector);
        return selectedOption.isSelected();
    }
    public void clickOnDropdown(){
        clickOnElement(quantityDropdown);
    }
    public void clickOnSortByDropdown(){
        clickOnElement(sortByDropdown);
    }
    public int checkQuantityOfBooks(){
        return quantityOfBooks.size();
    }
    public boolean checkVisibilityOfBooks(){
        boolean allBooksAreVisible = true;
        for (WebElement book :quantityOfBooks) {
            if (!book.isDisplayed()) {
                allBooksAreVisible = false;
            }
        }
        return allBooksAreVisible;
    }
    public void clickOn4FromDropdown(){
        clickOnElement(quantity4);
    }
    public void clickOn8FromDropdown(){
        clickOnElement(quantity8);
    }
    public void clickOn12FromDropdown(){
        clickOnElement(quantity12);
    }
    public void clickOn20FromDropdown(){
        clickOnElement(quantity20);
    }
}
