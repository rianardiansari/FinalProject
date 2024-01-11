package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;

public class Models {
    private static RequestSpecification request;
    public static void setupHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "658e387a626dbd203e4262ea");
    }

    public static Response getListUsers(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

    public static Response getListUsersLimitBy1(String endpoint) {
        setupHeaders();
        String finalEndpoint = endpoint  + "?page=1&limit=1";;
        return request.when().get(finalEndpoint);
    }

    public static Response getListUsersById(String endpoint, String user_id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().get(finalEndpoint);
    }

    public static Response postCreateUser(String endpoint){
        String title = "ms";
        String firstName = "Riana";
        String lastName = "Ardiansari";
        String email = generateRandomEmail();
        String gender = "female";
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);
        payload.put("gender", gender);

        setupHeaders();
        String finalEndpoint = endpoint + "/create";
        return request.body(payload.toString()).when().post(finalEndpoint);

    }
    public static Response deleteUser(String endpoint, String user_id) {
        setupHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        //System.out.println("User id: "+endpoint + "/" + user_id);
        return request.when().delete(finalEndpoint);
    }
    public static Response updateUser(String endpoint, String user_id) {
        setupHeaders();
        String title = "ms";
        String firstName = "Hasya";
        String lastName = "Edit";
        String email = generateRandomEmail();
        String gender = "female";
        JSONObject payload = new JSONObject();
        payload.put("title", title);
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);
        payload.put("gender", gender);

        String finalEndpoint = endpoint + "/" + user_id;
        //System.out.println("User id: "+endpoint + "/" + user_id);
        return request.body(payload.toString()).when().put(finalEndpoint);
    }

    public static Response GetListOfTags(String endpoint) {
        setupHeaders();
        return request.when().get(endpoint);
    }

}

