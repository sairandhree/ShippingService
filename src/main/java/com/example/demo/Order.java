package com.example.demo;

import java.io.Serializable;
import java.util.List;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
public class Order implements Serializable {

    Long orderId;

    List<String> books;

    String customerEmail;
    
}
