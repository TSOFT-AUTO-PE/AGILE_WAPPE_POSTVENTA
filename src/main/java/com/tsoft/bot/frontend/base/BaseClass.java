package com.tsoft.bot.frontend.base;

import com.tsoft.bot.frontend.exceptions.FrontEndException;
import com.tsoft.bot.frontend.utility.ExtentReportUtil;
import com.tsoft.bot.frontend.utility.GenerateWord;
import com.tsoft.bot.frontend.utility.Sleeper;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Logger;


public class BaseClass {

    private static GenerateWord generateWord = new GenerateWord();

    protected void click(WebDriver driver, By locator) throws IOException {
        try {
            driver.findElement(locator).click();
        }catch (RuntimeException we){
            errorNoElementFound(driver, locator);
            throw we;
        }
    }

    protected void clear(WebDriver driver, By locator) throws IOException {
        try {
            driver.findElement(locator).clear();
        }catch (RuntimeException we){
            errorNoElementFound(driver, locator);
            throw we;
        }
    }

    protected void typeText(WebDriver driver, By locator, String inputText) throws IOException {
        try {
            driver.findElement(locator).sendKeys(inputText);
        }catch (RuntimeException we){
            errorNoElementFound(driver, locator);
            throw we;
        }
    }

    protected Boolean isDisplayed(WebDriver driver, By locator){
        try {
            return driver.findElement(locator).isDisplayed();
        }catch (NoSuchElementException we){
            driver.close();
            return false;
        }
    }

    public static void SelectByVisibleText(WebDriver driver, By locator, String text) throws Throwable {
        try {
            WebElement element = driver.findElement(locator);
            Select select = new Select(element);
            select.selectByVisibleText(text);
        }catch (Exception we){
            driver.close();
        }
    }

    public static String getText(WebDriver driver, By locator){
        try {
            return driver.findElement(locator).getText();
        }catch (Exception we){
            driver.close();
        }
        return driver.findElement(locator).getText();
    }

    public static Exception handleError(WebDriver driver, String codigo, String msg) throws Throwable {
        stepWarning(driver, msg);
        return new FrontEndException(StringUtils.trimToEmpty(codigo), msg);
    }

    protected static void sleep(int milisegundos) {
        Sleeper.sleep(milisegundos);
    }

    protected static void stepPass(WebDriver driver, String descripcion) {
        try {
            ExtentReportUtil.INSTANCE.stepPass(driver, descripcion);
        } catch (RuntimeException t) {
            Logger.getLogger("[LOG]-StepPass: " + t);
            throw t;
        } catch (Exception e) {
            Logger.getLogger("[LOG]-StepPass: " + e);
        }
    }

    private static void stepWarning(WebDriver driver, String descripcion) throws Throwable {
        try {
            ExtentReportUtil.INSTANCE.stepWarning(driver, descripcion);
        } catch (RuntimeException t) {
            Logger.getLogger("[LOG]-StepWarning: " + t);
            throw t;
        }
    }

    protected void stepFail(WebDriver driver, String descripcion) throws Exception {
        try {
            ExtentReportUtil.INSTANCE.stepFail(driver, descripcion);
        } catch (RuntimeException t) {
            Logger.getLogger("[LOG]-StepFail: " + t);
            throw t;
        }
    }

    public static void stepFailNoShoot(String descripcion) {
        try {
            ExtentReportUtil.INSTANCE.stepFailNoShoot(descripcion);
        } catch (RuntimeException t) {
            Logger.getLogger("[LOG]-StepFailNoShoot: " + t);
            throw t;
        }
    }

    public static void scroll(WebDriver driver, int x, int y) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(" + x + "," + y + ")", "");
        } catch (RuntimeException t) {
            Logger.getLogger("[LOG]-Scroll: " + t);
            throw t;
        }
    }

    public static void zoom(WebDriver driver, int size) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.body.style.zoom = '" + size + "%'");
        } catch (RuntimeException t) {
            Logger.getLogger("[LOG]-zoom: " + t);
            throw t;
        }
    }

    private void errorNoElementFound(WebDriver driver, By locator) throws IOException {
        generateWord.sendText("Error : No se encontró el elemento : " + locator);
        generateWord.addImageToWord(driver);
        driver.close();
    }
}