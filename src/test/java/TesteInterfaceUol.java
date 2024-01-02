import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteInterfaceUol {

      private WebDriver driver;
      private static final String baseURL = "https://www.uol.com.br";

    
    @Test
    @DisplayName("Quando eu acessar a página inicial, Então deve aparecer o título 'Expulsos por obras esperam há 6 anos água da transposição na PB'")
    public void quandoAcessarHomePage_EntaoDeveAparecerOTitulo() {

        String tituloEsperado = "Expulsos por obras esperam há 6 anos água da transposição na PB";

      
        UolHomePage uolHomePage = new UolHomePage(navegador);

        uolHomePage.abrirPaginaInicial();
        uolHomePage.clicarNoTitulo();

        String tituloClickado = uolHomePage.obterTitulo();

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
