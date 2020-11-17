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

import static com.tsoft.bot.frontend.pages.objects.WappePageObject.*;
import static com.tsoft.bot.frontend.pages.objects.ExcelDataObjects.*;


public class WappePageCliente extends BaseClass {

    private static GenerateWord generateWord = new GenerateWord();
    private WebDriver driver;

    public WappePageCliente() {
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, WAPPE_WEB);
    }

    public void seleccionarEmpresa() throws Throwable {
        try {
            click(driver, BTN_OPCIONES);
            click(driver, OPCION_EMPRESA);
            click(driver, FRAME_EMPRESA);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            robot.keyPress(KeyEvent.VK_PAGE_DOWN);
            String valor;
            valor = getText(driver, SELECCIONAR_EMPRESA);
            System.out.println("[LOG] El texto es: " + valor);
            click(driver, SELECCIONAR_EMPRESA);
            sleep(5000);
            stepPass(driver, "Se selecciona empresa");
            System.out.println("[LOG] Se selecciona empresa");
            generateWord.sendText("Se selecciona empresa");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seleccionarMisProductos() throws Exception {
        try {
            click(driver, SELECCIONAR_PRODUCTOS);
            sleep(10000);
            stepPass(driver, "Se selecciona la opción Productos");
            System.out.println("[LOG] Se selecciona la opción Productos");
            generateWord.sendText("Se selecciona la opción Productos");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seleccionarDispositivos() throws Exception {
        try {
            sleep(10000);
            click(driver, SELECCIONAR_TAB_MOVILES);
            sleep(10000);
            if (driver.findElement(LISTADO_PRODUCTOS_MOVILES).isDisplayed())
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

    public void realizarBusquedaMovil(String casoPrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoPrueba) - 1;
            String nroMovil = getData().get(wappe).get(COLUMNA_NRO_MOVIL);
            typeText(driver, TEXT_PRODUCTO, nroMovil);
            sleep(5000);
            if (driver.findElement(LISTADO_BUSQUEDA_PRODUCTO).isDisplayed())
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

    public void limpiarFiltro() throws Exception {
        try {
            click(driver, IMG_LIMPIAR_FILTRO);
            sleep(5000);
            if (driver.findElement(TEXT_PRODUCTO).getText().equals("")){
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

    public void filtrarEstado() throws Exception {
        try {
            click(driver, IMG_FILTRAR_ESTADO);
            if (driver.findElement(FILTRAR_ACTIVO).isDisplayed()){
                click(driver, FILTRAR_ACTIVO);
                sleep(10000);
                scroll(driver, 0, 100);
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
            click(driver, BTN_LIMPIAR);
            sleep(5000);
            if (driver.findElement(FILTRAR_ACTIVO).isSelected()){
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

    public void paginado(String casoPrueba) throws Exception {
        try {
            click(driver, PAGINADO);
            sleep(1000);
            click(driver, PAGINADO2);
            System.out.println("[LOG] Se selecciona paginado de 50 por página");
            stepPass(driver, "Se selecciona paginado de 50 por página");
            generateWord.sendText("Se selecciona paginado de 50 por página");
            generateWord.addImageToWord(driver);
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void validarAvancePaginado() throws Exception {
        try {
            if (driver.findElement(BTN_PAGINADO).isEnabled()){
                click(driver, BTN_PAGINADO);
                sleep(10000);
                stepPass(driver, "Se ha avanzado en el paginado");
                System.out.println("[LOG] Se ha avanzado en el paginado");
                generateWord.sendText("Se ha avanzado en el paginado");
                generateWord.addImageToWord(driver);
            }else if(driver.findElement(BTN_PAGINADO2).isEnabled()){
                click(driver, BTN_PAGINADO2);
                stepPass(driver, "Se ha avanzado en el paginado");
                System.out.println("[LOG] Se ha avanzado en el paginado");
                generateWord.sendText("Se ha avanzado en el paginado");
                generateWord.addImageToWord(driver);
            }
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void ingresarNumeroPaginado(String casoPrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoPrueba) - 1;
            String nroPaginado = getData().get(wappe).get(COLUMNA_NRO_PAGINADO);
            scroll(driver, 0, 1000);
            clear(driver, TXT_PAGINADO);
            typeText(driver, TXT_PAGINADO, nroPaginado);
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

