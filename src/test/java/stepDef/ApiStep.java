package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.ApiPage;

public class ApiStep {
    ApiPage apiPage;
    public ApiStep() {
        this.apiPage = new ApiPage();
    }
    @Given("prepare url for {string}")
    public void prepareUrlFor(String url) {
        apiPage.prepareUrlFor(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @Then("validation status code is equals {int}")
    public void validationStatusCodeIsEquals(int status_code) {
        apiPage.validationStatusCodeIsEquals(status_code);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @And("hit api get list users limit by 1")
    public void hitApiGetListUsersLimitBy1() {apiPage.hitApiGetListUsersLimitBy1();}

    @Then("validation response body get list users limit by 1")
    public void validationResponseBodyGetListUsersLimitBy1() {
        apiPage.validationResponseBodyGetListUsersLimitBy1();
    }

    @And("hit api get list user by id")
    public void hitApiGetListUserById() {apiPage.hitApiGetListUserById();}

    @Then("validation response body get list user by id")
    public void validationResponseBodyGetListUserById() {
        apiPage.validationResponseBodyGetListUserById();
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUser();
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyCreateNewUsers();
    }

    @And("hit api delete new")
    public void hitApiDeleteNew() {
        apiPage.hitApiDeleteUser();
    }

    @And("hit api update data")
    public void hitApiUpdateData() {
        apiPage.hitApiUpdateUser();
    }

    @Then("validation response body update user")
    public void validationResponseBodyUpdateUser() {
        apiPage.validationResponseBodyUpdateUser();
    }

    @And("hit api get list of tags")
    public void hitApiGetListOfTags() {
        apiPage.hitApiGetListOfTags();
    }

    @Then("validation response body get list of tags")
    public void validationResponseBodyGetListOfTags() {
        apiPage.validationResponseBodyGetListOfTags();
    }

}



