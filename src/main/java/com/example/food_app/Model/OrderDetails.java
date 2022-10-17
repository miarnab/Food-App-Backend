package com.example.food_app.Model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "orderdetails")

public class OrderDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int oder_details_id;

    @Column(type = "order_id")
    private int order_id;

    @Column(type = "menu_id")
    private int menu_id;

    @Column(type = "amount")
    private float amount;

    @Column(type = "no_of_serving")
    private int no_of_serving;

    @Column(type = "total_amount")
    private float total_amount;

    public OrderDetails()
    {
        
    }
    
}
