package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import setup.Driver;

public class testBotoesCalculadora {
    private WebDriver driver;

    @Before
    public void abrirNavegador() {
        Driver navegador = new Driver();
        driver = navegador.inicializarNavegador();
    }

    @After
    public void fecharNavegador(){
        driver.quit();
    }

    @Test
    public void verificarSoma() {
        HomePage homePage = new HomePage(driver);
        homePage.clicarNumero1();
        homePage.clicarNumero0();
        homePage.clicarbtnSoma();
        homePage.clicarNumero2();
        homePage.clicarNumero5();
        homePage.clicarbtnIgual();
        homePage.validarSoma("35");
    }

    @Test
    public void verificarSubtracao() {
        HomePage homePage = new HomePage(driver);
        homePage.clicarNumero4();
        homePage.clicarNumero6();
        homePage.clicarbtnSubtracao();
        homePage.clicarNumero3();
        homePage.clicarbtnIgual();
        homePage.validarSubtracao("43");
    }

    @Test
    public void verificarMultiplicacao() {
        HomePage homePage = new HomePage(driver);
        homePage.clicarNumero7();
        homePage.clicarbtnMultiplicacao();
        homePage.clicarNumero9();
        homePage.clicarbtnIgual();
        homePage.validarMultiplicacao("63");
    }

    @Test
    public void verificarDivisao() {
        HomePage homePage = new HomePage(driver);
        homePage.clicarNumero8();
        homePage.clicarbtnDivisao();
        homePage.clicarNumero8();
        homePage.clicarbtnIgual();
        homePage.validarDivisao("1");
    }

    @Test
    public void verificarDivisaoPorZero() {
        HomePage homePage = new HomePage(driver);
        homePage.clicarNumero6();
        homePage.clicarbtnDivisao();
        homePage.clicarNumero0();
        homePage.clicarbtnIgual();
        homePage.validarDivisaoPorZero("Error");
    }

}
