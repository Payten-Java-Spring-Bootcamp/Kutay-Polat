package com.bootcamp.payten.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class User {
    private Integer id;
    private String name;
    private String surname;
    private String gender;
}
