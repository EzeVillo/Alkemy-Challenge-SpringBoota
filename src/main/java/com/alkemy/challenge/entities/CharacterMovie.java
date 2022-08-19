package com.alkemy.challenge.entities;

import javax.persistence.*;

@Entity
@Table(name = "character_movie")
public class CharacterMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @ManyToOne
    @Column(name = "character_id", nullable = false)
    private Character character;

    @ManyToOne
    @Column(name = "movie_id", nullable = false)
    private Movie movie;
}
