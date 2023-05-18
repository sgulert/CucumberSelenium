package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleHomePage;
import utils.Driver;



public class BackgroundStepDefinition {
    @Given("Kullanici google.com sayfasindadir")
    public void kullaniciGoogleComSayfasindadir() {
        Driver.getDriver().get("https://www.google.com/");

    }

    @When("Kullanici arama kismina amazon yazar")
    public void kullaniciAramaKisminaAmazonYazar() {
        GoogleHomePage homePage=new GoogleHomePage();
        homePage.searchFor("amazon");

    }

    @And("Kullanici aramayi gerceklestirdiginde")
    public void kullaniciAramayiGerceklestirdiginde() {
        GoogleHomePage homePage=new GoogleHomePage();
        homePage.clickSearchButton();

    }

    @Then("Kullanici title da amazon gormelidir")
    public void kullaniciTitleDaAmazonGormelidir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("amazon"));


    }

    @When("Kullanici arama kismina linkedin yazar")
    public void kullaniciAramaKisminaLinkedinYazar() {
        GoogleHomePage homePage=new GoogleHomePage();
        homePage.searchFor("linkedin");
    }

    @Then("Kullanici title da linkedin gormelidir")
    public void kullaniciTitleDaLinkedinGormelidir() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("linkedin"));
    }
}
