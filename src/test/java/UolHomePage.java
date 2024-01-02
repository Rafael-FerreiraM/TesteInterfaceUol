import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

    public class UolHomePage {

        private WebDriver driver;

        // Localizador do elements na página
        private By tituloNoticia = By.cssSelector("#lqt68sn8");

        // Clicar no titulo para redirecionar para a página da notícia
        public void clicarNoTitulo() {
           driver.findElement(tituloNoticia).click();
        }

            //Construtor
            public UolHomePage (WebDriver driver){
                this.driver = driver;
                }
        }
    }


