package com.example.demo;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.time.LocalDateTime;

@Value
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public class Dto {
    //@JsonDeserialize(converter  = LocalDateTimeTruncateToHoursConverter.class)
    @JsonDeserialize(using = LocalDateTimeTruncateToHoursDeserializer.class)
    LocalDateTime localDateTime;
}
