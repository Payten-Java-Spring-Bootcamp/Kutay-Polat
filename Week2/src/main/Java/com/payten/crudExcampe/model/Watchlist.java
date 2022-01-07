package com.payten.crudExcampe.model;

import com.payten.crudExcampe.service.MovieService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@ApiModel(value = "Watchlist Class")
public class Watchlist {
    @ApiModelProperty(value = "WatchList Id field.")
    private Long id;
    @ApiModelProperty(value = "WatchList MemberId field.")
    private Long memberId;
    @ApiModelProperty(value = "WatchList Name field.")
    private String  watchListName;
    @ApiModelProperty(value = "WatchList Movies List field.")
    private List<Movie> movies;

}
