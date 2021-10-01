package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[1]")
    private WebElement numero0;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[1]")
    private WebElement numero1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[2]")
    private WebElement numero2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[3]")
    private WebElement numero3;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[1]")
    private WebElement numero4;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[2]")
    private WebElement numero5;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[3]")
    private WebElement numero6;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[1]")
    private WebElement numero7;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[2]")
    private WebElement numero8;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[3]")
    private WebElement numero9;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[5]/span[4]")
    private WebElement btnIgual;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[1]/span[4]")
    private WebElement btnSoma;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[2]/span[4]")
    private WebElement btnSubtracao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[3]/span[4]")
    private WebElement btnMultiplicacao;

    @FindBy(how = How.XPATH, using = "//*[@id=\"sciout\"]/tbody/tr[2]/td[2]/div/div[4]/span[4]")
    private WebElement btnDivisao;

    @FindBy(how = How.ID, using = "sciOutPut")
    private WebElement campoResultado;

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void clicarNumero0() {
        numero0.click();
    }

    public void clicarNumero1() {
        numero1.click();
    }

    public void clicarNumero2() {
        numero2.click();
    }

    public void clicarNumero3() {
        numero3.click();
    }

    public void clicarNumero4() {
        numero4.click();
    }

    public void clicarNumero5() {
        numero5.click();
    }

    public void clicarNumero6() {
        numero6.click();
    }

    public void clicarNumero7() {
        numero7.click();
    }

    public void clicarNumero8() {
        numero8.click();
    }

    public void clicarNumero9() {
        numero9.click();
    }

    public void clicarbtnIgual() {
        btnIgual.click();
    }

    public void clicarbtnSoma() {
        btnSoma.click();
    }

    public void clicarbtnSubtracao() {
        btnSubtracao.click();
    }

    public void clicarbtnMultiplicacao() {
        btnMultiplicacao.click();
    }

    public void clicarbtnDivisao() {
        btnDivisao.click();
    }

    public void validarSoma(String valorEsperadoSoma) {
        String resultadoSoma = campoResultado.getText();
        Assert.assertEquals(valorEsperadoSoma, resultadoSoma.replace(" ", ""));
    }

    public void validarSubtracao(String valorEsperadoSubtracao) {
        String resultadoSubtracao = campoResultado.getText();
        Assert.assertEquals(valorEsperadoSubtracao, resultadoSubtracao.replace(" ", ""));
    }

    public void validarMultiplicacao(String valorEsperadoMultiplicao) {
        String resultadoMultiplicao = campoResultado.getText();
        Assert.assertEquals(valorEsperadoMultiplicao, resultadoMultiplicao.replace(" ", ""));
    }

    public void validarDivisao(String valorEsperadoDivisao) {
        String resultadoDivisao = campoResultado.getText();
        Assert.assertEquals(valorEsperadoDivisao, resultadoDivisao.replace(" ", ""));
    }

    public void validarDivisaoPorZero(String valorEsperadoDivisaoPorZero) {
        String resultadoDivisaoPorZero = campoResultado.getText();
        Assert.assertEquals(valorEsperadoDivisaoPorZero, resultadoDivisaoPorZero.replace(" ", ""));
    }


}
