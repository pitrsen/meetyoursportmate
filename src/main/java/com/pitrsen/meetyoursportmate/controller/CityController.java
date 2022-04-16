package com.pitrsen.meetyoursportmate.controller;

import com.pitrsen.meetyoursportmate.entity.City;
import com.pitrsen.meetyoursportmate.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 22:40
 * Project: meetyoursportmate
 */
@RestController
@RequestMapping("api")
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City> findAll() {
        return cityService.findAll();
    }

}
