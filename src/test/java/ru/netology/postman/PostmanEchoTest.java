package ru.netology.postman;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

class PostmanEchoTest {
    @Test
    void shouldReturnSendData() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("Good evening, dear students and teachers!")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Good evening, dear students and teachers!"));

    }
}
