package com.pitrsen.meetyoursportmate.service;

import com.pitrsen.meetyoursportmate.entity.Sport;
import com.pitrsen.meetyoursportmate.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 16.4.2022
 * Time: 8:33
 * Project: meetyoursportmate
 */
@Service
public class SportServiceImpl implements SportService {

    @Autowired
    private SportRepository sportRepository;

    @Override
    public Sport save(Sport sport) {
        return sportRepository.save(sport);
    }

    @Override
    public List<Sport> findAll() {
        return (List<Sport>) sportRepository.findAll();
    }

}
