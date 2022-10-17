package com.example.food_app.Model;

import java.lang.annotation.Inherited;
import java.sql.Blob;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "customer")

public class Customer 
{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customer_id;

    @Column(type = "customer_first_name")
    private String customer_first_name;

    @Column(type = "customer_last_name")
    private String customer_last_name;

    @Column(type = "customer_middle_name")
    private String customer_middle_name;

    @Column(type = "customer_email")
    private String customer_email;

    @Column(type = "customer_phone_number")
    private String customer_phone_number;

    @Column(type = "customer_landline")
    private String customer_landline;

    @Column(type = "profile_image")
    private Blob profile_image;

    @Column(type = "customer_username")
    private String customer_username;

    @Column(type = "customer_password")
    private String customer_password;

    @Column(type = "account_status")
    private int account_status;

    public Customer()
    {

    }
}
