package com.onito.moviesdata.repository;

import com.onito.moviesdata.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepo extends JpaRepository<Rating,String> {}
