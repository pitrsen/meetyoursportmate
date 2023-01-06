package com.pitrsen.meetyoursportmate.controller;

import com.pitrsen.meetyoursportmate.dto.ActivityDto;
import com.pitrsen.meetyoursportmate.entity.Activity;
import com.pitrsen.meetyoursportmate.mapper.ActivityMapper;
import com.pitrsen.meetyoursportmate.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:17
 * Project: meetyoursportmate
 */
@RestController
@RequestMapping("api")
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @PostMapping("/activities")
    public void saveAll(@RequestBody List<ActivityDto> activityDtos) {
        activityService.saveAll(ActivityMapper.INSTANCE.map(activityDtos));
    }

    @GetMapping("/activities/mate/{id}")
    @ResponseBody
    public List<Activity> getActivitiesByMate(@PathVariable Long id) {
        return activityService.getByMate(id);
    }

}
