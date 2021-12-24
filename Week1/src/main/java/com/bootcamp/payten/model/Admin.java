package com.bootcamp.payten.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Admin {
    private Integer id;
    private String name;
    private String surname;
    private Long age;
    private String gender;
}
