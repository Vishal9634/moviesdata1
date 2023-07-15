package com.onito.moviesdata.runner;

import com.onito.moviesdata.dto.OrderResponse3;
import com.onito.moviesdata.entities.Movie;
import com.onito.moviesdata.repository.MovieRepo;
import com.onito.moviesdata.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private MovieRepo movieRepo;
    @Autowired
    private RatingRepo ratingRepo;

    @Override
    public void run(String... args) throws Exception {
    // movieRepo.findAll().forEach(System.out::println);
    // ratingRepo.findAll().forEach(System.out::println);

    // movieRepo.getLimitData().forEach(System.out::println);
    // movieRepo.getLimitedData().forEach(System.out::println);
    // movieRepo.getDataByAverageRating().forEach(System.out::println);
        List<OrderResponse3> collect = movieRepo.getDataByGenres().stream().collect(Collectors.toList());
    collect.forEach(System.out::println);
    }
}
