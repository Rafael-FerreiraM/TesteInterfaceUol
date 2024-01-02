import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteInterfaceUol {

      private WebDriver driver;
      private static final String baseURL = "https://www.uol.com.br";

    
    @Test
    @DisplayName("Quando eu acessar a página inicial, Então deve aparecer o título esperado")
    public void quandoAcessarHomePage_EntaoDeveAparecerOTitulo() {

        homePage = new UolHomePage();
          
        String tituloEsperado = "Expulsos por obras esperam há 6 anos água da transposição na PB";
          
        driver.get(baseURL);  
      
      

        String tituloClickado = 

        assertEquals(tituloClickado, tituloEsperado);

     
    }

      @BeforeAll
      public void setup (){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitWait(Duration.ofMillis(10));
      }

      @AfterAll
      public void tearDown(){
            driver.close();
            
      }
}
