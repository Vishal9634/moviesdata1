package com.onito.moviesdata.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderResponse1 {
    private String tConst;
    private String primaryTitle;
    private int runtimeMinutes;
    private String genres;
}
