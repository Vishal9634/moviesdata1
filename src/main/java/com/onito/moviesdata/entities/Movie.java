package com.onito.moviesdata.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @Column(name = "tconst")
    private String tConst;
    @Column(name = "titleType")
    private String titleType;
    @Column(name = "primaryTitle")
    private String primaryTitle;
    @Column(name = "runtimeMinutes")
    private int runtimeMinutes;
    @Column(name = "genres")
    private String genres;
}
