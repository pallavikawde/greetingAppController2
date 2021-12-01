package com.example.Greetingappcontroller2.dto;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Id;//
@Data
@Getter
public class GreetingAppDto {
    private String firstname;
    private String lastname;
    private long id;
}
