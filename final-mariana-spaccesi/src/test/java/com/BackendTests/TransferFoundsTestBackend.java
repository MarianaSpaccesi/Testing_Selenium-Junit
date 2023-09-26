package com.BackendTests;

import com.google.gson.JsonObject;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TransferFoundsTestBackend {

    private String transferFoundsUrl = "https://parabank.parasoft.com/parabank/services/bank/transfer?fromAccountId=13677&toAccountId=14676&amount=1000";

    @Test
    @Tag("Transferencia-de-fondos")
    public void transferFoundsEndpoint () {
        JsonObject request = new JsonObject();

        given()
                .contentType("application/json")
                .body(request.toString())
                .when()
                .post(transferFoundsUrl)
                .then()
                .statusCode(200)
                .log().status();
    }
}
