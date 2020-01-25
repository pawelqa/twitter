package com.sda.twitter.persistance.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "TB_USER")
public class TbUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "US_ID", unique = true, nullable = false)
    private int id;

    @Column(name = "US_USERNAME", unique = true, nullable = false, length = 25)
    private String username;

    @Column(name = "US_PASSWORD", nullable = false, length = 25)
    private String password;
}
