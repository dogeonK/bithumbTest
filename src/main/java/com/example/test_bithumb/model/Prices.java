package com.example.test_bithumb.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "PRICES")
@Getter
@Setter
@ToString
public class Prices {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pnum;

    private String coincode;

    private Double price;

    private Double volume;

    private LocalDateTime date;
}
