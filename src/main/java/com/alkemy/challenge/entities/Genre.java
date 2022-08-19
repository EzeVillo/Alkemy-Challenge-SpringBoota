package com.alkemy.challenge.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "genre")
public class Genre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "image", unique = true)
    private String image;

    @Column(name = "name", unique = true, nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = "movie_id")
    private List<Movie> movies = new ArrayList<>();
}
