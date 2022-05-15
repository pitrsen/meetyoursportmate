package com.pitrsen.meetyoursportmate.mapper;

import com.pitrsen.meetyoursportmate.dto.ActivityDto;
import com.pitrsen.meetyoursportmate.entity.Activity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:39
 * Project: meetyoursportmate
 */
@Mapper
public interface ActivityMapper {

    ActivityMapper INSTANCE = Mappers.getMapper(ActivityMapper.class);

    List<Activity> map(List<ActivityDto> dtos);

    Activity map(ActivityDto source);
}
