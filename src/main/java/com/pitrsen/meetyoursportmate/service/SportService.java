package com.pitrsen.meetyoursportmate.service;

import com.pitrsen.meetyoursportmate.entity.Sport;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 8:33
 * Project: meetyoursportmate
 */
public interface SportService {

    // save operation
    Sport save(Sport sport);

    // read operation
    List<Sport> findAll();

}
