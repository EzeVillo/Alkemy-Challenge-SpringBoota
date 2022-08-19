package com.alkemy.challenge.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "image", unique = true)
    private String image;

    @Column(name = "title", unique = true, nullable = false)
    private String title;

    @Column(name = "creation_date")
    private LocalDate creationDate;

    @Column(name = "Score")
    private Integer score;

    @OneToMany(mappedBy = "movie", fetch = FetchType.EAGER)
    @Column(name = "characters")
    private List<Character> characters = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "genre_id")
    private Genre genre;
}
