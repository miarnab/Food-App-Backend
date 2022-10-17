package com.example.food_app.Model;

import java.lang.annotation.Inherited;
import java.sql.Date;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "order")

public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;

    @Column(type = "customer_id")
    private int customer_id;

    @Column(type = "order_date")
    private Date order_date;

    @Column(type = "total_amount")
    private float total_amount;

    @Column(type = "order_status")
    private int order_status;

    @Column(type = "processed_by")
    private int processed_by;

    public Order()
    {
        
    }

}
