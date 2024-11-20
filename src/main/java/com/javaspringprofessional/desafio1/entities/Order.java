package com.javaspringprofessional.desafio1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Order {

    private Integer code;
    private Double basic;
    private Double discount;
}
