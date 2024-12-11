package com.example.weblab.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "Books")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "KitapAdi", nullable = false)
    private String kitapAdi;

    @Column(name = "Yazar", nullable = false)
    private String yazar;

    @Column(name = "BasimYili")
    private LocalDate basimYili;

    @Column(name = "SayfaSayisi")
    private int sayfaSayisi;
}
