package com.example.PersonalInfo.model;

import lombok.Data;

@Data
public class InfoResponse {
    private Name name;
    private Address address;
    private int phone;
    private String id;
}
