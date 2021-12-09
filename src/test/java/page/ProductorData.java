package page;

import dsl.DSL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductorData {

    private DSL dsl;

    public ProductorData(WebDriver driver) {
        dsl = new DSL(driver);
    }

    By enterProduct = By.id("enterproductdata");
    By startdate_field		       = By.id("startdate");
    By insurancesum_field          = By.id("insurancesum");
    By meritrating_field		   = By.id("meritrating");
    By damageinsurance_field	   = By.id("damageinsurance");
    By EuroProtection_field        = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[1]/span\r\n");
    By LegalDefenseInsurance_field = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span\r\n");
    By courtesycar_field           = By.id("courtesycar");
    By button_next_Productor = By.id("nextselectpriceoption");
    By button_prev_Productor = By.id("preventerinsurancedata");
    By countFieldProductor = By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[3]/a/span");

    public void enterProduct() {
        dsl.menu(enterProduct);
    }
    public void setStartDate(String text) {
        dsl.write(startdate_field, text);
    }

    public void setInsuranceSum(String value) {
        dsl.selectComboBox(insurancesum_field, value);
    }

    public void setMeritRating(String value) {
        dsl.selectComboBox(meritrating_field, value);
    }

    public void setDamageInsurance(String value) {
        dsl.selectComboBox(damageinsurance_field, value);
    }

    public void setOptionalProductsEuroProtection() {
        dsl.clickRadio(EuroProtection_field);
    }
    public void setOptionalProductsLegalDefenseInsurance() {
        dsl.clickRadio(LegalDefenseInsurance_field);
    }

    public void setCourtesyCar(String value) {
        dsl.selectComboBox(courtesycar_field, value);
    }

    public String getCountFieldProductor(){
        return dsl.count(countFieldProductor);
    }

    public void prev(){
        dsl.clickPrev(button_prev_Productor);
    }

    public void next(){
        dsl.clickPrev(button_next_Productor);
    }

}
