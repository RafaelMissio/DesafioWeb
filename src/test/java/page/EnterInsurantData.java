package page;

import dsl.DSL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterInsurantData {

    private DSL dsl;

    public EnterInsurantData(WebDriver driver) {
        dsl = new DSL(driver);
    }

    By EnterInsurant = By.id("enterinsurantdata");
    By firstName_field = By.id("firstname");
    By lastName_field = By.id("lastname");
    By dataBirthDate = By.id("birthdate");
    By genderMale = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span\r\n");
    By genderFemale = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[2]/span");
    By streetAddress_field = By.id("streetaddress");
    By country_field = By.id("country");
    By zipCode_field = By.id("zipcode");
    By city_field = By.id("city");
    By occupation_field = By.id("occupation");
    By hobbies_speeding 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]\r\n");
    By hobbies_bungeejumping 	= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]\r\n");
    By hobbies_cliffdiving 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[3]\r\n");
    By hobbies_skydiving 		= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]\r\n");
    By hobbies_other 			= By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[5]\r\n");
    By website_field 			= By.id("website");
    By picture_field 			= By.id("picture");
    By open_field 			= By.id("open");
    By button_next = By.id("nextenterproductdata");
    By button_prev = By.id("preventervehicledata");
    By countFieldIsurant = By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[2]/a/span");


    public void enterInsurant() {
        dsl.menu(EnterInsurant);
    }

    public void setFirstName(String text) {
        dsl.write(firstName_field, text);
    }

    public void setLastName(String text) {
        dsl.write(lastName_field, text);
    }

    public void setDateBirth(String text) {
        dsl.write(dataBirthDate, text);
    }

    public void setGenderMale() {
        dsl.clickRadio(genderMale);
    }

    public void setGenderFemale() {
        dsl.clickRadio(genderFemale);
    }

    public void setStreetAddress(String text) {
        dsl.write(streetAddress_field, text);
    }

    public void setCountry(String value) {
        dsl.selectComboBox(country_field, value);
    }

    public void setZipCode(String text) {
        dsl.write(zipCode_field, text);
    }

    public void setCity(String text) {
        dsl.write(city_field, text);
    }

    public void setOccupation(String value) {
        dsl.selectComboBox(occupation_field, value);
    }

    public void setHobbieSpeeding() {
        dsl.clickRadio(hobbies_speeding);
    }

    public void setHobbiesBungeejumping() {
        dsl.clickRadio(hobbies_bungeejumping);
    }

    public void setHobbiesCliffDiving() {
        dsl.clickRadio(hobbies_cliffdiving);
    }

    public void setHobbiesSkyDiving() {
        dsl.clickRadio(hobbies_skydiving);
    }

    public void setHobbiesOther() {
        dsl.clickRadio(hobbies_other);
    }

    public void setWebsite(String text) {
        dsl.write(website_field, text);
    }

    public void setPicture(String text) {
        dsl.write(website_field, text);
    }

    public void open(){
        dsl.clickNext(open_field);
    }

    public void prev(){
        dsl.clickPrev(button_prev);
    }

    public void next(){
        dsl.clickPrev(button_next);
    }

    public String getCountFieldEnterIsurantData(){
        return dsl.count(countFieldIsurant);
    }



}
