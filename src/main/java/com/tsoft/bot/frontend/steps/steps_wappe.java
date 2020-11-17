package com.tsoft.bot.frontend.steps;

import com.tsoft.bot.frontend.pages.pages.stepsWappePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps_wappe {

    private stepsWappePage stepsWappe = new stepsWappePage();

    @Given("^Ingreso a la url de wappe agente \"([^\"]*)\"$")
    public void ingresoALaUrlDeWappeAgente(String casoDePrueba) throws Throwable {
        stepsWappe.ingresoALaUrlDeWappeAgente(casoDePrueba);
    }

    @When("^Ingreso el numero de DNI \"([^\"]*)\"$")
    public void ingresoElNumeroDeDNI(String casoDePrueba) throws Throwable {
        stepsWappe.ingresoElNumeroDeDNI(casoDePrueba);
    }

    @And("^Ingreso La contraseña \"([^\"]*)\"$")
    public void ingresoLaContraseña(String casoDePrueba) throws Throwable {
        stepsWappe.ingresoLaContraseña(casoDePrueba);
    }

    @Then("^se da clic en el boton INGRESAR$")
    public void seDaClicEnElBotonINGRESAR() throws Exception {
        stepsWappe.seDaClicEnElBotonINGRESAR();
    }

    @And("^se valida el ingreso correcto$")
    public void seValidaElIngresoCorrecto() throws Exception {
        stepsWappe.seValidaElIngresoCorrecto();
    }

    @Given("^Se realiza el login a la web Wappe \"([^\"]*)\" con el usaurio \"([^\"]*)\" y la clave \"([^\"]*)\"$")
    public void seRealizaElLoginALaWebWappeConElUsaurioYLaClave(String casoDePrueba, String casoDePrueba1, String casoDePrueba2) throws Throwable {
        stepsWappe.seRealizaElLoginALaWebWappeConElUsaurioYLaClave(casoDePrueba, casoDePrueba1, casoDePrueba2);
    }

    @When("^se selecciona Crear Empresa, se ingresa RUC \"([^\"]*)\" y se da click en validar$")
    public void seSeleccionaCrearEmpresaSeIngresaRUCYSeDaClickEnValidar(String casoDePrueba) throws Throwable {
        stepsWappe.seSeleccionaCrearEmpresaSeIngresaRUCYSeDaClickEnValidar(casoDePrueba);
    }

    @And("^se ingresa los datos obligatorios de la empresa : Razon social \"([^\"]*)\", sector \"([^\"]*)\", sub sector \"([^\"]*)\", nombre avenida \"([^\"]*)\", numero \"([^\"]*)\",$")
    public void seIngresaLosDatosObligatoriosDeLaEmpresaRazonSocialSectorSubSectorNombreAvenidaNumero(String casoDePrueba, String casoDePrueba1, String casoDePrueba2, String casoDePrueba3, String casoDePrueba4) throws Throwable {
        stepsWappe.seIngresaLosDatosObligatoriosDeLaEmpresaRazonSocialSectorSubSectorNombreAvenidaNumero(casoDePrueba, casoDePrueba1, casoDePrueba2, casoDePrueba3, casoDePrueba4);
        }

    @And("^se ingresa el departamento \"([^\"]*)\", la provincia \"([^\"]*)\" y el  distrito \"([^\"]*)\"$")
    public void seIngresaElDepartamentoLaProvinciaYElDistrito(String casoDePrueba, String casoDePrueba1, String casoDePrueba2) throws Throwable {
        stepsWappe.seIngresaElDepartamentoLaProvinciaYElDistrito(casoDePrueba, casoDePrueba1, casoDePrueba2);
    }

    @And("^se asigna el tipo de cliente \"([^\"]*)\" , se selecciona el subtipo \"([^\"]*)\" y grupo de atención \"([^\"]*)\"$")
    public void seAsignaElTipoDeClienteSeSeleccionaElSubtipoYGrupoDeAtención(String casoDePrueba, String casoDePrueba1, String casoDePrueba2) throws Throwable {
        stepsWappe.seAsignaElTipoDeClienteSeSeleccionaElSubtipoYGrupoDeAtención(casoDePrueba, casoDePrueba1, casoDePrueba2);
    }

    @And("^Se da click en el botón Crear$")
    public void seDaClickEnElBotónCrear() throws Exception {
        stepsWappe.seDaClickEnElBotónCrear();
    }

    @Then("^se confirma la creación del cliente \"([^\"]*)\"$")
    public void seConfirmaLaCreaciónDelCliente(String casoDePrueba) throws Throwable {
        stepsWappe.seConfirmaLaCreaciónDelCliente(casoDePrueba);
    }
}

