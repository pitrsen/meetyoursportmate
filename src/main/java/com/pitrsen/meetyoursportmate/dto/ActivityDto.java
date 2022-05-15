package com.pitrsen.meetyoursportmate.dto;

import com.pitrsen.meetyoursportmate.entity.ActivityId;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:20
 * Project: meetyoursportmate
 */
@Getter
@Setter
public class ActivityDto {

    private ActivityId id;

    private MateDto mate;

    private SportDto sport;

    private CityDto city;

    private LocalDateTime dateTimeFrom;

}
