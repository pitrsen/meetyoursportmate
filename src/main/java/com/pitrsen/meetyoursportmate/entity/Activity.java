package com.pitrsen.meetyoursportmate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by IntelliJ IDEA.
 * User: peterSenaj
 * Date: 25.4.2022
 * Time: 20:04
 * Project: meetyoursportmate
 */
@Entity
@Getter
@Setter
public class Activity {

    @EmbeddedId
    public ActivityId id;

    @ManyToOne
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    public User user;

    @ManyToOne
    @MapsId("cityId")
    @JoinColumn(name = "city_id")
    public City city;

    @ManyToOne
    @MapsId("sportId")
    @JoinColumn(name = "sport_id")
    public Sport sport;

}
