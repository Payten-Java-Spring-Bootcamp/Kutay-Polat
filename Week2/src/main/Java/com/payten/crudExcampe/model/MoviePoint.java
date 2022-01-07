package com.payten.crudExcampe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel(value = "MoviePoint Class")
public class MoviePoint {

    @ApiModelProperty(value = "Movie Id field.")
    private Long movieId;
    @ApiModelProperty(value = "Member Id field.")
    private Long memberId;
    @ApiModelProperty(value = "Movie point field.",notes = "for user stars")
    private Double point;



}
