package com.onito.moviesdata.controller;

import com.onito.moviesdata.dto.OrderResponse1;
import com.onito.moviesdata.dto.OrderResponse2;
import com.onito.moviesdata.dto.OrderResponse3;
import com.onito.moviesdata.entities.Movie;
import com.onito.moviesdata.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {
 ///api/v1/longest-duration-movies
    @Autowired
private MovieService movieService;
    // a. question first
    @GetMapping("/v1/longest-duration-movies")
    public List<OrderResponse1>getLimitedData(){
       return movieService.getLimitedData();
    }

    // b. second question
    @PostMapping("/v1/new-movie")
    public String savaData(@RequestBody Movie movie){
       return movieService.saveData(movie);
    }
    // c. question third
    @GetMapping("/v1/top-rated-movies")
    public List<OrderResponse2>getTopRatedData(){
        return movieService.getTopRatedMovie();
    }
   //d question forth
    @GetMapping("/v1/genre-movies-with-subtotals")
    public List<OrderResponse3> getDataByGenres()
    {
        return movieService.getDataByGenreWiseSubTotalVotes();
    }
    ////d question five
    @PutMapping("/v1/update-runtime-minutes")
    public String updateRunTime()
    {
        return movieService.updateRatingByCondition();
    }


}
