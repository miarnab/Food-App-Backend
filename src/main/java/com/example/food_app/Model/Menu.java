package com.example.food_app.Model;

import java.lang.annotation.Inherited;
import java.sql.Blob;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "menu")

public class Menu {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int menu_id;

    @Column(type = "menu_name")
    private String menu_name;

    @Column(type = "price")
    private float price;

    @Column(type = "menu_type_id")
    private int menu_type_id;

    @Column(type = "menu_image")
    private Blob menu_image;

    @column(type = "ingrediants")
    private String ingrediants;

    @Column(type = "menu_status")
    private boolean menu_status;

    public Menu()
    {

    }
}
