package com.tsoft.bot.frontend.pages.pages;

import com.tsoft.bot.frontend.base.BaseClass;
import com.tsoft.bot.frontend.helpers.Hook;
import com.tsoft.bot.frontend.utility.ExcelReader;
import com.tsoft.bot.frontend.utility.GenerateWord;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.util.HashMap;
import java.util.List;

import static com.tsoft.bot.frontend.pages.objects.ExcelDataObjects.*;
import static com.tsoft.bot.frontend.pages.objects.WappePageObject.*;


public class stepsWappePage extends BaseClass {

    private static GenerateWord generateWord = new GenerateWord();
    private WebDriver driver;

    public stepsWappePage() {
        this.driver = Hook.getDriver();
    }

    private List<HashMap<String, String>> getData() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, WAPPE_WEB3);
    }

    private List<HashMap<String, String>> getData1() throws Throwable {
        return ExcelReader.data(EXCEL_WEB, WAPPE_WEB1);
    }

    public void ingresoALaUrlDeWappeAgente(String casoDePrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String url = getData().get(wappe).get(COLUMNA_URL);
            driver.get(url);
            stepPass(driver, "Se inició correctamente la página del Agente");
            System.out.println("Se inició correctamente la página del Agente");
            generateWord.sendText("Se inició correctamente la página del Agente");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void ingresoElNumeroDeDNI(String casoDePrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String doc = getData().get(wappe).get(COLUMNA_DOCUMENTO);
            System.out.println("columna documento es: " + doc);
            typeText(driver, TXT_DOC, doc);
            stepPass(driver, "Se ingresa el documento: "+doc);
            System.out.println("Se ingresa el documento: "+doc);
            generateWord.sendText("Se ingresa el documento: "+doc);
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void ingresoLaContraseña(String casoDePrueba) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String pass = getData().get(wappe).get(COLUMNA_PASSWORD);
            typeText(driver, TXT_PASS, pass);
            stepPass(driver, "Se ingresa la contraseña: "+pass);
            System.out.println("Se ingresa la contraseña: "+pass);
            generateWord.sendText("Se ingresa la contraseña: "+pass);
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seDaClicEnElBotonINGRESAR() throws Exception {
        try {
            click(driver, BTN_ACEPTAR_CLIENTE);
            sleep(10000);
            stepPass(driver, "Se da click en el botón Aceptar");
            System.out.println("Se da click en el botón Aceptar");
            generateWord.sendText("Se da click en el botón Aceptar");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seValidaElIngresoCorrecto() throws Exception {
        try {
            driver.findElement(BTN_CREAREMP).isDisplayed();
            stepPass(driver, "Se verifica el login correcto");
            System.out.println("Se verifica el login correcto");
            generateWord.sendText("Se verifica el login correcto");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seRealizaElLoginALaWebWappeConElUsaurioYLaClave(String casoDePrueba, String casoDePrueba1, String casoDePrueba2) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String url = getData1().get(wappe).get(COLUMNA_URL);
            driver.get(url);
            stepPass(driver, "Se inició correctamente la página del Agente");
            System.out.println("Se inició correctamente la página del Agente");
            generateWord.sendText("Se inició correctamente la página del Agente");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            int wappe = Integer.parseInt(casoDePrueba1) - 1;
            String doc = getData1().get(wappe).get(COLUMNA_DOCUMENTO);
            typeText(driver, TXT_DOC, doc);
            stepPass(driver, "Se ingresa el documento: "+doc);
            System.out.println("Se ingresa el documento: "+doc);
            generateWord.sendText("Se ingresa el documento: "+doc);
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            int wappe = Integer.parseInt(casoDePrueba2) - 1;
            String pass = getData1().get(wappe).get(COLUMNA_PASSWORD);
            typeText(driver, TXT_PASS, pass);
            stepPass(driver, "Se ingresa la contraseña: "+pass);
            System.out.println("Se ingresa la contraseña: "+pass);
            generateWord.sendText("Se ingresa la contraseña: "+pass);
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            stepPass(driver, "Se da click en el botón Aceptar");
            System.out.println("Se da click en el botón Aceptar");
            generateWord.sendText("Se da click en el botón Aceptar");
            generateWord.addImageToWord(driver);
            click(driver, BTN_ACEPTAR_CLIENTE);
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            driver.findElement(BTN_CREAREMP2).isDisplayed();
            stepPass(driver, "Se verifica el login correcto");
            System.out.println("Se verifica el login correcto");
            generateWord.sendText("Se verifica el login correcto");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seSeleccionaCrearEmpresaSeIngresaRUCYSeDaClickEnValidar(String casoDePrueba) throws Throwable {
        try {
            click(driver, BTN_CREAREMP);
            stepPass(driver, "Se da click en el botón Crear Empreesa");
            System.out.println("Se da click en el botón Crear Empreesa");
            generateWord.sendText("Se da click en el botón Crear Empreesa");
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String ruc = getData1().get(wappe).get(COLUMNA_RUC);
            typeText(driver, TXT_NUMDOC, ruc);
            stepPass(driver, "Se ingresa el RUC: "+ruc);
            System.out.println("Se ingresa el RUC: "+ruc);
            generateWord.sendText("Se ingresa el RUC: "+ruc);
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            click(driver, BTN_VALIDAR);
            stepPass(driver, "Se da click en el botón Validar");
            System.out.println("Se da click en el botón Validar");
            generateWord.sendText("Se da click en el botón Validar");
            generateWord.addImageToWord(driver);
            Thread.sleep(5000);
            if(driver.findElement(BTN_SI).isDisplayed()){
                ExcelReader.writeCellValue(EXCEL_WEB, WAPPE_WEB1, 1, 20, "FAIL");
                stepFail(driver, "Fallo el caso de prueba : EL RUC YA EXISTE, INTENTAR CON OTRO");
                System.out.println("Fallo el caso de prueba : EL RUC YA EXISTE, INTENTAR CON OTRO");
                generateWord.sendText("Fallo el caso de prueba : EL RUC YA EXISTE, INTENTAR CON OTRO");
                generateWord.addImageToWord(driver);
                driver.close();
            }
        } catch (Exception we) {
            casoFallido(we);
        }



    }

    public void seIngresaLosDatosObligatoriosDeLaEmpresaRazonSocialSectorSubSectorNombreAvenidaNumero(String casoDePrueba, String casoDePrueba1, String casoDePrueba2, String casoDePrueba3, String casoDePrueba4) throws Throwable {
        try {
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String razonsocial = getData1().get(wappe).get(COLUMNA_RAZONSOCIAL);
            typeText(driver, TXT_RAZONSOCIAL, razonsocial);
            stepPass(driver, "Se ingresa la razón social: " + razonsocial);
            System.out.println("Se ingresa la razón social: " + razonsocial);
            generateWord.sendText("Se ingresa la razón social: " + razonsocial);
            generateWord.addImageToWord(driver);
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            sleep(3000);
            click(driver, ARROW1);
            sleep(2000);
            int wappe = Integer.parseInt(casoDePrueba1) - 1;
            String sector = getData1().get(wappe).get(COLUMNA_SECTOR);
            switch (sector) {
                case "CONSULTORIA":
                    CONSULTORIA();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "AUDITORIA":
                    AUDITORIA();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "COMERCIO":
                    COMERCIO();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "COMUNICACIONES Y TECNOLOGIA":
                    COMUNICACIONES_TEC();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "FINANCIERO":
                    FINANCIERO();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "INDUSTRIA":
                    INDUSTRIA();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "SECTOR PUBLICO":
                    SECTOR_PUBLICO();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "SERVICIOS":
                    SERVICIOS();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "SERVICIOS PUBLICOS":
                    SERVICIOS_PUBLICOS();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "TRANSPORTE":
                    TRANSPORTE();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
                case "OTROS":
                    OTRTOS();
                    stepPass(driver, "Se ingresa el Sector: " + sector);
                    System.out.println("Se ingresa el Sector: " + sector);
                    generateWord.sendText("Se ingresa el Sector: " + sector);
                    generateWord.addImageToWord(driver);
                    break;
            }
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            click(driver, ARROW2);
            sleep(2000);
            int wappe = Integer.parseInt(casoDePrueba2) - 1;
            String subsector = getData1().get(wappe).get(COLUMNA_SUBSECTOR);
            Robot robot = new Robot();
            switch (subsector) {
                case "INFORMATICA":
                    INFORMATICA();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;
                case "ALIMENTOS Y BEBIDAS":
                    ALIMENTOS_BEBIDAS();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;
                case "AUTOMOTORES Y CAMIONES":
                    AUTOMOTORES_CAMIONES();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;
                case "CENTROS COMERCIALES":
                    CENTROS_COMERCIALES();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;
                case "COMBUSTIBLE Y LUBRICANTES":
                    COMBUSTIBLES_LUBRICANTES();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;
                case "DROGUERIAS":
                    DROGUERIAS();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;
                case "OTROS COMERCIOS":
                    OTROS_COMERCIOS();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;
                case "SUPERMERCADOS":
                    SUPERMERCADOS();
                    stepPass(driver, "Se ingresa el Sub-Sector: " + subsector);
                    System.out.println("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.sendText("Se ingresa el Sub-Sector: " + subsector);
                    generateWord.addImageToWord(driver);
                    break;

            }
        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            Thread.sleep(2000);
            int wappe = Integer.parseInt(casoDePrueba3) - 1;
            String nombre_calle = getData1().get(wappe).get(COLUMNA_NOMBRECALLE);
            typeText(driver, NOMBRE_CALLE, nombre_calle);
            stepPass(driver, "Se ingresa el nombre de la calle: " + nombre_calle);
            System.out.println("Se ingresa el nombre de la calle: " + nombre_calle);
            generateWord.sendText("Se ingresa el nombre de la calle: " + nombre_calle);
            generateWord.addImageToWord(driver);

        } catch (Exception we) {
            casoFallido(we);
        }

        try {
            int wappe = Integer.parseInt(casoDePrueba4) - 1;
            String numero_calle = getData1().get(wappe).get(COLUMNA_NUMEROCALLE);
            typeText(driver, NUMERO_CALLE, numero_calle);
            stepPass(driver, "Se ingresa el número de la calle: " + numero_calle);
            System.out.println("Se ingresa el número de la calle: " + numero_calle);
            generateWord.sendText("Se ingresa el número de la calle: " + numero_calle);
            generateWord.addImageToWord(driver);

        } catch (Exception we) {
            casoFallido(we);
        }

    }

    public void seIngresaElDepartamentoLaProvinciaYElDistrito(String casoDePrueba, String casoDePrueba1, String casoDePrueba2) throws Throwable {
        try {
            click(driver, ARROW3);
            sleep(2000);
            int depa = Integer.parseInt(casoDePrueba) - 1;
            String departamento = getData1().get(depa).get(COLUMNA_DEPARTAMENTO);
            switch (departamento){
                case "AMAZONAS":
                    AMAZONAS();
                    stepPass(driver, "Se ingresa el Departamento: "+departamento);
                    System.out.println("Se ingresa el Departamento: "+departamento);
                    generateWord.sendText("Se ingresa el Sub-Sector: "+departamento);
                    generateWord.addImageToWord(driver);
                    break;
                case "ANCASH":
                    ANCASH();
                    stepPass(driver, "Se ingresa el Departamento: " + departamento);
                    System.out.println("Se ingresa el Departamento: " + departamento);
                    generateWord.sendText("Se ingresa el Sub-Sector: "+departamento);
                    generateWord.addImageToWord(driver);
                    break;
                case "APURIMAC":
                    APURIMAC();
                    stepPass(driver, "Se ingresa el Departamento: "+departamento);
                    System.out.println("Se ingresa el Departamento: "+departamento);
                    generateWord.sendText("Se ingresa el Sub-Sector: "+departamento);
                    generateWord.addImageToWord(driver);
                    break;
                case "AREQUIPA":
                    AREQUIPA();
                    stepPass(driver, "Se ingresa el Departamento: "+departamento);
                    System.out.println("Se ingresa el Departamento: "+departamento);
                    generateWord.sendText("Se ingresa el Sub-Sector: "+departamento);
                    generateWord.addImageToWord(driver);
                    break;
                case "AYACUCHO":
                    AYACUCHO();
                    stepPass(driver, "Se ingresa el Departamento: "+departamento);
                    System.out.println("Se ingresa el Departamento: "+departamento);
                    generateWord.sendText("Se ingresa el Sub-Sector: "+departamento);
                    generateWord.addImageToWord(driver);
                    break;
                case "LIMA":
                    LIMA();
                    stepPass(driver, "Se ingresa el Departamento: "+departamento);
                    System.out.println("Se ingresa el Departamento: "+departamento);
                    generateWord.sendText("Se ingresa el Sub-Sector: "+departamento);
                    generateWord.addImageToWord(driver);
                    break;
            }
        } catch (Exception we) {
            casoFallido(we);
        }

       try {
        click(driver, ARROW4);
        sleep(2000);
        int pro = Integer.parseInt(casoDePrueba1) - 1;
        String provincia = getData1().get(pro).get(COLUMNA_PROVINCIA);
        switch (provincia){
            case "LIMA":
                LIMA_PROV();
                stepPass(driver, "Se ingresa la Provincia: "+provincia);
                System.out.println("Se ingresa la Provincia: "+provincia);
                generateWord.sendText("Se ingresa la Provincia: "+provincia);
                generateWord.addImageToWord(driver);
                break;

        }
        }catch (Exception we) {
           casoFallido(we);
        }

        try {
            click(driver, ARROW5);
            sleep(2000);
            int dis = Integer.parseInt(casoDePrueba2) - 1;
            String distrito = getData1().get(dis).get(COLUMNA_DISTRITO);
            switch (distrito){
                case "LIMA":
                    LIMA_DIS();
                    stepPass(driver, "Se ingresa el Distrito: "+distrito);
                    System.out.println("Se ingresa el Distrito: "+distrito);
                    generateWord.sendText("Se ingresa el Distrito: "+distrito);
                    generateWord.addImageToWord(driver);
                    break;

            }
        }catch (Exception we) {
            casoFallido(we);
        }

    }

    public void seAsignaElTipoDeClienteSeSeleccionaElSubtipoYGrupoDeAtención(String casoDePrueba, String casoDePrueba1, String casoDePrueba2) throws Throwable {
        try {
            int tcliente = Integer.parseInt(casoDePrueba) - 1;
            String tipocliente = getData1().get(tcliente).get(COLUMNA_TIPOCLIENTE);
            switch (tipocliente){
                case "NEGOCIO":
                    click(driver, RAD_NEGOCIO);
                    stepPass(driver, "Se selecciona el tipo de cliente: "+tipocliente);
                    System.out.println("Se selecciona el tipo de cliente: "+tipocliente);
                    generateWord.sendText("Se selecciona el tipo de cliente: "+tipocliente);
                    generateWord.addImageToWord(driver);
                    break;
                case "EMPRESA":
                    click(driver, RAD_EMPRESA);
                    stepPass(driver, "Se selecciona el tipo de cliente: "+tipocliente);
                    System.out.println("Se selecciona el tipo de cliente: "+tipocliente);
                    generateWord.sendText("Se selecciona el tipo de cliente: "+tipocliente);
                    generateWord.addImageToWord(driver);
                    break;
            }
        }catch (Exception we) {
            casoFallido(we);
        }

        try {
            click(driver, ARROW6);
            sleep(2000);
            int subcliente = Integer.parseInt(casoDePrueba1) - 1;
            String subtipocliente = getData1().get(subcliente).get(COLUMNA_SUBTIPOCLIENTE);
            switch (subtipocliente){
                case "EMPRESAS ORO":
                    EMPRESAS_ORO();
                    stepPass(driver, "Se ingresa el sub tipo de cliente: "+subtipocliente);
                    System.out.println("Se ingresa el sub tipo de cliente: "+subtipocliente);
                    generateWord.sendText("Se ingresa el sub tipo de cliente: "+subtipocliente);
                    generateWord.addImageToWord(driver);
                    break;
            }
        }catch (Exception we) {
            casoFallido(we);
        }

        try {
            click(driver, ARROW7);
            sleep(2000);
            int grupoatencion = Integer.parseInt(casoDePrueba2) - 1;
            String grupodeatencion = getData1().get(grupoatencion).get(COLUMNA_GRUPOATENCION);
            switch (grupodeatencion){
                case "EN MODELO AS IS":
                    ENMODELOASIS();
                    stepPass(driver, "Se ingresa el grupo de atención: "+grupodeatencion);
                    System.out.println("Se ingresa el grupo de atención: "+grupodeatencion);
                    generateWord.sendText("Se ingresa el grupo de antención: "+grupodeatencion);
                    generateWord.addImageToWord(driver);
                    break;
            }
        }catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seDaClickEnElBotónCrear() throws Exception {
        try {
            click(driver, BTN_CREAR);
            stepPass(driver, "Se ingresa da click en el botón crear");
            System.out.println("Se ingresa da click en el botón crear");
            generateWord.sendText("Se ingresa da click en el botón crear");
            generateWord.addImageToWord(driver);
        }catch (Exception we) {
            casoFallido(we);
        }
        try {
            click(driver, BTN_CONFIRMAR);
            stepPass(driver, "Se ingresa da click en el botón confirmar");
            System.out.println("Se ingresa da click en el botón confirmar");
            generateWord.sendText("Se ingresa da click en el botón confirmar");
            generateWord.addImageToWord(driver);
        }catch (Exception we) {
            casoFallido(we);
        }
    }

    public void seConfirmaLaCreaciónDelCliente(String casoDePrueba) throws Throwable {
        try{
            int wappe = Integer.parseInt(casoDePrueba) - 1;
            String razonsocial = getData1().get(wappe).get(COLUMNA_RAZONSOCIAL);
            typeText(driver, TXT_BUSCAR, razonsocial);
            sleep(5000);
            stepPass(driver, "Se verifica la creación del cliente :"+razonsocial);
            System.out.println("Se verifica la creación del cliente :"+razonsocial);
            generateWord.sendText("Se verifica la creación del cliente :"+razonsocial);
            generateWord.addImageToWord(driver);
        }catch (Exception we) {
            casoFallido(we);
        }
    }

    private void casoFallido(Exception we) throws Exception {
        ExcelReader.writeCellValue(EXCEL_WEB, WAPPE_WEB, 1, 25, "FAIL");
        stepFail(driver, "Fallo el caso de prueba : " + we.getMessage());
        System.out.println("Fallo el caso de prueba : " + we.getMessage());
        generateWord.sendText("Tiempo de espera ha excedido");
        generateWord.addImageToWord(driver);
        throw we;
    }

}

