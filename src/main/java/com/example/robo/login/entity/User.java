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
    @Column(name = "V_USER_NAME")
    private String userName;

    @Column(name = "V_PASSWORD")
    private String password;

    @Column(name = "V_ROLE")
    private String role;

    @Column(name = "V_STATUS")
    private String status;

}
