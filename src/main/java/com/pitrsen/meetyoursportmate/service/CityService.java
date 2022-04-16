package com.pitrsen.meetyoursportmate.service;

import com.pitrsen.meetyoursportmate.entity.City;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 22:36
 * Project: meetyoursportmate
 */
public interface CityService {

    List<City> findAll();

}
