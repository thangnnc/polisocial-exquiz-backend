package com.polysocial.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Exercise implements Serializable {

    private String ex1;

    private String ex2;

    private String ex3;

    private String ex4;
}
