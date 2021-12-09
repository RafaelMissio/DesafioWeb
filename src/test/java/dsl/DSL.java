package dsl;

import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class DSL {

    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }

    public void menu(By id){
        driver.findElement(id).click();
    }

    public void selectComboBox(By id, String value){
        WebElement element = driver.findElement(id);
        Select combo = new Select(element);
        combo.selectByVisibleText(value);
    }

    public void write(By id, String text){
        driver.findElement(id).sendKeys(text);
    }

    public void clickNext(By id){
        driver.findElement(id).click();
    }

    public String getText(By id) {
        return driver.findElement(id).getText();
    }

    public String obterValorCombo(By id) {
        WebElement element = driver.findElement(id);
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    public String count(By id){
        return driver.findElement(id).getText();
    }

    public void clickRadio(By id){
        driver.findElement(id).click();
    }

    public void clickOpen(By id){
        driver.findElement(id).click();
    }

    public void clickPrev(By id){
        driver.findElement(id).click();
    }

    public String verify_message(By id){
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String message = driver.findElement(id).getText();
        return message;
    }

    public void screenshot(String scenario){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try{
            FileUtils.copyFile(file, new File("target/screenshot"+scenario+".jpg"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }


}
