package com.example.PersonalInfo.service;

import com.example.PersonalInfo.model.Address;
import com.example.PersonalInfo.model.InfoRequest;
import com.example.PersonalInfo.model.InfoResponse;
import com.example.PersonalInfo.model.Name;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;

@Service
public class InfoService {
    public InfoResponse processInfo(InfoRequest infoRequest) {
        InfoResponse infoResponse = new InfoResponse();
        Name name = new Name();
        name.setFirstName(infoRequest.getFirstName());
        name.setLastName(infoRequest.getLastName());
        infoResponse.setName(name);

        Address address = new Address();
        address.setStreet(infoRequest.getStreet());
        address.setCity(infoRequest.getCity());
        address.setState(infoRequest.getState());
        address.setZipCode(infoRequest.getZipcode());
        infoResponse.setAddress(address);

        infoResponse.setPhone(infoRequest.getPhone());
        infoResponse.setId(generateId(infoRequest.getFirstName(), infoRequest.getLastName(), infoRequest.getPhone()));
        return infoResponse;

        
    }

    private static String generateId(String firstName, String lastName, int phone) {
        //String phone1 = String.valueOf(phone);
        //String phone2 = phone1.substring(6,10);

       String phone2=String.valueOf(phone).substring(6,10);

        String retValue = String.valueOf(firstName.charAt(0)).toUpperCase() + String.valueOf(lastName.charAt(0)).toUpperCase() + phone2;
        return retValue;
    }
}
