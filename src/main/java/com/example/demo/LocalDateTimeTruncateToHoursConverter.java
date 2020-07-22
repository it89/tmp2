package com.example.demo;

import com.fasterxml.jackson.databind.util.StdConverter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeTruncateToHoursConverter extends StdConverter<String, LocalDateTime> {

    @Override
    public LocalDateTime convert(String value) {
        return LocalDateTime.parse(value, DateTimeFormatter.ISO_DATE_TIME)
                .truncatedTo(ChronoUnit.HOURS);
    }
}
