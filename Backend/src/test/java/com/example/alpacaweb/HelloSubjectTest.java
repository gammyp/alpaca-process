package com.example.alpacaweb;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;

public class HelloSubjectTest {
    @Test
    public void showWelcomeMessage() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/subject/1";
        Subject subject_Object = restTemplate.getForObject(url, Subject.class);
        assertEquals("Software Development Process 1",subject_Object.getSubjectName());
    }
}