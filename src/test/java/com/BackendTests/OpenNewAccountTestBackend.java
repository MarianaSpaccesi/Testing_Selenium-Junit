package com.BackendTests;

import com.google.gson.JsonObject;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class OpenNewAccountTestBackend {
    private String openNewAccountUrl = "https://parabank.parasoft.com/parabank/services/bank/createAccount?customerId=12545&newAccountType=1&fromAccountId=13677";

    @Test
    @Tag("Abrir-cuenta-nueva")
    public void openNewAccountEndpoint() {
        JsonObject request = new JsonObject();

        given()
                .contentType("application/json")
                .body(request.toString())
                .when()
                .post(openNewAccountUrl)
                .then()
                .statusCode(200)
                .log().status();
    }

}
