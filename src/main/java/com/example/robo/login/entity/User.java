package com.example.robo.login.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "id")
    private Integer userId;

    @Column(name = "name")
    private String name;
    

}
