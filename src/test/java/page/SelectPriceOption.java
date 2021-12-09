package page;

import dsl.DSL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPriceOption {

    private DSL dsl;

    public SelectPriceOption(WebDriver driver) {
        dsl = new DSL(driver);
    }

    By enterSelectPrice = By.id("selectpriceoption");
    By selectsilver_option   = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span\r\n");
    By selectgold_option     = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span\r\n");
    By selectplatinum_option = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[3]/span\r\n");
    By selectultimate_option = By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[4]/span\r\n");
    By button_next_selectPrice  = By.id("nextsendquote");
    By button_prev_selectPrice = By.id("preventerproductdata");
    By countFieldSelectPrice = By.xpath("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[4]/a/span");

    public void setSelecOptionSilver() {
        dsl.clickRadio(selectsilver_option);
    }

    public void setSelecOptionGold() {
        dsl.clickRadio(selectgold_option);
    }
    public void setSelecOptionPatinum() {
        dsl.clickRadio(selectplatinum_option);
    }
    public void setSelecOptionUltimate() {
        dsl.clickRadio(selectultimate_option);
    }

    public void prev(){
        dsl.clickPrev(button_prev_selectPrice);
    }

    public void next(){
        dsl.clickPrev(button_next_selectPrice);
    }

    public String getCountFieldSelectPrice(){
        return dsl.count(countFieldSelectPrice);
    }





}
