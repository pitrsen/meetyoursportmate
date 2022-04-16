package com.pitrsen.meetyoursportmate.controller;

import com.pitrsen.meetyoursportmate.entity.Sport;
import com.pitrsen.meetyoursportmate.respository.SportRepository;
import com.pitrsen.meetyoursportmate.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 8:39
 * Project: meetyoursportmate
 */

@RestController
@RequestMapping("api")
public class SportController {

    @Autowired
    private SportService sportService;

    @GetMapping("/sports")
    public List<Sport> findAll() {
        return sportService.findAll();
    }

}
