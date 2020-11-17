package com.tsoft.bot.frontend.steps;

import com.tsoft.bot.frontend.pages.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();

    @Given("^Se ingresa a la url de Wappe cliente \"([^\"]*)\"$")
    public void seIngresaALaUrlDeWappeCliente(String casoPrueba) throws Throwable {
        loginPage.ingresarUrlWappeCliente(casoPrueba);
    }

    @When("^Se ingresan las credenciales y clic en ingresar \"([^\"]*)\"$")
    public void seIngresanLasCredencialesYClicEnIngresar(String casoPrueba) throws Throwable {
        loginPage.ingresarCredenciales(casoPrueba);
    }

    @Then("^Se valida el ingreso correcto a Wappe$")
    public void seValidaElIngresoCorrectoAWappe() throws Exception {
        loginPage.validarCredenciales();
    }

    @Given("^Se ingresa a la url de Wappe agente \"([^\"]*)\"$")
    public void seIngresaALaUrlDeWappeAgente(String casoPrueba) throws Throwable {
        loginPage.ingresarUrlWappeAgente(casoPrueba);
    }

    @When("^Se ingresan las credenciales de agente y clic en ingresar \"([^\"]*)\"$")
    public void seIngresanLasCredencialesDeAgenteYClicEnIngresar(String casoPrueba) throws Throwable {
        loginPage.ingresarCredencialesAgente(casoPrueba);
    }

    @Then("^Se valida el ingreso correcto a Wappe de agente$")
    public void seValidaElIngresoCorrectoAWappeDeAgente() throws Exception {
        loginPage.validarCredencialesAgente();
    }
}
