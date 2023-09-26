package com.BackendTests;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class AccountOverviewTestBackend {
    private String accountOverviewUrl = "https://parabank.parasoft.com/parabank/services/bank/customers/12545/accounts";

    @Test
    @Tag("resumen-de-cuenta")
    public void accountOverviewEndpoint()  {
        Response response =
                given().
                        auth().
                        basic("Mari123","1234567").
                        when().
                        get(accountOverviewUrl);

        System.out.println(response.getStatusCode());
        int statusCode = response.getStatusCode();
        Assert.assertEquals(200,statusCode);
    }

}
