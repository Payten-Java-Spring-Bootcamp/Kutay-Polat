package com.payten.crudExcampe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@ApiModel(value = "Movie Class")
public class Movie {
    @ApiModelProperty(value = "Movie Id field.")
    private Long id;
    @ApiModelProperty(value = "Movie name field.")
    private String name;
    @ApiModelProperty(value = "Movie genre field.")
    private Genre genre;
    @ApiModelProperty(value = "Movie releaseYear field.")
    private String releaseYear;
    @ApiModelProperty(value = "Movie director field.")
    private String director;
    @ApiModelProperty(value = "Movie casts field.")
    private List<String> cast;
}
