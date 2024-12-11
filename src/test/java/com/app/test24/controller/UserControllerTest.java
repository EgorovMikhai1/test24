package com.app.test24.controller;

import com.app.test24.entity.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
@Sql("/schema.sql")
@Sql("/data.sql")
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

    @Test
    void getUserById() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get(
                "/user/{id}",
                "1")
                .contentType(MediaType.APPLICATION_JSON))
                .andReturn();

        String jsonAsString = result.getResponse().getContentAsString();

        User user = mapper.readValue(jsonAsString, User.class);

        Assertions.assertEquals("Alice Smith", user.getName());
    }
}