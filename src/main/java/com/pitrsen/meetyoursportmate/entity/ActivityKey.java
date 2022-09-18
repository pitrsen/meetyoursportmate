package com.pitrsen.meetyoursportmate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 19:53
 * Project: meetyoursportmate
 */
@Embeddable
@Getter
@Setter
public class  ActivityId implements Serializable {

    @Column(name = "mate_id")
    private Long mateId;

    @Column(name = "sport_id")
    private Long sportId;

    @Column(name = "city_id")
    private Long cityId;

}
