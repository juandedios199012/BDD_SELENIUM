package steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pageobjects.CarritoPage;
import pageobjects.ProductCartPage;
import pageobjects.ProductsPage;
import pageobjects.SearchPage;

public class Search {
    WebDriver driver;


    @Given("^Se carga la página de búsqueda$")
    public void seCargaLaPáginaDeBúsqueda() throws Throwable {
        driver.get("http://automationpractice.com/index.php");
    }

    @When("^Buscamos el término \"([^\"]*)\"$")
    public void buscamosElTérmino(String term) throws Throwable {
        SearchPage search = new SearchPage(driver);
        search.writeText(term);
        search.clickSearch();
    }

   @When("^Clic en List$")
   public void clicEnList() throws Throwable {
       SearchPage search = new SearchPage(driver);
       search.clickList();
   }

   @When("^Clic en el boton agregar$")
    public void clicEnElBotonAgregar() throws Throwable {
        ProductsPage productsPage = new ProductsPage(driver);
       productsPage.clickAgregarCarrito();
    }
    @When("^Clic en el boton procesar$")
    public void clicEnElBotonProcesar() throws Throwable {
        ProductCartPage productCartPage=new ProductCartPage(driver);
        productCartPage.clickProcesar();
    }

    @Then("^Mostrar mensaje \"([^\"]*)\"$")
    public void mostrarMensaje(String mensajeproductocarrito) throws Throwable {
       CarritoPage carritoPage = new CarritoPage(driver);
       Assert.assertEquals(carritoPage.getMensajeAgregarProductoCarrito().trim(), mensajeproductocarrito ,
               "Error, no se agrego al carrito");
    }

    @Before
    public void startUp() {
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
