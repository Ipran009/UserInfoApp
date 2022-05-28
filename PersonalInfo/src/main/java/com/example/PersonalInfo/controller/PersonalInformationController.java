package com.example.PersonalInfo.controller;

//import com.example.PersonalInfo.model.Address;
import com.example.PersonalInfo.model.InfoRequest;
import com.example.PersonalInfo.model.InfoResponse;
//import com.example.PersonalInfo.model.Name;
import com.example.PersonalInfo.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonalInformationController {

    @Autowired
    InfoService infoService;

    @PostMapping("/create-info")
    public InfoResponse createPersonalInfo(@RequestBody InfoRequest infoRequest) {
        InfoService infoService = new InfoService();
        return infoService.processInfo(infoRequest);
    }
    // use libraries -> StringUtils. lastFourdigits = input.substring(input.length() -4);

    /*private static String generateId(String firstName, String lastName, int phoneNumber) {
        String lastFourString = String.valueOf(phoneNumber);
        int lastfour = lastFourString.charAt(6)+ lastFourString.charAt(7)+ lastFourString.charAt(8)+ lastFourString.charAt(9);
        return firstName.charAt(0) + lastName.charAt(0)+ String.valueOf(lastfour); */

    }

