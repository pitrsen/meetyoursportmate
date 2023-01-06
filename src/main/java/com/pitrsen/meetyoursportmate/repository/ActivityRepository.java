package com.pitrsen.meetyoursportmate.repository;

import com.pitrsen.meetyoursportmate.entity.Activity;
import com.pitrsen.meetyoursportmate.entity.ActivityKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:08
 * Project: meetyoursportmate
 */
@Repository
public interface ActivityRepository extends CrudRepository<Activity, ActivityKey> {

    List<Activity> getByActivityKeyMateId(Long id);
}
