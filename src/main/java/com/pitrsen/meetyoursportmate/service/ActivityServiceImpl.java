package com.pitrsen.meetyoursportmate.service;

import com.pitrsen.meetyoursportmate.entity.Activity;
import com.pitrsen.meetyoursportmate.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:11
 * Project: meetyoursportmate
 */
@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public void saveAll(List<Activity> activities) {
        activityRepository.saveAll(activities);
    }

}
