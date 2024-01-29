package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Integration tests for the application.
 */
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {
    @Autowired
    private TestRestTemplate restTemplate;
    @Test
    void homeResponse() {
        System.out.println("homeResponse");
        String body = this.restTemplate.getForObject("/", String.class);
        assertEquals("Spring is here!", body);
    }
}
