package com.example.food_app.Model;

import java.lang.annotation.Inherited;
import java.sql.Date;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "payment")

public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int payment_id;

    @Column(type = "order_id")
    private int order_id;

    @Column(type = "amount")
    private float amount;

    @Column(type = "paid_by")
    private String paid_by;

    @Column(type = "payment_date")
    private Date payment_date;

    @Column(type = "processed_by")
    private int processed_by;

    public Payment()
    {

    }
}
