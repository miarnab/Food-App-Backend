package com.example.food_app.Model;

import java.lang.annotation.Inherited;
import java.sql.Date;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "rating")

public class Rating {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int rating_id;

    @Column(type = "menu_id")
    private int menu_id;

    @Column(type = "score")
    private int score;

    @Column(type = "remarks")
    private String remarks;

    @Column(type = "date_recorded")
    private Date date_recorded;

    @Column(type = "customer_id")
    private int customer_id;

    public Rating()
    {

    }
}
