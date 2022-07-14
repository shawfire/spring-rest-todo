package net.shawfire.todo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest(TodoController.class)
class TodoApplicationTests {

    @Autowired
    private TodoController controller;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void contextLoads() {
        // Given

        // When

        // Then
        Assertions.assertThat(controller).isNotNull();
    }

    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/todo"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json("""
                        [{"id":1,"action":"Milk"},{"id":2,"action":"Bread"}]"""));
    }

}
