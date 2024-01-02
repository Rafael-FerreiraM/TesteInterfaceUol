import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TesteInterfaceUol {

      private WebDriver driver;
      private static final String baseURL = "https://www.uol.com.br/";
      
      UolHomePage home;

    
    @Test
    @DisplayName("Quando eu acessar a página inicial, Então deve aparecer o título esperado")
    public void quandoAcessarHomePage_EntaoDeveAparecerOTitulo() {

        //Entrar no site Uol
        driver.get(baseURL);  

        //Instanciar o Page Objects
        home = new UolHomePage(driver);

        //Clicar no título da notícia
        home.
              
        //Titulo esperado a ser encontrado
        String tituloEsperado = "Expulsos por obras esperam há 6 anos água da transposição na PB";

        //Título que foi econtrado
        String tituloEncontrado = driver.getTitle();

        //Verificação se o título encontrado é igual ao título esperado
        assertEquals(tituloEsperado, tituloEncontrado);

     
    }

      @BeforeAll
      public void setup (){
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10));
      }

      @AfterAll
      public void tearDown(){
            driver.close();
            
      }
}
