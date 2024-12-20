package com.hjg.producer;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @Description
 * @Author hjg
 * @Date 2024-12-20 15:09
 */
@Data
public class Car {

    private BigDecimal price;

    private String brand;
}
