package com.tsoft.bot.frontend.steps;

import com.tsoft.bot.frontend.pages.pages.WappePageAgente;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class WappeStepsAgente {

    private WappePageAgente wappePageAgente = new WappePageAgente();

    @And("^Se selecciona opcion todas las empresas y se ingresa empresa \"([^\"]*)\"$")
    public void seSeleccionaOpcionTodasLasEmpresas(String casoPrueba) throws Throwable {
        wappePageAgente.seleccionarTodasLasEmpresas(casoPrueba);
    }

    @Then("^Se selecciona la empresa buscada$")
    public void seSeleccionaLaEmpresaBuscada() throws Exception {
        wappePageAgente.seleccionarEmpresa();
    }

    @Then("^Se selecciona opcion productos$")
    public void seSeleccionaOpcionProductos() throws Exception {
        wappePageAgente.seleccionarProductos();
    }

    @Then("^Se selecciona tab dispositivos$")
    public void seSeleccionaTabDispositivos() throws Exception {
        wappePageAgente.seleccionarDispositivos();
    }

    @And("^Se realiza busqueda de producto\"([^\"]*)\"$")
    public void seRealizaBusquedaDeProducto(String casoPrueba) throws Throwable {
        wappePageAgente.busquedaProducto(casoPrueba);
    }

    @And("^Se limpia filtro de busqueda de producto$")
    public void seLimpiaFiltroDeBusquedaDeProducto() throws Exception {
        wappePageAgente.limpiarFiltroProducto();
    }

    @And("^Se filtra por estado en agente$")
    public void seFiltraPorEstadoEnAgente() throws Exception {
        wappePageAgente.filtrarPorEstado();
    }

    @And("^Se da clic en el boton limpiar estado$")
    public void seDaClicEnElBotonLimpiarEstado() throws Exception {
        wappePageAgente.limpiarFiltroEstado();
    }

    @And("^Se selecciona paginado a cincuenta en agente \"([^\"]*)\"$")
    public void seSeleccionaPaginadoACincuentaEnAgente(String casoPrueba) throws Throwable {
        wappePageAgente.seleccionarPaginado(casoPrueba);
    }

    @And("^Se valida avance de paginado boton$")
    public void seValidaAvanceDePaginadoBoton() throws Exception {
        wappePageAgente.avancePaginadoBoton();
    }

    @And("^Se ingresa numero de paginado en agente \"([^\"]*)\"$")
    public void seIngresaNumeroDePaginadoEnAgente(String casoPrueba) throws Throwable {
        wappePageAgente.ingresarNumeroPaginadoAgente(casoPrueba);
    }
}
