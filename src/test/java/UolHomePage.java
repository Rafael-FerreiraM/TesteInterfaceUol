import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class UolHomePage {


        // Localizadores (locators) dos elementos na página
        private By titleLocator = By.cssSelector("#lqt68sn8");

        // Métodos para interagir com a página

        public void abrirPaginaInicial() {
            driver.get("https://www.uol.com.br/");
            driver.manage().window().maximize();
        }

        public void clicarNoTitulo() {
            WebElement title = driver.findElement(titleLocator);
            title.click();
        }

        public String obterTitulo() {
            WebElement title = driver.findElement(titleLocator);
            return title.getText();
        }
    }


