package com.example.Greetingappcontroller2.model;

import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Getter
public class GreetingAppModel {
    @Id
    private String firstname;
    private String lastname;
    private long id;
    private String city;
    private int mobnumber;
    private int rollno;


}
