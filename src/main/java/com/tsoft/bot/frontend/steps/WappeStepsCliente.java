package com.tsoft.bot.frontend.steps;

import cucumber.api.java.en.And;
import com.tsoft.bot.frontend.pages.pages.WappePageCliente;
import cucumber.api.java.en.Then;

public class WappeStepsCliente {

    private WappePageCliente wappePageCliente = new WappePageCliente();

    @And("^Se selecciona empresa telefonica$")
    public void seSeleccionaEmpresaTelefonica() throws Throwable {
        wappePageCliente.seleccionarEmpresa();
    }


    @Then("^Se selecciona menu Mis Productos$")
    public void seSeleccionaMenuMisProductos() throws Exception {
        wappePageCliente.seleccionarMisProductos();
    }


    @Then("^Se selecciona dispositivos$")
    public void seSeleccionaDispositivos() throws Exception {
        wappePageCliente.seleccionarDispositivos();
    }

    @And("^Se realiza busqueda de movil \"([^\"]*)\"$")
    public void seRealizaBusquedaDeMovil(String CasoPrueba) throws Throwable {
        wappePageCliente.realizarBusquedaMovil(CasoPrueba);
    }

    @And("^Se limpia filtro$")
    public void seLimpiaFiltro() throws Exception {
        wappePageCliente.limpiarFiltro();
    }

    @And("^Se filtra por estado$")
    public void seFiltraPorEstado() throws Exception {
        wappePageCliente.filtrarEstado();
    }

    @And("^Se da clic en el boton limpiar$")
    public void seDaClicEnElBotonLimpiar() throws Exception {
        wappePageCliente.limpiarFiltroEstado();
    }

    @And("^Se selecciona paginado a cincuenta \"([^\"]*)\"$")
    public void seSeleccionaPaginadoACincuenta(String CasoPrueba) throws Throwable {
        wappePageCliente.paginado(CasoPrueba);
    }

    @And("^Se valida avance de paginado$")
    public void seValidaAvanceDePaginado() throws Exception {
        wappePageCliente.validarAvancePaginado();
    }

    @And("^Se ingresa numero de paginado \"([^\"]*)\"$")
    public void seIngresaNumeroDePaginado(String CasoPrueba) throws Throwable {
        wappePageCliente.ingresarNumeroPaginado(CasoPrueba);
    }
}
