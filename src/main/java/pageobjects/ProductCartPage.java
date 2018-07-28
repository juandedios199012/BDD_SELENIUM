package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductCartPage {

    WebDriver driver;

    public ProductCartPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "1")
    private WebElement mensaje;

    @FindBy(css = "div.button-container")
    private WebElement btnProcesar;

    public String getMensajeConfirmacion(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(mensaje));
        return mensaje.getText();
    }
    public void clickProcesar(){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(btnProcesar));
        btnProcesar.click();
    }
}
