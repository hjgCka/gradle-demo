package com.hjg.producer;

import java.math.BigDecimal;

/**
 * @Description
 * @Author hjg
 * @Date 2024-12-20 15:39
 */
public class ProducerApp {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Benz");
        car.setPrice(new BigDecimal(2000));
        System.out.println(car);
    }
}
