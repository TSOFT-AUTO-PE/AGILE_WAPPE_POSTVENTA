package com.tsoft.bot.frontend.pages.objects;

import org.openqa.selenium.By;

import java.awt.*;
import java.awt.event.KeyEvent;

public class WappePageObject {

    //LOGIN DESARROLLO
    //public static final By SELECCIONARDOCUMENTO           = By.xpath("/html/body/app-root/app-main/div/div/div/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div/mat-select/div/div[1]");
    //public static final By TXT_DOC                        = By.id("mat-input-0");
    //public static final By TXT_PASS                       = By.id("mat-input-1");
    //public static final By BTN_ACEPTAR                    = By.xpath("/html/body/app-root/app-main/div/div/div/div/div[2]/form/div[4]/button");

    //LOGIN CERTIFICACION
    public static final By TXT_DOC                        = By.xpath("//input[@placeholder='Nro de documento']");
    public static final By TXT_PASS                       = By.xpath("//input[@placeholder='Contraseña']");
    public static final By BTN_ACEPTAR                    = By.xpath("//button[text()='Ingresar ']");

    //CLIENTE DESARROLLO
//    public static final By BTN_OPCIONES                   = By.xpath("/html/body/app-root/app-select/header/app-header/nav/ul/li/ul[2]/li[2]/span[2]");
//    public static final By OPCION_EMPRESA                 = By.xpath("/html/body/app-root/app-select/header/app-header/nav/ul/li/ul[2]/li[2]/div/a[1]");
//    public static By FRAME_EMPRESA                        = By.xpath("/html/body/app-root/app-select/header/app-header/app-modal-aside-temporary/div/aside/div[2]/h3");
//    public static final By SELECCIONAR_EMPRESA            = By.xpath("/html/body/app-root/app-select/header/app-header/app-modal-aside-temporary/div/aside/div[2]/div/article[4]/figure/div[2]/figcaption");
//    public static final By SELECCIONAR_PRODUCTOS          = By.xpath("/html/body/app-root/app-home/div/app-sidebar-temporary/div[1]/nav/ul/li[2]/a");
//    public static final By SELECCIONAR_TAB_MOVILES        = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[1]/section/app-tab[1]/div/div[1]/span[2]");
//    public static final By LISTADO_PRODUCTOS_MOVILES      = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[1]/div/table/tbody/tr[1]/td[1]/span/span");
//    public static final By TEXT_PRODUCTO                  = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[1]/div/div[1]/app-search/div/input");
//    public static final By LISTADO_BUSQUEDA_PRODUCTO      = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[1]/div/table/tbody/tr/td[1]/span/span");
//    public static final By IMG_LIMPIAR_FILTRO             = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[1]/div/div[1]/app-search/div/img[2]");
//    public static final By IMG_FILTRAR_ESTADO             = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[1]/div/div[2]/img");
//    public static final By FILTRAR_ACTIVO                 = By.xpath("//*[@id='mat-checkbox-3']/label/div");
//    public static final By FILTRAR_SUSPENDIDO             = By.xpath("//*[@id='mat-checkbox-4']/label/div");
//    public static final By BTN_LIMPIAR                    = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/div/ul/li[2]/button");
//    public static final By PAGINADO                       = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div");
//    public static final By PAGINADO2                      = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div/div/ul/li[4]");
//    public static final By BTN_PAGINADO                   = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[2]");
//    public static final By BTN_PAGINADO2                  = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[1]/i");
//    public static final By TXT_PAGINADO                   = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/span[2]/input");

    //CLIENTE CERTIFICACION
    public static final By BTN_OPCIONES                   = By.xpath("/html/body/app-root/app-select/header/app-header/nav/ul/li/ul[2]/li[2]/span[2]");
    public static final By OPCION_EMPRESA                 = By.xpath("/html/body/app-root/app-select/header/app-header/nav/ul/li/ul[2]/li[2]/div/a[1]");
    public static final By FRAME_EMPRESA                  = By.xpath("/html/body/app-root/app-select/header/app-header/app-modal-aside-temporary/div/aside/div[2]/h3");
    public static final By SELECCIONAR_EMPRESA            = By.xpath("//figcaption[text()=' TELEFONICA DEL PERU SAA ']");
    public static final By SELECCIONAR_PRODUCTOS          = By.xpath("/html/body/app-root/app-home/div/app-sidebar-temporary/div[1]/nav/ul/li[2]/a");
    public static final By SELECCIONAR_TAB_MOVILES        = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[1]/section/app-tab[1]/div/div[1]/span[2]");
    public static final By LISTADO_PRODUCTOS_MOVILES      = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[1]/div/table/tbody/tr[1]/td[1]/span/span");
    public static final By TEXT_PRODUCTO                  = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[1]/div/div[1]/app-search/div/input");
    public static final By LISTADO_BUSQUEDA_PRODUCTO      = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[1]/div/table/tbody/tr/td[1]/span/span");
    public static final By IMG_LIMPIAR_FILTRO             = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[1]/div/div[1]/app-search/div/img[2]");
    public static final By IMG_FILTRAR_ESTADO             = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[1]/div/div[2]/img");
    public static final By FILTRAR_ACTIVO                 = By.xpath("//*[@id='mat-checkbox-3']/label/div");
    public static final By FILTRAR_SUSPENDIDO             = By.xpath("//*[@id='mat-checkbox-4']/label/div");
    public static final By BTN_LIMPIAR                    = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/div/ul/li[2]/button");
    public static final By PAGINADO                       = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div");
    public static final By PAGINADO2                      = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div/div/ul/li[4]");
    public static final By BTN_PAGINADO                   = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[2]");
    public static final By BTN_PAGINADO2                  = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[1]/i");
    public static final By TXT_PAGINADO                   = By.xpath("/html/body/app-root/app-module-services/app-main/div/div/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/span[2]/input");

    //AGENTE DESARROLLO
//    public static final By BTN_EMPRESAS                   = By.xpath("/html/body/app-root/app-main/div/div/app-company/div/div[1]/div[1]/app-toggle/span[2]");
//    public static final By LISTA_EMPRESAS                 = By.xpath("/html/body/app-root/app-main/div/div/app-company/div/div[3]/div/div/app-custom-table/div[1]/div/table/tbody/tr[1]/td[2]/span/div/div[1]/span/span[2]");
//    public static final By TXT_RAZON_SOCIAL               = By.xpath("//*[@placeholder='Buscar por Nro. de Doc / Razón Social']");
//    public static final By SELECT_EMPRESA                 = By.xpath("/html/body/app-root/app-main/div/div/app-company/div/div[3]/div/div/app-custom-table/div[1]/div/table/tbody/tr/td[2]/span/div/div[1]/span/span[2]");
//    public static final By OPCION_PRODUCTOS               = By.xpath("/html/body/app-root/app-detail/div/div/div/div[2]/span[5]");
//    public static final By TAB_MOVILES                    = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[1]/section/app-tab[1]/div/div[1]/span[2]");
//    public static final By LISTADO_PRODUCTO               = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[1]/div/table/tbody/tr[1]/td[1]/span/span");
//    public static final By IMG_ESPERAR                    = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[1]/div/mat-spinner/svg/circle");
//    public static final By TXT_BUSQUEDA_PRODUCTO          = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[1]/div/div[1]/app-search/div/input");
//    public static final By LISTA_BUSQUEDA_PRODUCTO        = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[1]/div/table/tbody/tr/td[1]/span/span");
//    public static final By IMG_BUSQUEDA_PRODUCTO          = By.xpath("//*[@class='img2 ng-star-inserted']");
//    public static final By IMG_FILTRO_ESTADO              = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[1]/div/div[2]/img");
//    public static final By CHECK_ESTADO_ACTIVO            = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/div/ul/li[1]/div[2]/div[1]/mat-checkbox/label/div");
//    public static final By BTN_LIMPIAR_ESTADO             = By.xpath("//button[text()='Limpiar']");
//    public static final By SELECT_PAGINADO                = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div");
//    public static final By SELECT_PAGINADO2               = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div/div/ul/li[4]");
//    public static final By BTN_PAGINADO_ADELANTE          = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[2]");
//    public static final By BTN_PAGINADO_ATRAS             = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[1]");
//    public static final By TXT_NRO_PAGINA                 = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/span[2]/input");


    //AGENTE CERTIFICACION
    public static final By BTN_EMPRESAS                   = By.xpath("/html/body/app-root/app-main/div/div/app-company/div/div[1]/div[1]/app-toggle/span[2]");
    public static final By LISTA_EMPRESAS                 = By.xpath("/html/body/app-root/app-main/div/div/app-company/div/div[3]/div/div/app-custom-table/div[1]/div/table/tbody/tr[1]/td[2]/span/div/div[1]/span/span[2]");
    public static final By TXT_RAZON_SOCIAL               = By.xpath("//*[@placeholder='Buscar por Nro. de Doc / Razón Social']");
    public static final By SELECT_EMPRESA                 = By.xpath("/html/body/app-root/app-main/div/div/app-company/div/div[3]/div/div/app-custom-table/div[1]/div/table/tbody/tr/td[2]/span/div/div[1]/span/span[2]");
    public static final By OPCION_PRODUCTOS               = By.xpath("/html/body/app-root/app-detail/div/div/div/div[2]/span[5]");
    public static final By TAB_MOVILES                    = By.xpath("//span[text()='Móviles activos']");
    public static final By LISTADO_PRODUCTO               = By.xpath("//span[text()='Productos']");
    public static final By IMG_ESPERAR                    = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[1]/div/mat-spinner/svg/circle");
    //public static final By TXT_BUSQUEDA_PRODUCTO          = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[1]/div/div[1]/app-search/div/input");
    public static final By TXT_BUSQUEDA_PRODUCTO          = By.xpath("//input[@placeholder='Buscar por línea o código de producto']");
    public static final By LISTA_BUSQUEDA_PRODUCTO        = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[1]/div/table/tbody/tr/td[1]/span/span");
    public static final By IMG_BUSQUEDA_PRODUCTO          = By.xpath("//*[@class='img2 ng-star-inserted']");
    public static final By IMG_FILTRO_ESTADO              = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[1]/div/div[2]/img");
    public static final By CHECK_ESTADO_ACTIVO            = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/div/ul/li[1]/div[2]/div[1]/mat-checkbox/label/div");
    public static final By BTN_LIMPIAR_ESTADO             = By.xpath("//button[text()='Limpiar']");
    public static final By SELECT_PAGINADO                = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div");
    public static final By SELECT_PAGINADO2               = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/div/div[2]/app-page-size/div/div/ul/li[4]");
    public static final By BTN_PAGINADO_ADELANTE          = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[2]");
    public static final By BTN_PAGINADO_ATRAS             = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/a[1]");
    public static final By TXT_NRO_PAGINA                 = By.xpath("/html/body/app-root/app-detail/div/div/div/div[7]/section[2]/app-list-services/section[2]/div/div/div/app-custom-table/div[2]/span[2]/input");



    public static final By BTN_ACEPTAR_CLIENTE            = By.xpath("//button[text()='Ingresar ']");
    public static final By BTN_CREAREMP                   = By.xpath("//a[text()=' Inicio ']");
    public static final By BTN_CREAREMP2                   = By.xpath("//a[text()=' Empresa ']");
    public static final By TXT_NUMDOC                     = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[1]/div/div[2]/div/mat-form-field/div/div[1]/div/input");
    public static final By BTN_VALIDAR                    = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[1]/div/div[3]/div/button");
    public static final By BTN_SI                         = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/app-modal-decision/div/div[2]/div[3]/button[1]");
    public static final By TXT_RAZONSOCIAL                = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[2]/div/div[1]/div/mat-form-field/div/div[1]/div/input");

    //Objetos de Lista Sector
    public static By ARROW1                         = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[3]/div/div[1]/div/mat-form-field/div/div[1]/div/mat-select");
    public static void CONSULTORIA() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void AUDITORIA() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void COMERCIO() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void COMUNICACIONES_TEC() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void FINANCIERO() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void INDUSTRIA() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void SECTOR_PUBLICO() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void SERVICIOS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void SERVICIOS_PUBLICOS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void TRANSPORTE() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void OTRTOS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    //Objetos Sub Sector
    public static By ARROW2                         = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[3]/div/div[2]/div/mat-form-field/div/div[1]/div/mat-select");
    public static void INFORMATICA() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void ALIMENTOS_BEBIDAS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void AUTOMOTORES_CAMIONES() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void CENTROS_COMERCIALES() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void COMBUSTIBLES_LUBRICANTES() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void DROGUERIAS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void OTROS_COMERCIOS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static void SUPERMERCADOS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static By NOMBRE_CALLE                   = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[4]/div[1]/div[2]/div/mat-form-field/div/div[1]/div/input");
    public static By NUMERO_CALLE                   = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[4]/div[1]/div[3]/div/mat-form-field/div/div[1]/div/input");

    public static By ARROW3                   = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[6]/div/div[1]/div/mat-form-field/div/div[1]/div/mat-select");
    public static void AMAZONAS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void ANCASH() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void APURIMAC() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void AREQUIPA() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void AYACUCHO() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static void LIMA() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static By ARROW4                      = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[6]/div/div[2]/div/mat-form-field/div/div[1]/div/mat-select");
    public static void LIMA_PROV() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
    public static By ARROW5                       = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[6]/div/div[3]/div/mat-form-field/div/div[1]/div/mat-select");
    public static void LIMA_DIS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static By RAD_NEGOCIO                    = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[10]/div/div/div/mat-radio-group/mat-radio-button[1]");
    public static By RAD_EMPRESA                    = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[10]/div/div/div/mat-radio-group/mat-radio-button[2]");

    public static By ARROW6                         = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[11]/div[1]/div[1]/div/mat-form-field/div/div[1]/div/mat-select");
    public static void EMPRESAS_ORO() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static By ARROW7                         = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[2]/div/div[11]/div[1]/div[2]/div/mat-form-field/div/div[1]/div/mat-select");
    public static void ENMODELOASIS() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.delay(100);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(200);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    public static By BTN_CREAR                  = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/div/div/form/div[3]/div/button[1]");
    public static By BTN_CONFIRMAR              = By.xpath("/html/body/app-dialog/div/div/app-modal-enterprise/app-modal-confirm/div/div[2]/div[3]/button[1]");
    public static By TXT_BUSCAR                 = By.xpath("/html/body/app-root/app-main/div/div/div/div[2]/div/div/div[1]/div[1]/app-search/div/input");









}
