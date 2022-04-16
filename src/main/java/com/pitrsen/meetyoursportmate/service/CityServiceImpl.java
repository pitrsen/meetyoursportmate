package com.pitrsen.meetyoursportmate.service;

import com.pitrsen.meetyoursportmate.entity.City;
import com.pitrsen.meetyoursportmate.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 22:37
 * Project: meetyoursportmate
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return (List<City>) cityRepository.findAll();
    }

}
