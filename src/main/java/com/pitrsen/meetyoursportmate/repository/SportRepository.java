package com.pitrsen.meetyoursportmate.repository;

import com.pitrsen.meetyoursportmate.entity.Sport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 8:26
 * Project: meetyoursportmate
 */
@Repository
public interface SportRepository extends CrudRepository<Sport, Long> {


}
