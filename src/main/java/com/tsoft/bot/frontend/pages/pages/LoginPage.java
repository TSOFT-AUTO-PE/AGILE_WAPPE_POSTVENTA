package com.tsoft.bot.frontend.pages.pages;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.opencv.imgproc.CLAHE;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static com.tsoft.bot.frontend.pages.objects.ExcelDataObjects.*;
import static com.tsoft.bot.frontend.pages.objects.WappePageObject.*;


public class LoginPage extends BaseClass {

    private static GenerateWord generateWord = new GenerateWord();
    private WebDriver driver;

    public LoginPage() {
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, WAPPE_WEB);
    }

    private List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, WAPPE_WEB2);
    }

    public void ingresarUrlWappeCliente(String casoDePrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String url = getData().get(wappe).get(COLUMNA_URL);
            driver.get(url);
            stepPass(driver, "Se inició correctamente la página del Cliente");
            System.out.println("[LOG] Se inició correctamente la página del Cliente");
            generateWord.sendText("Se inició correctamente la página del Cliente");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void ingresarCredenciales(String casoDePrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String doc = getData().get(wappe).get(COLUMNA_DOCUMENTO);
            String pass = getData().get(wappe).get(COLUMNA_PASSWORD);
            typeText(driver, TXT_DOC, doc);
            typeText(driver, TXT_PASS, pass);
            stepPass(driver, "Se ingresa el documento: " + doc + " Contraseña: " + pass + " y clic en el botón Ingresar");
            System.out.println("[LOG] Se ingresa el documento: " + doc + " Contraseña: " + pass + " y clic en el botón Ingresar");
            generateWord.sendText("Se ingresa el documento: " + doc + " Contraseña: " + pass + " y clic en el botón Ingresar");
            generateWord.addImageToWord(driver);
            click(driver, BTN_ACEPTAR);
            sleep(10000);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void validarCredenciales() throws Exception {
        try {
            if (driver.findElement(BTN_OPCIONES).isDisplayed())
            {
                stepPass(driver, "Se verifica el login correcto");
                System.out.println("[LOG] Se verifica el login correcto");
                generateWord.sendText("Se verifica el login correcto");
                generateWord.addImageToWord(driver);
            }
            else {
                stepFail(driver, "Error en inicio de sesión");
                System.out.println("[LOG] Error en inicio de sesión");
                generateWord.sendText("Error en inicio de sesión");
                generateWord.addImageToWord(driver);
            }
        }catch (Exception we){
            casoFallido(we);
        }
    }

    public void ingresarUrlWappeAgente(String casoDePrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String url = getData1().get(wappe).get(COLUMNA_URL);
            driver.get(url);
            stepPass(driver, "Se inició correctamente la página del Agente");
            System.out.println("[LOG] Se inició correctamente la página del Agente");
            generateWord.sendText("Se inició correctamente la página del Agente");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void ingresarCredencialesAgente(String casoDePrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String doc = getData1().get(wappe).get(COLUMNA_DOCUMENTO);
            String pass = getData1().get(wappe).get(COLUMNA_PASSWORD);
            typeText(driver, TXT_DOC, doc);
            typeText(driver, TXT_PASS, pass);
            stepPass(driver, "Se ingresa el documento: " + doc + " Contraseña: " + pass + " y clic en el botón Ingresar");
            System.out.println("[LOG] Se ingresa el documento: " + doc + " Contraseña: " + pass + " y clic en el botón Ingresar");
            generateWord.sendText("Se ingresa el documento: " + doc + " Contraseña: " + pass + " y clic en el botón Ingresar");
            generateWord.addImageToWord(driver);
            click(driver, BTN_ACEPTAR);
            sleep(10000);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void validarCredencialesAgente() throws Exception {
        try {
            if (driver.findElement(BTN_EMPRESAS).isDisplayed())
            {
                stepPass(driver, "Se verifica el login correcto");
                System.out.println("[LOG] Se verifica el login correcto");
                generateWord.sendText("Se verifica el login correcto");
                generateWord.addImageToWord(driver);
            }
            else {
                stepFail(driver, "Error en inicio de sesión");
                System.out.println("[LOG] Error en inicio de sesión");
                generateWord.sendText("Error en inicio de sesión");
                generateWord.addImageToWord(driver);
            }
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

