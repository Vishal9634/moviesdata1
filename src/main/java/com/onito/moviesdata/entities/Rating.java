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
@Table(name = "ratings")
public class Rating {
    @Id
    @Column(name = "tconst")
    private String tConst;
    @Column(name = "averageRating")
    private Double averageRating;
    @Column(name = "numVotes")
    private int numVotes;
}
