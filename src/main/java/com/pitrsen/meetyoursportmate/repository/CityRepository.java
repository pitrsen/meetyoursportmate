package com.pitrsen.meetyoursportmate.repository;

import com.pitrsen.meetyoursportmate.entity.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 22:34
 * Project: meetyoursportmate
 */
@Repository
public interface CityRepository extends CrudRepository<City, Long> {
}
