package com.pitrsen.meetyoursportmate.service;

import com.pitrsen.meetyoursportmate.entity.Activity;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:10
 * Project: meetyoursportmate
 */
public interface ActivityService {

    void saveAll(List<Activity> activities);

    List<Activity> getByMate(Long id);
}
