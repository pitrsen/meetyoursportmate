package com.pitrsen.meetyoursportmate.repository;

import com.pitrsen.meetyoursportmate.entity.Activity;
import com.pitrsen.meetyoursportmate.entity.ActivityId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:08
 * Project: meetyoursportmate
 */
@Repository
public interface ActivityRepository extends CrudRepository<Activity, ActivityId> {
}
