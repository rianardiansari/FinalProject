package pages;

import helper.Endpoint;
import helper.Utility;
import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.java.en.And;
import io.cucumber.java.sl.In;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.path.json.JsonPath;
import io.restassured.path.json.*;
import io.restassured.response.Response;

import java.io.File;
import java.lang.reflect.Array;
import java.util.List;

import static helper.Models.*;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;

public class ApiPage {

    String setURL, global_id;
    Response res;

    public void prepareUrlFor(String url) {
        switch (url) {
            case "GET_LIST_USERS":
                setURL = Endpoint.GET_LIST_USERS;
                break;
            case "GET_LIST_USER_BY_ID":
                setURL = Endpoint.GET_LIST_USER_BY_ID;
                break;
            case "CREATE_NEW_USERS":
                setURL = Endpoint.CREATE_NEW_USERS;
                break;
            case "DELETE_USERS":
                setURL = Endpoint.DELETE_USERS;
                break;
            case "GET_LIST_OF_TAGS":
                setURL = Endpoint.GET_LIST_OF_TAGS;
                break;
        }
    }

    public void hitApiGetListUsers() {
        res = getListUsers(setURL);
        System.out.println(res.getBody().asString());
    }

    public void hitApiPostCreateUser() {
        res = postCreateUser(setURL);
        System.out.println(res.getBody().asString());
    }

    public void validationStatusCodeIsEquals(int status_code) {
        assertThat(res.statusCode()).isEqualTo(status_code);
    }

    public void validationResponseBodyGetListUsers() {
        List<Object> id = res.jsonPath().getList("data.id");
        List<Object> title = res.jsonPath().getList("data.title");
        List<Object> firstname = res.jsonPath().getList("data.firstName");
        List<Object> lastname = res.jsonPath().getList("data.lastName");
        List<Object> picture = res.jsonPath().getList("data.picture");

        assertThat(id.get(0)).isNotNull();
        assertThat(title.get(0)).isIn("mr", "ms", "mrs", "miss", "dr", "");
        assertThat(firstname.get(0)).isNotNull();
        assertThat(lastname.get(0)).isNotNull();
        assertThat(picture.get(0)).isNotNull();
    }

    public void hitApiGetListUsersLimitBy1() {
        res = getListUsersLimitBy1(setURL);
        //System.out.println(res.getBody().asString());
    }

    public void validationResponseBodyGetListUsersLimitBy1() {
        List<Object> id = res.jsonPath().getList("data.id");
        List<Object> title = res.jsonPath().getList("data.title");
        List<Object> firstname = res.jsonPath().getList("data.firstName");
        List<Object> lastname = res.jsonPath().getList("data.lastName");
        List<Object> picture = res.jsonPath().getList("data.picture");

        assertThat(id.get(0)).isNotNull();
        assertThat(title.get(0)).isIn("mr", "ms", "mrs", "miss", "dr", "");
        assertThat(firstname.get(0)).isNotNull();
        assertThat(lastname.get(0)).isNotNull();
        assertThat(picture.get(0)).isNotNull();

        global_id = id.get(0).toString();
    }

    public void hitApiGetListUserById() {
        res = getListUsersById(setURL, global_id);
        System.out.println(res.getBody().asString());
    }

    public void validationResponseBodyGetListUserById() {

        //System.out.println(res);
        //System.out.println(res.getBody().asString());

        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstname = jsonPathEvaluator.get("firstName");
        String lastname = jsonPathEvaluator.get("lastName");
        String picture = jsonPathEvaluator.get("picture");
        //String id = jsonPathEvaluator.get("location.street");
        //System.out.println(id);

        assertThat(id).isNotNull();
        assertThat(title).isIn("mr", "ms", "mrs", "miss", "dr", "");
        assertThat(firstname).isNotNull();
        assertThat(lastname).isNotNull();
        assertThat(picture).isNotNull();
    }

    public void validationResponseJsonWithJSONSchema(String filename) {
        File JSONFile = Utility.getJSONSchemaFile(filename);
        res.then().assertThat().body(JsonSchemaValidator.matchesJsonSchema(JSONFile));
    }

    public void validationResponseBodyCreateNewUsers() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstname = jsonPathEvaluator.get("firstName");
        String lastname = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");

        assertThat(id).isNotNull();
        assertThat(title).isNotNull();
        assertThat(firstname).isNotNull();
        assertThat(lastname).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");

        global_id = id;
    }

    public void hitApiDeleteUser() {
        res = deleteUser(setURL, global_id);
    }

    public void hitApiUpdateUser() {
        res = updateUser(setURL, global_id);
    }

    public void validationResponseBodyUpdateUser() {
        JsonPath jsonPathEvaluator = res.jsonPath();
        String id = jsonPathEvaluator.get("id");
        String title = jsonPathEvaluator.get("title");
        String firstname = jsonPathEvaluator.get("firstName");
        String lastname = jsonPathEvaluator.get("lastName");
        String email = jsonPathEvaluator.get("email");
        String gender = jsonPathEvaluator.get("gender");

        assertThat(id).isNotNull();
        assertThat(title).isNotNull();
        assertThat(firstname).isNotNull();
        assertThat(lastname).isNotNull();
        assertThat(email).isNotNull();
        assertThat(gender).isIn("female", "male");

        global_id = id;
    }

    public void hitApiGetListOfTags() {
        res = GetListOfTags(setURL);
        System.out.println(res.getBody().asString());
    }
    public void validationResponseBodyGetListOfTags() {
        //System.out.println(res.getBody().asString());
        String response = res.getBody().asString();
        assertThat(response).contains("DRIL");
    }
}