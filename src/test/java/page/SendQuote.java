package page;

import dsl.DSL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SendQuote {

    private DSL dsl;

    public SendQuote(WebDriver driver) {
        dsl = new DSL(driver);
    }

    By email_field           = By.id("email");
    By phone_field           = By.id("phone");
    By username_field        = By.id("username");
    By password_field        = By.id("password");
    By confirmpassword_field = By.id("confirmpassword");
    By comments_field        = By.id("Comments");
    By sendemail_field       = By.id("sendemail");
    By countFieldSendQuote = By.id("/html/body/div[1]/div/div[1]/div/div/nav/ul/li[5]/a/span");
    By success_message       = By.xpath("/html/body/div[4]/h2");

    public void setEmail(String text) {
        dsl.write(email_field, text);
    }

    public void setPhone(String text) {
        dsl.write(phone_field, text);
    }

    public void setUsername(String text) {
        dsl.write(username_field, text);
    }

    public void setPassword(String text) {
        dsl.write(password_field, text);
    }

    public void setConfirmPassword(String text) {
        dsl.write(confirmpassword_field, text);
    }

    public void setComments(String text) {
        dsl.write(comments_field, text);
    }

    public void send(){
        dsl.clickPrev(sendemail_field);
    }

    public String verify_message(){
        return dsl.verify_message(success_message);

    }

    public String getCountFieldSendQuote(){
        return dsl.count(countFieldSendQuote);
    }

}
