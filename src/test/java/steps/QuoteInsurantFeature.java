package steps;

import dsl.DSL;
import io.cucumber.java.After;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.*;

import java.util.concurrent.TimeUnit;

public class QuoteInsurantFeature {


    private static WebDriver driver;
    private VehicleData vehiclePage;
    private EnterInsurantData insurantPage;
    private ProductorData productorPage;
    private SelectPriceOption selectPricePage;
    private SendQuote sendPage;
    private DSL dsl;




    @Before
    public void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        dsl = new DSL(driver);
        vehiclePage = new VehicleData(driver);
        insurantPage = new EnterInsurantData(driver);
        productorPage = new ProductorData(driver);
        selectPricePage = new SelectPriceOption(driver);
        sendPage = new SendQuote(driver);
    }


    @After
    public void teardown() {

        if (driver != null) {
            driver.quit();
        }
    }



    @Given("The user is on the insurance quote page and want to quote")
    public void theUserIsOnTheInsuranceQuotePageAndWantToQuote() throws InterruptedException {

        driver.get("http://sampleapp.tricentis.com/101/app.php");
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(1);
    }

    @When("The user fill in the form Enter Vehicle Data")
    public void theUserFillInTheFormEnterVehicleData() throws InterruptedException {

        vehiclePage.selectMenu();
        vehiclePage.setFillMake("Audi");
        vehiclePage.setEnginePerformace("2000");
        vehiclePage.setDateManuFacture("08/12/2021");
        vehiclePage.setNumberOfSeats("4");
        vehiclePage.setFuelType("Gas");
        vehiclePage.setListPrice("10000");
        vehiclePage.setLicensePlateNumber("ABC1234");
        vehiclePage.setAnnualMileage("10000");

        Assert.assertEquals("0", vehiclePage.getCountFieldEnterVecicleData());
        dsl.screenshot("Enter Vehicle Data");
        TimeUnit.MILLISECONDS.sleep(2);
        vehiclePage.next();





    }

    @When("The user fill in the form Enter Insurant Data")
    public void theUserFillInTheFormEnterInsurantData() throws InterruptedException {
        insurantPage.enterInsurant();
        insurantPage.setFirstName("Rafael");
        insurantPage.setLastName("missio");
        insurantPage.setDateBirth("12/04/1984");
        insurantPage.setGenderMale();
        insurantPage.setStreetAddress("Travesssa Missio");
        insurantPage.setCountry("Brazil");
        insurantPage.setZipCode("13050252");
        insurantPage.setCity("Ccampinas");
        insurantPage.setOccupation("Employee");
        insurantPage.setHobbieSpeeding();
        insurantPage.setHobbiesBungeejumping();
        insurantPage.setHobbiesCliffDiving();
        insurantPage.setHobbiesSkyDiving();
        insurantPage.setHobbiesOther();
        insurantPage.setWebsite("rafael_missio.com.br");

        Assert.assertEquals("0", insurantPage.getCountFieldEnterIsurantData());
        dsl.screenshot("Enter Isurant Data");
        TimeUnit.MILLISECONDS.sleep(2);
        insurantPage.next();

    }

    @When("The user fill in the form Enter Product Data")
    public void theUserFillInTheFormEnterProductData() throws InterruptedException {

        productorPage.enterProduct();
        productorPage.setStartDate("05/01/2022");
        productorPage.setInsuranceSum("10.000.000,00");
        productorPage.setMeritRating("Bonus 1");
        productorPage.setDamageInsurance("Partial Coverage");
        productorPage.setOptionalProductsEuroProtection();
        productorPage.setOptionalProductsLegalDefenseInsurance();
        productorPage.setCourtesyCar("Yes");

        Assert.assertEquals("0", productorPage.getCountFieldProductor());
        dsl.screenshot("Enter Produt Data");
        TimeUnit.MILLISECONDS.sleep(2);
        productorPage.next();
    }

    @When("The user fill in the form Select Price Option")
    public void theUserFillInTheFormSelectPriceOption() throws InterruptedException {

        selectPricePage.setSelecOptionPatinum();

        Assert.assertEquals("0", selectPricePage.getCountFieldSelectPrice());
        dsl.screenshot("Select Price Option");
        TimeUnit.SECONDS.sleep(1);
        selectPricePage.next();

    }

    @When("The user fill in the form Send Quote")
    public void theUserFillInTheFormSendQuote() throws InterruptedException {
        sendPage.setEmail("tmissio@hotmail.com");
        sendPage.setPhone("9911115555");
        sendPage.setUsername("rtmissio");
        sendPage.setPassword("rt088..GG");
        sendPage.setConfirmPassword("rt088..GG");

        sendPage.send();
        dsl.screenshot("Send Quote");
        TimeUnit.SECONDS.sleep(10);
        dsl.screenshot("Send Quote2");

    }

    @Then("The user validates the success message")
    public void theUserValidatesTheSuccessMessage() {
        String expected_message = "Sending e-mail success!";
        String message_success = sendPage.verify_message();
        if (message_success.equalsIgnoreCase(expected_message)) {
            System.out.println("Text is matching");
        } else {
            System.out.println("Error Alert.................: Text is not matching");
        }
        Assert.assertTrue(message_success.equalsIgnoreCase("Sending e-mail success!"));
    }
}
