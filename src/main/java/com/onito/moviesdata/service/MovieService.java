package com.onito.moviesdata.service;

import com.onito.moviesdata.dto.OrderResponse1;
import com.onito.moviesdata.dto.OrderResponse2;
import com.onito.moviesdata.dto.OrderResponse3;
import com.onito.moviesdata.entities.Movie;
import com.onito.moviesdata.repository.MovieRepo;
import com.onito.moviesdata.repository.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
    @Autowired
    private MovieRepo movieRepo;
    @Autowired
    private RatingRepo ratingRepo;

    //This route returns as JSON the top 10 movies with the longest runTime
    //The output should contain tconst, primaryTitle, runtimeMinutes & genres
    public List<OrderResponse1> getLimitedData()
    {
       return movieRepo.getLimitedData();
    }
  public String saveData(Movie movie)
  {
      //data save
      movieRepo.save(movie);
      return "data save successfully";
  }
  // This route returns as JSON the movies with an averageRating > 6.0, in sorted
  // order by averageRating
  // The output should contain tconst, primaryTitle, genre & averageRating.
    public List<OrderResponse2>getTopRatedMovie(){
       return movieRepo.getDataByAverageRating();
    }
  // last question answer
  // Increment runtimeMinutes of all Movies using only SQL query (not in API code).
  // Increment runtimeMinutes by :
  // 15 if genre = Documentary
  // 30 if genre = Animation
  // 45 for the res
  public String updateRatingByCondition() {
        List<Movie> collect = movieRepo.findAll().stream().map(movie ->
        {
            if (movie.getGenres().equalsIgnoreCase("Documentary")) {
                movie.setRuntimeMinutes(movie.getRuntimeMinutes() + 15);
            } else if (movie.getGenres().equalsIgnoreCase("Animation")) {
                movie.setRuntimeMinutes(movie.getRuntimeMinutes() + 30);
            } else {
                movie.setRuntimeMinutes(movie.getRuntimeMinutes() + 45);
            }
            return movie;
        }).collect(Collectors.toList());
        movieRepo.saveAll(collect);

        return "successfully updated";
    }
  // =========================================================
  // Show a list of all movies genre-wise with Subtotals of their numVotes.
  // The calculation of subtotals should be done in SQL query; not the API code
    public List<OrderResponse3> getDataByGenreWiseSubTotalVotes()
    {
       return movieRepo.getDataByGenres();
    }
}
