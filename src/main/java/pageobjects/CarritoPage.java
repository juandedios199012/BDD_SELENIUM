package pageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarritoPage {

    WebDriver driver;

    public CarritoPage(WebDriver browser){
        driver = browser;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#summary_products_quantity")
    private WebElement lblMensajeAgregarProductoCarrito;

    public String getMensajeAgregarProductoCarrito(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(lblMensajeAgregarProductoCarrito));
        return lblMensajeAgregarProductoCarrito.getText();
    }
}
