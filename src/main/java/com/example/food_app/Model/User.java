package com.example.food_app.Model;

import java.lang.annotation.Inherited;

import javax.annotation.processing.Generated;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name = "user")

public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int user_id;

    private String full_name;
    private String contact;
    private String email_address;
    private String username;
    private long password;

    public User()
    {

    }

    public User(String full_name,String contact,String email_address,String username,long password)
    {
        this.setFullName(full_name);
        this.setContact(contact);
        this.setEmailAddress(email_address);
        this.setUsername(username);
        this.setPassword(password);
    }

    public User(int id,String full_name,String contact,String emaul_address,String username,long password)
    {
        this.setId(user_id)l
        this.setFullName(full_name);
        this.setContact(contact);
        this.setEmailAddress(email_address);
        this.setUsername(username);
        this.setPassword(password);
    }
}