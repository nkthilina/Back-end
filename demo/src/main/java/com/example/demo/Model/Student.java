package com.example.demo.Model;

import jakarta.persistence.Column;

public class Student {

    @Column(name = "weight")
    private float weight;

    @Column(name = "height")
    private float height;

}
