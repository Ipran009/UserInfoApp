package com.example.PersonalInfo.model;

import lombok.Data;

@Data
public class InfoRequest {
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private int phone;

}
