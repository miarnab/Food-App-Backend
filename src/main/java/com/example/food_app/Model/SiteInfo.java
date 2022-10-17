package com.example.food_app.Model;

import java.lang.annotation.Inherited;
import java.sql.Date;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "siteinfo")

public class SiteInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int site_info_id;

    @Column(type = "site_name")
    private String site_name;

    @Column(type = "description")
    private String description;

    @Column(type = "contact_info")
    private String contact_info;

    @Column(type = "address")
    private String address;

    @Column(type = "last_update")
    private Date last_update;

    @Column(type = "user_id")
    private int user_id;

    public SiteInfo()
    {
        
    }
}
