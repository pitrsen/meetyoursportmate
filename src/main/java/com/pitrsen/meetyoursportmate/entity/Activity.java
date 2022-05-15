package com.pitrsen.meetyoursportmate.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

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
@NamedQueries({
        @NamedQuery(name = "Activity.findByMateId", query = "SELECT a FROM Activity a WHERE a.id.mateId = :mateId")
})
public class Activity {

    public final static String FIND_BY_MATE_ID = "Activity.findByMateId";

    @EmbeddedId
    private ActivityId id;

    @ManyToOne
    @MapsId("mateId")
    @JoinColumn(name = "mate_id")
    private Mate mate;

    @ManyToOne
    @MapsId("sportId")
    @JoinColumn(name = "sport_id")
    private Sport sport;

    @ManyToOne
    @MapsId("cityId")
    @JoinColumn(name = "city_id")
    private City city;

    private LocalDateTime dateTimeFrom;

    private LocalDateTime dateTimeTo;

}
