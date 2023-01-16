package com.example.demo.Model;

import jakarta.persistence.Column;

public class Coach {

    @Column(name = "yearOfExperience")
    private int yearOfExperience;

    @Column(name = "certificates")
    private String certificates;

}
