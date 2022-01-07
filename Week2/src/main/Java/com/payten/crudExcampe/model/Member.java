package com.payten.crudExcampe.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@ApiModel(value = "Member Class")
public class Member {

    @ApiModelProperty(value = "Member Id field.")
    private Long id;
    @ApiModelProperty(value = "Member Name field.")
    private String name;
    @ApiModelProperty(value = "Member Phone field.")
    private String phone;
    @ApiModelProperty(value = "Member watchlist field.")
    private List<Watchlist> watchlist;

}
