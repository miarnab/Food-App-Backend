package com.example.food_app.Model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "menutype")

public class Menutype {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int menu_type_id;

    @Column(type = "type_name")
    private String type_name;

    @Column(type = "description")
    private String description;

    public Menutype()
    {
        
    }

}
