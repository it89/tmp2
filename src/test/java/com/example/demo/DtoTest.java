package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class DtoTest {
    @Test
    void deserialize() throws JsonProcessingException {
        String json = "{\"localDateTime\": \"2020-06-28T14:20:20.123\"}";
        Dto expected = new Dto(LocalDateTime.of(
                LocalDate.of(2020, 6, 28),
                LocalTime.of(14, 0)));

        ObjectMapper objectMapper = new ObjectMapper();
        assertEquals(expected, objectMapper.readValue(json, Dto.class));
    }
}