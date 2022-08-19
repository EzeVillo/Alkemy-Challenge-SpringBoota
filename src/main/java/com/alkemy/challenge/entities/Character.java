package com.alkemy.challenge.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "image", unique = true)
    private String image;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "weight")
    private Float weight;

    @Column(name = "history", columnDefinition = "TEXT")
    private String history;

    @OneToMany(mappedBy = "character", fetch = FetchType.EAGER)
    private List<CharacterMovie> characterMovie = new ArrayList<>();
}
