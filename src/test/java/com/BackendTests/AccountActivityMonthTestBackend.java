package com.BackendTests;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AccountActivityMonthTestBackend {
    private String accountActivityMonth = "https://parabank.parasoft.com/parabank/services/bank/accounts/13677/transactions/month/All/type/All";

    @Test
    @Tag("Actividad-mensual-de-la-cuenta")
    public void setAccountActivityMonthEndpoint () {
        Response response =
                given().
                        auth().
                        basic("Mari123","1234567").
                        when().
                        get(accountActivityMonth);

        System.out.println(response.getStatusCode());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200,statusCode);
    }
}
