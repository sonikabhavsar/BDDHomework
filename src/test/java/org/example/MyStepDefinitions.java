package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class MyStepDefinitions extends Utils {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    LoginPage loginPage = new LoginPage();
    ProductPage productPage = new ProductPage();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();
    EmailAFriendResultPage emailAFriendResultPage = new EmailAFriendResultPage();

    @Given("I am on registration page")
    public void i_am_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("I enter required registration details")
    public void i_enter_required_registration_details() {

        registerPage.enterRegistrationDetails();

    }

    @Then("I should able to register successfully")
    public void i_should_able_to_register_successfully() {
        registerResultPage.VerifyUserRegisterSuccessfully();

    }
    @When("Click on log in button and fill required details")
    public void click_on_log_in_button_and_fill_required_details() {
        loginPage.enterLoginDetails();
    }
    @When("Click on selected product")
    public void click_on_selected_product() {
        productPage.VerifyUserSelectProductSuccessful();
    }
    @When("Click on email a friend button")
    public void click_on_email_a_friend_button() {
        emailAFriendPage.enterSendFriendMailDetails();
    }
    @Then("I should be able to refer a product by email a friend")
    public void i_should_be_able_to_refer_a_product_by_email_a_friend() {
       emailAFriendResultPage.VerifyUserSendEmailFriendsSuccessfully();
    }


    @When("I enter required registration New details")
    public void iEnterRequiredRegistrationNewDetails() {
        registerPage.enterRegistrationNewDetails();
    }

    @Given("I am on demoNopcommerce homepage")
    public void iAmOnDemoNopcommerceHomepage() {

    }

    @When("I Click on {string} button")
    public void iClickOnButton(String button_name) {
        clickOnElement(By.xpath("//a[text()='"+button_name+" ']"));


    }

    @Then("I should be able to verify I am navigated to related page{string} successfully")
    public void iShouldBeAbleToVerifyIAmNavigatedToRelatedPageSuccessfully(String page_url) {
        Assert.assertEquals(getCurrentURL(),page_url);
    }

    @And("I should be able to verify the page title as {string}")
    public void iShouldBeAbleToVerifyThePageTitleAs(String page_title) {
        Assert.assertEquals(getTextFromElement(By.tagName("h1")),page_title);
    }

    @Then("I should able to verify changes that happened after hovering")
    public void i_should_able_to_verify_changes_that_happened_after_hovering() {
        
    }

    @When("I click on subcategory {string} link")
    public void i_click_on_subcategory_link(String subCategory) {
        homePage.toVerifySubCategory(subCategory);
       
    }

    @Then("I should able to successfully navigate to {string} category")
    public void i_should_able_to_successfully_navigate_to_category(String subCategoryPage) {
        homePage.toVerifySubCategoryNavigateSuccessfully(subCategoryPage);
    }

    @When("I hover over {string} category link")
    public void iHoverOverCategoryLink(String category) {
        homePage.hoverOverCategory(category);
    }



    @And("I click on {string} button accordingly")
    public void iClickOnButtonAccordingly(String sub_Category) {
    homePage.toVerifySubCategory(sub_Category);

    }

    @And("I should be able to verity i am navigated to related page {string} successfully")
    public void iShouldBeAbleToVerityIAmNavigatedToRelatedPageSuccessfully(String page_url) {
        Assert.assertEquals(getCurrentURL(),page_url);
    }

    @Then("I should be able to verify the page title {string} accordingly")
    public void iShouldBeAbleToVerifyThePageTitleAccordingly(String page_title) {
        Assert.assertEquals(getTextFromElement(By.tagName("h1")),page_title);
    }


}
