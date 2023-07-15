package com.onito.moviesdata.repository;

import com.onito.moviesdata.dto.OrderResponse1;
import com.onito.moviesdata.dto.OrderResponse2;
import com.onito.moviesdata.dto.OrderResponse3;
import com.onito.moviesdata.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie,String> {
   // @Query("FROM Movie  ORDER BY runtimeMinutes DESC LIMIT 10")
   // public List<Movie> getLimitData();

    //first question solve
    @Query("SELECT NEW com.onito.moviesdata.dto.OrderResponse1 (m.tConst,m.primaryTitle,m.runtimeMinutes,m.genres) FROM Movie m  ORDER BY runtimeMinutes DESC LIMIT 10")
    public List<OrderResponse1>getLimitedData();
    //==================================================================================
    @Query("SELECT NEW com.onito.moviesdata.dto.OrderResponse2 (m.tConst,m.primaryTitle,m.genres,r.averageRating) FROM Movie m  INNER JOIN Rating r ON m.tConst=r.tConst WHERE r.averageRating>6 ORDER BY r.averageRating ")
    public List<OrderResponse2>getDataByAverageRating();
    //===========================================================================================
    @Query("SELECT NEW com.onito.moviesdata.dto.OrderResponse3 (m.genres,sum(r.numVotes) ) FROM Movie m  INNER JOIN Rating r ON m.tConst=r.tConst group by m.genres")
    public List<OrderResponse3>getDataByGenres();






}
