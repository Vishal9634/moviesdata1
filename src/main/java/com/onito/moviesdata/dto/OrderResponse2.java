package com.onito.moviesdata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse2 {
    private String tConst;
    private String primaryTitle;
    private String genres;
    private Double averageRating;
}
