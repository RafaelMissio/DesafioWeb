package page;

import dsl.DSL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehicleData {

    private DSL dsl;

    public VehicleData(WebDriver driver) {
        dsl = new DSL(driver);
    }

    By automobile_menu         = By.id("nav_automobile");
    By make_field              = By.id("make");
    By enginePerformance_field = By.id("engineperformance");
    By dateManufacture_field    = By.id("dateofmanufacture");
    By numberSeats_field 		= By.id("numberofseats");
    By fuelType_field           = By.id("fuel");
    By listPrice_field          = By.id("listprice");
    By licencePlateNumber_field = By.id("licenseplatenumber");
    By annualMileage_field      = By.id("annualmileage");
    By insuranteData_button     = By.id("nextenterinsurantdata");
    By counter_field            = By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[1]/a/span");

    public void selectMenu(){
        dsl.menu(automobile_menu);
    }
    public void setFillMake(String value){
        dsl.selectComboBox(make_field, value);
    }

    public void setEnginePerformace(String text){
        dsl.write(enginePerformance_field, text);
    }

    public void setDateManuFacture(String text){
        dsl.write(dateManufacture_field, text);
    }

    public void setNumberOfSeats(String value){
        dsl.selectComboBox(numberSeats_field,value);
    }

    public void setFuelType(String value){
        dsl.selectComboBox(fuelType_field,value);
    }

    public void setListPrice(String text){
        dsl.write(listPrice_field, text);
    }

    public void setLicensePlateNumber(String text){
        dsl.write(licencePlateNumber_field, text);
    }

    public void setAnnualMileage(String text){
        dsl.write(annualMileage_field, text);
    }

    public void next(){
        dsl.clickNext(insuranteData_button);
    }

    public String getMake(){
        return dsl.getText(make_field);
    }

    public String getCountFieldEnterVecicleData(){
        return dsl.count(counter_field);
    }

}
