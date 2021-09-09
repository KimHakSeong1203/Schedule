package com.example.test0101.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "3_7")
public class model3_7 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String Monday;
    private String Tuesday;
    private String Wednesday;
    private String Thursday;
    private String Friday;
}
