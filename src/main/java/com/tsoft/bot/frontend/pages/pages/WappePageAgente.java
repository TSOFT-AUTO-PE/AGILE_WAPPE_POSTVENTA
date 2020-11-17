package com.tsoft.bot.frontend.pages.pages;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.List;

import static com.tsoft.bot.frontend.pages.objects.ExcelDataObjects.*;
import static com.tsoft.bot.frontend.pages.objects.WappePageObject.*;


public class WappePageAgente extends BaseClass {

    private static GenerateWord generateWord = new GenerateWord();
    private WebDriver driver;

    public WappePageAgente() {
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, WAPPE_WEB2);
    }

    public void seleccionarTodasLasEmpresas(String casoPrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoPrueba) - 1;
            String empresa = getData().get(wappe).get(COLUMNA_EMPRESA);
            click(driver, BTN_EMPRESAS);
            sleep(10000);
            if (driver.findElement(LISTA_EMPRESAS).isDisplayed())
            {
                click(driver, TXT_RAZON_SOCIAL);
                typeText(driver, TXT_RAZON_SOCIAL, empresa);
                sleep(10000);
                stepPass(driver, "Se busca la empresa: " + empresa);
                System.out.println("[LOG] Se busca la empresa: " + empresa);
                generateWord.sendText("Se busca la empresa: " + empresa);
                generateWord.addImageToWord(driver);
            }
            else
            {
                stepFail(driver, "Error - no se ha listado todas las empresas");
                System.out.println("[LOG] Error - no se ha listado todas las empresas");
                generateWord.sendText("Error - no se ha listado todas las empresas");
                generateWord.addImageToWord(driver);
            }
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seleccionarEmpresa() throws Exception {
        try {
            if (driver.findElement(SELECT_EMPRESA).isDisplayed()){
                stepPass(driver, "Se selecciona la empresa buscada");
                System.out.println("[LOG] Se selecciona la empresa buscada");
                generateWord.sendText("Se selecciona la empresa buscada");
                generateWord.addImageToWord(driver);
                click(driver, SELECT_EMPRESA);
            }
            else {
                stepFail(driver, "No se encontró la empresa ingresada");
                System.out.println("[LOG] No se encontró la empresa ingresada");
                generateWord.sendText("No se encontró la empresa ingresada");
                generateWord.addImageToWord(driver);
            }
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void seleccionarProductos() throws Exception {
        try {
            if (driver.findElement(OPCION_PRODUCTOS).isDisplayed())
            {
                click(driver, OPCION_PRODUCTOS);
                sleep(15000);
                stepPass(driver, "Se selecciona la opción Productos");
                System.out.println("[LOG] Se selecciona la opción Productos");
                generateWord.sendText("Se selecciona la opción Productos");
                generateWord.addImageToWord(driver);
            }
            else {
                stepPass(driver, "No se ha seleccionado la opción Productos");
                System.out.println("[LOG] No se ha seleccionado la opción Productos");
                generateWord.sendText("No se ha seleccionado la opción Productos");
                generateWord.addImageToWord(driver);
            }
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seleccionarDispositivos() throws Exception {
        try {
            sleep(10000);
            click(driver, TAB_MOVILES);
            scroll(driver,0, 400);
            sleep(10000);
            if (driver.findElement(LISTADO_PRODUCTO).isDisplayed())
            {
                stepPass(driver, "Se selecciona la opción tab móviles y lista los productos móviles");
                System.out.println("[LOG] Se selecciona la opción tab móviles y lista los productos móviles");
                generateWord.sendText("Se selecciona la opción tab móviles y lista los productos móviles");
                generateWord.addImageToWord(driver);
            }else {
                stepFail(driver, "No lista los productos móviles");
                System.out.println("[LOG] No lista los productos móviles");
                generateWord.sendText("No lista los productos móviles");
                generateWord.addImageToWord(driver);
            }
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void busquedaProducto(String casoPrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoPrueba) - 1;
            String nroMovil = getData().get(wappe).get(COLUMNA_NRO_MOVIL);
            typeText(driver, TXT_BUSQUEDA_PRODUCTO, nroMovil);
            sleep(5000);
            if (driver.findElement(LISTA_BUSQUEDA_PRODUCTO).isDisplayed())
            {
                stepPass(driver, "Se valida la busqueda de producto");
                System.out.println("[LOG] Se valida la busqueda de producto");
                generateWord.sendText("Se valida la busqueda de producto");
                generateWord.addImageToWord(driver);
            }else {
                stepFail(driver, "No lista el movil buscado");
                System.out.println("[LOG] No lista el movil buscado");
                generateWord.sendText("No lista el movil buscado");
                generateWord.addImageToWord(driver);
            }
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void limpiarFiltroProducto() throws Exception {
        try {
            click(driver, IMG_BUSQUEDA_PRODUCTO);
            sleep(10000);
            if (driver.findElement(TXT_RAZON_SOCIAL).getText().equals("")){
                stepPass(driver, "Se valida la limpieza del filtro");
                System.out.println("[LOG] Se valida la limpieza del filtro");
                generateWord.sendText("Se valida la limpieza del filtro");
                generateWord.addImageToWord(driver);
            }else {
                stepPass(driver, "No se ha limpiado el filtro");
                System.out.println("[LOG] No se ha limpiado el filtro");
                generateWord.sendText("No se ha limpiado el filtro");
                generateWord.addImageToWord(driver);
            }
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void filtrarPorEstado() throws Exception {
        try {
            click(driver, IMG_FILTRO_ESTADO);
            if (driver.findElement(CHECK_ESTADO_ACTIVO).isDisplayed()){
                click(driver, CHECK_ESTADO_ACTIVO);
                sleep(10000);
                scroll(driver, 0, 200);
                stepPass(driver, "Se filtra por estado activo");
                System.out.println("[LOG] Se filtra por estado activo");
                generateWord.sendText("Se filtra por estado activo");
                generateWord.addImageToWord(driver);
            }else {
                stepFail(driver, "No se ha filtrado por estado activo");
                System.out.println("[LOG] No se ha filtrado por estado activo");
                generateWord.sendText("No se ha filtrado por estado activo");
                generateWord.addImageToWord(driver);
            }
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void limpiarFiltroEstado() throws Exception {
        try {
            click(driver, BTN_LIMPIAR_ESTADO);
            sleep(5000);
            if (driver.findElement(CHECK_ESTADO_ACTIVO).isSelected()){
                stepFail(driver, "No ha limpiado el filtro de estado activo");
                System.out.println("[LOG] No ha limpiado el filtro de estado activo");
                generateWord.sendText("No ha limpiado el filtro de estado activo");
                generateWord.addImageToWord(driver);
            }
            else {
                scroll(driver, 0, 100);
                stepPass(driver, "Se ha limpiado el filtro de estado activo");
                System.out.println("[LOG] Se ha limpiado el filtro de estado activo");
                generateWord.sendText("Se ha limpiado el filtro de estado activo");
                generateWord.addImageToWord(driver);
            }
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void seleccionarPaginado(String casoPrueba) throws Exception {
        try {
            click(driver, SELECT_PAGINADO);
            sleep(1000);
            click(driver, SELECT_PAGINADO2);
            stepPass(driver, "Se selecciona paginado de 50 por página");
            System.out.println("[LOG] Se selecciona paginado de 50 por página");
            generateWord.sendText("Se selecciona paginado de 50 por página");
            generateWord.addImageToWord(driver);
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void avancePaginadoBoton() throws Exception {
        try {
            if (driver.findElement(BTN_PAGINADO_ADELANTE).isEnabled()){
                click(driver, BTN_PAGINADO_ADELANTE);
                sleep(10000);
                stepPass(driver, "Se ha avanzado en el paginado");
                System.out.println("[LOG] Se ha avanzado en el paginado");
                generateWord.sendText("Se ha avanzado en el paginado");
                generateWord.addImageToWord(driver);
            }else if(driver.findElement(BTN_PAGINADO_ATRAS).isEnabled()){
                click(driver, BTN_PAGINADO_ATRAS);
                stepPass(driver, "Se ha avanzado en el paginado");
                System.out.println("[LOG] Se ha avanzado en el paginado");
                generateWord.sendText("Se ha avanzado en el paginado");
                generateWord.addImageToWord(driver);
            }
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void ingresarNumeroPaginadoAgente(String casoPrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoPrueba) - 1;
            String nroPaginado = getData().get(wappe).get(COLUMNA_NRO_PAGINADO);
            scroll(driver, 0, 1000);
            clear(driver, TXT_NRO_PAGINA);
            typeText(driver, TXT_NRO_PAGINA, nroPaginado);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_ENTER);
            sleep(10000);
            stepPass(driver, "Se ha ingresado la pagina " + nroPaginado);
            System.out.println("[LOG] Se ha ingresado la pagina " + nroPaginado);
            generateWord.sendText("Se ha ingresado la pagina " + nroPaginado);
            generateWord.addImageToWord(driver);
        }catch (Exception we){
            casoFallido(we);
        }
    }

    private void casoFallido(Exception we) throws Exception {
        ExcelReader.writeCellValue(EXCEL_WEB, WAPPE_WEB, 1, 25, "FAIL");
        stepFail(driver, "Fallo el caso de prueba : " + we.getMessage());
        System.out.println("[LOG] Fallo el caso de prueba : " + we.getMessage());
        generateWord.sendText("Tiempo de espera ha excedido");
        generateWord.addImageToWord(driver);
    }

}

