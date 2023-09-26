package com.BackendTests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegisterTestBackend {
    private String registerUrl = "https://parabank.parasoft.com/parabank/register.htm";

    @Test
    @Tag("registro")
    public void registerEndpoint() {
        Response response = RestAssured.get(registerUrl);
        System.out.println(response.getStatusCode());

        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode, 200);
    }

}
